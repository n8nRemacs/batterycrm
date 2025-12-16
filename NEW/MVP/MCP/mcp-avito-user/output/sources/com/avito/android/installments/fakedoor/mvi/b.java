package com.avito.android.installments.fakedoor.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FakedoorActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.installments.fakedoor.f f172564a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f172565b;

    public b(com.avito.android.installments.fakedoor.f fVar, Provider provider) {
        this.f172564a = fVar;
        this.f172565b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.installments.fakedoor.e) this.f172564a.get(), this.f172565b.get());
    }
}
