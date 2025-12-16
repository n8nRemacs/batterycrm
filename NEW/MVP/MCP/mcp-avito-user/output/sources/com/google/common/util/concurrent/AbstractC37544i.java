package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* compiled from: AbstractScheduledService.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* renamed from: com.google.common.util.concurrent.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37544i implements Service {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC37550l f360610a = new e(null);

    /* compiled from: AbstractScheduledService.java */
    /* renamed from: com.google.common.util.concurrent.i$a */
    public interface a {
    }

    /* compiled from: AbstractScheduledService.java */
    /* renamed from: com.google.common.util.concurrent.i$b */
    public static abstract class b extends d {

        /* compiled from: AbstractScheduledService.java */
        /* renamed from: com.google.common.util.concurrent.i$b$a */
        public final class a implements Callable<Void> {
            @Override // java.util.concurrent.Callable
            @I41.a
            public final Void call() {
                throw null;
            }
        }

        /* compiled from: AbstractScheduledService.java */
        /* renamed from: com.google.common.util.concurrent.i$b$b, reason: collision with other inner class name */
        public static final class C10693b {
        }

        /* compiled from: AbstractScheduledService.java */
        /* renamed from: com.google.common.util.concurrent.i$b$c */
        public static final class c implements a {
            public c() {
                throw null;
            }
        }

        public b() {
            super(null);
        }
    }

    /* compiled from: AbstractScheduledService.java */
    /* renamed from: com.google.common.util.concurrent.i$c */
    public static final class c implements a {
        public c() {
            throw null;
        }
    }

    /* compiled from: AbstractScheduledService.java */
    /* renamed from: com.google.common.util.concurrent.i$d */
    public static abstract class d {
        public /* synthetic */ d(C37540g c37540g) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: AbstractScheduledService.java */
    /* renamed from: com.google.common.util.concurrent.i$e */
    public final class e extends AbstractC37550l {

        /* compiled from: AbstractScheduledService.java */
        /* renamed from: com.google.common.util.concurrent.i$e$a */
        public class a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public e(C37540g c37540g) {
            new ReentrantLock();
        }

        @Override // com.google.common.util.concurrent.AbstractC37550l
        public final String toString() {
            return AbstractC37544i.this.toString();
        }
    }

    static {
        Logger.getLogger(AbstractC37544i.class.getName());
    }

    public final String toString() {
        return getClass().getSimpleName() + " [" + this.f360610a.a() + "]";
    }
}
