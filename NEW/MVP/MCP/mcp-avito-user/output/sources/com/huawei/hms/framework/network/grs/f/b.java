package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.foundation.H;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import q01.C47180a;
import w01.C49418a;
import w01.C49419b;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f363525b = new ConcurrentHashMap(16);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f363526c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public a f363527a;

    public static b a(String str, GrsBaseInfo grsBaseInfo) {
        ConcurrentHashMap concurrentHashMap = f363525b;
        StringBuilder sbR = H.r(str);
        sbR.append(grsBaseInfo.uniqueCode());
        return (b) concurrentHashMap.get(sbR.toString());
    }

    public static void e(Context context, GrsBaseInfo grsBaseInfo) {
        b bVarA = a(context.getPackageName(), grsBaseInfo);
        if (bVarA != null) {
            Logger.i("LocalManagerProxy", "appGrs is not null and clear services.");
            synchronized (f363526c) {
                a aVar = bVarA.f363527a;
                C49418a c49418a = aVar.f363518a;
                if (c49418a != null) {
                    HashMap map = c49418a.f441143b;
                    if (map != null) {
                        map.clear();
                    }
                    aVar.f363523f = true;
                }
            }
        }
    }

    public final String b(Context context, C47180a c47180a, GrsBaseInfo grsBaseInfo, String str, String str2) {
        String str3;
        synchronized (f363526c) {
            try {
                Map<String, String> mapD = this.f363527a.d(context, c47180a, grsBaseInfo, str, true);
                String str4 = null;
                if (mapD == null) {
                    Logger.w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
                    str3 = null;
                } else {
                    str3 = (String) ((HashMap) mapD).get(str2);
                }
                if (!TextUtils.isEmpty(str3) || !this.f363527a.f363523f) {
                    return str3;
                }
                d(context);
                f(grsBaseInfo);
                f363525b.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
                Map<String, String> mapD2 = this.f363527a.d(context, c47180a, grsBaseInfo, str, true);
                if (mapD2 == null) {
                    Logger.w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
                } else {
                    str4 = (String) ((HashMap) mapD2).get(str2);
                }
                return str4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Map<String, String> c(Context context, C47180a c47180a, GrsBaseInfo grsBaseInfo, String str, boolean z12) {
        synchronized (f363526c) {
            try {
                Map<String, String> mapD = this.f363527a.d(context, c47180a, grsBaseInfo, str, z12);
                if ((mapD != null && !((HashMap) mapD).isEmpty()) || !this.f363527a.f363523f) {
                    return mapD;
                }
                d(context);
                f(grsBaseInfo);
                f363525b.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
                return this.f363527a.d(context, c47180a, grsBaseInfo, str, z12);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.Context r12) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.f.b.d(android.content.Context):void");
    }

    public final void f(GrsBaseInfo grsBaseInfo) {
        a aVar = this.f363527a;
        ConcurrentHashMap concurrentHashMap = aVar.f363520c;
        concurrentHashMap.put("no_route_country", "no-country");
        ArrayList arrayList = aVar.f363519b;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = aVar.f363519b.iterator();
        while (it.hasNext()) {
            C49419b c49419b = (C49419b) it.next();
            if (c49419b.f441145b.contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), c49419b.f441144a);
            }
            if (c49419b.f441145b.contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), c49419b.f441144a);
            }
            if (c49419b.f441145b.contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), c49419b.f441144a);
            }
        }
        aVar.f363519b = null;
    }
}
