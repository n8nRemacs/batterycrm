package com.avito.android.gig_motivation_payment.ui.deeplinks.payment_refresh;

import com.avito.android.gig_motivation_payment.GigMotivationPaymentRefreshDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigMotivationPaymentRefreshDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f160196a;

    public c(d dVar) {
        this.f160196a = dVar;
    }

    public static C43834a a(d dVar) {
        b.f160195a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigMotivationPaymentRefreshDeeplink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigMotivationPaymentRefreshDeeplink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f160196a);
    }
}
