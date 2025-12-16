package hu.akarnokd.rxjava3.parallel;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.lang.Number;
import o41.f;
import r41.AbstractC47491a;

/* compiled from: ParallelSumDouble.java */
/* loaded from: classes8.dex */
final class b<T extends Number> extends AbstractC47491a<Double> implements r41.c<T, Double> {

    /* compiled from: ParallelSumDouble.java */
    public static final class a extends f<Double> implements InterfaceC41782o<Number> {
        private static final long serialVersionUID = -1502296701568087162L;

        /* renamed from: d, reason: collision with root package name */
        public double f398188d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f398189e;

        /* renamed from: f, reason: collision with root package name */
        public org.reactivestreams.e f398190f;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f398190f, eVar)) {
                this.f398190f = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f398190f.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f398189e) {
                l(Double.valueOf(this.f398188d));
            } else {
                this.f419376b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f419376b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            Number number = (Number) obj;
            if (!this.f398189e) {
                this.f398189e = true;
            }
            this.f398188d = number.doubleValue() + this.f398188d;
        }
    }
}
