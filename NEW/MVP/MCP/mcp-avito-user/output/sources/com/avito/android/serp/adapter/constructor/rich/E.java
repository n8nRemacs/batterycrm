package com.avito.android.serp.adapter.constructor.rich;

import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SerpConstructorAdvertRichBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34722a> f269650a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f269651b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.b> f269652c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.p> f269653d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f269654e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f269655f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f269656g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f269657h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f269658i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.u f269659j;

    public E(Provider provider, dagger.internal.u uVar, Provider provider2, Provider provider3, dagger.internal.l lVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, dagger.internal.u uVar5, dagger.internal.u uVar6) {
        this.f269650a = provider;
        this.f269651b = uVar;
        this.f269652c = provider2;
        this.f269653d = provider3;
        this.f269654e = lVar;
        this.f269655f = uVar2;
        this.f269656g = uVar3;
        this.f269657h = uVar4;
        this.f269658i = uVar5;
        this.f269659j = uVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new D(this.f269650a.get(), (InterfaceC25659b) this.f269651b.get(), this.f269652c.get(), this.f269653d.get(), (RecyclerView.t) this.f269654e.f393949a, (C36135w2) this.f269655f.get(), (RecyclerView.t) this.f269656g.get(), (com.avito.android.video_snippets.g) this.f269657h.get(), (com.avito.android.pinch_to_zoom.b) this.f269658i.get(), (R0) this.f269659j.get());
    }
}
