package com.avito.android.developments_agency_search.di;

import com.avito.android.developments_agency_search.deeplink.HelpCenterLink;
import com.avito.android.developments_agency_search.deeplink.n;
import com.avito.android.developments_agency_search.deeplink.o;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DevelopmentsAgencySearchLinkHandlerModule_ProvideHelpCenterLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final n f136491a;

    public d(n nVar) {
        this.f136491a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = this.f136491a;
        a.f136488a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(HelpCenterLink.class, new o(), new C43834a.b.C11809b(nVar));
    }
}
