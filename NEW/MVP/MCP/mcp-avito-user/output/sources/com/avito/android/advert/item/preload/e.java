package com.avito.android.advert.item.preload;

import com.avito.android.advert.InterfaceC27797i;
import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.advert.item.C28124e0;
import com.avito.android.advert.item.PreloadCacheKey;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPreloadable_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27797i> f78206a;

    /* renamed from: b, reason: collision with root package name */
    public final l f78207b;

    /* renamed from: c, reason: collision with root package name */
    public final l f78208c;

    /* renamed from: d, reason: collision with root package name */
    public final l f78209d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f78210e;

    /* renamed from: f, reason: collision with root package name */
    public final l f78211f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f78212g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<A7.b> f78213h;

    /* renamed from: i, reason: collision with root package name */
    public final l f78214i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<C28124e0> f78215j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<A7.b> f78216k;

    public e(Provider provider, l lVar, l lVar2, l lVar3, Provider provider2, l lVar4, Provider provider3, Provider provider4, l lVar5, Provider provider5, Provider provider6) {
        this.f78206a = provider;
        this.f78207b = lVar;
        this.f78208c = lVar2;
        this.f78209d = lVar3;
        this.f78210e = provider2;
        this.f78211f = lVar4;
        this.f78212g = provider3;
        this.f78213h = provider4;
        this.f78214i = lVar5;
        this.f78215j = provider5;
        this.f78216k = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f78206a.get(), (String) this.f78207b.f393949a, (Integer) this.f78208c.f393949a, (String) this.f78209d.f393949a, this.f78210e.get(), (AdvertDetailsFastOpenParams) this.f78211f.f393949a, this.f78212g.get(), this.f78213h.get(), (PreloadCacheKey) this.f78214i.f393949a, this.f78215j.get(), this.f78216k.get());
    }
}
