package com.avito.android.serp.adapter.rich_snippets.regular;

import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Provider;

/* compiled from: AdvertXlRichItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class K implements dagger.internal.h<J> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f271074a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271075b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.p> f271076c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271077d;

    public K(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f271074a = uVar;
        this.f271075b = lVar;
        this.f271076c = provider;
        this.f271077d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new J((L) this.f271074a.get(), (RecyclerView.t) this.f271075b.f393949a, this.f271076c.get(), this.f271077d.get());
    }
}
