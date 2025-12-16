package com.yandex.div.core.view2.divs;

import com.yandex.div.core.C37919n;

/* compiled from: DivVideoBinder_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class B2 implements dagger.internal.h<z2> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f368020a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f368021b;

    /* renamed from: c, reason: collision with root package name */
    public final C37919n f368022c;

    public B2(dagger.internal.u uVar, dagger.internal.u uVar2, C37919n c37919n) {
        this.f368020a = uVar;
        this.f368021b = uVar2;
        this.f368022c = c37919n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C38006w c38006w = (C38006w) this.f368020a.get();
        com.yandex.div.core.expression.variables.f fVar = (com.yandex.div.core.expression.variables.f) this.f368021b.get();
        this.f368022c.get();
        return new z2(c38006w, fVar);
    }
}
