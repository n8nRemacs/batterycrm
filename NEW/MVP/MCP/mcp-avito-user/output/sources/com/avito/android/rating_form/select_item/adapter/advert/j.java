package com.avito.android.rating_form.select_item.adapter.advert;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertItemRedesignBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f248925a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f248926b;

    public j(dagger.internal.l lVar, Provider provider) {
        this.f248925a = provider;
        this.f248926b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f248925a.get(), ((Boolean) this.f248926b.f393949a).booleanValue());
    }
}
