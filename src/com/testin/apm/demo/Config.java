// -*- Mode: java; tab-width: 4; indent-tabs-mode: nil; c-basic-offset: 4 -*-
//
// Copyright (C) 2015 Testin.  All rights reserved.
//
// This file is an original work developed by Testin

package com.testin.apm.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Config for the application
 */
public class Config {
    static final String TEST_TYPE_KEY = "test_type_key";
    static final String TYPE_HTTP_CLIENT = "test_http_client";
    static final String TYPE_HTTP_URL = "test_http_url_connection";

    private static final List<String> URLLIST = new ArrayList<String>() { {
        add("http://www.baidu.com/");
        add("https://download.oneapm.com/android_agent/eclipse/");
        add("http://crash.testin.cn/cpi/crash");
    } };

    static List<String> getUrlList() {
        return URLLIST;
    }

    static String getDefaultUrl() {
        return URLLIST.get(0);
    }
}