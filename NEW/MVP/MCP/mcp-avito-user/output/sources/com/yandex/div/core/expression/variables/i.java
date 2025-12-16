package com.yandex.div.core.expression.variables;

import dagger.internal.u;

/* compiled from: TwoWayStringVariableBinder_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f367507a;

    /* renamed from: b, reason: collision with root package name */
    public final u f367508b;

    public i(u uVar, u uVar2) {
        this.f367507a = uVar;
        this.f367508b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.yandex.div.core.view2.errors.f) this.f367507a.get(), (com.yandex.div.core.expression.g) this.f367508b.get());
    }
}
