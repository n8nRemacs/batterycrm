package com.avito.android.serp.adapter.constructor;

import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.serp.adapter.E0;
import com.avito.android.serp.adapter.F0;
import javax.inject.Provider;

/* compiled from: SerpConstructorAdvertAvitoBlackBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A> f269728a;

    /* renamed from: b, reason: collision with root package name */
    public final F0 f269729b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f269730c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.b> f269731d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f269732e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f269733f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<RecyclerView.t> f269734g;

    public s(Provider provider, F0 f02, dagger.internal.u uVar, Provider provider2, dagger.internal.u uVar2, dagger.internal.u uVar3, Provider provider3) {
        this.f269728a = provider;
        this.f269729b = f02;
        this.f269730c = uVar;
        this.f269731d = provider2;
        this.f269732e = uVar2;
        this.f269733f = uVar3;
        this.f269734g = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f269728a.get(), (E0) this.f269729b.get(), (InterfaceC25659b) this.f269730c.get(), this.f269731d.get(), (com.avito.android.video_snippets.g) this.f269732e.get(), (C36135w2) this.f269733f.get(), this.f269734g.get());
    }
}
