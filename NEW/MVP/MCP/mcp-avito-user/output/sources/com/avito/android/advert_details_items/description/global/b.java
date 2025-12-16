package com.avito.android.advert_details_items.description.global;

import com.avito.android.advert_details_items.description.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsDescriptionGlobalBrandBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f84634a;

    public b(Provider<c> provider) {
        this.f84634a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f84634a.get());
    }
}
