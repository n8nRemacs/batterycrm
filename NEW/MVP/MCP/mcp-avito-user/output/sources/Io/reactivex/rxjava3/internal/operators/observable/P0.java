package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.observers.AbstractC41805c;

/* compiled from: ObservableRangeLong.java */
/* loaded from: classes8.dex */
public final class P0 extends io.reactivex.rxjava3.core.z<Long> {

    /* compiled from: ObservableRangeLong.java */
    public static final class a extends AbstractC41805c<Long> {
        private static final long serialVersionUID = 396518478098735504L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super Long> f403788b;

        /* renamed from: c, reason: collision with root package name */
        public long f403789c = 0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f403790d;

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f403788b = g12;
        }

        @Override // q41.g
        public final void clear() {
            this.f403789c = 0L;
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
            return this.f403789c == 0;
        }

        @Override // q41.g
        @j41.f
        public final Object poll() {
            long j12 = this.f403789c;
            if (j12 != 0) {
                this.f403789c = 1 + j12;
                return Long.valueOf(j12);
            }
            lazySet(1);
            return null;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            this.f403790d = true;
            return 1;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super Long> g12) {
        io.reactivex.rxjava3.core.G<? super Long> g13;
        a aVar = new a(g12);
        g12.b(aVar);
        if (aVar.f403790d) {
            return;
        }
        long j12 = aVar.f403789c;
        while (true) {
            g13 = aVar.f403788b;
            if (j12 == 0 || aVar.get() != 0) {
                break;
            }
            g13.onNext(Long.valueOf(j12));
            j12++;
        }
        if (aVar.get() == 0) {
            aVar.lazySet(1);
            g13.e();
        }
    }
}
