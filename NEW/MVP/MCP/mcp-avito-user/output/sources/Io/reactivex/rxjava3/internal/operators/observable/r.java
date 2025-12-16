package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import l41.InterfaceC43544b;
import s41.C47998a;

/* compiled from: ObservableCollect.java */
/* loaded from: classes8.dex */
public final class r<T, U> extends AbstractC41932a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.s<? extends U> f404251c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC43544b<? super U, ? super T> f404252d;

    /* compiled from: ObservableCollect.java */
    public static final class a<T, U> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super U> f404253b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC43544b<? super U, ? super T> f404254c;

        /* renamed from: d, reason: collision with root package name */
        public final U f404255d;

        /* renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404256e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f404257f;

        public a(io.reactivex.rxjava3.core.G<? super U> g12, U u12, InterfaceC43544b<? super U, ? super T> interfaceC43544b) {
            this.f404253b = g12;
            this.f404254c = interfaceC43544b;
            this.f404255d = u12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404256e, dVar)) {
                this.f404256e = dVar;
                this.f404253b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404256e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404257f) {
                return;
            }
            this.f404257f = true;
            U u12 = this.f404255d;
            io.reactivex.rxjava3.core.G<? super U> g12 = this.f404253b;
            g12.onNext(u12);
            g12.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404256e.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404257f) {
                C47998a.b(th2);
            } else {
                this.f404257f = true;
                this.f404253b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404257f) {
                return;
            }
            try {
                this.f404254c.accept(this.f404255d, t12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404256e.dispose();
                onError(th2);
            }
        }
    }

    public r(io.reactivex.rxjava3.core.z zVar, l41.s sVar, InterfaceC43544b interfaceC43544b) {
        super(zVar);
        this.f404251c = sVar;
        this.f404252d = interfaceC43544b;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super U> g12) {
        try {
            U u12 = this.f404251c.get();
            Objects.requireNonNull(u12, "The initialSupplier returned a null value");
            this.f403951b.c(new a(g12, u12, this.f404252d));
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.d(th2, g12);
        }
    }
}
