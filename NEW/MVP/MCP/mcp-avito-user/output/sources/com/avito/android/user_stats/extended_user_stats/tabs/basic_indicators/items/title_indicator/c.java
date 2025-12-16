package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.title_indicator;

import Y61.k;
import kotlin.Metadata;

/* compiled from: TitleIndicatorItemData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/title_indicator/c;", "Lcom/avito/conveyor_item/a;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f317502b;

    public c(@k String str) {
        this.f317502b = str;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF317502b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF317502b() {
        return this.f317502b;
    }
}
