package com.huawei.updatesdk.b.d;

import android.text.TextUtils;
import androidx.appcompat.app.r;
import java.io.File;
import java.net.HttpURLConnection;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile d f363840a;

    public static synchronized d a() {
        try {
            if (f363840a == null) {
                f363840a = new d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f363840a;
    }

    public static String b() {
        String strB = com.huawei.updatesdk.a.b.a.a.c().b();
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        String strQ = r.q(strB, "/updatesdk");
        File file = new File(strQ);
        return (file.exists() || file.mkdirs()) ? strQ : "";
    }

    public HttpURLConnection a(String str) {
        HttpURLConnection httpURLConnectionA = com.huawei.updatesdk.a.a.b.b.a(str, com.huawei.updatesdk.a.b.a.a.c().a());
        httpURLConnectionA.setConnectTimeout(7000);
        httpURLConnectionA.setReadTimeout(10000);
        httpURLConnectionA.setUseCaches(false);
        httpURLConnectionA.setDoInput(true);
        httpURLConnectionA.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnectionA.setInstanceFollowRedirects(true);
        return httpURLConnectionA;
    }
}
