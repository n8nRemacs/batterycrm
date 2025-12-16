package com.yandex.div.core.view2.divs;

/* compiled from: DivTextBinder_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class w2 implements dagger.internal.h<C37962h2> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f368861a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f368862b;

    /* renamed from: c, reason: collision with root package name */
    public final com.yandex.div.core.B f368863c;

    /* renamed from: d, reason: collision with root package name */
    public final com.yandex.div.core.I f368864d;

    public w2(dagger.internal.u uVar, dagger.internal.u uVar2, com.yandex.div.core.B b12, com.yandex.div.core.I i12) {
        this.f368861a = uVar;
        this.f368862b = uVar2;
        this.f368863c = b12;
        this.f368864d = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C37962h2((C38006w) this.f368861a.get(), (com.yandex.div.core.view2.J) this.f368862b.get(), (v21.c) this.f368863c.get(), ((Boolean) this.f368864d.get()).booleanValue());
    }
}
