package com.avito.android.profile.user_profile.di;

import javax.inject.Provider;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserProfileModule_ProvideTnsPromoBlockActionsFlowFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<InterfaceC43160i<com.avito.android.promoblock.a>> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226123a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.d<com.avito.android.promoblock.a>> f226124b;

    public s(f fVar, Provider<com.jakewharton.rxrelay3.d<com.avito.android.promoblock.a>> provider) {
        this.f226123a = fVar;
        this.f226124b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.jakewharton.rxrelay3.d<com.avito.android.promoblock.a> dVar = this.f226124b.get();
        this.f226123a.getClass();
        return kotlinx.coroutines.rx3.y.a(dVar);
    }
}
