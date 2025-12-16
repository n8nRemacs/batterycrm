package com.yandex.div.core.timer;

import com.yandex.div.core.timer.Ticker;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: Ticker.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.g f367720l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ticker f367721m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f367722n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l0.g gVar, Ticker ticker, long j12) {
        super(0);
        this.f367720l = gVar;
        this.f367721m = ticker;
        this.f367722n = j12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        long j12 = this.f367720l.f406841b;
        long j13 = this.f367722n;
        Ticker ticker = this.f367721m;
        if (j12 > 0) {
            ticker.f367684e.invoke(Long.valueOf(j13));
        }
        ticker.f367683d.invoke(Long.valueOf(j13));
        ticker.b();
        ticker.f();
        ticker.f367690k = Ticker.State.f367696b;
        return G0.f406611a;
    }
}
