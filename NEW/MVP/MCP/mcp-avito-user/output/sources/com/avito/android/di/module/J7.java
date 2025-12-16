package com.avito.android.di.module;

import android.content.Context;
import com.avito.android.util.C35965w0;
import com.avito.android.util.InterfaceC35951u0;
import javax.inject.Provider;

/* compiled from: SendMetricsModule_ProvideDataDiskUsageDelegateFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class J7 implements dagger.internal.h<InterfaceC35951u0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144020a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Context> f144021b;

    public J7(dagger.internal.u uVar, Provider provider) {
        this.f144020a = uVar;
        this.f144021b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = this.f144021b.get();
        H7 h72 = H7.f143987a;
        return new C35965w0(context);
    }
}
