package hu.akarnokd.rxjava3.debug.multihook;

import io.reactivex.rxjava3.disposables.d;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MultiHandlerManager.java */
/* loaded from: classes8.dex */
public class a<H> {

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<C11318a<H>> f397846b = new CopyOnWriteArrayList<>();

    /* compiled from: MultiHandlerManager.java */
    /* renamed from: hu.akarnokd.rxjava3.debug.multihook.a$a, reason: collision with other inner class name */
    public static final class C11318a<H> extends AtomicReference<H> implements d {
        private static final long serialVersionUID = -3761960052630027297L;

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (getAndSet(null) != null) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return get() == null;
        }
    }
}
