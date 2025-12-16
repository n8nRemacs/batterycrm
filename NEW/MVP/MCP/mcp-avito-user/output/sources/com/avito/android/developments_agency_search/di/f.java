package com.avito.android.developments_agency_search.di;

import com.avito.android.developments_agency_search.deeplink.RealtyAgencySearchLink;
import com.avito.android.developments_agency_search.deeplink.w;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DevelopmentsAgencySearchLinkHandlerModule_ProvideRealtyAgencySearchLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final w f136493a;

    public f(w wVar) {
        this.f136493a = wVar;
    }

    public static C43834a a(w wVar) {
        a.f136488a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RealtyAgencySearchLink.class, new com.avito.android.developments_agency_search.deeplink.x(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RealtyAgencySearchLink.class), wVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f136493a);
    }
}
