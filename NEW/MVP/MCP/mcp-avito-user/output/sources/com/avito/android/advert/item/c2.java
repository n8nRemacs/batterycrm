package com.avito.android.advert.item;

import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import iT.C41343c;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: AdvertDetailsViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class c2 implements dagger.internal.h<C27814a2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<n.a> f74235a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.item.advertdetails.mvi.e f74236b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Set<FV0.h>> f74237c;

    /* renamed from: d, reason: collision with root package name */
    public final C31144q0 f74238d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f74239e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f74240f;

    public c2(Provider provider, com.avito.android.advert.item.advertdetails.mvi.e eVar, Provider provider2, C31144q0 c31144q0, dagger.internal.l lVar, Provider provider3) {
        this.f74235a = provider;
        this.f74236b = eVar;
        this.f74237c = provider2;
        this.f74238d = c31144q0;
        this.f74239e = lVar;
        this.f74240f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C27814a2(this.f74235a.get(), (com.avito.android.advert.item.advertdetails.mvi.d) this.f74236b.get(), this.f74237c.get(), (aU0.b) this.f74238d.get(), (C41343c) this.f74239e.f393949a, this.f74240f.get());
    }
}
