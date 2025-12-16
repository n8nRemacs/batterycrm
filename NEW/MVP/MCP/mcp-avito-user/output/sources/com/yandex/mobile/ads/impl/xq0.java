package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.video.models.ad.JavaScriptResource;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes8.dex */
public final class xq0 {
    @j.N
    public static de1 a(@j.N xd1 xd1Var) {
        JavaScriptResource javaScriptResourceB = xd1Var.b();
        if (javaScriptResourceB == null || !javaScriptResourceB.c().equals("omid")) {
            throw new zd1(xd1Var, 2);
        }
        try {
            URL url = new URL(javaScriptResourceB.d());
            String strD = xd1Var.d();
            String strC = xd1Var.c();
            return TextUtils.isEmpty(strC) ? de1.a(url) : de1.a(strD, url, strC);
        } catch (MalformedURLException unused) {
            throw new zd1(xd1Var, 3);
        }
    }
}
