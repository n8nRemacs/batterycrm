package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: JdkFutureAdapters.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* loaded from: classes6.dex */
public final class C0 {

    /* compiled from: JdkFutureAdapters.java */
    public static class a<V> extends AbstractFutureC37557o0<V> implements D0<V> {

        /* renamed from: b, reason: collision with root package name */
        public static final ExecutorService f360486b;

        static {
            k1 k1Var = new k1();
            k1Var.f360621a = Boolean.TRUE;
            Locale locale = Locale.ROOT;
            f360486b = Executors.newCachedThreadPool(new j1(Executors.defaultThreadFactory(), new AtomicLong(0L), k1Var.f360621a));
        }

        @Override // com.google.common.util.concurrent.D0
        public final void N(Runnable runnable, Executor executor) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.AbstractFutureC37557o0, com.google.common.collect.S0
        public final /* bridge */ /* synthetic */ Object X() {
            return null;
        }

        @Override // com.google.common.util.concurrent.AbstractFutureC37557o0
        /* renamed from: Y */
        public final Future<V> X() {
            return null;
        }
    }
}
