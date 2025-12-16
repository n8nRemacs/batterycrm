package com.avito.android.developments_agency_search.di;

import com.avito.android.developments_agency_search.deeplink.C29833d;
import com.avito.android.developments_agency_search.deeplink.C29834e;
import com.avito.android.developments_agency_search.deeplink.DealCabinetLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DevelopmentsAgencySearchLinkHandlerModule_ProvideDealCabinetLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C29833d f136489a;

    public b(C29833d c29833d) {
        this.f136489a = c29833d;
    }

    public static C43834a a(C29833d c29833d) {
        a.f136488a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(DealCabinetLink.class, new C29834e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DealCabinetLink.class), c29833d));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f136489a);
    }
}
