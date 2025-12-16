package com.yandex.div.core.view2.divs;

/* compiled from: DivIndicatorBinder_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class S0 implements dagger.internal.h<R0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f368215a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f368216b;

    public S0(dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f368215a = uVar;
        this.f368216b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new R0((C38006w) this.f368215a.get(), (C2) this.f368216b.get());
    }
}
