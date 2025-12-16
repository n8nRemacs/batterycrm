package com.avito.android.serp.adapter.constructor;

import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.serp.adapter.E0;
import com.avito.android.serp.adapter.F0;
import javax.inject.Provider;

/* compiled from: SerpConstructorAdvertCarouselGridXlBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A> f269778a;

    /* renamed from: b, reason: collision with root package name */
    public final F0 f269779b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f269780c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.b> f269781d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f269782e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C36135w2> f269783f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<RecyclerView.t> f269784g;

    public y(Provider provider, F0 f02, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f269778a = provider;
        this.f269779b = f02;
        this.f269780c = provider2;
        this.f269781d = provider3;
        this.f269782e = provider4;
        this.f269783f = provider5;
        this.f269784g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x(this.f269778a.get(), (E0) this.f269779b.get(), this.f269780c.get(), this.f269781d.get(), this.f269782e.get(), this.f269783f.get(), this.f269784g.get());
    }
}
