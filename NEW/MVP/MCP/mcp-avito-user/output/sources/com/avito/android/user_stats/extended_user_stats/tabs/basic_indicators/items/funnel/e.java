package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: FunnelItemData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/funnel/e;", "Lcom/avito/conveyor_item/a;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f317473b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f317474c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f317475d;

    public e(@Y61.k String str, @Y61.k String str2, @Y61.k ArrayList arrayList) {
        this.f317473b = str;
        this.f317474c = arrayList;
        this.f317475d = str2;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF317473b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF317473b() {
        return this.f317473b;
    }
}
