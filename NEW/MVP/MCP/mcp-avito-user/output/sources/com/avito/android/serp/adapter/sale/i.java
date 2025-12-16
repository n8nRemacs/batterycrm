package com.avito.android.serp.adapter.sale;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.sales.SalesHeaderWidget;
import com.avito.android.serp.adapter.PersistableSerpItem;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SaleHeaderPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/sale/i;", "Lcom/avito/android/serp/adapter/sale/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f271500b;

    @Inject
    public i(@Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f271500b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        SaleHeaderItem saleHeaderItem = (SaleHeaderItem) aVar;
        UniversalImage universalImage = saleHeaderItem.f271474h;
        List<PersistableSerpItem> list = saleHeaderItem.f271476j;
        boolean z12 = universalImage != null && list.isEmpty();
        String strE = lVar.e(saleHeaderItem.f271468b);
        lVar.k(saleHeaderItem.f271469c);
        lVar.D7(saleHeaderItem.f271470d.getBackgroundColor());
        lVar.GN(list);
        lVar.jl(saleHeaderItem.f271471e);
        lVar.yX(saleHeaderItem.f271473g, saleHeaderItem.f271475i);
        lVar.QB(universalImage, list.isEmpty());
        lVar.Er(z12);
        SalesHeaderWidget.Timer timer = saleHeaderItem.f271472f;
        String str = null;
        Long saleEnds = timer != null ? timer.getSaleEnds() : null;
        if (saleEnds == null) {
            lVar.g00(timer != null ? timer.getFormattedDate() : null, timer != null ? timer.getDateBadgeStyle() : null);
            lVar.I3(null, timer != null ? timer.getTimerStyle() : null);
        } else {
            Integer countDownBeforeHours = timer.getCountDownBeforeHours();
            int iIntValue = countDownBeforeHours != null ? countDownBeforeHours.intValue() : 48;
            long jLongValue = saleEnds.longValue() - TimeUnit.MILLISECONDS.toSeconds(new Date().getTime());
            Long lValueOf = (0 > jLongValue || jLongValue >= ((long) (iIntValue * 3600))) ? null : Long.valueOf(TimeUnit.SECONDS.toMillis(saleEnds.longValue()));
            String formattedDate = timer.getFormattedDate();
            if (lValueOf == null && jLongValue > 0) {
                str = formattedDate;
            }
            lVar.g00(str, timer.getDateBadgeStyle());
            lVar.I3(lValueOf, timer.getTimerStyle());
        }
        this.f271500b.h(i12, "salesHeader_widget", strE, null, null, (56 & 32) != 0 ? null : null, (56 & 64) != 0 ? null : saleHeaderItem.f271478l);
    }
}
