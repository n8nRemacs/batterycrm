package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes8.dex */
final class me0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final q20 f387982a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final cf0 f387983b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final dk0 f387984c;

    public interface a {
        void a(@j.N AdResponse<bl0> adResponse);
    }

    public me0(@j.N Context context, @j.N q20 q20Var, @j.N cf0 cf0Var) {
        this.f387982a = q20Var;
        this.f387983b = cf0Var;
        this.f387984c = new dk0(context);
    }

    public final void a(@j.N com.monetization.ads.mediation.nativeads.a aVar, @j.N int i12, @j.N ArrayList arrayList, @j.N a aVar2) {
        this.f387982a.a(this.f387983b.a(arrayList), new le0(this, aVar, i12, aVar2));
    }

    public static void a(me0 me0Var, com.monetization.ads.mediation.nativeads.a aVar, Map map, int i12, a aVar2) {
        aVar2.a(me0Var.f387984c.a(aVar, map, i12));
    }
}
