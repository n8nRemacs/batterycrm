package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMapCompletable.java */
/* loaded from: classes8.dex */
public final class s<T> extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z<T> f403428b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends InterfaceC41774g> f403429c;

    /* renamed from: d, reason: collision with root package name */
    public final ErrorMode f403430d;

    /* renamed from: e, reason: collision with root package name */
    public final int f403431e;

    /* compiled from: ObservableConcatMapCompletable.java */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = 3610901111000061034L;

        /* renamed from: i, reason: collision with root package name */
        public final InterfaceC41771d f403432i;

        /* renamed from: j, reason: collision with root package name */
        public final l41.o<? super T, ? extends InterfaceC41774g> f403433j;

        /* renamed from: k, reason: collision with root package name */
        public final C11481a f403434k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f403435l;

        /* compiled from: ObservableConcatMapCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.s$a$a, reason: collision with other inner class name */
        public static final class C11481a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d {
            private static final long serialVersionUID = 5638352172918776687L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?> f403436b;

            public C11481a(a<?> aVar) {
                this.f403436b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void e() {
                a<?> aVar = this.f403436b;
                aVar.f403435l = false;
                aVar.d();
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                a<?> aVar = this.f403436b;
                if (aVar.f403349b.b(th2)) {
                    if (aVar.f403351d != ErrorMode.f404821d) {
                        aVar.f403353f.dispose();
                    }
                    aVar.f403435l = false;
                    aVar.d();
                }
            }
        }

        public a(InterfaceC41771d interfaceC41771d, l41.o<? super T, ? extends InterfaceC41774g> oVar, ErrorMode errorMode, int i12) {
            super(i12, errorMode);
            this.f403432i = interfaceC41771d;
            this.f403433j = oVar;
            this.f403434k = new C11481a(this);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.c
        public final void c() {
            C11481a c11481a = this.f403434k;
            c11481a.getClass();
            DisposableHelper.a(c11481a);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.c
        public final void d() {
            InterfaceC41774g interfaceC41774g;
            boolean z12;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.util.b bVar = this.f403349b;
            ErrorMode errorMode = this.f403351d;
            q41.g<T> gVar = this.f403352e;
            while (!this.f403355h) {
                if (bVar.get() != null && (errorMode == ErrorMode.f404819b || (errorMode == ErrorMode.f404820c && !this.f403435l))) {
                    this.f403355h = true;
                    gVar.clear();
                    bVar.d(this.f403432i);
                    return;
                }
                if (!this.f403435l) {
                    boolean z13 = this.f403354g;
                    try {
                        T tPoll = gVar.poll();
                        if (tPoll != null) {
                            InterfaceC41774g interfaceC41774gApply = this.f403433j.apply(tPoll);
                            Objects.requireNonNull(interfaceC41774gApply, "The mapper returned a null CompletableSource");
                            interfaceC41774g = interfaceC41774gApply;
                            z12 = false;
                        } else {
                            interfaceC41774g = null;
                            z12 = true;
                        }
                        if (z13 && z12) {
                            this.f403355h = true;
                            bVar.d(this.f403432i);
                            return;
                        } else if (!z12) {
                            this.f403435l = true;
                            interfaceC41774g.a(this.f403434k);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        this.f403355h = true;
                        gVar.clear();
                        this.f403353f.dispose();
                        bVar.b(th2);
                        bVar.d(this.f403432i);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            gVar.clear();
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.c
        public final void f() {
            this.f403432i.b(this);
        }
    }

    public s(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        ErrorMode errorMode = ErrorMode.f404819b;
        this.f403428b = zVar;
        this.f403429c = oVar;
        this.f403430d = errorMode;
        this.f403431e = 2;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        io.reactivex.rxjava3.core.z<T> zVar = this.f403428b;
        l41.o<? super T, ? extends InterfaceC41774g> oVar = this.f403429c;
        if (y.a(zVar, oVar, interfaceC41771d)) {
            return;
        }
        zVar.c(new a(interfaceC41771d, oVar, this.f403430d, this.f403431e));
    }
}
