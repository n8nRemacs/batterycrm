package hu.akarnokd.rxjava3.string;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableCharSequence.java */
/* loaded from: classes8.dex */
final class c extends z<Integer> {

    /* compiled from: ObservableCharSequence.java */
    public static final class a extends AtomicBoolean implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -4762798297183704664L;

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            lazySet(true);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get();
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super Integer> g12) {
        g12.b(new a());
        throw null;
    }
}
