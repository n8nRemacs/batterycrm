package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: FlowableFlatMapSync.java */
/* renamed from: hu.akarnokd.rxjava3.operators.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41160t<T, R> extends AbstractC41777j<R> implements InterfaceC41783p<T, R> {

    /* compiled from: FlowableFlatMapSync.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.t$a */
    public static abstract class a<T, R> extends AtomicInteger implements org.reactivestreams.d<T>, org.reactivestreams.e, c<T, R> {
        private static final long serialVersionUID = -208456984819517117L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f398139b;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceArray<b<T, R>> f398141d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicIntegerArray f398142e;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f398145h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f398146i;

        /* renamed from: j, reason: collision with root package name */
        public org.reactivestreams.e f398147j;

        /* renamed from: k, reason: collision with root package name */
        public long f398148k;

        /* renamed from: l, reason: collision with root package name */
        public long f398149l;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f398140c = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f398143f = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicLong f398144g = new AtomicLong();

        public a(InterfaceC41782o interfaceC41782o) {
            this.f398139b = interfaceC41782o;
            int iA2 = io.reactivex.rxjava3.internal.util.n.a(0);
            this.f398141d = new AtomicReferenceArray<>(iA2);
            this.f398142e = new AtomicIntegerArray(iA2 + 48);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f398147j, eVar)) {
                this.f398147j = eVar;
                this.f398139b.K(this);
                eVar.request(0);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
        
            r18 = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
        
            if (r2 != r8) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
        
            if (r20.f398146i == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
        
            if (r20.f398145h == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
        
            if (r20.f398143f.get() == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
        
            r20.f398143f.g(r5);
            h();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00e8, code lost:
        
            if (r20.f398149l != r15.get()) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
        
            r5.e();
            h();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00f0, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
        
            r6 = r20.f398149l;
            r8 = r15.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00f9, code lost:
        
            if (r20.f398145h == false) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00fd, code lost:
        
            if (r8 != r6) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00ff, code lost:
        
            r5.e();
            h();
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0105, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0109, code lost:
        
            if (r14 != r18) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x010b, code lost:
        
            r0 = get();
            r7 = r16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0111, code lost:
        
            if (r0 != r7) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0113, code lost:
        
            r20.f398148k = r2;
            r0 = addAndGet(-r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
        
            if (r0 != 0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x011c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x011d, code lost:
        
            r7 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0123, code lost:
        
            r7 = r16;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.akarnokd.rxjava3.operators.C41160t.a.a():void");
        }

        public final void b() {
            AtomicReferenceArray<b<T, R>> atomicReferenceArray = this.f398141d;
            int length = atomicReferenceArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                b<T, R> bVar = atomicReferenceArray.get(i12);
                if (bVar != null) {
                    atomicReferenceArray.lazySet(i12, null);
                    SubscriptionHelper.a(bVar);
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f398146i) {
                return;
            }
            this.f398146i = true;
            this.f398147j.cancel();
            this.f398143f.c();
            b();
            h();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f398145h = true;
            c();
        }

        public abstract void h();

        public final void i(b<T, R> bVar) {
            AtomicIntegerArray atomicIntegerArray = this.f398142e;
            AtomicReferenceArray<b<T, R>> atomicReferenceArray = this.f398141d;
            int length = atomicReferenceArray.length();
            int i12 = length + 16;
            int i13 = atomicIntegerArray.get(i12);
            bVar.getClass();
            atomicReferenceArray.lazySet(0 - 1, null);
            atomicIntegerArray.lazySet(i13, 0);
            atomicIntegerArray.lazySet(i12, (i13 + 1) & (length - 1));
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f398143f.b(th2)) {
                this.f398145h = true;
                c();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398147j.cancel();
                b();
                if (this.f398143f.b(th2)) {
                    this.f398145h = true;
                    c();
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f398140c, j12);
                c();
            }
        }

        public void run() {
            a();
        }
    }

    /* compiled from: FlowableFlatMapSync.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.t$b */
    public static final class b<T, R> extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<R> {
        private static final long serialVersionUID = -4991009168975207961L;

        /* renamed from: b, reason: collision with root package name */
        public int f398150b;

        /* renamed from: c, reason: collision with root package name */
        public int f398151c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f398152d;

        /* renamed from: e, reason: collision with root package name */
        public volatile SimpleQueue<R> f398153e;

        public static void b() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this, eVar)) {
                if (eVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) eVar;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f398151c = iRequestFusion;
                        this.f398153e = queueSubscription;
                        this.f398152d = true;
                        throw null;
                    }
                    if (iRequestFusion == 2) {
                        this.f398151c = iRequestFusion;
                        this.f398153e = queueSubscription;
                        eVar.request(0);
                        return;
                    }
                }
                eVar.request(0);
            }
        }

        public final void a() {
            if (this.f398151c != 1) {
                int i12 = this.f398150b + 1;
                if (i12 != 0) {
                    this.f398150b = i12;
                } else {
                    this.f398150b = 0;
                    get().request(i12);
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(R r12) {
            if (this.f398151c != 0) {
                throw null;
            }
            throw null;
        }
    }

    /* compiled from: FlowableFlatMapSync.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.t$c */
    public interface c<T, R> {
        void c();

        void d(b<T, R> bVar);

        void f(b<T, R> bVar, R r12);

        void g(b<T, R> bVar, Throwable th2);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new d((InterfaceC41782o) dVar);
        throw null;
    }

    /* compiled from: FlowableFlatMapSync.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.t$d */
    public static final class d<T, R> extends a<T, R> {
        private static final long serialVersionUID = -5109342841608286301L;

        public d() {
            throw null;
        }

        @Override // hu.akarnokd.rxjava3.operators.C41160t.c
        public final void c() {
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // hu.akarnokd.rxjava3.operators.C41160t.c
        public final void d(b<T, R> bVar) {
            bVar.f398152d = true;
            c();
        }

        @Override // hu.akarnokd.rxjava3.operators.C41160t.c
        public final void f(b<T, R> bVar, R r12) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                b.b();
                throw null;
            }
            long j12 = this.f398140c.get();
            long j13 = this.f398148k;
            if (j13 == j12) {
                b.b();
                throw null;
            }
            this.f398139b.onNext(r12);
            this.f398148k = j13 + 1;
            bVar.a();
            if (decrementAndGet() == 0) {
                return;
            }
            a();
        }

        @Override // hu.akarnokd.rxjava3.operators.C41160t.c
        public final void g(b<T, R> bVar, Throwable th2) {
            i(bVar);
            if (this.f398143f.b(th2)) {
                bVar.f398152d = true;
                this.f398145h = true;
                this.f398147j.cancel();
                b();
                c();
            }
        }

        @Override // hu.akarnokd.rxjava3.operators.C41160t.a
        public final void h() {
        }
    }
}
