package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;

/* compiled from: CompletableMergeDelayErrorIterable.java */
/* loaded from: classes8.dex */
public final class E extends AbstractC41768a {
    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        interfaceC41771d.b(new io.reactivex.rxjava3.disposables.c());
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            interfaceC41771d.onError(th2);
        }
    }
}
