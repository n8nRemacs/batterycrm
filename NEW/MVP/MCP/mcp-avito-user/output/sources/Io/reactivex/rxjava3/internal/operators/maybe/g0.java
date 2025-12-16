package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: MaybePeek.java */
/* loaded from: classes8.dex */
public final class g0<T> extends AbstractC41907a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super io.reactivex.rxjava3.disposables.d> f403230c;

    /* renamed from: d, reason: collision with root package name */
    public final l41.g<? super T> f403231d;

    /* renamed from: e, reason: collision with root package name */
    public final l41.g<? super Throwable> f403232e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC43543a f403233f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC43543a f403234g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC43543a f403235h;

    /* compiled from: MaybePeek.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403236b;

        /* renamed from: c, reason: collision with root package name */
        public final g0<T> f403237c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403238d;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar, g0<T> g0Var) {
            this.f403236b = tVar;
            this.f403237c = g0Var;
        }

        public final void a() {
            try {
                this.f403237c.f403234g.run();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403236b;
            if (DisposableHelper.f(this.f403238d, dVar)) {
                try {
                    this.f403237c.f403230c.accept(dVar);
                    this.f403238d = dVar;
                    tVar.b(this);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    dVar.dispose();
                    this.f403238d = DisposableHelper.f401986b;
                    EmptyDisposable.c(th2, tVar);
                }
            }
        }

        public final void c(Throwable th2) {
            try {
                this.f403237c.f403232e.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f403238d = DisposableHelper.f401986b;
            this.f403236b.onError(th2);
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            try {
                this.f403237c.f403235h.run();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
            this.f403238d.dispose();
            this.f403238d = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            io.reactivex.rxjava3.disposables.d dVar = this.f403238d;
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper) {
                return;
            }
            try {
                this.f403237c.f403233f.run();
                this.f403238d = disposableHelper;
                this.f403236b.e();
                a();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                c(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403238d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            if (this.f403238d == DisposableHelper.f401986b) {
                C47998a.b(th2);
            } else {
                c(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.disposables.d dVar = this.f403238d;
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper) {
                return;
            }
            try {
                this.f403237c.f403231d.accept(t12);
                this.f403238d = disposableHelper;
                this.f403236b.onSuccess(t12);
                a();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                c(th2);
            }
        }
    }

    public g0(io.reactivex.rxjava3.core.q qVar, l41.g gVar, l41.g gVar2, l41.g gVar3, InterfaceC43543a interfaceC43543a, InterfaceC43543a interfaceC43543a2, InterfaceC43543a interfaceC43543a3) {
        super(qVar);
        this.f403230c = gVar;
        this.f403231d = gVar2;
        this.f403232e = gVar3;
        this.f403233f = interfaceC43543a;
        this.f403234g = interfaceC43543a2;
        this.f403235h = interfaceC43543a3;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403189b.a(new a(tVar, this));
    }
}
