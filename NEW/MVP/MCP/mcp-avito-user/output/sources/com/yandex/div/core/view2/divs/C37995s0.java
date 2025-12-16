package com.yandex.div.core.view2.divs;

/* compiled from: DivContainerBinder_Factory.java */
@dagger.internal.e
/* renamed from: com.yandex.div.core.view2.divs.s0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37995s0 implements dagger.internal.h<C37990q0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f368700a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f368701b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f368702c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f368703d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f368704e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f368705f;

    public C37995s0(dagger.internal.f fVar, dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, dagger.internal.u uVar5) {
        this.f368700a = uVar;
        this.f368701b = uVar2;
        this.f368702c = uVar3;
        this.f368703d = uVar4;
        this.f368704e = fVar;
        this.f368705f = uVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C37990q0((C38006w) this.f368700a.get(), this.f368701b, (com.yandex.div.core.downloader.n) this.f368702c.get(), (com.yandex.div.core.downloader.k) this.f368703d.get(), this.f368704e, (com.yandex.div.core.view2.errors.f) this.f368705f.get());
    }
}
