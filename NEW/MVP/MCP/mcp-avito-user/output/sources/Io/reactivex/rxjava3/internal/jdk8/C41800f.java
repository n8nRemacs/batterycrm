package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import s41.C47998a;

/* compiled from: FlowableFlatMapStream.java */
/* renamed from: io.reactivex.rxjava3.internal.jdk8.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41800f<T, R> extends AbstractC41777j<R> {

    /* compiled from: FlowableFlatMapStream.java */
    /* renamed from: io.reactivex.rxjava3.internal.jdk8.f$a */
    public static final class a<T, R> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -5127032662980523968L;

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super R> f402038b;

        /* renamed from: d, reason: collision with root package name */
        public q41.g<T> f402040d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f402041e;

        /* renamed from: f, reason: collision with root package name */
        public Iterator<? extends R> f402042f;

        /* renamed from: g, reason: collision with root package name */
        public Stream f402043g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f402044h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f402045i;

        /* renamed from: k, reason: collision with root package name */
        public long f402047k;

        /* renamed from: l, reason: collision with root package name */
        public int f402048l;

        /* renamed from: m, reason: collision with root package name */
        public int f402049m;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f402039c = new AtomicLong();

        /* renamed from: j, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402046j = new io.reactivex.rxjava3.internal.util.b();

        public a(org.reactivestreams.d dVar) {
            this.f402038b = dVar;
        }

        @Override // org.reactivestreams.d
        public final void K(@j41.e org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402041e, eVar)) {
                this.f402041e = eVar;
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(7);
                    if (iV2 == 1) {
                        this.f402049m = iV2;
                        this.f402040d = dVar;
                        this.f402045i = true;
                        this.f402038b.K(this);
                        return;
                    }
                    if (iV2 == 2) {
                        this.f402049m = iV2;
                        this.f402040d = dVar;
                        this.f402038b.K(this);
                        eVar.request(0);
                        return;
                    }
                }
                this.f402040d = new q41.h(0);
                this.f402038b.K(this);
                eVar.request(0);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r11v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.jdk8.C41800f.a.a():void");
        }

        public final void b(Throwable th2, org.reactivestreams.d dVar) {
            if (!this.f402046j.compareAndSet(null, th2)) {
                C47998a.b(th2);
                return;
            }
            this.f402041e.cancel();
            this.f402044h = true;
            dVar.onError(th2);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402044h = true;
            this.f402041e.cancel();
            a();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402045i = true;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (!this.f402046j.compareAndSet(null, th2)) {
                C47998a.b(th2);
            } else {
                this.f402045i = true;
                a();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402049m == 2 || this.f402040d.offer(t12)) {
                a();
            } else {
                this.f402041e.cancel();
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402039c, j12);
                a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a(dVar);
        throw null;
    }
}
