package hu.akarnokd.rxjava3.math;

import io.reactivex.rxjava3.core.G;

/* compiled from: ObservableSumFloat.java */
/* loaded from: classes8.dex */
public class o extends r<Float, Float> {

    /* compiled from: ObservableSumFloat.java */
    public static final class a extends io.reactivex.rxjava3.internal.observers.o<Float, Float> {
        private static final long serialVersionUID = -6344890278713820111L;

        /* renamed from: e, reason: collision with root package name */
        public float f397894e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f397895f;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.observers.o, io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f397895f) {
                a(Float.valueOf(this.f397894e));
            } else {
                this.f402118b.e();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            Float f12 = (Float) obj;
            if (!this.f397895f) {
                this.f397895f = true;
            }
            this.f397894e = f12.floatValue() + this.f397894e;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super Float> g12) {
        new a(g12);
        throw null;
    }
}
