package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaybeOnErrorReturn.java */
/* loaded from: classes8.dex */
public final class f0<T> extends AbstractC41907a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final ru.avito.messenger.internal.connection.L f403226c;

    /* compiled from: MaybeOnErrorReturn.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403227b;

        /* renamed from: c, reason: collision with root package name */
        public final ru.avito.messenger.internal.connection.L f403228c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403229d;

        public a(io.reactivex.rxjava3.core.t tVar, ru.avito.messenger.internal.connection.L l12) {
            this.f403227b = tVar;
            this.f403228c = l12;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403229d, dVar)) {
                this.f403229d = dVar;
                this.f403227b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403229d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403227b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403229d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403227b;
            try {
                tVar.onSuccess(this.f403228c.apply(th2));
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                tVar.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403227b.onSuccess(t12);
        }
    }

    public f0(io.reactivex.rxjava3.core.q qVar, ru.avito.messenger.internal.connection.L l12) {
        super(qVar);
        this.f403226c = l12;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403189b.a(new a(tVar, this.f403226c));
    }
}
