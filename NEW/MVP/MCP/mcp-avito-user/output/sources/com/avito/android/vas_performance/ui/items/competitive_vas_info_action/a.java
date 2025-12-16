package com.avito.android.vas_performance.ui.items.competitive_vas_info_action;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: CompetitiveVasInfoActionItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/competitive_vas_info_action/a;", "Lcom/avito/conveyor_item/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f321646b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f321647c;

    public a(@k String str, @k DeepLink deepLink) {
        this.f321646b = str;
        this.f321647c = deepLink;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return -852710752;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF321621b() {
        return "competitive_vas_info_action";
    }
}
