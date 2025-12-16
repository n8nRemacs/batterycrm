package hu.akarnokd.rxjava3.math;

/* compiled from: FlowableSumDouble.java */
/* loaded from: classes8.dex */
final class e extends d<Double, Double> {

    /* compiled from: FlowableSumDouble.java */
    public static final class a extends io.reactivex.rxjava3.internal.subscribers.h<Double, Double> {
        private static final long serialVersionUID = 600979972678601618L;

        /* renamed from: f, reason: collision with root package name */
        public double f397884f;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.d
        public final void e() {
            if (this.f404783e) {
                l(Double.valueOf(this.f397884f));
            } else {
                this.f419376b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            Double d12 = (Double) obj;
            if (!this.f404783e) {
                this.f404783e = true;
            }
            this.f397884f = d12.doubleValue() + this.f397884f;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Double> dVar) {
        new a(dVar);
        throw null;
    }
}
