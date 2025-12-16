package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: CompletablePeek.java */
/* loaded from: classes8.dex */
public final class K extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f402166b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super io.reactivex.rxjava3.disposables.d> f402167c;

    /* renamed from: d, reason: collision with root package name */
    public final l41.g<? super Throwable> f402168d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC43543a f402169e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC43543a f402170f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC43543a f402171g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC43543a f402172h;

    /* compiled from: CompletablePeek.java */
    public final class a implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402173b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402174c;

        public a(InterfaceC41771d interfaceC41771d) {
            this.f402173b = interfaceC41771d;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            InterfaceC41771d interfaceC41771d = this.f402173b;
            try {
                K.this.f402167c.accept(dVar);
                if (DisposableHelper.f(this.f402174c, dVar)) {
                    this.f402174c = dVar;
                    interfaceC41771d.b(this);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                dVar.dispose();
                this.f402174c = DisposableHelper.f401986b;
                EmptyDisposable.b(th2, interfaceC41771d);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            try {
                K.this.f402172h.run();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
            this.f402174c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            InterfaceC41771d interfaceC41771d = this.f402173b;
            K k12 = K.this;
            if (this.f402174c == DisposableHelper.f401986b) {
                return;
            }
            try {
                k12.f402169e.run();
                k12.f402170f.run();
                interfaceC41771d.e();
                try {
                    k12.f402171g.run();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                interfaceC41771d.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402174c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            K k12 = K.this;
            if (this.f402174c == DisposableHelper.f401986b) {
                C47998a.b(th2);
                return;
            }
            try {
                k12.f402168d.accept(th2);
                k12.f402170f.run();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f402173b.onError(th2);
            try {
                k12.f402171g.run();
            } catch (Throwable th4) {
                io.reactivex.rxjava3.exceptions.a.a(th4);
                C47998a.b(th4);
            }
        }
    }

    public K(AbstractC41768a abstractC41768a, l41.g gVar, l41.g gVar2, InterfaceC43543a interfaceC43543a, InterfaceC43543a interfaceC43543a2, InterfaceC43543a interfaceC43543a3, InterfaceC43543a interfaceC43543a4) {
        this.f402166b = abstractC41768a;
        this.f402167c = gVar;
        this.f402168d = gVar2;
        this.f402169e = interfaceC43543a;
        this.f402170f = interfaceC43543a2;
        this.f402171g = interfaceC43543a3;
        this.f402172h = interfaceC43543a4;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f402166b.a(new a(interfaceC41771d));
    }
}
