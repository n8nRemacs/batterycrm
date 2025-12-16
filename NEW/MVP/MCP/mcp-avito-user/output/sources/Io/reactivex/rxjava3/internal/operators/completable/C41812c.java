package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CompletableCache.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41812c extends AbstractC41768a implements InterfaceC41771d {

    /* compiled from: CompletableCache.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.c$a */
    public final class a extends AtomicBoolean implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 8943152917179642732L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402220b;

        public a(InterfaceC41771d interfaceC41771d) {
            this.f402220b = interfaceC41771d;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (compareAndSet(false, true)) {
                C41812c.this.getClass();
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get();
        }
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void e() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void onError(Throwable th2) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        interfaceC41771d.b(new a(interfaceC41771d));
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
    }
}
