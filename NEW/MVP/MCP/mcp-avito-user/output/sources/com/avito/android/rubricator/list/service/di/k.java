package com.avito.android.rubricator.list.service.di;

import com.avito.android.J0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import wn0.C49656b;
import wn0.InterfaceC49655a;

/* compiled from: ServiceListModule_ProvideServiceListConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<InterfaceC49655a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f255980a;

    public k(u uVar) {
        this.f255980a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        J0 j02 = (J0) this.f255980a.get();
        e eVar = e.f255972a;
        return new C49656b(j02);
    }
}
