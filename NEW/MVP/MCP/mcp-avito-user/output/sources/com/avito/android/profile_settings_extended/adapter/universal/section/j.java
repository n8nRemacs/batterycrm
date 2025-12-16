package com.avito.android.profile_settings_extended.adapter.universal.section;

import Rb0.InterfaceC15026b;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetCarouselPreviewView;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetTwoBlocksView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalWidgetSectionItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/universal/section/j;", "LTV0/e;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface j extends TV0.e, InterfaceC15026b {

    /* compiled from: UniversalWidgetSectionItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void DT(@Y61.k UniversalWidgetCarouselPreviewView.UniversalWidgetCarouselPreviewState universalWidgetCarouselPreviewState);

    void MH(@Y61.k UniversalWidgetSectionItem universalWidgetSectionItem, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3, @Y61.k Y41.a<G0> aVar4);

    void Nx(@Y61.k UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState);

    void XA(@Y61.l String str);

    void gM(@Y61.k UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState universalWidgetFourBlocksState);

    void wz(@Y61.k UniversalWidgetTwoBlocksView.UniversalWidgetTwoBlocksState universalWidgetTwoBlocksState);
}
