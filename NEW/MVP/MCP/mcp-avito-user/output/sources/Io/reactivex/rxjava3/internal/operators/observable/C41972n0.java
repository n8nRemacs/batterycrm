package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.InterfaceC41776i;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import s41.C47998a;

/* compiled from: ObservableGenerate.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.n0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41972n0<T, S> extends io.reactivex.rxjava3.core.z<T> {

    /* compiled from: ObservableGenerate.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.n0$a */
    public static final class a<T, S> implements InterfaceC41776i<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f404156b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f404157c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f404158d;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404156b = true;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void e() {
            if (this.f404157c) {
                return;
            }
            this.f404157c = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404156b;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onError(Throwable th2) {
            if (this.f404157c) {
                C47998a.b(th2);
            } else {
                this.f404157c = true;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onNext(T t12) {
            if (this.f404157c) {
                return;
            }
            if (this.f404158d) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t12 == null) {
                onError(io.reactivex.rxjava3.internal.util.h.b("onNext called with a null value."));
            } else {
                this.f404158d = true;
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.d(th2, g12);
        }
    }
}
