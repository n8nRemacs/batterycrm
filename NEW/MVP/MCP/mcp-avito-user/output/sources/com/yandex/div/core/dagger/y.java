package com.yandex.div.core.dagger;

/* compiled from: DivKitModule_ProvideViewCreatorFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class y implements dagger.internal.h<com.yandex.div.internal.viewpool.f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f367427a;

    public y(dagger.internal.u uVar) {
        this.f367427a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.yandex.div.histogram.b bVar = (com.yandex.div.histogram.b) this.f367427a.get();
        int i12 = w.f367424a;
        return new com.yandex.div.internal.viewpool.f(bVar);
    }
}
