package com.avito.android.settings.adapter;

import javax.inject.Provider;

/* compiled from: ReplaceMainItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class X implements dagger.internal.h<W> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.replace_main.toggle.v> f280762a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f280763b;

    public X(dagger.internal.l lVar, Provider provider) {
        this.f280762a = provider;
        this.f280763b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new W(this.f280762a.get(), (Y41.l) this.f280763b.f393949a);
    }
}
