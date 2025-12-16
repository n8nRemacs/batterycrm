package com.avito.android.serp.adapter.rich_snippets.travel;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.rich_snippets.p;
import com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34782e;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertRichSmallStrRedesignItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34782e> f271409a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271410b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<p> f271411c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271412d;

    public b(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271409a = provider;
        this.f271410b = lVar;
        this.f271411c = provider2;
        this.f271412d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f271409a.get(), (RecyclerView.t) this.f271410b.f393949a, this.f271411c.get(), this.f271412d.get());
    }
}
