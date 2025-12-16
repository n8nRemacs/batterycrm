package com.avito.android.error_reporting.memory;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OnCrashMemoryStateProvider_Factory.java */
@e
@x
@y
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* compiled from: OnCrashMemoryStateProvider_Factory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f147925a = new c();
    }

    public static c a() {
        return a.f147925a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b();
    }
}
