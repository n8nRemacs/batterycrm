package hu.akarnokd.rxjava3.parallel;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.lang.Number;
import o41.f;
import r41.AbstractC47491a;

/* compiled from: ParallelSumInteger.java */
/* loaded from: classes8.dex */
final class c<T extends Number> extends AbstractC47491a<Integer> implements r41.c<T, Integer> {

    /* compiled from: ParallelSumInteger.java */
    public static final class a extends f<Integer> implements InterfaceC41782o<Number> {
        private static final long serialVersionUID = -1502296701568087162L;

        /* renamed from: d, reason: collision with root package name */
        public int f398191d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f398192e;

        /* renamed from: f, reason: collision with root package name */
        public org.reactivestreams.e f398193f;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f398193f, eVar)) {
                this.f398193f = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f398193f.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f398192e) {
                l(Integer.valueOf(this.f398191d));
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
            if (!this.f398192e) {
                this.f398192e = true;
            }
            this.f398191d = number.intValue() + this.f398191d;
        }
    }
}
