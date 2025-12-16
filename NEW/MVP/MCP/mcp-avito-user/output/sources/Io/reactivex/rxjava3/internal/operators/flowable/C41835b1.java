package io.reactivex.rxjava3.internal.operators.flowable;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o41.AbstractC44584d;
import q41.InterfaceC47198a;

/* compiled from: FlowableRange.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.b1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41835b1 extends AbstractC41777j<Integer> {

    /* renamed from: c, reason: collision with root package name */
    public final int f402654c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final int f402655d = BeduinInputModel.MIN_TEXT_VERSION;

    /* compiled from: FlowableRange.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.b1$a */
    public static abstract class a extends AbstractC44584d<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: b, reason: collision with root package name */
        public final int f402656b;

        /* renamed from: c, reason: collision with root package name */
        public int f402657c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f402658d;

        public a(int i12, int i13) {
            this.f402657c = i12;
            this.f402656b = i13;
        }

        public abstract void a();

        public abstract void b(long j12);

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402658d = true;
        }

        @Override // q41.g
        public final void clear() {
            this.f402657c = this.f402656b;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f402657c == this.f402656b;
        }

        @Override // q41.g
        @j41.f
        public final Object poll() {
            int i12 = this.f402657c;
            if (i12 == this.f402656b) {
                return null;
            }
            this.f402657c = i12 + 1;
            return Integer.valueOf(i12);
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

    /* compiled from: FlowableRange.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.b1$b */
    public static final class b extends a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC47198a<? super Integer> f402659e;

        public b(InterfaceC47198a<? super Integer> interfaceC47198a, int i12, int i13) {
            super(i12, i13);
            this.f402659e = interfaceC47198a;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41835b1.a
        public final void a() {
            int i12 = this.f402656b;
            InterfaceC47198a<? super Integer> interfaceC47198a = this.f402659e;
            for (int i13 = this.f402657c; i13 != i12; i13++) {
                if (this.f402658d) {
                    return;
                }
                interfaceC47198a.P(Integer.valueOf(i13));
            }
            if (this.f402658d) {
                return;
            }
            interfaceC47198a.e();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        
            r9.f402657c = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41835b1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(long r10) {
            /*
                r9 = this;
                int r0 = r9.f402656b
                int r1 = r9.f402657c
                q41.a<? super java.lang.Integer> r2 = r9.f402659e
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L24
                if (r1 == r0) goto L24
                boolean r7 = r9.f402658d
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                boolean r7 = r2.P(r7)
                if (r7 == 0) goto L21
                r7 = 1
                long r5 = r5 + r7
            L21:
                int r1 = r1 + 1
                goto L9
            L24:
                if (r1 != r0) goto L2e
                boolean r10 = r9.f402658d
                if (r10 != 0) goto L2d
                r2.e()
            L2d:
                return
            L2e:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.f402657c = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.C41835b1.b.b(long):void");
        }
    }

    /* compiled from: FlowableRange.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.b1$c */
    public static final class c extends a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC41782o f402660e;

        public c(InterfaceC41782o interfaceC41782o, int i12, int i13) {
            super(i12, i13);
            this.f402660e = interfaceC41782o;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41835b1.a
        public final void a() {
            int i12 = this.f402656b;
            InterfaceC41782o interfaceC41782o = this.f402660e;
            for (int i13 = this.f402657c; i13 != i12; i13++) {
                if (this.f402658d) {
                    return;
                }
                interfaceC41782o.onNext(Integer.valueOf(i13));
            }
            if (this.f402658d) {
                return;
            }
            interfaceC41782o.e();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        
            r9.f402657c = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41835b1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(long r10) {
            /*
                r9 = this;
                int r0 = r9.f402656b
                int r1 = r9.f402657c
                io.reactivex.rxjava3.core.o r2 = r9.f402660e
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L21
                if (r1 == r0) goto L21
                boolean r7 = r9.f402658d
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                r2.onNext(r7)
                r7 = 1
                long r5 = r5 + r7
                int r1 = r1 + 1
                goto L9
            L21:
                if (r1 != r0) goto L2b
                boolean r10 = r9.f402658d
                if (r10 != 0) goto L2a
                r2.e()
            L2a:
                return
            L2b:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.f402657c = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.C41835b1.c.b(long):void");
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Integer> dVar) {
        boolean z12 = dVar instanceof InterfaceC47198a;
        int i12 = this.f402655d;
        int i13 = this.f402654c;
        if (z12) {
            dVar.K(new b((InterfaceC47198a) dVar, i13, i12));
        } else {
            dVar.K(new c((InterfaceC41782o) dVar, i13, i12));
        }
    }
}
