package com.avito.android.installments.di;

import com.avito.android.deep_linking.links.InstallmentsFakeDoorLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: InstallmentsDeepLinkHandlerModule_ProvideInstallmentsFakedoorDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.installments.fakedoor.deeplink.d f172483a;

    public b(com.avito.android.installments.fakedoor.deeplink.d dVar) {
        this.f172483a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.installments.fakedoor.deeplink.d dVar = this.f172483a;
        a.f172482a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(InstallmentsFakeDoorLink.class, new com.avito.android.installments.fakedoor.deeplink.a(), new C43834a.b.C11809b(dVar));
    }
}
