package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o41.AbstractC44584d;

/* compiled from: FlowableRepeatScalar.java */
/* loaded from: classes8.dex */
final class C<T> extends AbstractC41777j<T> {
    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        if (dVar instanceof ConditionalSubscriber) {
            dVar.K(new a((ConditionalSubscriber) dVar));
        } else {
            dVar.K(new b((InterfaceC41782o) dVar));
        }
    }

    /* compiled from: FlowableRepeatScalar.java */
    public static final class a<T> extends AbstractC44584d<T> {
        private static final long serialVersionUID = -231033913007168200L;

        /* renamed from: b, reason: collision with root package name */
        public final ConditionalSubscriber<? super T> f397910b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f397911c;

        public a(ConditionalSubscriber conditionalSubscriber) {
            this.f397910b = conditionalSubscriber;
        }

        public final void a() {
            while (!this.f397911c) {
                this.f397910b.tryOnNext((Object) null);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        
            r7 = addAndGet(-r2);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(long r7) {
            /*
                r6 = this;
                r0 = 0
            L2:
                r2 = r0
            L3:
                int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r4 == 0) goto L19
                boolean r4 = r6.f397911c
                if (r4 == 0) goto Lc
                return
            Lc:
                io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber<? super T> r4 = r6.f397910b
                r5 = 0
                boolean r4 = r4.tryOnNext(r5)
                if (r4 == 0) goto L3
                r4 = 1
                long r2 = r2 + r4
                goto L3
            L19:
                boolean r7 = r6.f397911c
                if (r7 == 0) goto L1e
                return
            L1e:
                long r7 = r6.get()
                int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r4 != 0) goto L3
                long r7 = -r2
                long r7 = r6.addAndGet(r7)
                int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r2 != 0) goto L2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.akarnokd.rxjava3.operators.C.a.b(long):void");
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397911c = true;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return true;
        }

        @Override // q41.g
        public final T poll() {
            return null;
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

        @Override // q41.g
        public final void clear() {
        }
    }

    /* compiled from: FlowableRepeatScalar.java */
    public static final class b<T> extends AbstractC44584d<T> {
        private static final long serialVersionUID = -231033913007168200L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397912b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f397913c;

        public b(InterfaceC41782o interfaceC41782o) {
            this.f397912b = interfaceC41782o;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397913c = true;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return true;
        }

        @Override // q41.g
        public final T poll() {
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // org.reactivestreams.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void request(long r9) {
            /*
                r8 = this;
                boolean r0 = io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper.h(r9)
                if (r0 == 0) goto L4e
                long r0 = io.reactivex.rxjava3.internal.util.c.a(r8, r9)
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L4e
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r1 = 0
                if (r0 != 0) goto L25
            L1a:
                boolean r9 = r8.f397913c
                if (r9 == 0) goto L1f
                goto L4e
            L1f:
                io.reactivex.rxjava3.core.o r9 = r8.f397912b
                r9.onNext(r1)
                goto L1a
            L25:
                r4 = r2
            L26:
                int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r0 == 0) goto L38
                boolean r0 = r8.f397913c
                if (r0 == 0) goto L2f
                goto L4e
            L2f:
                io.reactivex.rxjava3.core.o r0 = r8.f397912b
                r0.onNext(r1)
                r6 = 1
                long r4 = r4 + r6
                goto L26
            L38:
                boolean r9 = r8.f397913c
                if (r9 == 0) goto L3d
                goto L4e
            L3d:
                long r9 = r8.get()
                int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r0 != 0) goto L26
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r0 != 0) goto L25
            L4e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.akarnokd.rxjava3.operators.C.b.request(long):void");
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return i12 & 1;
        }

        @Override // q41.g
        public final void clear() {
        }
    }
}
