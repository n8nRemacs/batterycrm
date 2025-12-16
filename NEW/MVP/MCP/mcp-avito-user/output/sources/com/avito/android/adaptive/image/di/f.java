package com.avito.android.adaptive.image.di;

import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdaptiveImagePickerModule_ProvideBatterySaveModeProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<R3.a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f68511a;

    public f(g gVar) {
        this.f68511a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f68511a.get();
        c.f68506a.getClass();
        return new R3.b(context);
    }
}
