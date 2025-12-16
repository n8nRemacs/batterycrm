package com.avito.android.serp.adapter.vertical_main.publish.item;

import Oi0.C14700d;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.M;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalPublishBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f273122a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f273123b;

    /* renamed from: c, reason: collision with root package name */
    public final u f273124c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<M> f273125d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.c> f273126e;

    public c(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f273122a = provider;
        this.f273123b = provider2;
        this.f273124c = uVar;
        this.f273125d = provider3;
        this.f273126e = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f273122a.get(), this.f273123b.get(), (C14700d) this.f273124c.get(), this.f273125d.get(), this.f273126e.get());
    }
}
