package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: NonoRepeat.java */
/* loaded from: classes8.dex */
final class W extends AbstractC41062i {

    /* compiled from: NonoRepeat.java */
    public static abstract class a extends AbstractC41041b implements org.reactivestreams.d<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397647b;

        /* renamed from: c, reason: collision with root package name */
        public long f397648c = 0;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397649d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f397650e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f397651f;

        public a(org.reactivestreams.d dVar) {
            this.f397647b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.d(this.f397649d, eVar);
            if (this.f397651f) {
                return;
            }
            this.f397651f = true;
            this.f397647b.K(this);
        }

        public final void a(Throwable th2) {
            long j12 = this.f397648c;
            if (j12 == 1) {
                if (th2 != null) {
                    this.f397647b.onError(th2);
                    return;
                } else {
                    this.f397647b.e();
                    return;
                }
            }
            if (j12 != Long.MAX_VALUE) {
                this.f397648c = j12 - 1;
            }
            if (getAndIncrement() == 0) {
                while (SubscriptionHelper.f404813b != this.f397649d.get()) {
                    if (!this.f397650e) {
                        this.f397650e = true;
                        throw null;
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.d
        public final /* bridge */ /* synthetic */ void onNext(Void r12) {
        }
    }

    /* compiled from: NonoRepeat.java */
    public static final class b extends a {
        public b() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397650e = false;
            a(null);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397647b.onError(th2);
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new b(dVar);
        throw null;
    }
}
