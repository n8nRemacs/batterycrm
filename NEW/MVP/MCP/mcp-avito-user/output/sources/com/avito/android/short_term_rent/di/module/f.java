package com.avito.android.short_term_rent.di.module;

import com.avito.android.deep_linking.links.D;
import com.avito.android.deep_linking.links.E;
import com.avito.android.deep_linking.links.StrBookingPaymentFailureLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrBookingLinkHandlerModule_ProvideStrBookingPaymentFailureLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.short_term_rent.g f282335a;

    /* renamed from: b, reason: collision with root package name */
    public final E f282336b;

    public f(com.avito.android.short_term_rent.g gVar, E e12) {
        this.f282335a = gVar;
        this.f282336b = e12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f282336b.getClass();
        D d12 = new D();
        com.avito.android.short_term_rent.g gVar = this.f282335a;
        d.f282332a.getClass();
        return new C43834a(StrBookingPaymentFailureLink.class, d12, new C43834a.b.C11809b(gVar));
    }
}
