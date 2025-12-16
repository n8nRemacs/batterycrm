package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: NonoRetryWhile.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41042b0 extends AbstractC41062i {

    /* compiled from: NonoRetryWhile.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.b0$a */
    public static final class a extends AbstractC41041b implements org.reactivestreams.d<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397677b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397678c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public boolean f397679d;

        public a(org.reactivestreams.d dVar) {
            this.f397677b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.d(this.f397678c, eVar);
            if (this.f397679d) {
                return;
            }
            this.f397679d = true;
            this.f397677b.K(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397677b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f397677b.onError(new CompositeException(th2, th3));
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
