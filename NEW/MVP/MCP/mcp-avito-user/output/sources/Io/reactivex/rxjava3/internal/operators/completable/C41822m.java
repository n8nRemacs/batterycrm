package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: CompletableDoOnEvent.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41822m extends AbstractC41768a {

    /* compiled from: CompletableDoOnEvent.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.m$a */
    public final class a implements InterfaceC41771d {
        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                new CompositeException(th2, th3);
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        throw null;
    }
}
