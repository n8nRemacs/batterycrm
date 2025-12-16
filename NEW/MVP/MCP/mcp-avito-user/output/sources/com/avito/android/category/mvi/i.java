package com.avito.android.category.mvi;

import Nn.InterfaceC14592a;
import com.avito.android.category.CategoryArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CategoryBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14592a> f116705a;

    /* renamed from: b, reason: collision with root package name */
    public final u f116706b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f116707c;

    public i(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f116705a = provider;
        this.f116706b = uVar;
        this.f116707c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f116705a.get(), (com.avito.android.category.d) this.f116706b.get(), (CategoryArguments) this.f116707c.f393949a);
    }
}
