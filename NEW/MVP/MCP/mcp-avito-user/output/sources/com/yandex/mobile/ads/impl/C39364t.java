package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ky0;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39364t {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39350o f390045a;

    public C39364t(@j.N n2 n2Var, @j.N AdResponse adResponse, @j.N dj djVar, @j.N sm0 sm0Var, @j.N com.yandex.mobile.ads.nativeads.w wVar, @j.N com.yandex.mobile.ads.nativeads.k kVar, @j.P ky0.a aVar) {
        this.f390045a = new C39350o(n2Var, adResponse, djVar, sm0Var, wVar, kVar, aVar);
    }

    public final void a(@j.N View view, @j.P List<AbstractC39344m> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (AbstractC39344m abstractC39344m : list) {
            InterfaceC39347n interfaceC39347nA = this.f390045a.a(view.getContext(), abstractC39344m);
            if (interfaceC39347nA != null) {
                interfaceC39347nA.a(view, abstractC39344m);
            }
        }
    }
}
