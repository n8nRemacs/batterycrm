package com.avito.android.serp.adapter.rich_snippets.travel;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.rich_snippets.p;
import com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34782e;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertRichTravelPriceV12ItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34782e> f271439a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271440b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<p> f271441c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271442d;

    public h(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271439a = provider;
        this.f271440b = lVar;
        this.f271441c = provider2;
        this.f271442d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f271439a.get(), (RecyclerView.t) this.f271440b.f393949a, this.f271441c.get(), this.f271442d.get());
    }
}
