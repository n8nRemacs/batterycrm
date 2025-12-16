package com.avito.android.publish.screen.objects.di;

import com.avito.android.ab_tests.groups.ServicesNotificationAboutAnomalyLowPricesGroup;
import com.avito.android.publish.screen.objects.di.C33986a;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvideServicesInstantMarketValueInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class x implements dagger.internal.h<com.avito.android.publish.imv.f> {

    /* renamed from: a, reason: collision with root package name */
    public final C34019j f239948a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.h<ServicesNotificationAboutAnomalyLowPricesGroup>> f239949b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f239950c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.publish.imv.e f239951d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.publish.imv.j f239952e;

    public x(C34019j c34019j, Provider provider, dagger.internal.l lVar, com.avito.android.publish.imv.e eVar, com.avito.android.publish.imv.j jVar) {
        this.f239948a = c34019j;
        this.f239949b = provider;
        this.f239950c = lVar;
        this.f239951d = eVar;
        this.f239952e = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        u3.h hVar = (u3.h) ((C33986a.c.Y) this.f239949b).get();
        boolean zBooleanValue = ((Boolean) this.f239950c.f393949a).booleanValue();
        this.f239948a.getClass();
        ServicesNotificationAboutAnomalyLowPricesGroup servicesNotificationAboutAnomalyLowPricesGroup = (ServicesNotificationAboutAnomalyLowPricesGroup) hVar.f439744a.f439749b;
        servicesNotificationAboutAnomalyLowPricesGroup.getClass();
        if (servicesNotificationAboutAnomalyLowPricesGroup == ServicesNotificationAboutAnomalyLowPricesGroup.f67956c && zBooleanValue) {
            return (com.avito.android.publish.imv.f) this.f239952e.get();
        }
        this.f239951d.getClass();
        return new com.avito.android.publish.imv.d();
    }
}
