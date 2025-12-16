package com.yandex.div.core;

/* compiled from: DivConfiguration_GetDiv2ImageStubProviderFactory.java */
@dagger.internal.e
/* renamed from: com.yandex.div.core.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37922q implements dagger.internal.h<InterfaceC37914i> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f367629a;

    public C37922q(C37918m c37918m) {
        this.f367629a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC37914i interfaceC37914i = this.f367629a.f367576g;
        dagger.internal.t.d(interfaceC37914i);
        return interfaceC37914i;
    }
}
