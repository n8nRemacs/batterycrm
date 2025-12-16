package com.avito.android.installments.di;

import com.avito.android.deep_linking.links.InstallmentsFormShowLink;
import com.avito.android.installments.form.deeplink.m;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: InstallmentsDeepLinkHandlerModule_ProvideInstallmentsFormDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.installments.form.deeplink.f f172484a;

    public c(com.avito.android.installments.form.deeplink.f fVar) {
        this.f172484a = fVar;
    }

    public static C43834a a(com.avito.android.installments.form.deeplink.f fVar) {
        a.f172482a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(InstallmentsFormShowLink.class, new m(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(InstallmentsFormShowLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f172484a);
    }
}
