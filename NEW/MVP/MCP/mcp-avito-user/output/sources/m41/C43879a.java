package m41;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: ArrayCompositeDisposable.java */
/* renamed from: m41.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43879a extends AtomicReferenceArray<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.disposables.d {
    private static final long serialVersionUID = 2746389416410565408L;

    public final boolean a(int i12, io.reactivex.rxjava3.disposables.d dVar) {
        io.reactivex.rxjava3.disposables.d dVar2;
        do {
            dVar2 = get(i12);
            if (dVar2 == DisposableHelper.f401986b) {
                dVar.dispose();
                return false;
            }
        } while (!compareAndSet(i12, dVar2, dVar));
        if (dVar2 == null) {
            return true;
        }
        dVar2.dispose();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        io.reactivex.rxjava3.disposables.d andSet;
        io.reactivex.rxjava3.disposables.d dVar = get(0);
        DisposableHelper disposableHelper = DisposableHelper.f401986b;
        if (dVar != disposableHelper) {
            int length = length();
            for (int i12 = 0; i12 < length; i12++) {
                if (get(i12) != disposableHelper && (andSet = getAndSet(i12, disposableHelper)) != disposableHelper && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return get(0) == DisposableHelper.f401986b;
    }
}
