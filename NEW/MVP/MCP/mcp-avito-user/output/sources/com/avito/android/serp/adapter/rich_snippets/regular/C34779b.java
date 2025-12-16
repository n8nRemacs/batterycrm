package com.avito.android.serp.adapter.rich_snippets.regular;

import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Provider;

/* compiled from: AdvertMiniRichItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34779b implements dagger.internal.h<C34778a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34782e> f271141a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271142b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.p> f271143c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271144d;

    public C34779b(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271141a = provider;
        this.f271142b = lVar;
        this.f271143c = provider2;
        this.f271144d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34778a(this.f271141a.get(), (RecyclerView.t) this.f271142b.f393949a, this.f271143c.get(), this.f271144d.get());
    }
}
