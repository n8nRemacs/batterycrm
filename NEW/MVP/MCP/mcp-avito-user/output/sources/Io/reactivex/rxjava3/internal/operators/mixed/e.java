package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableConcatMapCompletable.java */
/* loaded from: classes8.dex */
public final class e<T> extends AbstractC41768a {

    /* compiled from: FlowableConcatMapCompletable.java */
    public static final class a<T> extends d<T> implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 3610901111000061034L;

        /* renamed from: j, reason: collision with root package name */
        public final InterfaceC41771d f403364j;

        /* renamed from: k, reason: collision with root package name */
        public final C11475a f403365k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f403366l;

        /* renamed from: m, reason: collision with root package name */
        public int f403367m;

        /* compiled from: FlowableConcatMapCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.e$a$a, reason: collision with other inner class name */
        public static final class C11475a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d {
            private static final long serialVersionUID = 5638352172918776687L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?> f403368b;

            public C11475a(a<?> aVar) {
                this.f403368b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void e() {
                a<?> aVar = this.f403368b;
                aVar.f403366l = false;
                aVar.c();
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                a<?> aVar = this.f403368b;
                if (aVar.f403356b.b(th2)) {
                    if (aVar.f403358d != ErrorMode.f404819b) {
                        aVar.f403366l = false;
                        aVar.c();
                        return;
                    }
                    aVar.f403360f.cancel();
                    aVar.f403356b.d(aVar.f403364j);
                    if (aVar.getAndIncrement() == 0) {
                        aVar.f403359e.clear();
                    }
                }
            }
        }

        public a(InterfaceC41771d interfaceC41771d) {
            super(0, null);
            this.f403364j = interfaceC41771d;
            this.f403365k = new C11475a(this);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.d
        public final void b() {
            C11475a c11475a = this.f403365k;
            c11475a.getClass();
            DisposableHelper.a(c11475a);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.d
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            ErrorMode errorMode = this.f403358d;
            q41.g<T> gVar = this.f403359e;
            io.reactivex.rxjava3.internal.util.b bVar = this.f403356b;
            boolean z12 = this.f403363i;
            while (!this.f403362h) {
                if (bVar.get() != null && (errorMode == ErrorMode.f404819b || (errorMode == ErrorMode.f404820c && !this.f403366l))) {
                    gVar.clear();
                    bVar.d(this.f403364j);
                    return;
                }
                if (!this.f403366l) {
                    boolean z13 = this.f403361g;
                    try {
                        boolean z14 = gVar.poll() == null;
                        if (z13 && z14) {
                            bVar.d(this.f403364j);
                            return;
                        }
                        if (!z14) {
                            int i12 = this.f403357c;
                            int i13 = i12 - (i12 >> 1);
                            if (!z12) {
                                int i14 = this.f403367m + 1;
                                if (i14 == i13) {
                                    this.f403367m = 0;
                                    this.f403360f.request(i13);
                                } else {
                                    this.f403367m = i14;
                                }
                            }
                            try {
                                throw null;
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.a.a(th2);
                                gVar.clear();
                                this.f403360f.cancel();
                                bVar.b(th2);
                                bVar.d(this.f403364j);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.a.a(th3);
                        this.f403360f.cancel();
                        bVar.b(th3);
                        bVar.d(this.f403364j);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            gVar.clear();
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.d
        public final void d() {
            this.f403364j.b(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403362h;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        new a(interfaceC41771d);
        throw null;
    }
}
