package com.avito.android.tariff.cpx.info.sf.terms.di;

import com.avito.android.tariff.deeplink.TariffCpxInfoSfTermsLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCpxInfoSfTermsDeeplinkMappingsModule_ProvideTariffCpxInfoSfTermsShowDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final AB0.b f296855a;

    public d(AB0.b bVar) {
        this.f296855a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AB0.b bVar = this.f296855a;
        c.f296854a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxInfoSfTermsLink.class, new AB0.e(), new C43834a.b.C11809b(bVar));
    }
}
