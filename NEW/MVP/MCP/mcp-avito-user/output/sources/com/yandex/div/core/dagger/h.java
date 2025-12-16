package com.yandex.div.core.dagger;

import com.yandex.div.core.N;

/* compiled from: Div2Module_ProvideViewPoolFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class h implements dagger.internal.h<com.yandex.div.internal.viewpool.h> {

    /* renamed from: a, reason: collision with root package name */
    public final N f367408a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f367409b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f367410c;

    public h(N n12, dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f367408a = n12;
        this.f367409b = uVar;
        this.f367410c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return ((Boolean) this.f367408a.get()).booleanValue() ? new com.yandex.div.internal.viewpool.a((com.yandex.div.internal.viewpool.i) this.f367409b.get(), (com.yandex.div.internal.viewpool.f) this.f367410c.get()) : new com.yandex.div.internal.viewpool.e();
    }
}
