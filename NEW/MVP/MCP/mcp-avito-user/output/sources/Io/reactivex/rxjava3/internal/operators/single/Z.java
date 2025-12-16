package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: SingleTimeout.java */
/* loaded from: classes8.dex */
public final class Z<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404543b;

    /* renamed from: c, reason: collision with root package name */
    public final long f404544c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f404545d;

    /* renamed from: e, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f404546e;

    /* renamed from: f, reason: collision with root package name */
    public final M f404547f;

    /* compiled from: SingleTimeout.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<T>, Runnable, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 37497744973048446L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404548b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f404549c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final C11510a<T> f404550d;

        /* renamed from: e, reason: collision with root package name */
        public M f404551e;

        /* renamed from: f, reason: collision with root package name */
        public final long f404552f;

        /* renamed from: g, reason: collision with root package name */
        public final TimeUnit f404553g;

        /* compiled from: SingleTimeout.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.single.Z$a$a, reason: collision with other inner class name */
        public static final class C11510a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<T> {
            private static final long serialVersionUID = 2071387740092105509L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.L<? super T> f404554b;

            public C11510a(io.reactivex.rxjava3.core.L<? super T> l12) {
                this.f404554b = l12;
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                this.f404554b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onSuccess(T t12) {
                this.f404554b.onSuccess(t12);
            }
        }

        public a(io.reactivex.rxjava3.core.L l12, M m12, long j12, TimeUnit timeUnit) {
            this.f404548b = l12;
            this.f404551e = m12;
            this.f404552f = j12;
            this.f404553g = timeUnit;
            if (m12 != null) {
                this.f404550d = new C11510a<>(l12);
            } else {
                this.f404550d = null;
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
            DisposableHelper.a(this.f404549c);
            C11510a<T> c11510a = this.f404550d;
            if (c11510a != null) {
                DisposableHelper.a(c11510a);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper || !compareAndSet(dVar, disposableHelper)) {
                C47998a.b(th2);
            } else {
                DisposableHelper.a(this.f404549c);
                this.f404548b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper || !compareAndSet(dVar, disposableHelper)) {
                return;
            }
            DisposableHelper.a(this.f404549c);
            this.f404548b.onSuccess(t12);
        }

        @Override // java.lang.Runnable
        public final void run() {
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper || !compareAndSet(dVar, disposableHelper)) {
                return;
            }
            if (dVar != null) {
                dVar.dispose();
            }
            M m12 = this.f404551e;
            if (m12 == null) {
                this.f404548b.onError(new TimeoutException(io.reactivex.rxjava3.internal.util.h.e(this.f404552f, this.f404553g)));
            } else {
                this.f404551e = null;
                m12.a(this.f404550d);
            }
        }
    }

    public Z(io.reactivex.rxjava3.core.I i12, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12, M m12) {
        this.f404543b = i12;
        this.f404544c = j12;
        this.f404545d = timeUnit;
        this.f404546e = h12;
        this.f404547f = m12;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        a aVar = new a(l12, this.f404547f, this.f404544c, this.f404545d);
        l12.b(aVar);
        DisposableHelper.c(aVar.f404549c, this.f404546e.e(aVar, this.f404544c, this.f404545d));
        this.f404543b.a(aVar);
    }
}
