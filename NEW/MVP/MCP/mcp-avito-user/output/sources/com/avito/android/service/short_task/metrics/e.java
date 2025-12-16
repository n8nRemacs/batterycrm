package com.avito.android.service.short_task.metrics;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: AccessibilityManagerWrapperImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f274078a;

    public e(Provider<Context> provider) {
        this.f274078a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f274078a.get());
    }
}
