package com.avito.android.serp.adapter.rich_snippets.travel;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.rich_snippets.p;
import com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34782e;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertRichSmallWithNormalizedPriceStrRedesignItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34782e> f271419a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271420b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<p> f271421c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271422d;

    public d(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271419a = provider;
        this.f271420b = lVar;
        this.f271421c = provider2;
        this.f271422d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f271419a.get(), (RecyclerView.t) this.f271420b.f393949a, this.f271421c.get(), this.f271422d.get());
    }
}
