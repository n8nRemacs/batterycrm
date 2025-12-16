package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.network.grs.b;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import q01.C47180a;
import q01.C47181b;
import s01.C47954c;

/* loaded from: classes7.dex */
public class GrsClient {
    private static final String EMPTY_STRING = "";
    private final d grsClientGlobal;

    public GrsClient(Context context, GrsBaseInfo grsBaseInfo) {
        d dVar;
        if (context == null || grsBaseInfo == null) {
            throw new NullPointerException("invalid init params for context is null or GrsBaseInfo instance is null Object.");
        }
        synchronized (e.f363517b) {
            try {
                int iUniqueCode = grsBaseInfo.uniqueCode();
                ConcurrentHashMap concurrentHashMap = e.f363516a;
                dVar = (d) concurrentHashMap.get(context.getPackageName() + iUniqueCode);
                if (dVar != null) {
                    d dVar2 = new d();
                    dVar2.f363512h = null;
                    try {
                        dVar2.f363505a = grsBaseInfo.m111clone();
                    } catch (CloneNotSupportedException e12) {
                        Logger.w("c", "GrsClient catch CloneNotSupportedException", e12);
                        dVar2.f363505a = grsBaseInfo.copy();
                    }
                    if (!(dVar == dVar2 ? true : dVar.f363505a.compare(dVar2.f363505a))) {
                        dVar = new d(context, grsBaseInfo);
                        concurrentHashMap.put(context.getPackageName() + iUniqueCode, dVar);
                    }
                } else {
                    dVar = new d(context, grsBaseInfo);
                    concurrentHashMap.put(context.getPackageName() + iUniqueCode, dVar);
                }
            } finally {
            }
        }
        this.grsClientGlobal = dVar;
    }

    public void ayncGetGrsUrl(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        int i12;
        d dVar = this.grsClientGlobal;
        if (dVar == null) {
            iQueryUrlCallBack.onCallBackFail(-8);
            return;
        }
        if (iQueryUrlCallBack == null) {
            Logger.w("c", "IQueryUrlCallBack is must not null for process continue.");
            return;
        }
        if (dVar.f363505a == null || str == null || str2 == null) {
            i12 = -6;
        } else {
            if (dVar.a()) {
                b bVar = dVar.f363511g;
                bVar.getClass();
                C47181b c47181b = new C47181b();
                Context context = dVar.f363506b;
                String str3 = bVar.e(str, c47181b, context).get(str2);
                boolean z12 = c47181b.f428949a == 1;
                GrsBaseInfo grsBaseInfo = bVar.f363486a;
                if (z12) {
                    Logger.i("a", "get unexpired cache localUrl");
                    if (TextUtils.isEmpty(str3)) {
                        iQueryUrlCallBack.onCallBackFail(-5);
                        return;
                    }
                    com.huawei.hms.framework.network.grs.f.b.e(context, grsBaseInfo);
                    Logger.i("a", "ayncGetGrsUrl: %s", StringUtils.anonymizeMessage(str3));
                    iQueryUrlCallBack.onCallBackSuccess(str3);
                    return;
                }
                C47954c c47954c = new C47954c(context, grsBaseInfo);
                b.C10755b c10755b = new b.C10755b();
                c10755b.f363496a = str;
                c10755b.f363497b = str2;
                c10755b.f363498c = iQueryUrlCallBack;
                c10755b.f363499d = str3;
                c10755b.f363500e = context;
                c10755b.f363501f = grsBaseInfo;
                c10755b.f363502g = bVar.f363487b;
                bVar.f363488c.c(c47954c, c10755b, str, bVar.f363489d);
                return;
            }
            Logger.i("c", "grs init task has not completed.");
            i12 = -7;
        }
        iQueryUrlCallBack.onCallBackFail(i12);
    }

    public void ayncGetGrsUrls(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        int i12;
        d dVar = this.grsClientGlobal;
        if (dVar == null) {
            iQueryUrlsCallBack.onCallBackFail(-8);
            return;
        }
        if (iQueryUrlsCallBack == null) {
            Logger.w("c", "IQueryUrlsCallBack is must not null for process continue.");
            return;
        }
        if (dVar.f363505a == null || str == null) {
            i12 = -6;
        } else {
            if (dVar.a()) {
                b bVar = dVar.f363511g;
                bVar.getClass();
                C47181b c47181b = new C47181b();
                Context context = dVar.f363506b;
                Map<String, String> mapE = bVar.e(str, c47181b, context);
                boolean z12 = c47181b.f428949a == 1;
                GrsBaseInfo grsBaseInfo = bVar.f363486a;
                if (z12) {
                    Logger.i("a", "get unexpired cache localUrls");
                    if (mapE.isEmpty()) {
                        iQueryUrlsCallBack.onCallBackFail(-5);
                        return;
                    }
                    com.huawei.hms.framework.network.grs.f.b.e(context, grsBaseInfo);
                    Logger.i("a", "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(mapE).toString()));
                    iQueryUrlsCallBack.onCallBackSuccess(mapE);
                    return;
                }
                C47954c c47954c = new C47954c(context, grsBaseInfo);
                b.a aVar = new b.a();
                aVar.f363490a = str;
                aVar.f363491b = mapE;
                aVar.f363492c = iQueryUrlsCallBack;
                aVar.f363493d = context;
                aVar.f363494e = grsBaseInfo;
                aVar.f363495f = bVar.f363487b;
                bVar.f363488c.c(c47954c, aVar, str, bVar.f363489d);
                return;
            }
            Logger.i("c", "grs init task has not completed.");
            i12 = -7;
        }
        iQueryUrlsCallBack.onCallBackFail(i12);
    }

    public void clearSp() throws UnsupportedEncodingException {
        d dVar = this.grsClientGlobal;
        if (dVar != null && dVar.a()) {
            String grsParasKey = dVar.f363505a.getGrsParasKey(true, true, dVar.f363506b);
            dVar.f363509e.b(grsParasKey);
            dVar.f363509e.b(grsParasKey + CrashHianalyticsData.TIME);
            dVar.f363509e.b(grsParasKey + "ETag");
            dVar.f363507c.b(grsParasKey);
        }
    }

    public boolean forceExpire() throws UnsupportedEncodingException {
        GrsBaseInfo grsBaseInfo;
        Context context;
        d dVar = this.grsClientGlobal;
        if (dVar == null || !dVar.a() || (grsBaseInfo = dVar.f363505a) == null || (context = dVar.f363506b) == null) {
            return false;
        }
        C47180a c47180a = dVar.f363508d;
        c47180a.getClass();
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        c47180a.f428946c.c(r.q(grsParasKey, CrashHianalyticsData.TIME), "0");
        c47180a.f428945b.remove(grsParasKey + CrashHianalyticsData.TIME);
        c47180a.f428944a.remove(grsParasKey);
        c47180a.f428948e.b(grsParasKey);
        return true;
    }

    public String synGetGrsUrl(String str, String str2) {
        d dVar = this.grsClientGlobal;
        if (dVar == null) {
            return "";
        }
        if (dVar.f363505a == null || str == null || str2 == null) {
            Logger.w("c", "invalid para!");
            return null;
        }
        if (!dVar.a()) {
            return null;
        }
        b bVar = dVar.f363511g;
        bVar.getClass();
        C47181b c47181b = new C47181b();
        Context context = dVar.f363506b;
        String strB = bVar.e(str, c47181b, context).get(str2);
        boolean z12 = c47181b.f428949a == 1;
        GrsBaseInfo grsBaseInfo = bVar.f363486a;
        if (!z12 || TextUtils.isEmpty(strB)) {
            String str3 = (String) b.c(bVar.a(context, str), str).get(str2);
            if (!TextUtils.isEmpty(str3)) {
                Logger.i("a", "get url is from remote server");
                com.huawei.hms.framework.network.grs.f.b.e(context, grsBaseInfo);
                return str3;
            }
            if (TextUtils.isEmpty(strB)) {
                Logger.i("a", "access local config for return a domain.");
                strB = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName(), grsBaseInfo).b(context, bVar.f363487b, bVar.f363486a, str, str2);
            } else {
                Logger.i("a", "get expired cache localUrl");
            }
            Logger.i("a", "synGetGrsUrl: %s", StringUtils.anonymizeMessage(strB));
        } else {
            Logger.i("a", "get unexpired cache localUrl: %s", StringUtils.anonymizeMessage(strB));
            com.huawei.hms.framework.network.grs.f.b.e(context, grsBaseInfo);
        }
        return strB;
    }

    public Map<String, String> synGetGrsUrls(String str) {
        d dVar = this.grsClientGlobal;
        if (dVar == null) {
            return new HashMap();
        }
        if (dVar.f363505a == null || str == null) {
            Logger.w("c", "invalid para!");
            return new HashMap();
        }
        if (!dVar.a()) {
            return new HashMap();
        }
        b bVar = dVar.f363511g;
        bVar.getClass();
        C47181b c47181b = new C47181b();
        Context context = dVar.f363506b;
        Map<String, String> mapE = bVar.e(str, c47181b, context);
        boolean z12 = c47181b.f428949a == 1;
        GrsBaseInfo grsBaseInfo = bVar.f363486a;
        if (z12 && !mapE.isEmpty()) {
            Logger.i("a", "get unexpired cache localUrls: %s", StringUtils.anonymizeMessage(new JSONObject(mapE).toString()));
            com.huawei.hms.framework.network.grs.f.b.e(context, grsBaseInfo);
            return mapE;
        }
        HashMap mapC = b.c(bVar.a(context, str), str);
        if (!mapC.isEmpty()) {
            Logger.i("a", "get url is from remote server");
            com.huawei.hms.framework.network.grs.f.b.e(context, grsBaseInfo);
            return mapC;
        }
        if (mapE.isEmpty()) {
            Logger.i("a", "access local config for return a domain.");
            mapE = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName(), grsBaseInfo).c(context, bVar.f363487b, bVar.f363486a, str, true);
        } else {
            Logger.i("a", "get expired cache localUrls");
        }
        Logger.i("a", "synGetGrsUrls: %s", StringUtils.anonymizeMessage(mapE != null ? new JSONObject(mapE).toString() : ""));
        return mapE;
    }
}
