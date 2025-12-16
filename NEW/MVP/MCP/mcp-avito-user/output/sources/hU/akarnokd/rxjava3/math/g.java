package hu.akarnokd.rxjava3.math;

/* compiled from: FlowableSumInt.java */
/* loaded from: classes8.dex */
final class g extends d<Integer, Integer> {

    /* compiled from: FlowableSumInt.java */
    public static final class a extends io.reactivex.rxjava3.internal.subscribers.h<Integer, Integer> {
        private static final long serialVersionUID = 600979972678601618L;

        /* renamed from: f, reason: collision with root package name */
        public int f397886f;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.d
        public final void e() {
            if (this.f404783e) {
                l(Integer.valueOf(this.f397886f));
            } else {
                this.f419376b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            Integer num = (Integer) obj;
            if (!this.f404783e) {
                this.f404783e = true;
            }
            this.f397886f = num.intValue() + this.f397886f;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Integer> dVar) {
        new a(dVar);
        throw null;
    }
}
