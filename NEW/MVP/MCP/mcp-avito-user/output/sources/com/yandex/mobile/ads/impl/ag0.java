package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes8.dex */
final class ag0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final re0 f383551a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final pe0 f383552b = new pe0();

    public ag0(@j.N re0 re0Var) {
        this.f383551a = re0Var;
    }

    public final void a(@j.N Context context, @j.N zf0 zf0Var, @j.P com.monetization.ads.mediation.base.e eVar, @j.N String str, @j.P Long l12) {
        HashMap map = new HashMap();
        map.put("failure_reason", str);
        map.put("status", "error");
        if (l12 != null) {
            map.put("response_time", l12);
        }
        if (eVar != null) {
            this.f383552b.getClass();
            map.putAll(pe0.a(eVar));
        }
        this.f383551a.f(context, zf0Var, map);
    }

    public final void a(@j.N Context context, @j.N zf0 zf0Var, @j.P com.monetization.ads.mediation.base.e eVar) {
        HashMap mapG = org.webrtc.h.g("status", "success");
        if (eVar != null) {
            this.f383552b.getClass();
            mapG.putAll(pe0.a(eVar));
        }
        this.f383551a.f(context, zf0Var, mapG);
    }
}
