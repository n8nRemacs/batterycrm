package hu.akarnokd.rxjava3.math;

import io.reactivex.rxjava3.core.G;

/* compiled from: ObservableAverageFloat.java */
/* loaded from: classes8.dex */
public class l extends r<Number, Float> {

    /* compiled from: ObservableAverageFloat.java */
    public static final class a extends io.reactivex.rxjava3.internal.observers.o<Number, Float> {
        private static final long serialVersionUID = -4845767048730060914L;

        /* renamed from: e, reason: collision with root package name */
        public float f397890e;

        /* renamed from: f, reason: collision with root package name */
        public int f397891f;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.observers.o, io.reactivex.rxjava3.core.G
        public final void e() {
            int i12 = this.f397891f;
            if (i12 != 0) {
                a(Float.valueOf(this.f397890e / i12));
            } else {
                this.f402118b.e();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            this.f397891f++;
            this.f397890e = ((Number) obj).floatValue() + this.f397890e;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super Float> g12) {
        new a(g12);
        throw null;
    }
}
