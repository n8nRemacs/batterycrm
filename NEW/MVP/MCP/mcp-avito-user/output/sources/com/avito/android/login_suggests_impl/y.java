package com.avito.android.login_suggests_impl;

import android.content.res.Resources;

/* compiled from: LoginSuggestsResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f182969a;

    public y(dagger.internal.l lVar) {
        this.f182969a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new x((Resources) this.f182969a.f393949a);
    }
}
