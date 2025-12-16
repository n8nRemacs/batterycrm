package com.avito.android.barcode_scanner_impl.di;

import dagger.internal.x;
import dagger.internal.y;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: BarcodeScannerModule_SingleThreadExecutorFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<ExecutorService> {

    /* compiled from: BarcodeScannerModule_SingleThreadExecutorFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f98888a = new h();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f98884a.getClass();
        return Executors.newSingleThreadExecutor();
    }
}
