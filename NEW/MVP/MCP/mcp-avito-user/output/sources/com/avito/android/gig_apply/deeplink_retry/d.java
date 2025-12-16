package com.avito.android.gig_apply.deeplink_retry;

import com.avito.android.gig_apply.GigSlotRetryDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigSlotRetryPaymentDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f159619a;

    public d(e eVar) {
        this.f159619a = eVar;
    }

    public static C43834a a(e eVar) {
        c.f159618a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigSlotRetryDeeplink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigSlotRetryDeeplink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f159619a);
    }
}
