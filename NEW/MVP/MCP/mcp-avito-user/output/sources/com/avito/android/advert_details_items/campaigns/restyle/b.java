package com.avito.android.advert_details_items.campaigns.restyle;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsCampaignsBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f84525a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f84526b;

    public b(u uVar, Provider provider) {
        this.f84525a = uVar;
        this.f84526b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.advert_details_items.campaigns.c) this.f84525a.get(), this.f84526b.get());
    }
}
