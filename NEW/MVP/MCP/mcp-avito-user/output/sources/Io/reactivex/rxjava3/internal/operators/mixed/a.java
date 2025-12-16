package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableAndThenObservable.java */
/* loaded from: classes8.dex */
public final class a<R> extends io.reactivex.rxjava3.core.z<R> {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f403342b;

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f403343c;

    /* compiled from: CompletableAndThenObservable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.a$a, reason: collision with other inner class name */
    public static final class C11474a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements G<R>, InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -8948264376121066672L;

        /* renamed from: b, reason: collision with root package name */
        public final G<? super R> f403344b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.core.z f403345c;

        public C11474a(io.reactivex.rxjava3.core.z zVar, G g12) {
            this.f403345c = zVar;
            this.f403344b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.c(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            io.reactivex.rxjava3.core.z zVar = this.f403345c;
            if (zVar == null) {
                this.f403344b.e();
            } else {
                this.f403345c = null;
                zVar.c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403344b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(R r12) {
            this.f403344b.onNext(r12);
        }
    }

    public a(AbstractC41768a abstractC41768a, io.reactivex.rxjava3.core.z zVar) {
        this.f403342b = abstractC41768a;
        this.f403343c = zVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super R> g12) {
        C11474a c11474a = new C11474a(this.f403343c, g12);
        g12.b(c11474a);
        this.f403342b.a(c11474a);
    }
}
