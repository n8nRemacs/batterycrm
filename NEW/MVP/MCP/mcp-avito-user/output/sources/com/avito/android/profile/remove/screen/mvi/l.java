package com.avito.android.profile.remove.screen.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileRemoveItemsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.profile.remove.screen.e> f224189a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.profile.remove.screen.items.a> f224190b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f224191c;

    public l(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f224189a = provider;
        this.f224190b = provider2;
        this.f224191c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f224189a.get(), this.f224190b.get(), (String) this.f224191c.f393949a);
    }
}
