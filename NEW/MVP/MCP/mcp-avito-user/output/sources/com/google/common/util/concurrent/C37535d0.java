package com.google.common.util.concurrent;

import bZ0.InterfaceC25600a;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ExecutionList.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* renamed from: com.google.common.util.concurrent.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37535d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f360590c = Logger.getLogger(C37535d0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    @I41.a
    @InterfaceC25600a
    public a f360591a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC25600a
    public boolean f360592b;

    /* compiled from: ExecutionList.java */
    /* renamed from: com.google.common.util.concurrent.d0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f360593a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f360594b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public a f360595c;

        public a(Runnable runnable, Executor executor, @I41.a a aVar) {
            this.f360593a = runnable;
            this.f360594b = executor;
            this.f360595c = aVar;
        }
    }

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e12) {
            f360590c.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e12);
        }
    }
}
