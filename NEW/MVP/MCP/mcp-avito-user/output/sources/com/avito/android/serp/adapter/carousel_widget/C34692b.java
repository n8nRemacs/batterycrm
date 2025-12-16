package com.avito.android.serp.adapter.carousel_widget;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.di.module.Q7;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L0;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: CarouselItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.carousel_widget.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34692b implements dagger.internal.h<C34691a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<I> f269328a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.favorite.m f269329b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.a> f269330c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.d> f269331d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f269332e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f269333f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f269334g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f269335h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<L0> f269336i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f269337j;

    /* renamed from: k, reason: collision with root package name */
    public final Q7 f269338k;

    public C34692b(Provider provider, com.avito.android.favorite.m mVar, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, dagger.internal.u uVar, Provider provider7, Provider provider8, Q7 q72) {
        this.f269328a = provider;
        this.f269329b = mVar;
        this.f269330c = provider2;
        this.f269331d = provider3;
        this.f269332e = provider4;
        this.f269333f = provider5;
        this.f269334g = provider6;
        this.f269335h = uVar;
        this.f269336i = provider7;
        this.f269337j = provider8;
        this.f269338k = q72;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34691a(this.f269328a.get(), (com.avito.android.favorite.h) this.f269329b.get(), this.f269330c.get(), this.f269331d.get(), this.f269332e.get(), this.f269333f.get(), this.f269334g.get(), (RecyclerView.t) this.f269335h.get(), this.f269336i.get(), this.f269337j.get(), (String) this.f269338k.get());
    }
}
