package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: NonoRepeatWhen.java */
/* loaded from: classes8.dex */
final class Y extends AbstractC41062i {

    /* compiled from: NonoRepeatWhen.java */
    public static final class a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Object>, org.reactivestreams.e {
        private static final long serialVersionUID = 3973630610536953229L;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this, null, eVar);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this, null, j12);
        }
    }

    /* compiled from: NonoRepeatWhen.java */
    public interface b {
    }

    /* compiled from: NonoRepeatWhen.java */
    public static final class c extends AbstractC41041b implements org.reactivestreams.d<Void>, b {
        public c() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.f(null, eVar);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final /* bridge */ /* synthetic */ void onNext(Void r12) {
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new io.reactivex.rxjava3.processors.e().z();
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
