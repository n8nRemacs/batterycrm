package com.avito.android.di.module;

import android.content.Context;
import com.avito.android.util.C35854n3;
import com.avito.android.util.InterfaceC35879r0;
import javax.inject.Provider;

/* compiled from: SendMetricsModule_ProvideDataDirectoryProviderFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class I7 implements dagger.internal.h<InterfaceC35879r0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f144009a;

    public I7(Provider<Context> provider) {
        this.f144009a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = this.f144009a.get();
        H7 h72 = H7.f143987a;
        return new C35854n3(context);
    }
}
