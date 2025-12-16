package com.avito.android.push.rustore.token_update;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RustorePushTokenUpdateTask_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<RustorePushTokenUpdateTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f246154a;

    public p(Provider<i> provider) {
        this.f246154a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new RustorePushTokenUpdateTask(this.f246154a.get());
    }
}
