package com.avito.android.section.vertical.button;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionVerticalButtonPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f264958a;

    public f(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f264958a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f264958a.get());
    }
}
