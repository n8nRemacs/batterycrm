package com.yandex.div.core.expression.variables;

import dagger.internal.u;

/* compiled from: TwoWayIntegerVariableBinder_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f367505a;

    /* renamed from: b, reason: collision with root package name */
    public final u f367506b;

    public g(u uVar, u uVar2) {
        this.f367505a = uVar;
        this.f367506b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.yandex.div.core.view2.errors.f) this.f367505a.get(), (com.yandex.div.core.expression.g) this.f367506b.get());
    }
}
