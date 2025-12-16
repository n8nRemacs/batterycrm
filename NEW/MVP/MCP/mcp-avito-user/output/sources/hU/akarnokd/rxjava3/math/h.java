package hu.akarnokd.rxjava3.math;

/* compiled from: FlowableSumLong.java */
/* loaded from: classes8.dex */
final class h extends d<Long, Long> {

    /* compiled from: FlowableSumLong.java */
    public static final class a extends io.reactivex.rxjava3.internal.subscribers.h<Long, Long> {
        private static final long serialVersionUID = 600979972678601618L;

        /* renamed from: f, reason: collision with root package name */
        public long f397887f;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.d
        public final void e() {
            if (this.f404783e) {
                l(Long.valueOf(this.f397887f));
            } else {
                this.f419376b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            Long l12 = (Long) obj;
            if (!this.f404783e) {
                this.f404783e = true;
            }
            this.f397887f = l12.longValue() + this.f397887f;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Long> dVar) {
        new a(dVar);
        throw null;
    }
}
