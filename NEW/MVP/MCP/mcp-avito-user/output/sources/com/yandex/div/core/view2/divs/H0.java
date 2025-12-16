package com.yandex.div.core.view2.divs;

/* compiled from: DivGridBinder_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class H0 implements dagger.internal.h<F0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f368085a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f368086b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f368087c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f368088d;

    public H0(dagger.internal.f fVar, dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f368085a = uVar;
        this.f368086b = uVar2;
        this.f368087c = uVar3;
        this.f368088d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new F0((C38006w) this.f368085a.get(), (com.yandex.div.core.downloader.n) this.f368086b.get(), (com.yandex.div.core.downloader.k) this.f368087c.get(), this.f368088d);
    }
}
