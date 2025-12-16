package com.yandex.div.core.timer;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: Ticker.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f367715l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ticker f367716m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.g f367717n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f367718o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f367719p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j12, Ticker ticker, l0.g gVar, long j13, Y41.a<G0> aVar) {
        super(0);
        this.f367715l = j12;
        this.f367716m = ticker;
        this.f367717n = gVar;
        this.f367718o = j13;
        this.f367719p = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        int i12 = Ticker.f367679q;
        Ticker ticker = this.f367716m;
        long jD2 = this.f367715l - ticker.d();
        ticker.c();
        l0.g gVar = this.f367717n;
        gVar.f406841b--;
        Y41.a<G0> aVar = this.f367719p;
        if (1 <= jD2 && jD2 < this.f367718o) {
            ticker.b();
            this.f367716m.i(jD2, jD2, new f(aVar));
        } else if (jD2 <= 0) {
            ((h) aVar).invoke();
        }
        return G0.f406611a;
    }
}
