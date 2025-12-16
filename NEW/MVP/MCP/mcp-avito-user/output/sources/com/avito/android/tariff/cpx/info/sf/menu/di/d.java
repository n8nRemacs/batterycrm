package com.avito.android.tariff.cpx.info.sf.menu.di;

import com.avito.android.tariff.cpx.info.sf.menu.deeplink.TariffCpxInfoSfMenuLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import xB0.C49811b;

/* compiled from: TariffCpxInfoSfMenuDeeplinkMappingsModule_ProvideTariffCpxInfoSfMenuShowDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C49811b f296781a;

    public d(C49811b c49811b) {
        this.f296781a = c49811b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C49811b c49811b = this.f296781a;
        c.f296780a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxInfoSfMenuLink.class, new xB0.e(), new C43834a.b.C11809b(c49811b));
    }
}
