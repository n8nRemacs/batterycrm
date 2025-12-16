package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: NonoDoFinally.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41106x extends AbstractC41062i {

    /* compiled from: NonoDoFinally.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.x$a */
    public static final class a extends AbstractC41041b implements org.reactivestreams.d<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397803b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f397804c;

        public a(org.reactivestreams.d dVar) {
            this.f397803b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397804c, eVar)) {
                this.f397804c = eVar;
                this.f397803b.K(this);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397803b.e();
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397803b.onError(th2);
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th3) {
                    io.reactivex.rxjava3.exceptions.a.a(th3);
                    C47998a.b(th3);
                }
            }
        }

        @Override // org.reactivestreams.d
        public final /* bridge */ /* synthetic */ void onNext(Void r12) {
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
