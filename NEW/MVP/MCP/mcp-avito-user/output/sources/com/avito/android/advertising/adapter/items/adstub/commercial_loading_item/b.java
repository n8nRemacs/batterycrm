package com.avito.android.advertising.adapter.items.adstub.commercial_loading_item;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CommercialLoadingBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f86942a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<BannerPageSource> f86943b;

    public b(u uVar, Provider provider) {
        this.f86942a = uVar;
        this.f86943b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f86942a.get(), this.f86943b.get());
    }
}
