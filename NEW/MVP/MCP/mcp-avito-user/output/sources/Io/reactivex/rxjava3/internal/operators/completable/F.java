package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import s41.C47998a;

/* compiled from: CompletableMergeIterable.java */
/* loaded from: classes8.dex */
public final class F extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterable<? extends InterfaceC41774g> f402152b;

    /* compiled from: CompletableMergeIterable.java */
    public static final class a extends AtomicBoolean implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -7730517613164279224L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f402153b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC41771d f402154c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f402155d;

        public a(InterfaceC41771d interfaceC41771d, io.reactivex.rxjava3.disposables.c cVar, AtomicInteger atomicInteger) {
            this.f402154c = interfaceC41771d;
            this.f402153b = cVar;
            this.f402155d = atomicInteger;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f402153b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402153b.dispose();
            set(true);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            if (this.f402155d.decrementAndGet() == 0) {
                this.f402154c.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f402153b.f401978c;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f402153b.dispose();
            if (compareAndSet(false, true)) {
                this.f402154c.onError(th2);
            } else {
                C47998a.b(th2);
            }
        }
    }

    public F(Iterable<? extends InterfaceC41774g> iterable) {
        this.f402152b = iterable;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        AtomicInteger atomicInteger = new AtomicInteger(1);
        a aVar = new a(interfaceC41771d, cVar, atomicInteger);
        interfaceC41771d.b(aVar);
        try {
            Iterator<? extends InterfaceC41774g> it = this.f402152b.iterator();
            Objects.requireNonNull(it, "The source iterator returned is null");
            while (!cVar.f401978c) {
                try {
                    if (!it.hasNext()) {
                        aVar.e();
                        return;
                    }
                    if (cVar.f401978c) {
                        return;
                    }
                    try {
                        InterfaceC41774g next = it.next();
                        Objects.requireNonNull(next, "The iterator returned a null CompletableSource");
                        InterfaceC41774g interfaceC41774g = next;
                        if (cVar.f401978c) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        interfaceC41774g.a(aVar);
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        cVar.dispose();
                        aVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    io.reactivex.rxjava3.exceptions.a.a(th3);
                    cVar.dispose();
                    aVar.onError(th3);
                    return;
                }
            }
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.a.a(th4);
            interfaceC41771d.onError(th4);
        }
    }
}
