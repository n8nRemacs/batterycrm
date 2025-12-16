package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import m41.C43879a;

/* compiled from: ObservableSequenceEqual.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.g1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41952g1<T> extends io.reactivex.rxjava3.core.z<Boolean> {

    /* compiled from: ObservableSequenceEqual.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.g1$a */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super Boolean> f404053b;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f404056e;

        /* renamed from: f, reason: collision with root package name */
        public T f404057f;

        /* renamed from: g, reason: collision with root package name */
        public T f404058g;

        /* renamed from: d, reason: collision with root package name */
        public final b<T>[] f404055d = {new b<>(this, 0), new b<>(this, 1)};

        /* renamed from: c, reason: collision with root package name */
        public final C43879a f404054c = new C43879a(2);

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f404053b = g12;
        }

        public final void a() {
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T>[] bVarArr = this.f404055d;
            b<T> bVar = bVarArr[0];
            q41.i<T> iVar = bVar.f404060c;
            b<T> bVar2 = bVarArr[1];
            q41.i<T> iVar2 = bVar2.f404060c;
            int iAddAndGet = 1;
            while (!this.f404056e) {
                boolean z12 = bVar.f404062e;
                if (z12 && (th3 = bVar.f404063f) != null) {
                    this.f404056e = true;
                    iVar.clear();
                    iVar2.clear();
                    this.f404053b.onError(th3);
                    return;
                }
                boolean z13 = bVar2.f404062e;
                if (z13 && (th2 = bVar2.f404063f) != null) {
                    this.f404056e = true;
                    iVar.clear();
                    iVar2.clear();
                    this.f404053b.onError(th2);
                    return;
                }
                if (this.f404057f == null) {
                    this.f404057f = iVar.poll();
                }
                boolean z14 = this.f404057f == null;
                if (this.f404058g == null) {
                    this.f404058g = iVar2.poll();
                }
                boolean z15 = this.f404058g == null;
                if (z12 && z13 && z14 && z15) {
                    this.f404053b.onNext(Boolean.TRUE);
                    this.f404053b.e();
                    return;
                }
                if (z12 && z13 && z14 != z15) {
                    this.f404056e = true;
                    iVar.clear();
                    iVar2.clear();
                    this.f404053b.onNext(Boolean.FALSE);
                    this.f404053b.e();
                    return;
                }
                if (!z14 && !z15) {
                    try {
                        throw null;
                    } catch (Throwable th4) {
                        io.reactivex.rxjava3.exceptions.a.a(th4);
                        this.f404056e = true;
                        iVar.clear();
                        iVar2.clear();
                        this.f404053b.onError(th4);
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
            if (this.f404056e) {
                return;
            }
            this.f404056e = true;
            this.f404054c.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f404055d;
                bVarArr[0].f404060c.clear();
                bVarArr[1].f404060c.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404056e;
        }
    }

    /* compiled from: ObservableSequenceEqual.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.g1$b */
    public static final class b<T> implements io.reactivex.rxjava3.core.G<T> {

        /* renamed from: b, reason: collision with root package name */
        public final a<T> f404059b;

        /* renamed from: c, reason: collision with root package name */
        public final q41.i<T> f404060c = new q41.i<>(0);

        /* renamed from: d, reason: collision with root package name */
        public final int f404061d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f404062e;

        /* renamed from: f, reason: collision with root package name */
        public Throwable f404063f;

        public b(a aVar, int i12) {
            this.f404059b = aVar;
            this.f404061d = i12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f404059b.f404054c.a(this.f404061d, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404062e = true;
            this.f404059b.a();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404063f = th2;
            this.f404062e = true;
            this.f404059b.a();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f404060c.offer(t12);
            this.f404059b.a();
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super Boolean> g12) {
        a aVar = new a(g12);
        g12.b(aVar);
        b<T> bVar = aVar.f404055d[0];
        throw null;
    }
}
