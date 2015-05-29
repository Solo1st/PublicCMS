package com.sanluan.cms.admin.views.controller.system;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sanluan.common.base.BaseController;

@RequestMapping("file")
public class FileController extends BaseController {
	@RequestMapping(value = { "upload" + DO_SUFFIX }, method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> upload(MultipartFile file, HttpServletRequest request, HttpServletResponse response, ModelMap model)
			throws IllegalStateException, IOException {
		Map<String, Object> map = new HashMap<String, Object>();
		if (!file.isEmpty()) {
			String fileName = new SimpleDateFormat("yyyy/MM/dd/HH-mm-ssSSSS").format(new Date()) + new Random().nextInt()
					+ file.getContentType();
			file.transferTo(new File(fileName));
			map.put("fileName", fileName);
		}
		return map;
	}
}
