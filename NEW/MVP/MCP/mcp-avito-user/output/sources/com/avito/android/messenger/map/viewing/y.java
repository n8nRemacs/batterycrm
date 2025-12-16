package com.avito.android.messenger.map.viewing;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet;
import com.avito.android.messenger.map.viewing.view.d;
import kotlin.Metadata;

/* compiled from: PlatformMapPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/y;", "LS20/a;", "Lcom/avito/android/messenger/map/viewing/view/d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface y extends S20.a<d.b> {
    void A8();

    @Y61.k
    com.avito.android.util.architecture_components.D D6();

    void M4(@Y61.k BottomSheet.d dVar);

    @Y61.k
    com.avito.android.util.architecture_components.D c1();

    @Y61.k
    com.avito.android.util.architecture_components.D f6();

    void l3(@Y61.k com.avito.android.messenger.map.viewing.view.a aVar);

    void p5();

    void u(@Y61.k AvitoMapCameraPosition avitoMapCameraPosition, boolean z12);

    void x(boolean z12);

    void y(@Y61.k AvitoMapPoint avitoMapPoint);
}
