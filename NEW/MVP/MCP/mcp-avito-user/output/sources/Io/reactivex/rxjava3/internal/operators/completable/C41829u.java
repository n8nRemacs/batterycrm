package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import s41.C47998a;

/* compiled from: CompletableFromRunnable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41829u extends AbstractC41768a {
    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        io.reactivex.rxjava3.disposables.d dVarE = io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        interfaceC41771d.b(dVarE);
        if (dVarE.getF318621e()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (dVarE.getF318621e()) {
                C47998a.b(th2);
            } else {
                interfaceC41771d.onError(th2);
            }
        }
    }
}
