package m41;

import java.util.concurrent.atomic.AtomicReference;
import l41.f;
import s41.C47998a;

/* compiled from: CancellableDisposable.java */
/* renamed from: m41.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43880b extends AtomicReference<f> implements io.reactivex.rxjava3.disposables.d {
    private static final long serialVersionUID = 5718521705281392066L;

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        f andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return get() == null;
    }
}
