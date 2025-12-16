package com.avito.android.publish.items.button;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeepLinkActionButtonBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f236789a;

    public b(Provider<f> provider) {
        this.f236789a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f236789a.get());
    }
}
