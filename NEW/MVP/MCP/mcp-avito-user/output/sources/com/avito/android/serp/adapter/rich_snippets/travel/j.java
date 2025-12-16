package com.avito.android.serp.adapter.rich_snippets.travel;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.rich_snippets.p;
import com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34782e;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertRichTravelPriceV21ItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34782e> f271449a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271450b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<p> f271451c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271452d;

    public j(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271449a = provider;
        this.f271450b = lVar;
        this.f271451c = provider2;
        this.f271452d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f271449a.get(), (RecyclerView.t) this.f271450b.f393949a, this.f271451c.get(), this.f271452d.get());
    }
}
