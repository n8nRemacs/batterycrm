package com.avito.android.developments_agency_search.di;

import com.avito.android.developments_agency_search.deeplink.H;
import com.avito.android.developments_agency_search.deeplink.I;
import com.avito.android.developments_agency_search.deeplink.TariffCardRegionSelectorLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DevelopmentsAgencySearchLinkHandlerModule_ProvideTariffCardRegionSelectorLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final H f136495a;

    public h(H h12) {
        this.f136495a = h12;
    }

    public static C43834a a(H h12) {
        a.f136488a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCardRegionSelectorLink.class, new I(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCardRegionSelectorLink.class), h12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f136495a);
    }
}
