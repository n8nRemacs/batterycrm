package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o41.AbstractC44584d;
import q41.InterfaceC47198a;

/* compiled from: FlowableRangeLong.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.c1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41838c1 extends AbstractC41777j<Long> {

    /* compiled from: FlowableRangeLong.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.c1$a */
    public static abstract class a extends AbstractC44584d<Long> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: b, reason: collision with root package name */
        public long f402693b = 0;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f402694c;

        public abstract void a();

        public abstract void b(long j12);

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402694c = true;
        }

        @Override // q41.g
        public final void clear() {
            this.f402693b = 0L;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f402693b == 0;
        }

        @Override // q41.g
        @j41.f
        public final Object poll() {
            long j12 = this.f402693b;
            if (j12 == 0) {
                return null;
            }
            this.f402693b = 1 + j12;
            return Long.valueOf(j12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12) && io.reactivex.rxjava3.internal.util.c.a(this, j12) == 0) {
                if (j12 == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j12);
                }
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return i12 & 1;
        }
    }

    /* compiled from: FlowableRangeLong.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.c1$b */
    public static final class b extends a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC47198a<? super Long> f402695d;

        public b(InterfaceC47198a interfaceC47198a) {
            this.f402695d = interfaceC47198a;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41838c1.a
        public final void a() {
            InterfaceC47198a<? super Long> interfaceC47198a = this.f402695d;
            for (long j12 = this.f402693b; j12 != 0; j12++) {
                if (this.f402694c) {
                    return;
                }
                interfaceC47198a.P(Long.valueOf(j12));
            }
            if (this.f402694c) {
                return;
            }
            interfaceC47198a.e();
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
        
            r10.f402693b = r0;
            r11 = addAndGet(-r5);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41838c1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(long r11) {
            /*
                r10 = this;
                long r0 = r10.f402693b
                q41.a<? super java.lang.Long> r2 = r10.f402695d
                r3 = 0
            L6:
                r5 = r3
            L7:
                int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r7 == 0) goto L23
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 == 0) goto L23
                boolean r7 = r10.f402694c
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Long r7 = java.lang.Long.valueOf(r0)
                boolean r7 = r2.P(r7)
                r8 = 1
                if (r7 == 0) goto L21
                long r5 = r5 + r8
            L21:
                long r0 = r0 + r8
                goto L7
            L23:
                int r11 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r11 != 0) goto L2f
                boolean r11 = r10.f402694c
                if (r11 != 0) goto L2e
                r2.e()
            L2e:
                return
            L2f:
                long r11 = r10.get()
                int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r7 != 0) goto L7
                r10.f402693b = r0
                long r11 = -r5
                long r11 = r10.addAndGet(r11)
                int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r5 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.C41838c1.b.b(long):void");
        }
    }

    /* compiled from: FlowableRangeLong.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.c1$c */
    public static final class c extends a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC41782o f402696d;

        public c(InterfaceC41782o interfaceC41782o) {
            this.f402696d = interfaceC41782o;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41838c1.a
        public final void a() {
            InterfaceC41782o interfaceC41782o = this.f402696d;
            for (long j12 = this.f402693b; j12 != 0; j12++) {
                if (this.f402694c) {
                    return;
                }
                interfaceC41782o.onNext(Long.valueOf(j12));
            }
            if (this.f402694c) {
                return;
            }
            interfaceC41782o.e();
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        
            r9.f402693b = r0;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41838c1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(long r10) {
            /*
                r9 = this;
                long r0 = r9.f402693b
                io.reactivex.rxjava3.core.o r2 = r9.f402696d
                r3 = 0
            L6:
                r5 = r3
            L7:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L20
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 == 0) goto L20
                boolean r7 = r9.f402694c
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Long r7 = java.lang.Long.valueOf(r0)
                r2.onNext(r7)
                r7 = 1
                long r5 = r5 + r7
                long r0 = r0 + r7
                goto L7
            L20:
                int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r10 != 0) goto L2c
                boolean r10 = r9.f402694c
                if (r10 != 0) goto L2b
                r2.e()
            L2b:
                return
            L2c:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L7
                r9.f402693b = r0
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.C41838c1.c.b(long):void");
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Long> dVar) {
        if (dVar instanceof InterfaceC47198a) {
            dVar.K(new b((InterfaceC47198a) dVar));
        } else {
            dVar.K(new c((InterfaceC41782o) dVar));
        }
    }
}
