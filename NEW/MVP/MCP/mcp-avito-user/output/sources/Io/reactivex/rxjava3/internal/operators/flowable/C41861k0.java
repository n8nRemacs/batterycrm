package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import o41.AbstractC44584d;
import q41.InterfaceC47198a;

/* compiled from: FlowableFromArray.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41861k0<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public final T[] f402846c;

    /* compiled from: FlowableFromArray.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.k0$a */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC47198a<? super T> f402847e;

        public a(InterfaceC47198a<? super T> interfaceC47198a, T[] tArr) {
            super(tArr);
            this.f402847e = interfaceC47198a;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41861k0.c
        public final void a() {
            T[] tArr = this.f402849b;
            int length = tArr.length;
            InterfaceC47198a<? super T> interfaceC47198a = this.f402847e;
            for (int i12 = this.f402850c; i12 != length; i12++) {
                if (this.f402851d) {
                    return;
                }
                T t12 = tArr[i12];
                if (t12 == null) {
                    interfaceC47198a.onError(new NullPointerException(androidx.camera.camera2.internal.G.e(i12, "The element at index ", " is null")));
                    return;
                }
                interfaceC47198a.P(t12);
            }
            if (this.f402851d) {
                return;
            }
            interfaceC47198a.e();
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        
            r10.f402850c = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41861k0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.f402849b
                int r1 = r0.length
                int r2 = r10.f402850c
                q41.a<? super T> r3 = r10.f402847e
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L36
                if (r2 == r1) goto L36
                boolean r8 = r10.f402851d
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L2a
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "The element at index "
                java.lang.String r0 = " is null"
                java.lang.String r12 = androidx.camera.camera2.internal.G.e(r2, r12, r0)
                r11.<init>(r12)
                r3.onError(r11)
                return
            L2a:
                boolean r8 = r3.P(r8)
                if (r8 == 0) goto L33
                r8 = 1
                long r6 = r6 + r8
            L33:
                int r2 = r2 + 1
                goto La
            L36:
                if (r2 != r1) goto L40
                boolean r11 = r10.f402851d
                if (r11 != 0) goto L3f
                r3.e()
            L3f:
                return
            L40:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f402850c = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.C41861k0.a.b(long):void");
        }
    }

    /* compiled from: FlowableFromArray.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.k0$b */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC41782o f402848e;

        public b(InterfaceC41782o interfaceC41782o, Object[] objArr) {
            super(objArr);
            this.f402848e = interfaceC41782o;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41861k0.c
        public final void a() {
            T[] tArr = this.f402849b;
            int length = tArr.length;
            InterfaceC41782o interfaceC41782o = this.f402848e;
            for (int i12 = this.f402850c; i12 != length; i12++) {
                if (this.f402851d) {
                    return;
                }
                T t12 = tArr[i12];
                if (t12 == null) {
                    interfaceC41782o.onError(new NullPointerException(androidx.camera.camera2.internal.G.e(i12, "The element at index ", " is null")));
                    return;
                }
                interfaceC41782o.onNext(t12);
            }
            if (this.f402851d) {
                return;
            }
            interfaceC41782o.e();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
        
            r10.f402850c = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41861k0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.f402849b
                int r1 = r0.length
                int r2 = r10.f402850c
                io.reactivex.rxjava3.core.o r3 = r10.f402848e
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L33
                if (r2 == r1) goto L33
                boolean r8 = r10.f402851d
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L2a
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "The element at index "
                java.lang.String r0 = " is null"
                java.lang.String r12 = androidx.camera.camera2.internal.G.e(r2, r12, r0)
                r11.<init>(r12)
                r3.onError(r11)
                return
            L2a:
                r3.onNext(r8)
                r8 = 1
                long r6 = r6 + r8
                int r2 = r2 + 1
                goto La
            L33:
                if (r2 != r1) goto L3d
                boolean r11 = r10.f402851d
                if (r11 != 0) goto L3c
                r3.e()
            L3c:
                return
            L3d:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f402850c = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.C41861k0.b.b(long):void");
        }
    }

    /* compiled from: FlowableFromArray.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.k0$c */
    public static abstract class c<T> extends AbstractC44584d<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: b, reason: collision with root package name */
        public final T[] f402849b;

        /* renamed from: c, reason: collision with root package name */
        public int f402850c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f402851d;

        public c(T[] tArr) {
            this.f402849b = tArr;
        }

        public abstract void a();

        public abstract void b(long j12);

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402851d = true;
        }

        @Override // q41.g
        public final void clear() {
            this.f402850c = this.f402849b.length;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f402850c == this.f402849b.length;
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            int i12 = this.f402850c;
            T[] tArr = this.f402849b;
            if (i12 == tArr.length) {
                return null;
            }
            this.f402850c = i12 + 1;
            T t12 = tArr[i12];
            Objects.requireNonNull(t12, "array element is null");
            return t12;
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

    public C41861k0(T[] tArr) {
        this.f402846c = tArr;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        boolean z12 = dVar instanceof InterfaceC47198a;
        T[] tArr = this.f402846c;
        if (z12) {
            dVar.K(new a((InterfaceC47198a) dVar, tArr));
        } else {
            dVar.K(new b((InterfaceC41782o) dVar, tArr));
        }
    }
}
