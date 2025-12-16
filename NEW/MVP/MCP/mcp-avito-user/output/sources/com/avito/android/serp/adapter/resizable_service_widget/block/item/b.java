package com.avito.android.serp.adapter.resizable_service_widget.block.item;

import Oi0.C14700d;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ResizableServiceWidgetBlockBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f270709a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f270710b;

    /* renamed from: c, reason: collision with root package name */
    public final u f270711c;

    public b(u uVar, Provider provider, Provider provider2) {
        this.f270709a = provider;
        this.f270710b = provider2;
        this.f270711c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f270709a.get(), this.f270710b.get(), (C14700d) this.f270711c.get());
    }
}
