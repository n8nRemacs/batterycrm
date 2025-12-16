package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import s41.C47998a;

/* compiled from: CompletableMergeArray.java */
/* loaded from: classes8.dex */
public final class C extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC41774g[] f402148b;

    /* compiled from: CompletableMergeArray.java */
    public static final class a extends AtomicInteger implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -8360547806504310570L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402149b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f402150c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f402151d;

        public a(InterfaceC41771d interfaceC41771d, AtomicBoolean atomicBoolean, io.reactivex.rxjava3.disposables.c cVar, int i12) {
            this.f402149b = interfaceC41771d;
            this.f402150c = atomicBoolean;
            this.f402151d = cVar;
            lazySet(i12);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f402151d.b(dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402151d.dispose();
            this.f402150c.set(true);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            if (decrementAndGet() == 0) {
                this.f402149b.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402151d.f401978c;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f402151d.dispose();
            if (this.f402150c.compareAndSet(false, true)) {
                this.f402149b.onError(th2);
            } else {
                C47998a.b(th2);
            }
        }
    }

    public C(InterfaceC41774g[] interfaceC41774gArr) {
        this.f402148b = interfaceC41774gArr;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        a aVar = new a(interfaceC41771d, new AtomicBoolean(), cVar, this.f402148b.length + 1);
        interfaceC41771d.b(aVar);
        for (InterfaceC41774g interfaceC41774g : this.f402148b) {
            if (cVar.f401978c) {
                return;
            }
            if (interfaceC41774g == null) {
                cVar.dispose();
                aVar.onError(new NullPointerException("A completable source is null"));
                return;
            }
            interfaceC41774g.a(aVar);
        }
        aVar.e();
    }
}
