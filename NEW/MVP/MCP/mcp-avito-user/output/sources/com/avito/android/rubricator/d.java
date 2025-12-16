package com.avito.android.rubricator;

import Oi0.InterfaceC14698b;
import com.avito.android.util.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SerpVerticalRubricatorBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f255736a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f255737b;

    /* renamed from: c, reason: collision with root package name */
    public final u f255738c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C> f255739d;

    public d(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f255736a = provider;
        this.f255737b = provider2;
        this.f255738c = uVar;
        this.f255739d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f255736a.get(), this.f255737b.get(), (InterfaceC14698b) this.f255738c.get(), this.f255739d.get());
    }
}
