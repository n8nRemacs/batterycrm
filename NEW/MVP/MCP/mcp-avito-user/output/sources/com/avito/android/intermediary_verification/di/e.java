package com.avito.android.intermediary_verification.di;

import com.avito.android.intermediary_verification.deeplink.IntermediaryVerificationLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IntermediaryVerificationLinkHandlerModule_ProvideIntermediaryVerificationLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.intermediary_verification.deeplink.b f173142a;

    public e(com.avito.android.intermediary_verification.deeplink.b bVar) {
        this.f173142a = bVar;
    }

    public static C43834a a(com.avito.android.intermediary_verification.deeplink.b bVar) {
        d.f173141a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IntermediaryVerificationLink.class, new com.avito.android.intermediary_verification.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IntermediaryVerificationLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f173142a);
    }
}
