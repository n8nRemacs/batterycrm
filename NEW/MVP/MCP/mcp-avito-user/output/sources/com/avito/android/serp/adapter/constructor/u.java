package com.avito.android.serp.adapter.constructor;

import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.serp.adapter.E0;
import com.avito.android.serp.adapter.F0;
import javax.inject.Provider;

/* compiled from: SerpConstructorAdvertAvitoMallBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A> f269764a;

    /* renamed from: b, reason: collision with root package name */
    public final F0 f269765b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f269766c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.b> f269767d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f269768e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f269769f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<RecyclerView.t> f269770g;

    public u(Provider provider, F0 f02, dagger.internal.u uVar, Provider provider2, dagger.internal.u uVar2, dagger.internal.u uVar3, Provider provider3) {
        this.f269764a = provider;
        this.f269765b = f02;
        this.f269766c = uVar;
        this.f269767d = provider2;
        this.f269768e = uVar2;
        this.f269769f = uVar3;
        this.f269770g = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f269764a.get(), (E0) this.f269765b.get(), (InterfaceC25659b) this.f269766c.get(), this.f269767d.get(), (com.avito.android.video_snippets.g) this.f269768e.get(), (C36135w2) this.f269769f.get(), this.f269770g.get());
    }
}
