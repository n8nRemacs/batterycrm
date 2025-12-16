package com.avito.android.serp.adapter.rich_snippets.travel;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.rich_snippets.p;
import com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34782e;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertRichTravelPriceV11ItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34782e> f271429a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271430b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<p> f271431c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271432d;

    public f(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271429a = provider;
        this.f271430b = lVar;
        this.f271431c = provider2;
        this.f271432d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f271429a.get(), (RecyclerView.t) this.f271430b.f393949a, this.f271431c.get(), this.f271432d.get());
    }
}
