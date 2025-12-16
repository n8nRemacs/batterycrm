package hu.akarnokd.rxjava3.math;

import io.reactivex.rxjava3.core.G;

/* compiled from: ObservableSumDouble.java */
/* loaded from: classes8.dex */
public class n extends r<Double, Double> {

    /* compiled from: ObservableSumDouble.java */
    public static final class a extends io.reactivex.rxjava3.internal.observers.o<Double, Double> {
        private static final long serialVersionUID = -769098775594601087L;

        /* renamed from: e, reason: collision with root package name */
        public double f397892e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f397893f;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.observers.o, io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f397893f) {
                a(Double.valueOf(this.f397892e));
            } else {
                this.f402118b.e();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            Double d12 = (Double) obj;
            if (!this.f397893f) {
                this.f397893f = true;
            }
            this.f397892e = d12.doubleValue() + this.f397892e;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super Double> g12) {
        new a(g12);
        throw null;
    }
}
