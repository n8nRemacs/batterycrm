package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableZip.java */
/* loaded from: classes8.dex */
public final class R1<T, R> extends io.reactivex.rxjava3.core.z<R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.E<? extends T>[] f403824b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f403825c;

    /* renamed from: d, reason: collision with root package name */
    public final l41.o<? super Object[], ? extends R> f403826d;

    /* renamed from: e, reason: collision with root package name */
    public final int f403827e;

    /* compiled from: ObservableZip.java */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 2983708048395377667L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f403828b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super Object[], ? extends R> f403829c;

        /* renamed from: d, reason: collision with root package name */
        public final b<T, R>[] f403830d;

        /* renamed from: e, reason: collision with root package name */
        public final T[] f403831e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f403832f;

        public a(io.reactivex.rxjava3.core.G g12, l41.o oVar, int i12) {
            this.f403828b = g12;
            this.f403829c = oVar;
            this.f403830d = new b[i12];
            this.f403831e = (T[]) new Object[i12];
        }

        public final void a() {
            b<T, R>[] bVarArr = this.f403830d;
            for (b<T, R> bVar : bVarArr) {
                bVar.f403834c.clear();
            }
            for (b<T, R> bVar2 : bVarArr) {
                DisposableHelper.a(bVar2.f403837f);
            }
        }

        public final void b() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T, R>[] bVarArr = this.f403830d;
            io.reactivex.rxjava3.core.G<? super R> g12 = this.f403828b;
            T[] tArr = this.f403831e;
            int iAddAndGet = 1;
            while (true) {
                int i12 = 0;
                int i13 = 0;
                for (b<T, R> bVar : bVarArr) {
                    if (tArr[i13] == null) {
                        boolean z12 = bVar.f403835d;
                        T tPoll = bVar.f403834c.poll();
                        boolean z13 = tPoll == null;
                        if (this.f403832f) {
                            a();
                            return;
                        }
                        if (z12) {
                            Throwable th3 = bVar.f403836e;
                            if (th3 != null) {
                                this.f403832f = true;
                                a();
                                g12.onError(th3);
                                return;
                            } else if (z13) {
                                this.f403832f = true;
                                a();
                                g12.e();
                                return;
                            }
                        }
                        if (z13) {
                            i12++;
                        } else {
                            tArr[i13] = tPoll;
                        }
                    } else if (bVar.f403835d && (th2 = bVar.f403836e) != null) {
                        this.f403832f = true;
                        a();
                        g12.onError(th2);
                        return;
                    }
                    i13++;
                }
                if (i12 != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        R rApply = this.f403829c.apply(tArr.clone());
                        Objects.requireNonNull(rApply, "The zipper returned a null value");
                        g12.onNext(rApply);
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th4) {
                        io.reactivex.rxjava3.exceptions.a.a(th4);
                        a();
                        g12.onError(th4);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f403832f) {
                return;
            }
            this.f403832f = true;
            for (b<T, R> bVar : this.f403830d) {
                DisposableHelper.a(bVar.f403837f);
            }
            if (getAndIncrement() == 0) {
                for (b<T, R> bVar2 : this.f403830d) {
                    bVar2.f403834c.clear();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403832f;
        }
    }

    /* compiled from: ObservableZip.java */
    public static final class b<T, R> implements io.reactivex.rxjava3.core.G<T> {

        /* renamed from: b, reason: collision with root package name */
        public final a<T, R> f403833b;

        /* renamed from: c, reason: collision with root package name */
        public final q41.i<T> f403834c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f403835d;

        /* renamed from: e, reason: collision with root package name */
        public Throwable f403836e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403837f = new AtomicReference<>();

        public b(a<T, R> aVar, int i12) {
            this.f403833b = aVar;
            this.f403834c = new q41.i<>(i12);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f403837f, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403835d = true;
            this.f403833b.b();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403836e = th2;
            this.f403835d = true;
            this.f403833b.b();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403834c.offer(t12);
            this.f403833b.b();
        }
    }

    public R1(io.reactivex.rxjava3.core.E[] eArr, ArrayList arrayList, l41.o oVar, int i12) {
        this.f403824b = eArr;
        this.f403825c = arrayList;
        this.f403826d = oVar;
        this.f403827e = i12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        int length;
        io.reactivex.rxjava3.core.E<? extends T>[] eArr = this.f403824b;
        if (eArr == null) {
            eArr = new io.reactivex.rxjava3.core.E[8];
            Iterator it = this.f403825c.iterator();
            length = 0;
            while (it.hasNext()) {
                io.reactivex.rxjava3.core.E<? extends T> e12 = (io.reactivex.rxjava3.core.E) it.next();
                if (length == eArr.length) {
                    io.reactivex.rxjava3.core.E<? extends T>[] eArr2 = new io.reactivex.rxjava3.core.E[(length >> 2) + length];
                    System.arraycopy(eArr, 0, eArr2, 0, length);
                    eArr = eArr2;
                }
                eArr[length] = e12;
                length++;
            }
        } else {
            length = eArr.length;
        }
        if (length == 0) {
            EmptyDisposable.a(g12);
            return;
        }
        a aVar = new a(g12, this.f403826d, length);
        int i12 = this.f403827e;
        b<T, R>[] bVarArr = aVar.f403830d;
        int length2 = bVarArr.length;
        for (int i13 = 0; i13 < length2; i13++) {
            bVarArr[i13] = new b<>(aVar, i12);
        }
        aVar.lazySet(0);
        aVar.f403828b.b(aVar);
        for (int i14 = 0; i14 < length2 && !aVar.f403832f; i14++) {
            eArr[i14].c(bVarArr[i14]);
        }
    }
}
