package com.avito.android.messenger.di;

import java.util.Collections;

/* compiled from: MessageAdapterModule_ProvideAttributedTextFormatterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class I0 implements dagger.internal.h<com.avito.android.util.text.a> {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f195645a;

    public I0(G0 g02) {
        this.f195645a = g02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f195645a.getClass();
        H0 h02 = H0.f195638l;
        JK0.c.f8877a.getClass();
        return new com.avito.android.util.text.b(new JK0.f(Collections.singletonMap(0, new KK0.a(null)), null, 2, null), h02);
    }
}
