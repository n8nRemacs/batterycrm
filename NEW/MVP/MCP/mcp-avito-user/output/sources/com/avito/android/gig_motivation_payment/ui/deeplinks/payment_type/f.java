package com.avito.android.gig_motivation_payment.ui.deeplinks.payment_type;

import com.avito.android.gig_motivation_payment.GigMotivationPaymentTypeDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigMotivationPaymentTypeDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f160209a;

    public f(h hVar) {
        this.f160209a = hVar;
    }

    public static C43834a a(h hVar) {
        e.f160208a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigMotivationPaymentTypeDeeplink.class, new i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigMotivationPaymentTypeDeeplink.class), hVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f160209a);
    }
}
