package com.avito.android.bundles.vas_union.item.performance.info_action;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: InfoActionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/performance/info_action/a;", "Lcom/avito/conveyor_item/a;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f108609b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f108610c;

    public a(@k String str, @k DeepLink deepLink) {
        this.f108609b = str;
        this.f108610c = deepLink;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return 1943453776;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF106084b() {
        return "vas_info_action";
    }
}
