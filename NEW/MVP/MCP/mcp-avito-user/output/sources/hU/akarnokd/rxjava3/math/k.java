package hu.akarnokd.rxjava3.math;

import io.reactivex.rxjava3.core.G;

/* compiled from: ObservableAverageDouble.java */
/* loaded from: classes8.dex */
public class k extends r<Number, Double> {

    /* compiled from: ObservableAverageDouble.java */
    public static final class a extends io.reactivex.rxjava3.internal.observers.o<Number, Double> {
        private static final long serialVersionUID = 6990557227019180008L;

        /* renamed from: e, reason: collision with root package name */
        public double f397888e;

        /* renamed from: f, reason: collision with root package name */
        public long f397889f;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.observers.o, io.reactivex.rxjava3.core.G
        public final void e() {
            long j12 = this.f397889f;
            if (j12 != 0) {
                a(Double.valueOf(this.f397888e / j12));
            } else {
                this.f402118b.e();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            this.f397889f++;
            this.f397888e = ((Number) obj).doubleValue() + this.f397888e;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super Double> g12) {
        new a(g12);
        throw null;
    }
}
