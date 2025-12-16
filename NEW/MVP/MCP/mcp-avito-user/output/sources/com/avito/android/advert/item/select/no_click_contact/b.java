package com.avito.android.advert.item.select.no_click_contact;

import javax.inject.Provider;

/* compiled from: AutoSelectNoClickContactBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f79442a;

    public b(Provider<c> provider) {
        this.f79442a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f79442a.get());
    }
}
