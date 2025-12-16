package com.avito.android.serp.adapter.constructor;

import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.serp.adapter.E0;
import com.avito.android.serp.adapter.F0;
import javax.inject.Provider;

/* compiled from: SerpConstructorAdvertRedesignBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A> f269436a;

    /* renamed from: b, reason: collision with root package name */
    public final F0 f269437b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f269438c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.b> f269439d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f269440e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f269441f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<RecyclerView.t> f269442g;

    public C(Provider provider, F0 f02, dagger.internal.u uVar, Provider provider2, dagger.internal.u uVar2, dagger.internal.u uVar3, Provider provider3) {
        this.f269436a = provider;
        this.f269437b = f02;
        this.f269438c = uVar;
        this.f269439d = provider2;
        this.f269440e = uVar2;
        this.f269441f = uVar3;
        this.f269442g = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new B(this.f269436a.get(), (E0) this.f269437b.get(), (InterfaceC25659b) this.f269438c.get(), this.f269439d.get(), (com.avito.android.video_snippets.g) this.f269440e.get(), (C36135w2) this.f269441f.get(), this.f269442g.get());
    }
}
