package com.avito.android.short_term_rent.di.module;

import com.avito.android.deep_linking.links.StrBookingPaymentLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrBookingLinkHandlerModule_ProvideStrBookingPaymentLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.short_term_rent.j f282337a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.short_term_rent.l f282338b;

    public g(com.avito.android.short_term_rent.j jVar, com.avito.android.short_term_rent.l lVar) {
        this.f282337a = jVar;
        this.f282338b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f282338b.getClass();
        com.avito.android.short_term_rent.k kVar = new com.avito.android.short_term_rent.k();
        com.avito.android.short_term_rent.j jVar = this.f282337a;
        d.f282332a.getClass();
        return new C43834a(StrBookingPaymentLink.class, kVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(StrBookingPaymentLink.class), jVar));
    }
}
