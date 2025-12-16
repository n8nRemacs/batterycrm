package com.huawei.secure.android.common.webview;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class e {
    @TargetApi(9)
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            Pattern pattern = com.huawei.secure.android.common.util.e.f363740a;
            if (!TextUtils.isEmpty("url is null")) {
                TextUtils.isEmpty("url is null");
            }
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str)) {
                return new URL(str.replaceAll("[\\\\#]", "/")).getHost();
            }
            com.huawei.secure.android.common.util.e.a("url don't starts with http or https");
            return "";
        } catch (MalformedURLException e12) {
            com.huawei.secure.android.common.util.e.a("getHostByURI error  MalformedURLException : " + e12.getMessage());
            return "";
        }
    }
}
