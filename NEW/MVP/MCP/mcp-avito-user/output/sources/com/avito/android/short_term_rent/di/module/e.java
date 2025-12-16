package com.avito.android.short_term_rent.di.module;

import com.avito.android.deep_linking.links.I;
import com.avito.android.deep_linking.links.J;
import com.avito.android.deep_linking.links.StrSoftBookingDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrBookingLinkHandlerModule_ProvideStrBookingLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.short_term_rent.p f282333a;

    /* renamed from: b, reason: collision with root package name */
    public final J f282334b;

    public e(com.avito.android.short_term_rent.p pVar, J j12) {
        this.f282333a = pVar;
        this.f282334b = j12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f282334b.getClass();
        I i12 = new I();
        com.avito.android.short_term_rent.p pVar = this.f282333a;
        d.f282332a.getClass();
        return new C43834a(StrSoftBookingDeepLink.class, i12, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(StrSoftBookingDeepLink.class), pVar));
    }
}
