package hu.akarnokd.rxjava3.math;

/* compiled from: FlowableAverageDouble.java */
/* loaded from: classes8.dex */
final class a extends d<Number, Double> {

    /* compiled from: FlowableAverageDouble.java */
    /* renamed from: hu.akarnokd.rxjava3.math.a$a, reason: collision with other inner class name */
    public static final class C11320a extends io.reactivex.rxjava3.internal.subscribers.h<Number, Double> {
        private static final long serialVersionUID = 600979972678601618L;

        /* renamed from: f, reason: collision with root package name */
        public double f397880f;

        /* renamed from: g, reason: collision with root package name */
        public long f397881g;

        public C11320a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.d
        public final void e() {
            long j12 = this.f397881g;
            if (j12 != 0) {
                l(Double.valueOf(this.f397880f / j12));
            } else {
                this.f419376b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            this.f397880f = ((Number) obj).doubleValue() + this.f397880f;
            this.f397881g++;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Double> dVar) {
        new C11320a(dVar);
        throw null;
    }
}
