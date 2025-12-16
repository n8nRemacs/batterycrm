package com.avito.android.serp.adapter.rich_snippets.travel;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.rich_snippets.p;
import com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34782e;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertRichTravelPriceV22ItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34782e> f271459a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271460b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<p> f271461c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271462d;

    public l(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271459a = provider;
        this.f271460b = lVar;
        this.f271461c = provider2;
        this.f271462d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f271459a.get(), (RecyclerView.t) this.f271460b.f393949a, this.f271461c.get(), this.f271462d.get());
    }
}
