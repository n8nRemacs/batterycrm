package io.reactivex.rxjava3.disposables;

import l41.InterfaceC43543a;

/* compiled from: ActionDisposable.java */
/* loaded from: classes8.dex */
final class a extends g<InterfaceC43543a> {
    private static final long serialVersionUID = -8219729196779211169L;

    @Override // io.reactivex.rxjava3.disposables.g
    public final void a(@j41.e InterfaceC43543a interfaceC43543a) {
        try {
            interfaceC43543a.run();
        } catch (Throwable th2) {
            throw io.reactivex.rxjava3.internal.util.h.f(th2);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "ActionDisposable(disposed=" + i() + ", " + get() + ")";
    }
}
