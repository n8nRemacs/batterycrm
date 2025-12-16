package com.avito.android.services_transportation_widget.item;

import android.os.Parcelable;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.Metadata;

/* compiled from: ServicesTransportationWidgetBlueprintItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/ServicesTransportationWidgetBlueprintItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServicesTransportationWidgetBlueprintItem extends com.avito.conveyor_item.a, Parcelable {

    /* compiled from: ServicesTransportationWidgetBlueprintItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    ServicesTransportationWidgetBlueprintItem D1(boolean z12);

    @Y61.k
    ServicesTransportationWidgetBlueprintItem L4(boolean z12);

    boolean hasError();

    @Y61.k
    ServiceTransportationWidget.Field<?> i2();
}
