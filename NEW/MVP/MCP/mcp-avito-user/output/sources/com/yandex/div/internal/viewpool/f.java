package com.yandex.div.internal.viewpool;

import Y61.k;
import Y61.l;
import android.os.Process;
import com.yandex.div.internal.util.v;
import com.yandex.div.internal.viewpool.a;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.reflect.n;

/* compiled from: ViewCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/internal/viewpool/f;", "", "a", "b", "c", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f370210a;

    /* compiled from: ViewCreator.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/yandex/div/internal/viewpool/f$a;", "", "<init>", "()V", "", "CPU_USAGE_HISTOGRAM_NAME", "Ljava/lang/String;", "", "TASK_HIGHEST_PRIORITY", "I", "TASK_QUEUE_INITIAL_CAPACITY", "THREAD_DEFAULT_PRIORITY", "THREAD_LOW_PRIORITY", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ViewCreator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/viewpool/f$b;", "Ljava/lang/Runnable;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements Runnable, Comparable<b> {

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ n<Object>[] f370211e = {m0.f406844a.i(new h0(b.class, "channelRef", "getChannelRef()Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", 0))};

        /* renamed from: b, reason: collision with root package name */
        public final int f370212b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f370213c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final kotlin.properties.h f370214d;

        public b(@k a.C10927a<?> c10927a, int i12) {
            this.f370212b = i12;
            this.f370213c = c10927a.f370193a;
            this.f370214d = v.a(c10927a);
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            int i12 = this.f370212b - bVar2.f370212b;
            return i12 != 0 ? i12 : !L.f(this.f370213c, bVar2.f370213c) ? 1 : 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!b.class.equals(obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.viewpool.ViewCreator.CreateViewTask");
            }
            b bVar = (b) obj;
            return L.f(this.f370213c, bVar.f370213c) && this.f370212b == bVar.f370212b;
        }

        public final int hashCode() {
            return this.f370213c.hashCode() + ((6913 + this.f370212b) * 31);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            a.C10927a c10927a = (a.C10927a) this.f370214d.getValue(this, f370211e[0]);
            if (c10927a == null || c10927a.f370198f.get()) {
                return;
            }
            try {
                c10927a.f370197e.offer(c10927a.f370195c.a());
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: ViewCreator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/viewpool/f$c;", "Ljava/lang/Thread;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends Thread {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.yandex.div.histogram.b f370215b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final com.yandex.div.internal.viewpool.b<b> f370216c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public volatile String f370217d;

        public c(@k com.yandex.div.histogram.b bVar) {
            super("ViewPoolThread");
            this.f370215b = bVar;
            this.f370216c = new com.yandex.div.internal.viewpool.b<>(new PriorityQueue(32));
            setPriority(5);
        }

        public final void a() {
            b bVarPoll = this.f370216c.poll();
            if (bVarPoll == null) {
                try {
                    setPriority(3);
                    bVarPoll = this.f370216c.take();
                } finally {
                    setPriority(5);
                }
            }
            this.f370217d = bVarPoll.f370213c;
            bVarPoll.run();
            this.f370217d = null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.myTid();
            this.f370215b.a();
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    static {
        new a(null);
    }

    public f(@k com.yandex.div.histogram.b bVar) {
        c cVar = new c(bVar);
        this.f370210a = cVar;
        cVar.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        r2.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k com.yandex.div.internal.viewpool.a.C10927a<?> r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.f370193a
            com.yandex.div.internal.viewpool.f$c r1 = r5.f370210a
            java.lang.String r1 = r1.f370217d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L85
            boolean r0 = r6.f370199g
            if (r0 == 0) goto L12
            goto L85
        L12:
            com.yandex.div.internal.viewpool.f$c r0 = r5.f370210a
            com.yandex.div.internal.viewpool.b<com.yandex.div.internal.viewpool.f$b> r0 = r0.f370216c
            java.util.concurrent.locks.ReentrantLock r1 = r0.f370201c
            r1.lock()
            java.lang.String r1 = r6.f370193a     // Catch: java.lang.Throwable -> L71
            com.yandex.div.internal.viewpool.f$c r2 = r5.f370210a     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = r2.f370217d     // Catch: java.lang.Throwable -> L71
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L79
            boolean r1 = r6.f370199g     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L2c
            goto L79
        L2c:
            com.yandex.div.internal.viewpool.f$c r1 = r5.f370210a     // Catch: java.lang.Throwable -> L71
            com.yandex.div.internal.viewpool.b<com.yandex.div.internal.viewpool.f$b> r1 = r1.f370216c     // Catch: java.lang.Throwable -> L71
            java.util.concurrent.locks.ReentrantLock r2 = r1.f370201c     // Catch: java.lang.Throwable -> L71
            r2.lock()     // Catch: java.lang.Throwable -> L71
            java.util.PriorityQueue r2 = r1.f370200b     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L55
        L3b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L57
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L55
            com.yandex.div.internal.viewpool.f$b r3 = (com.yandex.div.internal.viewpool.f.b) r3     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = r3.f370213c     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = r6.f370193a     // Catch: java.lang.Throwable -> L55
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L3b
            r2.remove()     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r6 = move-exception
            goto L73
        L57:
            java.util.concurrent.locks.ReentrantLock r1 = r1.f370201c     // Catch: java.lang.Throwable -> L71
            r1.unlock()     // Catch: java.lang.Throwable -> L71
            com.yandex.div.internal.viewpool.f$c r1 = r5.f370210a     // Catch: java.lang.Throwable -> L71
            com.yandex.div.internal.viewpool.b<com.yandex.div.internal.viewpool.f$b> r1 = r1.f370216c     // Catch: java.lang.Throwable -> L71
            com.yandex.div.internal.viewpool.f$b r2 = new com.yandex.div.internal.viewpool.f$b     // Catch: java.lang.Throwable -> L71
            r3 = -1
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L71
            r1.offer(r2)     // Catch: java.lang.Throwable -> L71
            kotlin.G0 r6 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L71
            java.util.concurrent.locks.ReentrantLock r6 = r0.f370201c
            r6.unlock()
            return
        L71:
            r6 = move-exception
            goto L7f
        L73:
            java.util.concurrent.locks.ReentrantLock r1 = r1.f370201c     // Catch: java.lang.Throwable -> L71
            r1.unlock()     // Catch: java.lang.Throwable -> L71
            throw r6     // Catch: java.lang.Throwable -> L71
        L79:
            java.util.concurrent.locks.ReentrantLock r6 = r0.f370201c
            r6.unlock()
            return
        L7f:
            java.util.concurrent.locks.ReentrantLock r0 = r0.f370201c
            r0.unlock()
            throw r6
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.viewpool.f.a(com.yandex.div.internal.viewpool.a$a):void");
    }
}
