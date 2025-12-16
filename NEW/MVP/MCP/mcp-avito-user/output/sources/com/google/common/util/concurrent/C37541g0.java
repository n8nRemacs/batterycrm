package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ExecutionSequencer.java */
@InterfaceC37531b0
@XY0.d
/* renamed from: com.google.common.util.concurrent.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37541g0 {

    /* renamed from: a, reason: collision with root package name */
    public c f360599a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExecutionSequencer.java */
    /* renamed from: com.google.common.util.concurrent.g0$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f360600b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f360601c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f360602d;

        static {
            a aVar = new a("NOT_RUN", 0);
            f360600b = aVar;
            a aVar2 = new a("CANCELLED", 1);
            f360601c = aVar2;
            f360602d = new a[]{aVar, aVar2, new a("STARTED", 2)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f360602d.clone();
        }
    }

    /* compiled from: ExecutionSequencer.java */
    /* renamed from: com.google.common.util.concurrent.g0$b */
    public static final class b extends AtomicReference<a> implements Executor, Runnable {

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        public C37541g0 f360603b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public Executor f360604c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public Runnable f360605d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public Thread f360606e;

        public b(Executor executor, C37541g0 c37541g0, C37537e0 c37537e0) {
            super(a.f360600b);
            this.f360604c = executor;
            this.f360603b = c37541g0;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            if (get() == a.f360601c) {
                this.f360604c = null;
                this.f360603b = null;
                return;
            }
            this.f360606e = Thread.currentThread();
            try {
                C37541g0 c37541g0 = this.f360603b;
                Objects.requireNonNull(c37541g0);
                c cVar = c37541g0.f360599a;
                if (cVar.f360607a == this.f360606e) {
                    this.f360603b = null;
                    com.google.common.base.M.q(cVar.f360608b == null);
                    cVar.f360608b = runnable;
                    Executor executor = this.f360604c;
                    Objects.requireNonNull(executor);
                    cVar.f360609c = executor;
                    this.f360604c = null;
                } else {
                    Executor executor2 = this.f360604c;
                    Objects.requireNonNull(executor2);
                    this.f360604c = null;
                    this.f360605d = runnable;
                    executor2.execute(this);
                }
                this.f360606e = null;
            } catch (Throwable th2) {
                this.f360606e = null;
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Executor executor;
            Thread threadCurrentThread = Thread.currentThread();
            Thread thread = null;
            Object[] objArr = 0;
            if (threadCurrentThread != this.f360606e) {
                Runnable runnable = this.f360605d;
                Objects.requireNonNull(runnable);
                this.f360605d = null;
                runnable.run();
                return;
            }
            c cVar = new c(objArr == true ? 1 : 0);
            cVar.f360607a = threadCurrentThread;
            C37541g0 c37541g0 = this.f360603b;
            Objects.requireNonNull(c37541g0);
            c37541g0.f360599a = cVar;
            this.f360603b = null;
            try {
                Runnable runnable2 = this.f360605d;
                Objects.requireNonNull(runnable2);
                this.f360605d = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = cVar.f360608b;
                    if (runnable3 == null || (executor = cVar.f360609c) == null) {
                        break;
                    }
                    cVar.f360608b = null;
                    cVar.f360609c = null;
                    executor.execute(runnable3);
                }
            } finally {
                cVar.f360607a = null;
            }
        }
    }

    /* compiled from: ExecutionSequencer.java */
    /* renamed from: com.google.common.util.concurrent.g0$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @I41.a
        public Thread f360607a;

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        public Runnable f360608b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public Executor f360609c;

        public c() {
        }

        public /* synthetic */ c(C37537e0 c37537e0) {
            this();
        }
    }

    public C37541g0() {
        new AtomicReference(A0.f360480c);
        this.f360599a = new c(null);
    }
}
