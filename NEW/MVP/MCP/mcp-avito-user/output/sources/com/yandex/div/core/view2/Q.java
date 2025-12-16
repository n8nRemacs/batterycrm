package com.yandex.div.core.view2;

import android.content.Context;

/* compiled from: DivViewCreator_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class Q implements dagger.internal.h<P> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f367871a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f367872b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f367873c;

    public Q(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f367871a = uVar;
        this.f367872b = uVar2;
        this.f367873c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new P((Context) this.f367871a.get(), (com.yandex.div.internal.viewpool.h) this.f367872b.get(), (L) this.f367873c.get());
    }
}
