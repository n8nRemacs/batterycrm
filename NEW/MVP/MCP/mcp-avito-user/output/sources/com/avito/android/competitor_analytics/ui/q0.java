package com.avito.android.competitor_analytics.ui;

import com.avito.android.competitor_analytics.mvi.entity.a;
import com.avito.android.competitor_analytics.mvi.entity.b;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class q0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124837l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.b f124838m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q0(Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, com.avito.android.competitor_analytics.mvi.entity.b bVar) {
        super(0);
        this.f124837l = lVar;
        this.f124838m = bVar;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        b.h.a aVar = this.f124838m.f124473d;
        this.f124837l.invoke(new a.l(aVar != null ? aVar.f124526a : null));
        return kotlin.G0.f406611a;
    }
}
