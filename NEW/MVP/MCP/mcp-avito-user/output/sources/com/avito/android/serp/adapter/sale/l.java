package com.avito.android.serp.adapter.sale;

import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.sales.SalesHeaderWidget;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.PersistableSerpItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SaleHeaderView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/sale/l;", "LTV0/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface l extends TV0.e {

    /* compiled from: SaleHeaderView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void D7(@Y61.k UniversalColor universalColor);

    void Er(boolean z12);

    void GN(@Y61.k List<? extends PersistableSerpItem> list);

    void I3(@Y61.l Long l12, @Y61.l Timer.TimerStyle timerStyle);

    void QB(@Y61.l UniversalImage universalImage, boolean z12);

    @Y61.l
    String e(@Y61.l AttributedText attributedText);

    void g00(@Y61.l String str, @Y61.l SalesHeaderWidget.DateBadgeStyle dateBadgeStyle);

    void jl(@Y61.l String str);

    void k(@Y61.l AttributedText attributedText);

    void yX(@Y61.l UniversalImage universalImage, @Y61.k SalesHeaderWidget.ImageDisplayMode imageDisplayMode);
}
