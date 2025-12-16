package com.avito.android.advert_stats.detail.tab.items.funnel;

import Y41.l;
import Y61.k;
import eb.InterfaceC40078a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FunnelItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/funnel/d;", "Lcom/avito/android/advert_stats/detail/tab/items/funnel/c;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC40078a, G0> f86445b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f86446c = new com.jakewharton.rxrelay3.c<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC40078a, G0> lVar) {
        this.f86445b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((f) eVar).Tq(((FunnelItemData) aVar).f86440c, this.f86446c, this.f86445b);
    }
}
