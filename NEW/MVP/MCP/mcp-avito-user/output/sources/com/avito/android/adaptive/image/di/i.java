package com.avito.android.adaptive.image.di;

import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdaptiveImagePickerModule_ProvideNetworkCongestionProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<R3.e> {

    /* renamed from: a, reason: collision with root package name */
    public final g f68514a;

    public i(g gVar) {
        this.f68514a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f68514a.get();
        c.f68506a.getClass();
        return new R3.f(context);
    }
}
