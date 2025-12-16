package com.google.firebase.concurrent;

import com.google.android.gms.common.internal.C36729v;
import j.B;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: SequentialExecutor.java */
/* loaded from: classes13.dex */
final class w implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f360846g = Logger.getLogger(w.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final Executor f360847b;

    /* renamed from: c, reason: collision with root package name */
    @B
    public final ArrayDeque f360848c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    @B
    public c f360849d = c.f360855b;

    /* renamed from: e, reason: collision with root package name */
    @B
    public long f360850e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final b f360851f = new b(null);

    /* compiled from: SequentialExecutor.java */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f360852b;

        public a(Runnable runnable) {
            this.f360852b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f360852b.run();
        }

        public final String toString() {
            return this.f360852b.toString();
        }
    }

    /* compiled from: SequentialExecutor.java */
    public final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        public Runnable f360853b;

        public b(a aVar) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        
            r9.f360853b.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
        
            com.google.firebase.concurrent.w.f360846g.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.f360853b, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
        
            r9.f360853b = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.firebase.concurrent.w r2 = com.google.firebase.concurrent.w.this     // Catch: java.lang.Throwable -> L56
                java.util.ArrayDeque r2 = r2.f360848c     // Catch: java.lang.Throwable -> L56
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L56
                if (r0 != 0) goto L28
                com.google.firebase.concurrent.w r0 = com.google.firebase.concurrent.w.this     // Catch: java.lang.Throwable -> L1c
                com.google.firebase.concurrent.w$c r3 = r0.f360849d     // Catch: java.lang.Throwable -> L1c
                com.google.firebase.concurrent.w$c r4 = com.google.firebase.concurrent.w.c.f360858e     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                r0 = move-exception
                goto L79
            L1e:
                long r5 = r0.f360850e     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.f360850e = r5     // Catch: java.lang.Throwable -> L1c
                r0.f360849d = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                com.google.firebase.concurrent.w r3 = com.google.firebase.concurrent.w.this     // Catch: java.lang.Throwable -> L1c
                java.util.ArrayDeque r3 = r3.f360848c     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                r9.f360853b = r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L47
                com.google.firebase.concurrent.w r0 = com.google.firebase.concurrent.w.this     // Catch: java.lang.Throwable -> L1c
                com.google.firebase.concurrent.w$c r3 = com.google.firebase.concurrent.w.c.f360855b     // Catch: java.lang.Throwable -> L1c
                r0.f360849d = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L46
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L46:
                return
            L47:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L56
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.f360853b     // Catch: java.lang.Throwable -> L58 java.lang.RuntimeException -> L5a
                r3.run()     // Catch: java.lang.Throwable -> L58 java.lang.RuntimeException -> L5a
            L53:
                r9.f360853b = r2     // Catch: java.lang.Throwable -> L56
                goto L2
            L56:
                r0 = move-exception
                goto L7b
            L58:
                r0 = move-exception
                goto L76
            L5a:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.firebase.concurrent.w.f360846g     // Catch: java.lang.Throwable -> L58
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L58
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
                r6.<init>()     // Catch: java.lang.Throwable -> L58
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L58
                java.lang.Runnable r7 = r9.f360853b     // Catch: java.lang.Throwable -> L58
                r6.append(r7)     // Catch: java.lang.Throwable -> L58
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L58
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L58
                goto L53
            L76:
                r9.f360853b = r2     // Catch: java.lang.Throwable -> L56
                throw r0     // Catch: java.lang.Throwable -> L56
            L79:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L56
            L7b:
                if (r1 == 0) goto L84
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L84:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.w.b.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e12) {
                synchronized (w.this.f360848c) {
                    w.this.f360849d = c.f360855b;
                    throw e12;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f360853b;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + w.this.f360849d + "}";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SequentialExecutor.java */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f360855b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f360856c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f360857d;

        /* renamed from: e, reason: collision with root package name */
        public static final c f360858e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ c[] f360859f;

        static {
            c cVar = new c("IDLE", 0);
            f360855b = cVar;
            c cVar2 = new c("QUEUING", 1);
            f360856c = cVar2;
            c cVar3 = new c("QUEUED", 2);
            f360857d = cVar3;
            c cVar4 = new c("RUNNING", 3);
            f360858e = cVar4;
            f360859f = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f360859f.clone();
        }
    }

    public w(Executor executor) {
        C36729v.j(executor);
        this.f360847b = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            com.google.android.gms.common.internal.C36729v.j(r8)
            java.util.ArrayDeque r0 = r7.f360848c
            monitor-enter(r0)
            com.google.firebase.concurrent.w$c r1 = r7.f360849d     // Catch: java.lang.Throwable -> L6d
            com.google.firebase.concurrent.w$c r2 = com.google.firebase.concurrent.w.c.f360858e     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            com.google.firebase.concurrent.w$c r2 = com.google.firebase.concurrent.w.c.f360857d     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f360850e     // Catch: java.lang.Throwable -> L6d
            com.google.firebase.concurrent.w$a r1 = new com.google.firebase.concurrent.w$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque r8 = r7.f360848c     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            com.google.firebase.concurrent.w$c r8 = com.google.firebase.concurrent.w.c.f360856c     // Catch: java.lang.Throwable -> L6d
            r7.f360849d = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f360847b     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            com.google.firebase.concurrent.w$b r5 = r7.f360851f     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            com.google.firebase.concurrent.w$c r0 = r7.f360849d
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.ArrayDeque r0 = r7.f360848c
            monitor-enter(r0)
            long r5 = r7.f360850e     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            com.google.firebase.concurrent.w$c r1 = r7.f360849d     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f360849d = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.ArrayDeque r2 = r7.f360848c
            monitor-enter(r2)
            com.google.firebase.concurrent.w$c r0 = r7.f360849d     // Catch: java.lang.Throwable -> L55
            com.google.firebase.concurrent.w$c r3 = com.google.firebase.concurrent.w.c.f360855b     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            com.google.firebase.concurrent.w$c r3 = com.google.firebase.concurrent.w.c.f360856c     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.ArrayDeque r0 = r7.f360848c     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.ArrayDeque r1 = r7.f360848c     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.w.execute(java.lang.Runnable):void");
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f360847b + "}";
    }
}
