package com.google.common.util.concurrent;

import java.io.PrintStream;
import java.lang.Thread;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: UncaughtExceptionHandlers.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* loaded from: classes6.dex */
public final class o1 {

    /* compiled from: UncaughtExceptionHandlers.java */
    @XY0.e
    public static final class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        public static final Logger f360630a = Logger.getLogger(a.class.getName());

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th2) {
            try {
                f360630a.log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", thread), th2);
                throw null;
            } catch (Error | RuntimeException e12) {
                PrintStream printStream = System.err;
                printStream.println(th2.getMessage());
                printStream.println(e12.getMessage());
                throw null;
            }
        }
    }
}
