package com.sanluan.cms.views.directive.cms;

// Generated 2015-5-10 17:54:56 by SourceMaker

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sanluan.cms.logic.service.cms.CmsSiteService;
import com.sanluan.common.base.BaseDirective;
import com.sanluan.common.handler.DirectiveHandler;
import com.sanluan.common.handler.PageHandler;

import freemarker.template.TemplateException;

@Component
public class CmsSiteListDirective extends BaseDirective {

	@Override
	public void execute(DirectiveHandler handler) throws TemplateException, IOException {
		PageHandler page = service.getPage(handler.getDate("startCreateDate"), handler.getDate("endCreateDate"), handler.getBoolean("isDisable"), 
				handler.getString("orderField"), handler.getString("orderType"), handler.getInteger("pageNo",1), handler.getInteger("count",20));
		handler.put("page", page).render();
	}

	@Autowired
	private CmsSiteService service;

}