package com.avito.android.location_list.di;

import com.avito.android.geo_common.interactor.B;
import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.location_list.G;
import com.avito.android.location_list.P;
import com.avito.android.location_list.di.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationListModule_ProvideInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final d f182017a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.geo_common.interactor.g> f182018b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC30715a> f182019c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<B> f182020d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f182021e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f182022f;

    public g(d dVar, Provider<com.avito.android.geo_common.interactor.g> provider, Provider<InterfaceC30715a> provider2, Provider<B> provider3, Provider<InterfaceC35745a5> provider4, Provider<com.avito.android.remote.error.f> provider5) {
        this.f182017a = dVar;
        this.f182018b = provider;
        this.f182019c = provider2;
        this.f182020d = provider3;
        this.f182021e = provider4;
        this.f182022f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new P(this.f182017a.f182001a, (com.avito.android.geo_common.interactor.g) ((a.c.d) this.f182018b).get(), (InterfaceC30715a) ((a.c.C5346c) this.f182019c).get(), (B) ((a.c.e) this.f182020d).get(), (InterfaceC35745a5) ((a.c.h) this.f182021e).get(), (com.avito.android.remote.error.f) ((a.c.k) this.f182022f).get());
    }
}
