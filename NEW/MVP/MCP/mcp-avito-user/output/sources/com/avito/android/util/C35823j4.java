package com.avito.android.util;

import android.app.Application;
import javax.inject.Provider;

/* compiled from: PublishTitleGeneratorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.util.j4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35823j4 implements dagger.internal.h<C35815i4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f318907a;

    public C35823j4(Provider<Application> provider) {
        this.f318907a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35815i4(this.f318907a.get());
    }
}
