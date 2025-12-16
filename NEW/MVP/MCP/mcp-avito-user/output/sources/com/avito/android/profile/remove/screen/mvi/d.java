package com.avito.android.profile.remove.screen.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveItemsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f224170a;

    public d(dagger.internal.l lVar) {
        this.f224170a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(((Boolean) this.f224170a.f393949a).booleanValue());
    }
}
