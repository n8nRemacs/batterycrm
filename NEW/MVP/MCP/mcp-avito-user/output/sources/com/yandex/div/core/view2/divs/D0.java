package com.yandex.div.core.view2.divs;

/* compiled from: DivGifImageBinder_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class D0 implements dagger.internal.h<C38015x0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f368030a;

    /* renamed from: b, reason: collision with root package name */
    public final com.yandex.div.core.B f368031b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f368032c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f368033d;

    public D0(dagger.internal.u uVar, com.yandex.div.core.B b12, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f368030a = uVar;
        this.f368031b = b12;
        this.f368032c = uVar2;
        this.f368033d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C38015x0((C38006w) this.f368030a.get(), (v21.c) this.f368031b.get(), (com.yandex.div.core.view2.D) this.f368032c.get(), (com.yandex.div.core.view2.errors.f) this.f368033d.get());
    }
}
