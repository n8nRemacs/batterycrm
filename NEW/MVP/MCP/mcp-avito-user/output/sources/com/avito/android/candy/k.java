package com.avito.android.candy;

import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FileCarImageSource_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f114895a;

    public k(Provider<Context> provider) {
        this.f114895a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f114895a.get());
    }
}
