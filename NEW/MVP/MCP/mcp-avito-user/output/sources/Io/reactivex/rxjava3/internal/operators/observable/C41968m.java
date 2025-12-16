package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableBuffer.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41968m<T, U extends Collection<? super T>> extends AbstractC41932a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    public final int f404126c;

    /* renamed from: d, reason: collision with root package name */
    public final int f404127d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayListSupplier f404128e;

    /* compiled from: ObservableBuffer.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.m$a */
    public static final class a<T, U extends Collection<? super T>> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super U> f404129b;

        /* renamed from: c, reason: collision with root package name */
        public final int f404130c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayListSupplier f404131d;

        /* renamed from: e, reason: collision with root package name */
        public U f404132e;

        /* renamed from: f, reason: collision with root package name */
        public int f404133f;

        /* renamed from: g, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404134g;

        public a(io.reactivex.rxjava3.core.G g12, int i12, ArrayListSupplier arrayListSupplier) {
            this.f404129b = g12;
            this.f404130c = i12;
            this.f404131d = arrayListSupplier;
        }

        public final boolean a() {
            try {
                this.f404131d.getClass();
                this.f404132e = new ArrayList();
                return true;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404132e = null;
                io.reactivex.rxjava3.disposables.d dVar = this.f404134g;
                io.reactivex.rxjava3.core.G<? super U> g12 = this.f404129b;
                if (dVar == null) {
                    EmptyDisposable.d(th2, g12);
                    return false;
                }
                dVar.dispose();
                g12.onError(th2);
                return false;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404134g, dVar)) {
                this.f404134g = dVar;
                this.f404129b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404134g.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            U u12 = this.f404132e;
            if (u12 != null) {
                this.f404132e = null;
                boolean zIsEmpty = u12.isEmpty();
                io.reactivex.rxjava3.core.G<? super U> g12 = this.f404129b;
                if (!zIsEmpty) {
                    g12.onNext(u12);
                }
                g12.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404134g.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404132e = null;
            this.f404129b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            U u12 = this.f404132e;
            if (u12 != null) {
                u12.add(t12);
                int i12 = this.f404133f + 1;
                this.f404133f = i12;
                if (i12 >= this.f404130c) {
                    this.f404129b.onNext(u12);
                    this.f404133f = 0;
                    a();
                }
            }
        }
    }

    /* compiled from: ObservableBuffer.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.m$b */
    public static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -8223395059921494546L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super U> f404135b;

        /* renamed from: c, reason: collision with root package name */
        public final int f404136c;

        /* renamed from: d, reason: collision with root package name */
        public final int f404137d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayListSupplier f404138e;

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404139f;

        /* renamed from: g, reason: collision with root package name */
        public final ArrayDeque<U> f404140g = new ArrayDeque<>();

        /* renamed from: h, reason: collision with root package name */
        public long f404141h;

        public b(io.reactivex.rxjava3.core.G g12, int i12, int i13, ArrayListSupplier arrayListSupplier) {
            this.f404135b = g12;
            this.f404136c = i12;
            this.f404137d = i13;
            this.f404138e = arrayListSupplier;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404139f, dVar)) {
                this.f404139f = dVar;
                this.f404135b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404139f.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            while (true) {
                ArrayDeque<U> arrayDeque = this.f404140g;
                boolean zIsEmpty = arrayDeque.isEmpty();
                io.reactivex.rxjava3.core.G<? super U> g12 = this.f404135b;
                if (zIsEmpty) {
                    g12.e();
                    return;
                }
                g12.onNext(arrayDeque.poll());
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404139f.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404140g.clear();
            this.f404135b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            long j12 = this.f404141h;
            this.f404141h = 1 + j12;
            long j13 = j12 % this.f404137d;
            ArrayDeque<U> arrayDeque = this.f404140g;
            io.reactivex.rxjava3.core.G<? super U> g12 = this.f404135b;
            if (j13 == 0) {
                try {
                    this.f404138e.getClass();
                    ArrayList arrayList = new ArrayList();
                    Throwable th2 = io.reactivex.rxjava3.internal.util.h.f404834a;
                    arrayDeque.offer(arrayList);
                } catch (Throwable th3) {
                    io.reactivex.rxjava3.exceptions.a.a(th3);
                    arrayDeque.clear();
                    this.f404139f.dispose();
                    g12.onError(th3);
                    return;
                }
            }
            Iterator<U> it = arrayDeque.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t12);
                if (this.f404136c <= next.size()) {
                    it.remove();
                    g12.onNext(next);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41968m(io.reactivex.rxjava3.core.z zVar, int i12, int i13) {
        super(zVar);
        ArrayListSupplier arrayListSupplier = ArrayListSupplier.f404815b;
        this.f404126c = i12;
        this.f404127d = i13;
        this.f404128e = arrayListSupplier;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super U> g12) {
        io.reactivex.rxjava3.core.E<T> e12 = this.f403951b;
        ArrayListSupplier arrayListSupplier = this.f404128e;
        int i12 = this.f404127d;
        int i13 = this.f404126c;
        if (i12 != i13) {
            e12.c(new b(g12, i13, i12, arrayListSupplier));
            return;
        }
        a aVar = new a(g12, i13, arrayListSupplier);
        if (aVar.a()) {
            e12.c(aVar);
        }
    }
}
