package com.avito.android.rating_form.select_item.adapter.advert;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f248913a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f248914b;

    public c(dagger.internal.l lVar, Provider provider) {
        this.f248913a = provider;
        this.f248914b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f248913a.get(), ((Boolean) this.f248914b.f393949a).booleanValue());
    }
}
