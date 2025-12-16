package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: ObservableDoOnEach.java */
/* loaded from: classes8.dex */
public final class O<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super T> f403755c;

    /* renamed from: d, reason: collision with root package name */
    public final l41.g<? super Throwable> f403756d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC43543a f403757e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC43543a f403758f;

    /* compiled from: ObservableDoOnEach.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403759b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.g<? super T> f403760c;

        /* renamed from: d, reason: collision with root package name */
        public final l41.g<? super Throwable> f403761d;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC43543a f403762e;

        /* renamed from: f, reason: collision with root package name */
        public final InterfaceC43543a f403763f;

        /* renamed from: g, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403764g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f403765h;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, l41.g<? super T> gVar, l41.g<? super Throwable> gVar2, InterfaceC43543a interfaceC43543a, InterfaceC43543a interfaceC43543a2) {
            this.f403759b = g12;
            this.f403760c = gVar;
            this.f403761d = gVar2;
            this.f403762e = interfaceC43543a;
            this.f403763f = interfaceC43543a2;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403764g, dVar)) {
                this.f403764g = dVar;
                this.f403759b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403764g.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403765h) {
                return;
            }
            try {
                this.f403762e.run();
                this.f403765h = true;
                this.f403759b.e();
                try {
                    this.f403763f.run();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403764g.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403765h) {
                C47998a.b(th2);
                return;
            }
            this.f403765h = true;
            try {
                this.f403761d.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f403759b.onError(th2);
            try {
                this.f403763f.run();
            } catch (Throwable th4) {
                io.reactivex.rxjava3.exceptions.a.a(th4);
                C47998a.b(th4);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f403765h) {
                return;
            }
            try {
                this.f403760c.accept(t12);
                this.f403759b.onNext(t12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403764g.dispose();
                onError(th2);
            }
        }
    }

    public O(io.reactivex.rxjava3.core.z zVar, l41.g gVar, l41.g gVar2, InterfaceC43543a interfaceC43543a, InterfaceC43543a interfaceC43543a2) {
        super(zVar);
        this.f403755c = gVar;
        this.f403756d = gVar2;
        this.f403757e = interfaceC43543a;
        this.f403758f = interfaceC43543a2;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f403755c, this.f403756d, this.f403757e, this.f403758f));
    }
}
