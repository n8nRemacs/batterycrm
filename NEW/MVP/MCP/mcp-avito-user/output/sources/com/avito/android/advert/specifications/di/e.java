package com.avito.android.advert.specifications.di;

import com.avito.android.serp.adapter.C34738i0;
import com.avito.android.serp.adapter.InterfaceC34736h0;
import com.avito.android.util.L0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SpecificationsModule_ProvideLayoutTypeProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<InterfaceC34736h0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<L0> f80994a;

    public e(Provider<L0> provider) {
        this.f80994a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        L0 l02 = this.f80994a.get();
        int i12 = d.f80993a;
        return new C34738i0(l02);
    }
}
