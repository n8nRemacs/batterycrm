package com.avito.android.developments_agency_search.di;

import com.avito.android.developments_agency_search.deeplink.C;
import com.avito.android.developments_agency_search.deeplink.D;
import com.avito.android.developments_agency_search.deeplink.RealtyAgencySearchLotsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DevelopmentsAgencySearchLinkHandlerModule_ProvideRealtyAgencySearchLotsLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C f136494a;

    public g(C c12) {
        this.f136494a = c12;
    }

    public static C43834a a(C c12) {
        a.f136488a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RealtyAgencySearchLotsLink.class, new D(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RealtyAgencySearchLotsLink.class), c12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f136494a);
    }
}
