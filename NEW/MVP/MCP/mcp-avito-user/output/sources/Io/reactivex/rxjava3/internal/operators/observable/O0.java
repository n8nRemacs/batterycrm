package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.observers.AbstractC41805c;

/* compiled from: ObservableRange.java */
/* loaded from: classes8.dex */
public final class O0 extends io.reactivex.rxjava3.core.z<Integer> {

    /* compiled from: ObservableRange.java */
    public static final class a extends AbstractC41805c<Integer> {
        private static final long serialVersionUID = 396518478098735504L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super Integer> f403766b;

        /* renamed from: c, reason: collision with root package name */
        public long f403767c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f403768d;

        public a(io.reactivex.rxjava3.core.G g12, long j12) {
            this.f403766b = g12;
            this.f403767c = j12;
        }

        @Override // q41.g
        public final void clear() {
            this.f403767c = 0L;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            set(1);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() != 0;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f403767c == 0;
        }

        @Override // q41.g
        @j41.f
        public final Object poll() {
            long j12 = this.f403767c;
            if (j12 != 0) {
                this.f403767c = 1 + j12;
                return Integer.valueOf((int) j12);
            }
            lazySet(1);
            return null;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            this.f403768d = true;
            return 1;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super Integer> g12) {
        io.reactivex.rxjava3.core.G<? super Integer> g13;
        a aVar = new a(g12, 0);
        g12.b(aVar);
        if (aVar.f403768d) {
            return;
        }
        long j12 = aVar.f403767c;
        while (true) {
            g13 = aVar.f403766b;
            if (j12 == 0 || aVar.get() != 0) {
                break;
            }
            g13.onNext(Integer.valueOf((int) j12));
            j12++;
        }
        if (aVar.get() == 0) {
            aVar.lazySet(1);
            g13.e();
        }
    }
}
