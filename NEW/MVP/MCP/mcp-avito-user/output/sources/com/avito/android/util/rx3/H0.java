package com.avito.android.util.rx3;

import io.reactivex.rxjava3.core.AbstractC41777j;
import kotlin.Metadata;

/* compiled from: RetryWhen.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_rx_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final com.avito.android.analytics.timer.b f319001a = new com.avito.android.analytics.timer.b(3);

    /* compiled from: RetryWhen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f319002b;

        public a(Y41.l lVar) {
            this.f319002b = lVar;
        }

        @Override // l41.g
        public final /* synthetic */ void accept(Object obj) {
            this.f319002b.invoke(obj);
        }
    }

    @Y61.k
    public static final C35935z0 a(@Y61.k io.reactivex.rxjava3.core.H h12, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        return new C35935z0(AbstractC41777j.n().k(new E0()).x(1), new A0(lVar, 2), lVar2, h12, (byte) 0);
    }

    @Y61.k
    public static final C35935z0 b(long j12, int i12, @Y61.k io.reactivex.rxjava3.core.H h12, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, double d12) {
        return new C35935z0(AbstractC41777j.n().k(new G0(d12, j12)).x(i12), new A0(lVar), lVar2, h12);
    }
}
