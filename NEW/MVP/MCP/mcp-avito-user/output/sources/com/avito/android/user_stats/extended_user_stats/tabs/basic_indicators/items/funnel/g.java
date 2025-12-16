package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel;

import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FunnelItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/funnel/g;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/funnel/f;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f317476b = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f317477c = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public g() {
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.f
    /* renamed from: H4, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF317477c() {
        return this.f317477c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((i) eVar).EJ((e) aVar, this.f317476b, this.f317477c);
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.f
    /* renamed from: T, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF317476b() {
        return this.f317476b;
    }
}
