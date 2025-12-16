package com.avito.android.bxcontent.search_bar_promo_widget;

import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SearchPromoHeaderWidgetPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/d;", "Lcom/avito/android/ui/status_bar/k;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d extends com.avito.android.ui.status_bar.k {
    void G4(@Y61.k i iVar, @Y61.k BxContentFragment.G g12);

    void d3(boolean z12);

    @Y61.k
    InterfaceC43160i<UdfToolbarColors> e3();

    void f0();

    @Y61.k
    InterfaceC43160i<Float> f3();

    @Y61.k
    InterfaceC43160i<DeepLink> g3();

    @Y61.k
    InterfaceC43160i<h> h3();

    void hide();

    void j3(boolean z12, @Y61.k SearchPromoHeaderWidgetItem searchPromoHeaderWidgetItem, boolean z13);
}
