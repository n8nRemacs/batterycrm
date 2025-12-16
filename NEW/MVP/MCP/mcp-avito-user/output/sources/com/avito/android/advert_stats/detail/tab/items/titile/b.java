package com.avito.android.advert_stats.detail.tab.items.titile;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TitleItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f86459a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f86460b;

    public b(u uVar, Provider provider) {
        this.f86459a = uVar;
        this.f86460b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f86459a.get(), this.f86460b.get());
    }
}
