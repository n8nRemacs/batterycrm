package com.avito.android.vas_performance.screens.applied_services.di;

import com.avito.android.vas_performance.deeplink.AppliedServicesLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import tL0.C48570a;

/* compiled from: AppliedServicesHandlerModule_ProvideAppliedServicesHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.deeplink.handler.b f320238a;

    public e(com.avito.android.vas_performance.deeplink.handler.b bVar) {
        this.f320238a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.deeplink.handler.b bVar = this.f320238a;
        d.f320237a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AppliedServicesLink.class, new C48570a(), new C43834a.b.C11809b(bVar));
    }
}
