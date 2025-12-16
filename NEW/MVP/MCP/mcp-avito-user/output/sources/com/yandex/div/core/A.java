package com.yandex.div.core;

import java.util.List;
import u21.InterfaceC48776c;

/* compiled from: DivConfiguration_GetExtensionHandlersFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class A implements dagger.internal.h<List<? extends InterfaceC48776c>> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f367240a;

    public A(C37918m c37918m) {
        this.f367240a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        List<InterfaceC48776c> list = this.f367240a.f367582m;
        dagger.internal.t.d(list);
        return list;
    }
}
