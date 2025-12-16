package com.avito.android.profile.pro.impl.converters;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: ProfileTabWidgetParamsConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f222447a;

    public J(Provider<InterfaceC35863o4> provider) {
        this.f222447a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I(this.f222447a.get());
    }
}
