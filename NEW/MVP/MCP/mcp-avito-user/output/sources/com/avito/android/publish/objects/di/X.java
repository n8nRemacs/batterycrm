package com.avito.android.publish.objects.di;

import com.avito.android.ab_tests.groups.ServicesNotificationAboutAnomalyLowPricesGroup;
import com.avito.android.publish.objects.di.C33894a;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvideServicesInstantMarketValueInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class X implements dagger.internal.h<com.avito.android.publish.imv.f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<u3.h<ServicesNotificationAboutAnomalyLowPricesGroup>> f237677a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f237678b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.publish.imv.e f237679c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.publish.imv.j f237680d;

    public X(Provider provider, dagger.internal.l lVar, com.avito.android.publish.imv.e eVar, com.avito.android.publish.imv.j jVar) {
        this.f237677a = provider;
        this.f237678b = lVar;
        this.f237679c = eVar;
        this.f237680d = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        u3.h hVar = (u3.h) ((C33894a.c.Y) this.f237677a).get();
        boolean zBooleanValue = ((Boolean) this.f237678b.f393949a).booleanValue();
        C33939w.f238031a.getClass();
        ServicesNotificationAboutAnomalyLowPricesGroup servicesNotificationAboutAnomalyLowPricesGroup = (ServicesNotificationAboutAnomalyLowPricesGroup) hVar.f439744a.f439749b;
        servicesNotificationAboutAnomalyLowPricesGroup.getClass();
        if (servicesNotificationAboutAnomalyLowPricesGroup == ServicesNotificationAboutAnomalyLowPricesGroup.f67956c && zBooleanValue) {
            return (com.avito.android.publish.imv.f) this.f237680d.get();
        }
        this.f237679c.getClass();
        return new com.avito.android.publish.imv.d();
    }
}
