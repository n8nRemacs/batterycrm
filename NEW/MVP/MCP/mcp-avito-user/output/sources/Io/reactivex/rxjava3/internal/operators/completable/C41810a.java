package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: CompletableAmb.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41810a extends AbstractC41768a {

    /* compiled from: CompletableAmb.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.a$a, reason: collision with other inner class name */
    public static final class C11446a implements InterfaceC41771d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402213b;

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f402213b = dVar;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.b(th2, interfaceC41771d);
        }
    }
}
