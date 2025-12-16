package hu.akarnokd.rxjava3.math;

/* compiled from: FlowableSumFloat.java */
/* loaded from: classes8.dex */
final class f extends d<Float, Float> {

    /* compiled from: FlowableSumFloat.java */
    public static final class a extends io.reactivex.rxjava3.internal.subscribers.h<Float, Float> {
        private static final long serialVersionUID = 600979972678601618L;

        /* renamed from: f, reason: collision with root package name */
        public float f397885f;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.d
        public final void e() {
            if (this.f404783e) {
                l(Float.valueOf(this.f397885f));
            } else {
                this.f419376b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            Float f12 = (Float) obj;
            if (!this.f404783e) {
                this.f404783e = true;
            }
            this.f397885f = f12.floatValue() + this.f397885f;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Float> dVar) {
        new a(dVar);
        throw null;
    }
}
