package com.avito.android.serp.adapter.constructor.list;

import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.serp.adapter.E0;
import com.avito.android.serp.adapter.F0;
import com.avito.android.serp.adapter.constructor.A;
import com.avito.android.video_snippets.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SerpConstructorAdvertListBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A> f269504a;

    /* renamed from: b, reason: collision with root package name */
    public final F0 f269505b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f269506c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.b> f269507d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<g> f269508e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C36135w2> f269509f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<RecyclerView.t> f269510g;

    public b(Provider provider, F0 f02, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f269504a = provider;
        this.f269505b = f02;
        this.f269506c = provider2;
        this.f269507d = provider3;
        this.f269508e = provider4;
        this.f269509f = provider5;
        this.f269510g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f269504a.get(), (E0) this.f269505b.get(), this.f269506c.get(), this.f269507d.get(), this.f269508e.get(), this.f269509f.get(), this.f269510g.get());
    }
}
