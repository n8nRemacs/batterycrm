package com.yandex.mobile.ads.impl;

import android.content.Context;
import d11.AbstractC39485b;
import java.util.Map;

/* loaded from: classes8.dex */
final class sf0 implements je0<AbstractC39485b, d11.c> {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private AbstractC39485b f389926a;

    @Override // com.yandex.mobile.ads.impl.je0
    public final void a(@j.N com.monetization.ads.mediation.base.e eVar) {
        ((AbstractC39485b) eVar).b();
    }

    @Override // com.yandex.mobile.ads.impl.je0
    public final void a(@j.N Context context, @j.N com.monetization.ads.mediation.base.e eVar, @j.N Object obj, @j.N Map map, @j.N Map map2) {
        AbstractC39485b abstractC39485b = (AbstractC39485b) eVar;
        this.f389926a = abstractC39485b;
        abstractC39485b.a();
    }

    @j.P
    public final AbstractC39485b a() {
        return this.f389926a;
    }
}
