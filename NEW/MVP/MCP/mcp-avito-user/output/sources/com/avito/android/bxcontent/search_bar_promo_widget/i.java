package com.avito.android.bxcontent.search_bar_promo_widget;

import Y41.p;
import Y41.q;
import com.avito.android.bxcontent.search_bar_promo_widget.SearchPromoHeaderWidgetItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SearchPromoHeaderWidgetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/i;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface i {
    void a(@Y61.l ArrayList arrayList);

    void b(@Y61.k SearchPromoHeaderWidgetItem.SearchBarPromoItemTitle searchBarPromoItemTitle, @Y61.k q<? super DeepLink, ? super String, ? super String, G0> qVar);

    void c(boolean z12, @Y61.k Y41.l<? super Float, G0> lVar, @Y61.k Y41.l<? super com.avito.android.ui.status_bar.d, G0> lVar2, @Y61.l UdfToolbarAndStatusBarConfig udfToolbarAndStatusBarConfig, @Y61.k Y41.l<? super UdfToolbarColors, G0> lVar3, @Y61.k p<? super String, ? super String, G0> pVar, @Y61.k Y41.l<? super h, G0> lVar4, boolean z13, boolean z14);

    void d();

    void d3(boolean z12);

    void f4(@Y61.l UniversalImage universalImage);

    void v1(@Y61.l UniversalImage universalImage);
}
