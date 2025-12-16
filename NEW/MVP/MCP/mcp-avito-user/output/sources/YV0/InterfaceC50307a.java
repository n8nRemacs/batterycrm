package yv0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ServiceTransportationWidgetAnalytics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyv0/a;", "", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yv0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC50307a {
    void a(@l ServiceTransportationWidget.AnalyticParams analyticParams, @k String str, @k ServiceTransportationWidget.FieldValue fieldValue);

    void b(@l ServiceTransportationWidget.AnalyticParams analyticParams, @k List<? extends ServicesTransportationWidgetBlueprintItem> list);

    void c(@l ServiceTransportationWidget.AnalyticParams analyticParams, @k String str);

    void d(@l ServiceTransportationWidget.AnalyticParams analyticParams);
}
