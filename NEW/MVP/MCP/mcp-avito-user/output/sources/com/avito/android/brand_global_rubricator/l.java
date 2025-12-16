package com.avito.android.brand_global_rubricator;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.visual_rubricator.VisualRubricatorWidgetItem;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BrandGlobalRubricatorPresenterImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brand_global_rubricator/l;", "Lcom/avito/android/brand_global_rubricator/j;", "_avito_bx-content_widget_brand-global-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f107456b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f107457c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f107458d;

    public l(@Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f107456b = gVar;
        this.f107457c = aVar;
        this.f107458d = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        m mVar = (m) eVar;
        List<VisualRubricatorWidgetElementItem> listH6 = ((VisualRubricatorWidgetItem) aVar).h6();
        ArrayList arrayList = new ArrayList(C42745f0.q(listH6, 10));
        for (VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem : listH6) {
            arrayList.add(new i(visualRubricatorWidgetElementItem.getF327360c(), visualRubricatorWidgetElementItem.getF327362e(), visualRubricatorWidgetElementItem.getF327365h(), L.f(visualRubricatorWidgetElementItem.getF318041b(), "item_all_categories")));
        }
        mVar.d60(new k(this, i12), arrayList);
    }
}
