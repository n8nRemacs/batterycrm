package com.avito.android.bxcontent.beduin_v2.favorite;

import Y41.p;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BxFavoriteButtonComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f109532a;

    /* renamed from: b, reason: collision with root package name */
    public final l f109533b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f109534c;

    /* renamed from: d, reason: collision with root package name */
    public final j f109535d;

    public e(l lVar, l lVar2, Provider provider, j jVar) {
        this.f109532a = lVar;
        this.f109533b = lVar2;
        this.f109534c = provider;
        this.f109535d = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Y41.l) this.f109532a.f393949a, (p) this.f109533b.f393949a, this.f109534c.get(), (i) this.f109535d.get());
    }
}
