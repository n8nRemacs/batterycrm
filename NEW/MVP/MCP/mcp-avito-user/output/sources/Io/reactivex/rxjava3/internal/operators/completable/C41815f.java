package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CompletableConcatIterable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41815f extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f402236b;

    /* compiled from: CompletableConcatIterable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.f$a */
    public static final class a extends AtomicInteger implements InterfaceC41771d {
        private static final long serialVersionUID = -7965400327305809232L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402237b;

        /* renamed from: c, reason: collision with root package name */
        public final Iterator<? extends InterfaceC41774g> f402238c;

        /* renamed from: d, reason: collision with root package name */
        public final m41.d f402239d = new m41.d();

        public a(InterfaceC41771d interfaceC41771d, Iterator<? extends InterfaceC41774g> it) {
            this.f402237b = interfaceC41771d;
            this.f402238c = it;
        }

        public final void a() {
            InterfaceC41771d interfaceC41771d = this.f402237b;
            m41.d dVar = this.f402239d;
            if (!dVar.getF318621e() && getAndIncrement() == 0) {
                Iterator<? extends InterfaceC41774g> it = this.f402238c;
                while (!dVar.getF318621e()) {
                    try {
                        if (!it.hasNext()) {
                            interfaceC41771d.e();
                            return;
                        }
                        try {
                            InterfaceC41774g next = it.next();
                            Objects.requireNonNull(next, "The CompletableSource returned is null");
                            next.a(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.a.a(th2);
                            interfaceC41771d.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.a.a(th3);
                        interfaceC41771d.onError(th3);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            m41.d dVar2 = this.f402239d;
            dVar2.getClass();
            DisposableHelper.c(dVar2, dVar);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            a();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f402237b.onError(th2);
        }
    }

    public C41815f(ArrayList arrayList) {
        this.f402236b = arrayList;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        try {
            Iterator it = this.f402236b.iterator();
            Objects.requireNonNull(it, "The iterator returned is null");
            a aVar = new a(interfaceC41771d, it);
            interfaceC41771d.b(aVar.f402239d);
            aVar.a();
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.b(th2, interfaceC41771d);
        }
    }
}
