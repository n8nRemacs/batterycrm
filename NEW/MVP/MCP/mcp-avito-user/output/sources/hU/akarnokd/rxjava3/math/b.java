package hu.akarnokd.rxjava3.math;

/* compiled from: FlowableAverageFloat.java */
/* loaded from: classes8.dex */
final class b extends d<Number, Float> {

    /* compiled from: FlowableAverageFloat.java */
    public static final class a extends io.reactivex.rxjava3.internal.subscribers.h<Number, Float> {
        private static final long serialVersionUID = 600979972678601618L;

        /* renamed from: f, reason: collision with root package name */
        public float f397882f;

        /* renamed from: g, reason: collision with root package name */
        public int f397883g;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.d
        public final void e() {
            int i12 = this.f397883g;
            if (i12 != 0) {
                l(Float.valueOf(this.f397882f / i12));
            } else {
                this.f419376b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            this.f397882f = ((Number) obj).floatValue() + this.f397882f;
            this.f397883g++;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Float> dVar) {
        new a(dVar);
        throw null;
    }
}
