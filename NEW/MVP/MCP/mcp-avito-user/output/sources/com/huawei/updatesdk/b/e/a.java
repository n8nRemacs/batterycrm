package com.huawei.updatesdk.b.e;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public abstract class a {
    private String a(Context context, String str) {
        String strSynGetGrsUrl;
        try {
            GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
            grsBaseInfo.setSerCountry(str);
            strSynGetGrsUrl = new GrsClient(context, grsBaseInfo).synGetGrsUrl(a(), "ROOT");
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.a.c("AbstractTaskInit", "UpdateSDK Get url from GRS_SDK error: " + th2.toString());
            strSynGetGrsUrl = null;
        }
        if (TextUtils.isEmpty(strSynGetGrsUrl)) {
            com.huawei.updatesdk.a.a.a.b("AbstractTaskInit", "UpdateSDK Get url is default url");
            return a(context);
        }
        com.huawei.updatesdk.a.a.a.b("AbstractTaskInit", "UpdateSDK Get url from GRS_SDK Success!" + b(strSynGetGrsUrl));
        return strSynGetGrsUrl;
    }

    public abstract String a();

    public abstract String a(Context context);

    public abstract void a(List<String> list);

    public abstract String b();

    public String b(Context context) {
        String strA = com.huawei.updatesdk.service.otaupdate.f.e().a();
        if (!TextUtils.isEmpty(strA)) {
            return a(context, strA);
        }
        com.huawei.updatesdk.a.a.a.b("AbstractTaskInit", "UpdateSDK accountZone is empty, so url is default");
        return a(context);
    }

    public abstract int c();

    public abstract boolean c(Context context);

    public void d() throws ExecutionException, InterruptedException, TimeoutException {
        Context contextA = com.huawei.updatesdk.a.b.a.a.c().a();
        if (b(contextA, b())) {
            Locale locale = Locale.ROOT;
            String strK = AK.c.k("content://", b(), ".commondata/item/1");
            if (com.huawei.updatesdk.b.h.d.a(contextA, Uri.parse(strK), b())) {
                d dVar = new d(strK, b());
                dVar.executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
                try {
                    dVar.get(1000L, TimeUnit.MILLISECONDS);
                } catch (Exception e12) {
                    com.huawei.updatesdk.a.a.a.a("AbstractTaskInit", "init AccountZone error: " + e12.toString());
                }
            }
        }
    }

    private String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(0, str.indexOf(46));
        } catch (Exception e12) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("AbstractTaskInit", e12.toString());
            return null;
        }
    }

    public void a(String str) {
    }

    private boolean b(Context context, String str) {
        if (!com.huawei.updatesdk.b.h.b.d(context, str)) {
            return false;
        }
        if (Math.abs(System.currentTimeMillis() - com.huawei.updatesdk.b.b.a.d().b(str)) >= 86400000) {
            return true;
        }
        com.huawei.updatesdk.service.otaupdate.f.e().a(com.huawei.updatesdk.b.b.a.d().a(str));
        com.huawei.updatesdk.a.a.a.b("AbstractTaskInit", "The time interval does not meet the query accountZone requirements.");
        return false;
    }
}
