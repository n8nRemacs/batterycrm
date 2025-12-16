package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableValve.java */
/* loaded from: classes8.dex */
final class m0<T> extends io.reactivex.rxjava3.core.z<T> implements io.reactivex.rxjava3.core.F<T, T> {

    /* compiled from: ObservableValve.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -2233734924340471378L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f398082b;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f398087g;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f398089i;

        /* renamed from: d, reason: collision with root package name */
        public final SimplePlainQueue<T> f398084d = new SpscLinkedArrayQueue(0);

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f398088h = false;

        /* renamed from: e, reason: collision with root package name */
        public final a<T>.C11341a f398085e = new C11341a();

        /* renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f398086f = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f398083c = new AtomicReference<>();

        /* compiled from: ObservableValve.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.m0$a$a, reason: collision with other inner class name */
        public final class C11341a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<Boolean> {
            private static final long serialVersionUID = -3076915855750118155L;

            public C11341a() {
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                a aVar = a.this;
                aVar.getClass();
                aVar.onError(new IllegalStateException("The valve source completed unexpectedly."));
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                a.this.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(Boolean bool) {
                a aVar = a.this;
                boolean zBooleanValue = bool.booleanValue();
                aVar.f398088h = zBooleanValue;
                if (zBooleanValue) {
                    aVar.a();
                }
            }
        }

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f398082b = g12;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            SimplePlainQueue<T> simplePlainQueue = this.f398084d;
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f398082b;
            io.reactivex.rxjava3.internal.util.b bVar = this.f398086f;
            int iAddAndGet = 1;
            while (!this.f398089i) {
                if (bVar.get() != null) {
                    simplePlainQueue.clear();
                    DisposableHelper.a(this.f398083c);
                    DisposableHelper.a(this.f398085e);
                    bVar.e(g12);
                    return;
                }
                if (this.f398088h) {
                    boolean z12 = this.f398087g;
                    A00.a aVar = (Object) simplePlainQueue.poll();
                    boolean z13 = aVar == null;
                    if (z12 && z13) {
                        DisposableHelper.a(this.f398085e);
                        g12.e();
                        return;
                    } else if (!z13) {
                        g12.onNext(aVar);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            simplePlainQueue.clear();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f398083c, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398089i = true;
            DisposableHelper.a(this.f398083c);
            DisposableHelper.a(this.f398085e);
            this.f398086f.c();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f398087g = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398089i;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f398086f.b(th2)) {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f398084d.offer(t12);
            a();
        }
    }

    @Override // io.reactivex.rxjava3.core.F
    public final io.reactivex.rxjava3.core.E a(io.reactivex.rxjava3.core.z zVar) {
        return new m0();
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        g12.b(new a(g12));
        throw null;
    }
}
