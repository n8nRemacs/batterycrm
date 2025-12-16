package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.AbstractC41805c;
import l41.InterfaceC43543a;
import q41.InterfaceC47199b;
import s41.C47998a;

/* compiled from: ObservableDoFinally.java */
/* loaded from: classes8.dex */
public final class N<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC43543a f403742c;

    /* compiled from: ObservableDoFinally.java */
    public static final class a<T> extends AbstractC41805c<T> implements io.reactivex.rxjava3.core.G<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403743b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC43543a f403744c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403745d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC47199b<T> f403746e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f403747f;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, InterfaceC43543a interfaceC43543a) {
            this.f403743b = g12;
            this.f403744c = interfaceC43543a;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f403744c.run();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403745d, dVar)) {
                this.f403745d = dVar;
                if (dVar instanceof InterfaceC47199b) {
                    this.f403746e = (InterfaceC47199b) dVar;
                }
                this.f403743b.b(this);
            }
        }

        @Override // q41.g
        public final void clear() {
            this.f403746e.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403745d.dispose();
            a();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403743b.e();
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403745d.getF318621e();
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f403746e.isEmpty();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403743b.onError(th2);
            a();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403743b.onNext(t12);
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            T tPoll = this.f403746e.poll();
            if (tPoll == null && this.f403747f) {
                a();
            }
            return tPoll;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            InterfaceC47199b<T> interfaceC47199b = this.f403746e;
            if (interfaceC47199b == null || (i12 & 4) != 0) {
                return 0;
            }
            int iV2 = interfaceC47199b.v(i12);
            if (iV2 != 0) {
                this.f403747f = iV2 == 1;
            }
            return iV2;
        }
    }

    public N(io.reactivex.rxjava3.core.z zVar, InterfaceC43543a interfaceC43543a) {
        super(zVar);
        this.f403742c = interfaceC43543a;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f403742c));
    }
}
