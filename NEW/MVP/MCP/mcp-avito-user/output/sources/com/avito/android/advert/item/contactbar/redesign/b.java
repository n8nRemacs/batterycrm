package com.avito.android.advert.item.contactbar.redesign;

import com.avito.android.C29640d;
import com.avito.android.advert.item.contactbar.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsContactBarBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f74894a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C29640d> f74895b;

    public b(u uVar, Provider provider) {
        this.f74894a = uVar;
        this.f74895b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f74894a.get(), this.f74895b.get());
    }
}
