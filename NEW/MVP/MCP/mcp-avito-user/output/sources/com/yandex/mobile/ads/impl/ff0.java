package com.yandex.mobile.ads.impl;

import android.content.Context;
import c11.AbstractC26922a;
import java.util.Map;

/* loaded from: classes8.dex */
final class ff0 implements je0<AbstractC26922a, AbstractC26922a.InterfaceC2026a> {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private AbstractC26922a f385312a;

    @Override // com.yandex.mobile.ads.impl.je0
    public final void a(@j.N com.monetization.ads.mediation.base.e eVar) {
        ((AbstractC26922a) eVar).b();
    }

    @Override // com.yandex.mobile.ads.impl.je0
    public final void a(@j.N Context context, @j.N com.monetization.ads.mediation.base.e eVar, @j.N Object obj, @j.N Map map, @j.N Map map2) {
        AbstractC26922a abstractC26922a = (AbstractC26922a) eVar;
        this.f385312a = abstractC26922a;
        abstractC26922a.a();
    }

    @j.P
    public final AbstractC26922a a() {
        return this.f385312a;
    }
}
