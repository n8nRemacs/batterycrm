package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableResumeNext.java */
/* loaded from: classes8.dex */
public final class L extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f402176b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super Throwable, ? extends InterfaceC41774g> f402177c;

    /* compiled from: CompletableResumeNext.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 5018523762564524046L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402178b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super Throwable, ? extends InterfaceC41774g> f402179c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402180d;

        public a(InterfaceC41771d interfaceC41771d, l41.o<? super Throwable, ? extends InterfaceC41774g> oVar) {
            this.f402178b = interfaceC41771d;
            this.f402179c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.c(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f402178b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            boolean z12 = this.f402180d;
            InterfaceC41771d interfaceC41771d = this.f402178b;
            if (z12) {
                interfaceC41771d.onError(th2);
                return;
            }
            this.f402180d = true;
            try {
                InterfaceC41774g interfaceC41774gApply = this.f402179c.apply(th2);
                Objects.requireNonNull(interfaceC41774gApply, "The errorMapper returned a null CompletableSource");
                interfaceC41774gApply.a(this);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                interfaceC41771d.onError(new CompositeException(th2, th3));
            }
        }
    }

    public L(AbstractC41768a abstractC41768a, l41.o oVar) {
        this.f402176b = abstractC41768a;
        this.f402177c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        a aVar = new a(interfaceC41771d, this.f402177c);
        interfaceC41771d.b(aVar);
        this.f402176b.a(aVar);
    }
}
