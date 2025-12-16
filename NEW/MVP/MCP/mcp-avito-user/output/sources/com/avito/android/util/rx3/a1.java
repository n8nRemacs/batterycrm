package com.avito.android.util.rx3;

import kotlin.Metadata;

/* compiled from: Subscribers.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/rx3/a1;", "Lio/reactivex/rxjava3/subscribers/b;", "_common_rx_util"}, k = 1, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes5.dex */
public final class a1 extends io.reactivex.rxjava3.subscribers.b<Object> {

    /* compiled from: Subscribers.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.l<Long, kotlin.G0> {
        @Override // Y41.l
        public final kotlin.G0 invoke(Long l12) {
            ((a1) this.receiver).f405038b.get().request(l12.longValue());
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Subscribers.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.l<Long, kotlin.G0> {
        @Override // Y41.l
        public final kotlin.G0 invoke(Long l12) {
            ((a1) this.receiver).f405038b.get().request(l12.longValue());
            return kotlin.G0.f406611a;
        }
    }

    @Override // io.reactivex.rxjava3.subscribers.b
    public final void a() {
        new b(1, this, a1.class, "request", "request(J)V", 0);
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void e() {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onError(@Y61.l Throwable th2) {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onNext(@Y61.k Object obj) {
        new a(1, this, a1.class, "request", "request(J)V", 0);
        throw null;
    }
}
