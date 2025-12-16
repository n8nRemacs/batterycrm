package com.avito.android.code_check.code_confirm.timer.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TimerBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.code_check.d> f118790a;

    public c(Provider<com.avito.android.code_check.d> provider) {
        this.f118790a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f118790a.get());
    }
}
