package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule_ExecutorFactory.java */
/* loaded from: classes10.dex */
public final class l implements com.google.android.datatransport.runtime.dagger.internal.g<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final l f343167a = new l();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(Executors.newSingleThreadExecutor());
    }
}
