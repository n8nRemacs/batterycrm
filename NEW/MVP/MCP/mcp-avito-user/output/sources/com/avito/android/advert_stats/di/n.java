package com.avito.android.advert_stats.di;

import android.content.res.Resources;
import com.avito.android.advert_stats.di.y;
import com.avito.android.advert_stats.item.C28334m;
import com.avito.android.advert_stats.item.InterfaceC28333l;
import com.avito.android.util.L0;
import javax.inject.Provider;

/* compiled from: AdvertStatsModule_ProvidePlotDimensProvider$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class n implements dagger.internal.h<InterfaceC28333l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f86582a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<L0> f86583b;

    public n(dagger.internal.l lVar, Provider provider) {
        this.f86582a = lVar;
        this.f86583b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f86582a.f393949a;
        L0 l02 = (L0) ((y.b.f) this.f86583b).get();
        e.f86574a.getClass();
        return new C28334m(resources, l02);
    }
}
