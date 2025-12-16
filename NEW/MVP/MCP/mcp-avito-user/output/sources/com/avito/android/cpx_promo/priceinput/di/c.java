package com.avito.android.cpx_promo.priceinput.di;

import com.avito.android.cpx_promo.priceinput.deeplink.CpxPromoPriceInputDeepLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpxPromoPriceInputDeeplinkMappingsModule_ProvideCpxPromoPriceInputMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo.priceinput.deeplink.d f127305a;

    public c(com.avito.android.cpx_promo.priceinput.deeplink.d dVar) {
        this.f127305a = dVar;
    }

    public static C43834a a(com.avito.android.cpx_promo.priceinput.deeplink.d dVar) {
        b.f127304a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CpxPromoPriceInputDeepLink.class, new com.avito.android.cpx_promo.priceinput.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CpxPromoPriceInputDeepLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f127305a);
    }
}
