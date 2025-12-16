package com.avito.android.active_orders_common.items.comfortable_deal;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ComfortableDealItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/active_orders_common/items/comfortable_deal/b;", "LTV0/b;", "Lcom/avito/android/active_orders_common/items/comfortable_deal/h;", "Lcom/avito/android/active_orders_common/items/comfortable_deal/ComfortableDealOrderItem;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements TV0.b<h, ComfortableDealOrderItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f68331a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<i> f68332b = new g.a<>(R.layout.comfortable_deal, a.f68330l);

    @Inject
    public b(@k f fVar) {
        this.f68331a = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f68331a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f68332b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ComfortableDealOrderItem;
    }
}
