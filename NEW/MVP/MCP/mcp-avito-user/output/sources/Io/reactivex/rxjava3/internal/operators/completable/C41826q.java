package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: CompletableFromAction.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41826q extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC43543a f402262b;

    public C41826q(InterfaceC43543a interfaceC43543a) {
        this.f402262b = interfaceC43543a;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        io.reactivex.rxjava3.disposables.d dVarE = io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        interfaceC41771d.b(dVarE);
        if (dVarE.i()) {
            return;
        }
        try {
            this.f402262b.run();
            if (dVarE.i()) {
                return;
            }
            interfaceC41771d.e();
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (dVarE.i()) {
                C47998a.b(th2);
            } else {
                interfaceC41771d.onError(th2);
            }
        }
    }
}
