package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: NonoOnErrorResume.java */
/* loaded from: classes8.dex */
final class U extends AbstractC41062i {

    /* compiled from: NonoOnErrorResume.java */
    public static final class a extends AbstractC41050e<Void, org.reactivestreams.e> implements org.reactivestreams.d<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397628b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f397629c;

        public a(org.reactivestreams.d dVar) {
            this.f397628b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.d(this, eVar);
            if (this.f397629c) {
                return;
            }
            this.f397628b.K(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397628b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f397629c) {
                this.f397628b.onError(th2);
                return;
            }
            this.f397629c = true;
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f397628b.onError(new CompositeException(th2, th3));
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
