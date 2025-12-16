package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: NonoRepeatUntil.java */
/* loaded from: classes8.dex */
final class X extends AbstractC41062i {

    /* compiled from: NonoRepeatUntil.java */
    public static final class a extends AbstractC41041b implements org.reactivestreams.d<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397656b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397657c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public boolean f397658d;

        public a(org.reactivestreams.d dVar) {
            this.f397656b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.d(this.f397657c, eVar);
            if (this.f397658d) {
                return;
            }
            this.f397658d = true;
            this.f397656b.K(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397656b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397656b.onError(th2);
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
