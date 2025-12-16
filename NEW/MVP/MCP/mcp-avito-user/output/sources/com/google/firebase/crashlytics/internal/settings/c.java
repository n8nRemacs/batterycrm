package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.HashMap;
import lZ0.C43711a;
import lZ0.C43712b;

/* compiled from: DefaultSettingsSpiCall.java */
/* loaded from: classes4.dex */
class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f361454a;

    public c(String str, C43712b c43712b) {
        this.f361454a = str;
    }

    public static void a(C43711a c43711a, l lVar) {
        b(c43711a, "X-CRASHLYTICS-GOOGLE-APP-ID", lVar.f361480a);
        b(c43711a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(c43711a, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.3.7");
        b(c43711a, "Accept", "application/json");
        b(c43711a, "X-CRASHLYTICS-DEVICE-MODEL", lVar.f361481b);
        b(c43711a, "X-CRASHLYTICS-OS-BUILD-VERSION", lVar.f361482c);
        b(c43711a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", lVar.f361483d);
        b(c43711a, "X-CRASHLYTICS-INSTALLATION-ID", lVar.f361484e.c());
    }

    public static void b(C43711a c43711a, String str, String str2) {
        if (str2 != null) {
            c43711a.f413901c.put(str, str2);
        }
    }

    public static HashMap c(l lVar) {
        HashMap map = new HashMap();
        map.put("build_version", lVar.f361487h);
        map.put("display_version", lVar.f361486g);
        map.put(SearchParamsConverterKt.SOURCE, Integer.toString(lVar.f361488i));
        String str = lVar.f361485f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }
}
