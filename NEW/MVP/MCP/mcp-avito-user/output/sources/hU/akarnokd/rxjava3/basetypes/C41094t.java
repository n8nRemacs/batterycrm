package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.core.InterfaceC41770c;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import m41.C43880b;
import s41.C47998a;

/* compiled from: NonoCreate.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41094t extends AbstractC41062i {

    /* compiled from: NonoCreate.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.t$a */
    public static final class a extends AbstractC41050e<Void, io.reactivex.rxjava3.disposables.d> implements InterfaceC41770c {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397772b;

        public a(org.reactivestreams.d<? super Void> dVar) {
            this.f397772b = dVar;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41770c
        public final void e() {
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            io.reactivex.rxjava3.disposables.d andSet = getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                this.f397772b.e();
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41770c
        public final void f(l41.f fVar) {
            DisposableHelper.d(this, new C43880b(fVar));
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41770c
        public final boolean g(Throwable th2) {
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            io.reactivex.rxjava3.disposables.d andSet = getAndSet(disposableHelper);
            if (andSet == disposableHelper) {
                return false;
            }
            this.f397772b.onError(th2);
            if (andSet == null) {
                return true;
            }
            andSet.dispose();
            return true;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41770c
        public final boolean i() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41770c
        public final void onError(Throwable th2) {
            if (g(th2)) {
                return;
            }
            C47998a.b(th2);
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        QueueSubscription aVar = new a(dVar);
        dVar.K(aVar);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            aVar.onError(th2);
        }
    }
}
