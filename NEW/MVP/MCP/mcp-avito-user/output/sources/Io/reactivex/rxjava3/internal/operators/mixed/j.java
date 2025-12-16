package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableSwitchMapCompletable.java */
/* loaded from: classes8.dex */
public final class j<T> extends AbstractC41768a {

    /* compiled from: FlowableSwitchMapCompletable.java */
    public static final class a<T> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: g, reason: collision with root package name */
        public static final C11478a f403390g = new C11478a(null);

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f403391b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403392c = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<C11478a> f403393d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f403394e;

        /* renamed from: f, reason: collision with root package name */
        public org.reactivestreams.e f403395f;

        /* compiled from: FlowableSwitchMapCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.j$a$a, reason: collision with other inner class name */
        public static final class C11478a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d {
            private static final long serialVersionUID = -8003404460084760287L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?> f403396b;

            public C11478a(a<?> aVar) {
                this.f403396b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void e() {
                a<?> aVar = this.f403396b;
                AtomicReference<C11478a> atomicReference = aVar.f403393d;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                if (aVar.f403394e) {
                    aVar.f403392c.d(aVar.f403391b);
                }
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                a<?> aVar = this.f403396b;
                AtomicReference<C11478a> atomicReference = aVar.f403393d;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        C47998a.b(th2);
                        return;
                    }
                }
                io.reactivex.rxjava3.internal.util.b bVar = aVar.f403392c;
                if (bVar.b(th2)) {
                    aVar.f403395f.cancel();
                    aVar.a();
                    bVar.d(aVar.f403391b);
                }
            }
        }

        public a(InterfaceC41771d interfaceC41771d) {
            this.f403391b = interfaceC41771d;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f403395f, eVar)) {
                this.f403395f = eVar;
                this.f403391b.b(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        public final void a() {
            AtomicReference<C11478a> atomicReference = this.f403393d;
            C11478a c11478a = f403390g;
            C11478a andSet = atomicReference.getAndSet(c11478a);
            if (andSet == null || andSet == c11478a) {
                return;
            }
            DisposableHelper.a(andSet);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403395f.cancel();
            a();
            this.f403392c.c();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f403394e = true;
            if (this.f403393d.get() == null) {
                this.f403392c.d(this.f403391b);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403393d.get() == f403390g;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.internal.util.b bVar = this.f403392c;
            if (bVar.b(th2)) {
                a();
                bVar.d(this.f403391b);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403395f.cancel();
                onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        new a(interfaceC41771d);
        throw null;
    }
}
