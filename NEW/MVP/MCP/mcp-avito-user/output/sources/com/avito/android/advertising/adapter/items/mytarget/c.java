package com.avito.android.advertising.adapter.items.mytarget;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MyTargetBigBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f87613a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.e> f87614b;

    public c(Provider<j> provider, Provider<com.avito.android.serp.e> provider2) {
        this.f87613a = provider;
        this.f87614b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f87613a.get(), this.f87614b.get());
    }
}
