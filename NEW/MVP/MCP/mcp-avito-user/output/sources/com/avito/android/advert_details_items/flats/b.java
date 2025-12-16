package com.avito.android.advert_details_items.flats;

import com.avito.android.advert_core.advert.k;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: AdvertDetailsFlatsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f84718a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<k> f84719b;

    /* renamed from: c, reason: collision with root package name */
    public final u f84720c;

    public b(u uVar, Provider provider, Provider provider2) {
        this.f84718a = provider;
        this.f84719b = provider2;
        this.f84720c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f84718a.get(), this.f84719b.get(), (C43617a) this.f84720c.get());
    }
}
