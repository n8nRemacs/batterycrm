package com.avito.android.profile.user_profile.di;

import javax.inject.Provider;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserProfileModule_ProvidePassportCardEventFlowFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<InterfaceC43160i<com.avito.android.component.user_hat.e>> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226115a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<com.avito.android.component.user_hat.e>> f226116b;

    public o(f fVar, Provider<com.jakewharton.rxrelay3.c<com.avito.android.component.user_hat.e>> provider) {
        this.f226115a = fVar;
        this.f226116b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.jakewharton.rxrelay3.c<com.avito.android.component.user_hat.e> cVar = this.f226116b.get();
        this.f226115a.getClass();
        return kotlinx.coroutines.rx3.y.a(cVar);
    }
}
