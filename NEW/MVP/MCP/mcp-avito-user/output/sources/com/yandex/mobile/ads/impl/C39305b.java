package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.v10;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.yandex.mobile.ads.impl.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C39305b extends af implements v10.b {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final af f383720a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39301a f383721b = C39309c.a();

    public C39305b(@j.N Context context, @j.P SSLSocketFactory sSLSocketFactory) {
        this.f383720a = w10.a(context, this, sSLSocketFactory);
    }

    @Override // com.yandex.mobile.ads.impl.af
    public final o10 a(@j.N qy0<?> qy0Var, @j.N Map<String, String> map) {
        String strM = qy0Var.m();
        boolean zA2 = this.f383721b.a(strM);
        if (strM != null && !zA2) {
            map.put(i10.b(1), qy0Var.m());
        }
        return this.f383720a.a(qy0Var, map);
    }

    @Override // com.yandex.mobile.ads.impl.cc1
    @j.P
    public final String a(@j.P String str) {
        return (str == null || this.f383721b.a(str)) ? str : "https://yandex.ru/appcry";
    }
}
