package com.avito.android.developments_agency_search.di;

import com.avito.android.developments_agency_search.deeplink.MortgageProApplicationLink;
import com.avito.android.developments_agency_search.deeplink.q;
import com.avito.android.developments_agency_search.deeplink.s;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DevelopmentsAgencySearchLinkHandlerModule_ProvideMortgageProApplicationLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final q f136492a;

    public e(q qVar) {
        this.f136492a = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        q qVar = this.f136492a;
        a.f136488a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageProApplicationLink.class, new s(), new C43834a.b.C11809b(qVar));
    }
}
