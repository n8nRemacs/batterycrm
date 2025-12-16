package com.avito.android.analytics.coverage.di;

import android.os.Handler;
import android.os.Looper;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PerformanceScreenCoverageModule_ProvideHandlerFactory.java */
@e
@x
@y
/* loaded from: classes11.dex */
public final class b implements h<Handler> {

    /* compiled from: PerformanceScreenCoverageModule_ProvideHandlerFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f89868a = new b();
    }

    public static b a() {
        return a.f89868a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = com.avito.android.analytics.coverage.di.a.f89867a;
        return new Handler(Looper.getMainLooper());
    }
}
