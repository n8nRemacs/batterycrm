package com.yandex.div.core.view2.divs;

/* compiled from: DivImageBinder_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class P0 implements dagger.internal.h<K0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f368187a;

    /* renamed from: b, reason: collision with root package name */
    public final com.yandex.div.core.B f368188b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f368189c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f368190d;

    public P0(dagger.internal.u uVar, com.yandex.div.core.B b12, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f368187a = uVar;
        this.f368188b = b12;
        this.f368189c = uVar2;
        this.f368190d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new K0((C38006w) this.f368187a.get(), (v21.c) this.f368188b.get(), (com.yandex.div.core.view2.D) this.f368189c.get(), (com.yandex.div.core.view2.errors.f) this.f368190d.get());
    }
}
