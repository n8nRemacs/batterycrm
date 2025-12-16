package com.yandex.div.core.view2;

/* compiled from: DivVisibilityActionTracker_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class Z implements dagger.internal.h<X> {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f367907a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f367908b;

    public Z(h0 h0Var, dagger.internal.u uVar) {
        this.f367907a = h0Var;
        this.f367908b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f367907a.getClass();
        return new X(new g0(), (U) this.f367908b.get());
    }
}
