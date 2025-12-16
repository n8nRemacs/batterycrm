package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: CompletableDoFinally.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41821l extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f402255b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC43543a f402256c;

    /* compiled from: CompletableDoFinally.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.l$a */
    public static final class a extends AtomicInteger implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402257b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC43543a f402258c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402259d;

        public a(InterfaceC41771d interfaceC41771d, InterfaceC43543a interfaceC43543a) {
            this.f402257b = interfaceC41771d;
            this.f402258c = interfaceC43543a;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f402258c.run();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f402259d, dVar)) {
                this.f402259d = dVar;
                this.f402257b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402259d.dispose();
            a();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f402257b.e();
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402259d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f402257b.onError(th2);
            a();
        }
    }

    public C41821l(AbstractC41768a abstractC41768a, InterfaceC43543a interfaceC43543a) {
        this.f402255b = abstractC41768a;
        this.f402256c = interfaceC43543a;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f402255b.a(new a(interfaceC41771d, this.f402256c));
    }
}
