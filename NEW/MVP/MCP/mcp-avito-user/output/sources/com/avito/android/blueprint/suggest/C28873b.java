package com.avito.android.blueprint.suggest;

import javax.inject.Provider;

/* compiled from: PublishInputWithSuggestsBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.blueprint.suggest.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28873b implements dagger.internal.h<C28872a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28874c> f105700a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<jG0.c> f105701b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f105702c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f105703d;

    public C28873b(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider, Provider provider2) {
        this.f105700a = provider;
        this.f105701b = provider2;
        this.f105702c = uVar;
        this.f105703d = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C28872a(this.f105700a.get(), this.f105701b.get(), (com.avito.android.util.text.a) this.f105702c.get(), (u3.l) this.f105703d.get());
    }
}
