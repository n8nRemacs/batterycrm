package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: SingleDoAfterTerminate.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42016n<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404614b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC43543a f404615c;

    /* compiled from: SingleDoAfterTerminate.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.n$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404616b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC43543a f404617c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404618d;

        public a(io.reactivex.rxjava3.core.L<? super T> l12, InterfaceC43543a interfaceC43543a) {
            this.f404616b = l12;
            this.f404617c = interfaceC43543a;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404618d, dVar)) {
                this.f404618d = dVar;
                this.f404616b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404618d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404618d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404616b.onError(th2);
            try {
                this.f404617c.run();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                C47998a.b(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            this.f404616b.onSuccess(t12);
            try {
                this.f404617c.run();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
        }
    }

    public C42016n(io.reactivex.rxjava3.core.I i12, InterfaceC43543a interfaceC43543a) {
        this.f404614b = i12;
        this.f404615c = interfaceC43543a;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404614b.a(new a(l12, this.f404615c));
    }
}
