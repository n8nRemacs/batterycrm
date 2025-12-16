package com.avito.android.short_term_rent.di.module;

import com.avito.android.short_term_rent.deeplink.StrIncreasedCashbackApplyLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrBookingLinkHandlerModule_ProvideStrIncreasedCashbackApplyLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.short_term_rent.deeplink.d f282339a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.short_term_rent.deeplink.f f282340b;

    public h(com.avito.android.short_term_rent.deeplink.d dVar, com.avito.android.short_term_rent.deeplink.f fVar) {
        this.f282339a = dVar;
        this.f282340b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f282340b.getClass();
        com.avito.android.short_term_rent.deeplink.e eVar = new com.avito.android.short_term_rent.deeplink.e();
        com.avito.android.short_term_rent.deeplink.d dVar = this.f282339a;
        d.f282332a.getClass();
        return new C43834a(StrIncreasedCashbackApplyLink.class, eVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(StrIncreasedCashbackApplyLink.class), dVar));
    }
}
