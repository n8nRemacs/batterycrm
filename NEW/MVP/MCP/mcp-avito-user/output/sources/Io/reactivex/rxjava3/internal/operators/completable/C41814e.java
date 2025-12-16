package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CompletableConcatArray.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41814e extends AbstractC41768a {

    /* compiled from: CompletableConcatArray.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.e$a */
    public static final class a extends AtomicInteger implements InterfaceC41771d {
        private static final long serialVersionUID = -7965400327305809232L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402233b;

        /* renamed from: c, reason: collision with root package name */
        public int f402234c;

        /* renamed from: d, reason: collision with root package name */
        public final m41.d f402235d = new m41.d();

        public a(InterfaceC41771d interfaceC41771d) {
            this.f402233b = interfaceC41771d;
        }

        public final void a() {
            m41.d dVar = this.f402235d;
            if (dVar.getF318621e() || getAndIncrement() != 0 || dVar.getF318621e()) {
                return;
            }
            this.f402234c++;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            m41.d dVar2 = this.f402235d;
            dVar2.getClass();
            DisposableHelper.c(dVar2, dVar);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            a();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f402233b.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        a aVar = new a(interfaceC41771d);
        interfaceC41771d.b(aVar.f402235d);
        aVar.a();
    }
}
