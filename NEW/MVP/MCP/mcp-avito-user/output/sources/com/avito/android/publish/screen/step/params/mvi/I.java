package com.avito.android.publish.screen.step.params.mvi;

import com.avito.android.publish.C0;
import javax.inject.Provider;

/* compiled from: PublishDetailsReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f241345a;

    public I(Provider<C0> provider) {
        this.f241345a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H(this.f241345a.get());
    }
}
