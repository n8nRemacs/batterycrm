package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC37545i0;
import java.util.concurrent.TimeoutException;

/* compiled from: TimeoutFuture.java */
@InterfaceC37531b0
@XY0.d
@XY0.c
/* loaded from: classes6.dex */
final class m1<V> extends AbstractC37545i0.a<V> {

    /* compiled from: TimeoutFuture.java */
    public static final class b<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: TimeoutFuture.java */
    public static final class c extends TimeoutException {
        public c(String str, a aVar) {
            super(str);
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c
    public final void c() {
        k(null);
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c
    @I41.a
    public final String l() {
        return null;
    }
}
