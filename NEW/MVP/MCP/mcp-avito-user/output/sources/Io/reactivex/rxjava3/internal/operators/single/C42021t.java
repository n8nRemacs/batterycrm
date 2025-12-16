package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import s41.C47998a;

/* compiled from: SingleDoOnSubscribe.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42021t<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404637b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super io.reactivex.rxjava3.disposables.d> f404638c;

    /* compiled from: SingleDoOnSubscribe.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.t$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.L<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404639b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.g<? super io.reactivex.rxjava3.disposables.d> f404640c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f404641d;

        public a(io.reactivex.rxjava3.core.L<? super T> l12, l41.g<? super io.reactivex.rxjava3.disposables.d> gVar) {
            this.f404639b = l12;
            this.f404640c = gVar;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f404639b;
            try {
                this.f404640c.accept(dVar);
                l12.b(dVar);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404641d = true;
                dVar.dispose();
                EmptyDisposable.e(th2, l12);
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            if (this.f404641d) {
                C47998a.b(th2);
            } else {
                this.f404639b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            if (this.f404641d) {
                return;
            }
            this.f404639b.onSuccess(t12);
        }
    }

    public C42021t(io.reactivex.rxjava3.core.I i12, l41.g gVar) {
        this.f404637b = i12;
        this.f404638c = gVar;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404637b.a(new a(l12, this.f404638c));
    }
}
