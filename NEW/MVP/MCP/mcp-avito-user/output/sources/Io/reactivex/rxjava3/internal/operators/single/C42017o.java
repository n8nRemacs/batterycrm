package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: SingleDoFinally.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42017o<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404619b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC43543a f404620c;

    /* compiled from: SingleDoFinally.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.o$a */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404621b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC43543a f404622c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404623d;

        public a(io.reactivex.rxjava3.core.L<? super T> l12, InterfaceC43543a interfaceC43543a) {
            this.f404621b = l12;
            this.f404622c = interfaceC43543a;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f404622c.run();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404623d, dVar)) {
                this.f404623d = dVar;
                this.f404621b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404623d.dispose();
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404623d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404621b.onError(th2);
            a();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            this.f404621b.onSuccess(t12);
            a();
        }
    }

    public C42017o(io.reactivex.rxjava3.core.I i12, InterfaceC43543a interfaceC43543a) {
        this.f404619b = i12;
        this.f404620c = interfaceC43543a;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404619b.a(new a(l12, this.f404620c));
    }
}
