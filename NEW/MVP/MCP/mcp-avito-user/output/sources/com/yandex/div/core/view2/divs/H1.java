package com.yandex.div.core.view2.divs;

/* compiled from: DivSelectBinder_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class H1 implements dagger.internal.h<G1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f368089a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f368090b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f368091c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f368092d;

    public H1(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4) {
        this.f368089a = uVar;
        this.f368090b = uVar2;
        this.f368091c = uVar3;
        this.f368092d = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new G1((C38006w) this.f368089a.get(), (com.yandex.div.core.view2.J) this.f368090b.get(), (com.yandex.div.core.expression.variables.h) this.f368091c.get(), (com.yandex.div.core.view2.errors.f) this.f368092d.get());
    }
}
