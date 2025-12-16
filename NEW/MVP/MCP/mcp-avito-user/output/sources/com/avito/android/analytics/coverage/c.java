package com.avito.android.analytics.coverage;

import android.os.Handler;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PerfScreenCoverageTracker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f89863a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Handler> f89864b;

    public c(dagger.internal.f fVar, Provider provider) {
        this.f89863a = fVar;
        this.f89864b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(dagger.internal.g.b(this.f89863a), this.f89864b.get());
    }
}
