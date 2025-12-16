package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.CompositeException;
import l41.InterfaceC43543a;
import q41.InterfaceC47198a;
import s41.C47998a;

/* compiled from: FlowableDoOnEach.java */
/* loaded from: classes8.dex */
public final class S<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.g<? super T> f402530d;

    /* renamed from: e, reason: collision with root package name */
    public final l41.g<? super Throwable> f402531e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC43543a f402532f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC43543a f402533g;

    /* compiled from: FlowableDoOnEach.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.a<T, T> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.g<? super T> f402534g;

        /* renamed from: h, reason: collision with root package name */
        public final l41.g<? super Throwable> f402535h;

        /* renamed from: i, reason: collision with root package name */
        public final InterfaceC43543a f402536i;

        /* renamed from: j, reason: collision with root package name */
        public final InterfaceC43543a f402537j;

        public a(InterfaceC47198a<? super T> interfaceC47198a, l41.g<? super T> gVar, l41.g<? super Throwable> gVar2, InterfaceC43543a interfaceC43543a, InterfaceC43543a interfaceC43543a2) {
            super(interfaceC47198a);
            this.f402534g = gVar;
            this.f402535h = gVar2;
            this.f402536i = interfaceC43543a;
            this.f402537j = interfaceC43543a2;
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404772e) {
                return false;
            }
            try {
                this.f402534g.accept(t12);
                return this.f404769b.P(t12);
            } catch (Throwable th2) {
                a(th2);
                return false;
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.d
        public final void e() {
            if (this.f404772e) {
                return;
            }
            try {
                this.f402536i.getClass();
                this.f404772e = true;
                this.f404769b.e();
                try {
                    this.f402537j.getClass();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            } catch (Throwable th3) {
                a(th3);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.d
        public final void onError(Throwable th2) {
            InterfaceC41782o interfaceC41782o = this.f404769b;
            if (this.f404772e) {
                C47998a.b(th2);
                return;
            }
            this.f404772e = true;
            try {
                this.f402535h.accept(th2);
                interfaceC41782o.onError(th2);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                interfaceC41782o.onError(new CompositeException(th2, th3));
            }
            try {
                this.f402537j.getClass();
            } catch (Throwable th4) {
                io.reactivex.rxjava3.exceptions.a.a(th4);
                C47998a.b(th4);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404772e) {
                return;
            }
            int i12 = this.f404773f;
            InterfaceC41782o interfaceC41782o = this.f404769b;
            if (i12 != 0) {
                interfaceC41782o.onNext(null);
                return;
            }
            try {
                this.f402534g.accept(t12);
                interfaceC41782o.onNext(t12);
            } catch (Throwable th2) {
                a(th2);
            }
        }

        @Override // q41.g
        @j41.f
        public final T poll() throws Exception {
            CompositeException compositeException;
            l41.g<? super Throwable> gVar = this.f402535h;
            try {
                T tPoll = this.f404771d.poll();
                InterfaceC43543a interfaceC43543a = this.f402537j;
                if (tPoll != null) {
                    try {
                        this.f402534g.accept(tPoll);
                        interfaceC43543a.getClass();
                    } catch (Throwable th2) {
                        try {
                            io.reactivex.rxjava3.exceptions.a.a(th2);
                            try {
                                gVar.accept(th2);
                                Throwable th3 = io.reactivex.rxjava3.internal.util.h.f404834a;
                                if (th2 instanceof Exception) {
                                    throw th2;
                                }
                                throw th2;
                            } finally {
                            }
                        } catch (Throwable th4) {
                            interfaceC43543a.getClass();
                            throw th4;
                        }
                    }
                } else if (this.f404773f == 1) {
                    this.f402536i.getClass();
                    interfaceC43543a.getClass();
                }
                return tPoll;
            } catch (Throwable th22) {
                io.reactivex.rxjava3.exceptions.a.a(th22);
                try {
                    gVar.accept(th22);
                    Throwable th5 = io.reactivex.rxjava3.internal.util.h.f404834a;
                    if (th22 instanceof Exception) {
                        throw th22;
                    }
                    throw th22;
                } finally {
                }
            }
        }
    }

    /* compiled from: FlowableDoOnEach.java */
    public static final class b<T> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.g<? super T> f402538g;

        /* renamed from: h, reason: collision with root package name */
        public final l41.g<? super Throwable> f402539h;

        /* renamed from: i, reason: collision with root package name */
        public final InterfaceC43543a f402540i;

        /* renamed from: j, reason: collision with root package name */
        public final InterfaceC43543a f402541j;

        public b(InterfaceC41782o interfaceC41782o, l41.g gVar, l41.g gVar2, InterfaceC43543a interfaceC43543a, InterfaceC43543a interfaceC43543a2) {
            super(interfaceC41782o);
            this.f402538g = gVar;
            this.f402539h = gVar2;
            this.f402540i = interfaceC43543a;
            this.f402541j = interfaceC43543a2;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.d
        public final void e() {
            if (this.f404777e) {
                return;
            }
            try {
                this.f402540i.getClass();
                this.f404777e = true;
                this.f404774b.e();
                try {
                    this.f402541j.getClass();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            } catch (Throwable th3) {
                a(th3);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.d
        public final void onError(Throwable th2) {
            org.reactivestreams.d<? super R> dVar = this.f404774b;
            if (this.f404777e) {
                C47998a.b(th2);
                return;
            }
            this.f404777e = true;
            try {
                this.f402539h.accept(th2);
                dVar.onError(th2);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                dVar.onError(new CompositeException(th2, th3));
            }
            try {
                this.f402541j.getClass();
            } catch (Throwable th4) {
                io.reactivex.rxjava3.exceptions.a.a(th4);
                C47998a.b(th4);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404777e) {
                return;
            }
            int i12 = this.f404778f;
            org.reactivestreams.d<? super R> dVar = this.f404774b;
            if (i12 != 0) {
                dVar.onNext(null);
                return;
            }
            try {
                this.f402538g.accept(t12);
                dVar.onNext(t12);
            } catch (Throwable th2) {
                a(th2);
            }
        }

        @Override // q41.g
        @j41.f
        public final T poll() throws Exception {
            CompositeException compositeException;
            l41.g<? super Throwable> gVar = this.f402539h;
            try {
                T tPoll = this.f404776d.poll();
                InterfaceC43543a interfaceC43543a = this.f402541j;
                if (tPoll != null) {
                    try {
                        this.f402538g.accept(tPoll);
                        interfaceC43543a.getClass();
                    } catch (Throwable th2) {
                        try {
                            io.reactivex.rxjava3.exceptions.a.a(th2);
                            try {
                                gVar.accept(th2);
                                Throwable th3 = io.reactivex.rxjava3.internal.util.h.f404834a;
                                if (th2 instanceof Exception) {
                                    throw th2;
                                }
                                throw th2;
                            } finally {
                            }
                        } catch (Throwable th4) {
                            interfaceC43543a.getClass();
                            throw th4;
                        }
                    }
                } else if (this.f404778f == 1) {
                    this.f402540i.getClass();
                    interfaceC43543a.getClass();
                }
                return tPoll;
            } catch (Throwable th22) {
                io.reactivex.rxjava3.exceptions.a.a(th22);
                try {
                    gVar.accept(th22);
                    Throwable th5 = io.reactivex.rxjava3.internal.util.h.f404834a;
                    if (th22 instanceof Exception) {
                        throw th22;
                    }
                    throw th22;
                } finally {
                }
            }
        }
    }

    public S(AbstractC41777j<T> abstractC41777j, l41.g<? super T> gVar, l41.g<? super Throwable> gVar2, InterfaceC43543a interfaceC43543a, InterfaceC43543a interfaceC43543a2) {
        super(abstractC41777j);
        this.f402530d = gVar;
        this.f402531e = gVar2;
        this.f402532f = interfaceC43543a;
        this.f402533g = interfaceC43543a2;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        boolean z12 = dVar instanceof InterfaceC47198a;
        InterfaceC43543a interfaceC43543a = this.f402533g;
        InterfaceC43543a interfaceC43543a2 = this.f402532f;
        AbstractC41777j<T> abstractC41777j = this.f402624c;
        if (z12) {
            abstractC41777j.q(new a((InterfaceC47198a) dVar, this.f402530d, this.f402531e, interfaceC43543a2, interfaceC43543a));
        } else {
            abstractC41777j.q(new b((InterfaceC41782o) dVar, this.f402530d, this.f402531e, interfaceC43543a2, interfaceC43543a));
        }
    }
}
