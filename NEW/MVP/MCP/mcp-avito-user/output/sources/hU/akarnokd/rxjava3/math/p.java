package hu.akarnokd.rxjava3.math;

import io.reactivex.rxjava3.core.G;

/* compiled from: ObservableSumInt.java */
/* loaded from: classes8.dex */
final class p extends r<Integer, Integer> {

    /* compiled from: ObservableSumInt.java */
    public static final class a extends io.reactivex.rxjava3.internal.observers.o<Integer, Integer> {
        private static final long serialVersionUID = 5434323279399190675L;

        /* renamed from: e, reason: collision with root package name */
        public int f397896e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f397897f;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.observers.o, io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f397897f) {
                a(Integer.valueOf(this.f397896e));
            } else {
                this.f402118b.e();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            Integer num = (Integer) obj;
            if (!this.f397897f) {
                this.f397897f = true;
            }
            this.f397896e = num.intValue() + this.f397896e;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super Integer> g12) {
        new a(g12);
        throw null;
    }
}
