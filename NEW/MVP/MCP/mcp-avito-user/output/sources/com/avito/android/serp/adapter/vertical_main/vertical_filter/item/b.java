package com.avito.android.serp.adapter.vertical_main.vertical_filter.item;

import Oi0.C14701e;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.M;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalFilterItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f273547a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f273548b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f273549c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<M> f273550d;

    /* renamed from: e, reason: collision with root package name */
    public final u f273551e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.c> f273552f;

    public b(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f273547a = provider;
        this.f273548b = provider2;
        this.f273549c = provider3;
        this.f273550d = provider4;
        this.f273551e = uVar;
        this.f273552f = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f273547a.get(), this.f273548b.get(), this.f273549c.get(), this.f273550d.get(), (C14701e) this.f273551e.get(), this.f273552f.get());
    }
}
