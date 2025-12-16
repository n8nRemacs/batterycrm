package com.avito.android.developments_agency_search.di;

import com.avito.android.developments_agency_search.deeplink.C29839j;
import com.avito.android.developments_agency_search.deeplink.C29840k;
import com.avito.android.developments_agency_search.deeplink.DealRoomLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DevelopmentsAgencySearchLinkHandlerModule_ProvideDealRoomLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C29839j f136490a;

    public c(C29839j c29839j) {
        this.f136490a = c29839j;
    }

    public static C43834a a(C29839j c29839j) {
        a.f136488a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(DealRoomLink.class, new C29840k(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DealRoomLink.class), c29839j));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f136490a);
    }
}
