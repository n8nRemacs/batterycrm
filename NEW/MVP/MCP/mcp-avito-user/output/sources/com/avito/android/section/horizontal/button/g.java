package com.avito.android.section.horizontal.button;

import com.avito.android.section.horizontal.button.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HorizontalSectionButtonPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f264702a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<e.a> f264703b;

    public g(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<e.a> provider2) {
        this.f264702a = provider;
        this.f264703b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f264702a.get(), this.f264703b.get());
    }
}
