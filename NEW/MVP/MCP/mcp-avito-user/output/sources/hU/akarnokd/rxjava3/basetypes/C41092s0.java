package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: PerhapsDelay.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41092s0<T> extends AbstractC41069k0<T> {

    /* compiled from: PerhapsDelay.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.s0$a */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -7563209762781178448L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T>.C11311a f397763d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f397764e;

        /* renamed from: f, reason: collision with root package name */
        public Throwable f397765f;

        /* compiled from: PerhapsDelay.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.s0$a$a, reason: collision with other inner class name */
        public final class C11311a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Object> {
            private static final long serialVersionUID = -2194292167160252795L;

            /* renamed from: b, reason: collision with root package name */
            public boolean f397766b;

            public C11311a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                if (this.f397766b) {
                    return;
                }
                this.f397766b = true;
                a aVar = a.this;
                Throwable th2 = aVar.f397765f;
                org.reactivestreams.d<? super T> dVar = aVar.f419376b;
                if (th2 != null) {
                    dVar.onError(th2);
                    return;
                }
                T t12 = aVar.f419377c;
                if (t12 != null) {
                    aVar.l(t12);
                } else {
                    dVar.e();
                }
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                if (this.f397766b) {
                    C47998a.b(th2);
                    return;
                }
                this.f397766b = true;
                a aVar = a.this;
                Throwable th3 = aVar.f397765f;
                org.reactivestreams.d<? super T> dVar = aVar.f419376b;
                if (th3 != null) {
                    dVar.onError(new CompositeException(th3, th2));
                } else {
                    dVar.onError(th2);
                }
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                get().cancel();
                this.f397766b = true;
                a aVar = a.this;
                Throwable th2 = aVar.f397765f;
                org.reactivestreams.d<? super T> dVar = aVar.f419376b;
                if (th2 != null) {
                    dVar.onError(th2);
                    return;
                }
                T t12 = aVar.f419377c;
                if (t12 != null) {
                    aVar.l(t12);
                } else {
                    dVar.e();
                }
            }
        }

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397763d = new C11311a();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397764e, eVar)) {
                this.f397764e = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f397764e.cancel();
            SubscriptionHelper.a(this.f397763d);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397765f = th2;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f419377c = t12;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }
}
