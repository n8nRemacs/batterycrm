package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import q41.InterfaceC47199b;

/* compiled from: ObservableConcatMapEager.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41993v<T, R> extends AbstractC41932a<T, R> {

    /* compiled from: ObservableConcatMapEager.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.v$a */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.internal.observers.x<R> {
        private static final long serialVersionUID = 8080567949447303262L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f404353b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f404354c = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: d, reason: collision with root package name */
        public final ArrayDeque<io.reactivex.rxjava3.internal.observers.w<R>> f404355d = new ArrayDeque<>();

        /* renamed from: e, reason: collision with root package name */
        public q41.g<T> f404356e;

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404357f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f404358g;

        /* renamed from: h, reason: collision with root package name */
        public int f404359h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f404360i;

        /* renamed from: j, reason: collision with root package name */
        public io.reactivex.rxjava3.internal.observers.w<R> f404361j;

        /* renamed from: k, reason: collision with root package name */
        public int f404362k;

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f404353b = g12;
        }

        @Override // io.reactivex.rxjava3.internal.observers.x
        public final void a(io.reactivex.rxjava3.internal.observers.w<R> wVar, R r12) {
            wVar.f402131b.offer(r12);
            c();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404357f, dVar)) {
                this.f404357f = dVar;
                if (dVar instanceof InterfaceC47199b) {
                    InterfaceC47199b interfaceC47199b = (InterfaceC47199b) dVar;
                    int iV2 = interfaceC47199b.v(3);
                    if (iV2 == 1) {
                        this.f404359h = iV2;
                        this.f404356e = interfaceC47199b;
                        this.f404358g = true;
                        this.f404353b.b(this);
                        c();
                        return;
                    }
                    if (iV2 == 2) {
                        this.f404359h = iV2;
                        this.f404356e = interfaceC47199b;
                        this.f404353b.b(this);
                        return;
                    }
                }
                this.f404356e = new q41.i(0);
                this.f404353b.b(this);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
        
            throw null;
         */
        @Override // io.reactivex.rxjava3.internal.observers.x
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c() {
            /*
                Method dump skipped, instructions count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.C41993v.a.c():void");
        }

        @Override // io.reactivex.rxjava3.internal.observers.x
        public final void d(io.reactivex.rxjava3.internal.observers.w<R> wVar) {
            wVar.f402132c = true;
            c();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404360i) {
                return;
            }
            this.f404360i = true;
            this.f404357f.dispose();
            this.f404354c.c();
            if (getAndIncrement() == 0) {
                do {
                    this.f404356e.clear();
                    g();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404358g = true;
            c();
        }

        @Override // io.reactivex.rxjava3.internal.observers.x
        public final void f(io.reactivex.rxjava3.internal.observers.w<R> wVar, Throwable th2) {
            if (this.f404354c.b(th2)) {
                wVar.f402132c = true;
                c();
            }
        }

        public final void g() {
            io.reactivex.rxjava3.internal.observers.w<R> wVar = this.f404361j;
            if (wVar != null) {
                DisposableHelper.a(wVar);
            }
            while (true) {
                io.reactivex.rxjava3.internal.observers.w<R> wVarPoll = this.f404355d.poll();
                if (wVarPoll == null) {
                    return;
                } else {
                    DisposableHelper.a(wVarPoll);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404360i;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404354c.b(th2)) {
                this.f404358g = true;
                c();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404359h == 0) {
                this.f404356e.offer(t12);
            }
            c();
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        this.f403951b.c(new a(g12));
    }
}
