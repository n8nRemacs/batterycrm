package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import m41.C43879a;
import n41.InterfaceC44188e;

/* compiled from: ObservableSequenceEqualSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.h1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41955h1<T> extends io.reactivex.rxjava3.core.I<Boolean> implements InterfaceC44188e<Boolean> {

    /* compiled from: ObservableSequenceEqualSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.h1$a */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super Boolean> f404073b;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f404076e;

        /* renamed from: f, reason: collision with root package name */
        public T f404077f;

        /* renamed from: g, reason: collision with root package name */
        public T f404078g;

        /* renamed from: d, reason: collision with root package name */
        public final b<T>[] f404075d = {new b<>(this, 0), new b<>(this, 1)};

        /* renamed from: c, reason: collision with root package name */
        public final C43879a f404074c = new C43879a(2);

        public a(io.reactivex.rxjava3.core.L l12) {
            this.f404073b = l12;
        }

        public final void a() {
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T>[] bVarArr = this.f404075d;
            b<T> bVar = bVarArr[0];
            q41.i<T> iVar = bVar.f404080c;
            b<T> bVar2 = bVarArr[1];
            q41.i<T> iVar2 = bVar2.f404080c;
            int iAddAndGet = 1;
            while (!this.f404076e) {
                boolean z12 = bVar.f404082e;
                if (z12 && (th3 = bVar.f404083f) != null) {
                    this.f404076e = true;
                    iVar.clear();
                    iVar2.clear();
                    this.f404073b.onError(th3);
                    return;
                }
                boolean z13 = bVar2.f404082e;
                if (z13 && (th2 = bVar2.f404083f) != null) {
                    this.f404076e = true;
                    iVar.clear();
                    iVar2.clear();
                    this.f404073b.onError(th2);
                    return;
                }
                if (this.f404077f == null) {
                    this.f404077f = iVar.poll();
                }
                boolean z14 = this.f404077f == null;
                if (this.f404078g == null) {
                    this.f404078g = iVar2.poll();
                }
                boolean z15 = this.f404078g == null;
                if (z12 && z13 && z14 && z15) {
                    this.f404073b.onSuccess(Boolean.TRUE);
                    return;
                }
                if (z12 && z13 && z14 != z15) {
                    this.f404076e = true;
                    iVar.clear();
                    iVar2.clear();
                    this.f404073b.onSuccess(Boolean.FALSE);
                    return;
                }
                if (!z14 && !z15) {
                    try {
                        throw null;
                    } catch (Throwable th4) {
                        io.reactivex.rxjava3.exceptions.a.a(th4);
                        this.f404076e = true;
                        iVar.clear();
                        iVar2.clear();
                        this.f404073b.onError(th4);
                        return;
                    }
                }
                if (z14 || z15) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            iVar.clear();
            iVar2.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404076e) {
                return;
            }
            this.f404076e = true;
            this.f404074c.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f404075d;
                bVarArr[0].f404080c.clear();
                bVarArr[1].f404080c.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404076e;
        }
    }

    /* compiled from: ObservableSequenceEqualSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.h1$b */
    public static final class b<T> implements io.reactivex.rxjava3.core.G<T> {

        /* renamed from: b, reason: collision with root package name */
        public final a<T> f404079b;

        /* renamed from: c, reason: collision with root package name */
        public final q41.i<T> f404080c = new q41.i<>(0);

        /* renamed from: d, reason: collision with root package name */
        public final int f404081d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f404082e;

        /* renamed from: f, reason: collision with root package name */
        public Throwable f404083f;

        public b(a aVar, int i12) {
            this.f404079b = aVar;
            this.f404081d = i12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f404079b.f404074c.a(this.f404081d, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404082e = true;
            this.f404079b.a();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404083f = th2;
            this.f404082e = true;
            this.f404079b.a();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f404080c.offer(t12);
            this.f404079b.a();
        }
    }

    @Override // n41.InterfaceC44188e
    public final io.reactivex.rxjava3.core.z<Boolean> d() {
        return new C41952g1();
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super Boolean> l12) {
        a aVar = new a(l12);
        l12.b(aVar);
        b<T> bVar = aVar.f404075d[0];
        throw null;
    }
}
