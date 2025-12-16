package com.avito.android.advert_stats.detail.tab.items.button;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ButtonItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f86250a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f86251b;

    public b(u uVar, Provider provider) {
        this.f86250a = uVar;
        this.f86251b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f86250a.get(), this.f86251b.get());
    }
}
