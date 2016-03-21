package com.itranswarp.wxapi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.itranswarp.wxapi.WeixinClient;

abstract class AbstractController {

	final Log log = LogFactory.getLog(getClass());

	@Autowired
	protected WeixinClient client;

}
