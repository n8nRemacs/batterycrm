package com.avito.android.advert_collection_list.mvi;

import com.avito.android.account.E;
import com.avito.android.remote.H;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionListBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_list.f> f82280a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f82281b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f82282c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<H> f82283d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f82284e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f82285f;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f82280a = provider;
        this.f82281b = provider2;
        this.f82282c = provider3;
        this.f82283d = provider4;
        this.f82284e = lVar;
        this.f82285f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f82280a.get(), this.f82281b.get(), this.f82282c.get(), this.f82283d.get(), ((Boolean) this.f82284e.f393949a).booleanValue(), (String) this.f82285f.f393949a);
    }
}
