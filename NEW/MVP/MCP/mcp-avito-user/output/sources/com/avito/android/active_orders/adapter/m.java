package com.avito.android.active_orders.adapter;

import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.active_orders_common.items.common.ActiveOrderItem;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.util.D6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HomeActiveOrdersItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/active_orders/adapter/m;", "Lcom/avito/android/active_orders/adapter/i;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m extends com.avito.android.serp.c implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f68282b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public G3.a f68283c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public d f68284d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f68285e;

    public m(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.active_orders_carousel);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f68282b = viewFindViewById;
        this.f68285e = view.getResources();
    }

    @Override // com.avito.android.active_orders.adapter.i
    public final void US(@Y61.l List<? extends ActiveOrderItem> list, @Y61.k d dVar, int i12, @Y61.l Analytics analytics) throws BlueprintCollisionException {
        this.f68284d = dVar;
        if (this.f68283c == null) {
            a.C10493a c10493a = new a.C10493a();
            com.avito.android.active_orders_common.items.all_orders.h hVar = new com.avito.android.active_orders_common.items.all_orders.h();
            hVar.f68309c = new j(this, i12, analytics);
            c10493a.b(new com.avito.android.active_orders_common.items.all_orders.a(hVar));
            com.avito.android.active_orders_common.items.order.h hVar2 = new com.avito.android.active_orders_common.items.order.h(new com.avito.android.active_orders_common.items.order.k(this.f68285e));
            hVar2.f68382d = new l(this, i12, analytics);
            c10493a.b(new com.avito.android.active_orders_common.items.order.a(hVar2));
            com.avito.android.active_orders_common.items.comfortable_deal.f fVar = new com.avito.android.active_orders_common.items.comfortable_deal.f();
            fVar.f68338b = new k(this, i12, analytics);
            c10493a.b(new com.avito.android.active_orders_common.items.comfortable_deal.b(fVar));
            com.avito.konveyor.a aVarA = c10493a.a();
            com.avito.konveyor.adapter.h hVar3 = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
            View view = this.f68282b;
            this.f68283c = new G3.a(view, hVar3, aVarA, null, false, Integer.valueOf(D6.j(view, 6)), null, false, 192, null);
        }
        G3.a aVar = this.f68283c;
        if (aVar == null || list == null) {
            return;
        }
        aVar.f6269w = list;
        aVar.h();
    }
}
