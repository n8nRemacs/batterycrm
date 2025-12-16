package com.avito.android.tariff.cpx.configure.advance_manual.di;

import com.avito.android.tariff.cpx.configure.advance_manual.deeplink.TariffCpxConfigureAdvanceManualDeepLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import nB0.C44227c;

/* compiled from: CpxConfigureAdvanceManualDeeplinkMappingsModule_ProvideTariffCpxLevelFeatureMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final nB0.e f295807a;

    public c(nB0.e eVar) {
        this.f295807a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        nB0.e eVar = this.f295807a;
        b.f295806a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxConfigureAdvanceManualDeepLink.class, new C44227c(), new C43834a.b.C11809b(eVar));
    }
}
