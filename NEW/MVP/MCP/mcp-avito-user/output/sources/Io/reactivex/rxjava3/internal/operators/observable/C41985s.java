package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import l41.InterfaceC43544b;
import n41.InterfaceC44188e;
import s41.C47998a;

/* compiled from: ObservableCollectSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41985s<T, U> extends io.reactivex.rxjava3.core.I<U> implements InterfaceC44188e<U> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f404265b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.s<? extends U> f404266c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC43544b<? super U, ? super T> f404267d;

    /* compiled from: ObservableCollectSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.s$a */
    public static final class a<T, U> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super U> f404268b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC43544b<? super U, ? super T> f404269c;

        /* renamed from: d, reason: collision with root package name */
        public final U f404270d;

        /* renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404271e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f404272f;

        public a(io.reactivex.rxjava3.core.L<? super U> l12, U u12, InterfaceC43544b<? super U, ? super T> interfaceC43544b) {
            this.f404268b = l12;
            this.f404269c = interfaceC43544b;
            this.f404270d = u12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404271e, dVar)) {
                this.f404271e = dVar;
                this.f404268b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404271e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404272f) {
                return;
            }
            this.f404272f = true;
            this.f404268b.onSuccess(this.f404270d);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404271e.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404272f) {
                C47998a.b(th2);
            } else {
                this.f404272f = true;
                this.f404268b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404272f) {
                return;
            }
            try {
                this.f404269c.accept(this.f404270d, t12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404271e.dispose();
                onError(th2);
            }
        }
    }

    public C41985s(io.reactivex.rxjava3.core.z zVar, l41.s sVar, InterfaceC43544b interfaceC43544b) {
        this.f404265b = zVar;
        this.f404266c = sVar;
        this.f404267d = interfaceC43544b;
    }

    @Override // n41.InterfaceC44188e
    public final io.reactivex.rxjava3.core.z<U> d() {
        return new r(this.f404265b, this.f404266c, this.f404267d);
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super U> l12) {
        try {
            U u12 = this.f404266c.get();
            Objects.requireNonNull(u12, "The initialSupplier returned a null value");
            this.f404265b.c(new a(l12, u12, this.f404267d));
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.e(th2, l12);
        }
    }
}
