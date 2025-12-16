package com.avito.android.di.module;

import com.avito.android.InterfaceC32896n;
import javax.inject.Provider;

/* compiled from: ClickStreamModule_ProvideEventCountThresholdFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class I2 implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32896n> f144002a;

    public I2(Provider<InterfaceC32896n> provider) {
        this.f144002a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC32896n interfaceC32896n = this.f144002a.get();
        E2.f143902a.getClass();
        return Integer.valueOf(interfaceC32896n.e().invoke().booleanValue() ? 30 : 100);
    }
}
