package com.avito.android.serp.adapter.rich_snippets.regular;

import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Provider;

/* compiled from: AdvertRichItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34781d implements dagger.internal.h<C34780c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34782e> f271158a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271159b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.p> f271160c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f271161d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271162e;

    public C34781d(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f271158a = provider;
        this.f271159b = lVar;
        this.f271160c = provider2;
        this.f271161d = provider3;
        this.f271162e = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34780c(this.f271158a.get(), (RecyclerView.t) this.f271159b.f393949a, this.f271160c.get(), this.f271161d.get(), this.f271162e.get());
    }
}
