package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: SequentialExecutor.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* loaded from: classes6.dex */
final class Z0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f360550b = 0;

    /* compiled from: SequentialExecutor.java */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* compiled from: SequentialExecutor.java */
    public final class b implements Runnable {
        public b(a aVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Z0 z02 = Z0.this;
            try {
                int i12 = Z0.f360550b;
                z02.getClass();
                throw null;
            } catch (Error unused) {
                int i13 = Z0.f360550b;
                z02.getClass();
                throw null;
            }
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SequentialExecutor.java */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ c[] f360552b = {new c("IDLE", 0), new c("QUEUING", 1), new c("QUEUED", 2), new c("RUNNING", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        c EF5;

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f360552b.clone();
        }
    }

    static {
        Logger.getLogger(Z0.class.getName());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        throw null;
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{null}";
    }
}
