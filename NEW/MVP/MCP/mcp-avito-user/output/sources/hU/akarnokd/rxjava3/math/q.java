package hu.akarnokd.rxjava3.math;

import io.reactivex.rxjava3.core.G;

/* compiled from: ObservableSumLong.java */
/* loaded from: classes8.dex */
public class q extends r<Long, Long> {

    /* compiled from: ObservableSumLong.java */
    public static final class a extends io.reactivex.rxjava3.internal.observers.o<Long, Long> {
        private static final long serialVersionUID = 8645575082613773782L;

        /* renamed from: e, reason: collision with root package name */
        public long f397898e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f397899f;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.observers.o, io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f397899f) {
                a(Long.valueOf(this.f397898e));
            } else {
                this.f402118b.e();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            Long l12 = (Long) obj;
            if (!this.f397899f) {
                this.f397899f = true;
            }
            this.f397898e = l12.longValue() + this.f397898e;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super Long> g12) {
        new a(g12);
        throw null;
    }
}
