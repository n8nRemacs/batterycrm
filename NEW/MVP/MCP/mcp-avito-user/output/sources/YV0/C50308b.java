package yv0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.serp.r;
import com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem;
import com.google.gson.Gson;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceTransportationWidgetAnalytics.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyv0/b;", "Lyv0/a;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50308b implements InterfaceC50307a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f443607a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final r f443608b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Gson f443609c;

    @Inject
    public C50308b(@k InterfaceC28373a interfaceC28373a, @k r rVar, @k Gson gson) {
        this.f443607a = interfaceC28373a;
        this.f443608b = rVar;
        this.f443609c = gson;
    }

    @Override // yv0.InterfaceC50307a
    public final void a(@l ServiceTransportationWidget.AnalyticParams analyticParams, @k String str, @k ServiceTransportationWidget.FieldValue fieldValue) {
        Long itemId;
        Map mapSingletonMap = Collections.singletonMap(str, fieldValue.getAnalyticsBody());
        String mcid = analyticParams != null ? analyticParams.getMcid() : null;
        this.f443608b.getClass();
        this.f443607a.c(new C50312f(mcid, null, (analyticParams == null || (itemId = analyticParams.getItemId()) == null) ? null : itemId.toString(), analyticParams != null ? analyticParams.getFromSource() : null, this.f443609c.l(mapSingletonMap)));
    }

    @Override // yv0.InterfaceC50307a
    public final void b(@l ServiceTransportationWidget.AnalyticParams analyticParams, @k List<? extends ServicesTransportationWidgetBlueprintItem> list) {
        Long itemId;
        Map<String, Object> analyticsBody;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ServicesTransportationWidgetBlueprintItem servicesTransportationWidgetBlueprintItem : list) {
            ServiceTransportationWidget.FieldValue selectedValue = servicesTransportationWidgetBlueprintItem.i2().getSelectedValue();
            if (selectedValue != null && (analyticsBody = selectedValue.getAnalyticsBody()) != null) {
                linkedHashMap.put(servicesTransportationWidgetBlueprintItem.i2().getFieldId(), analyticsBody);
            }
        }
        String mcid = analyticParams != null ? analyticParams.getMcid() : null;
        this.f443608b.getClass();
        this.f443607a.c(new C50310d(mcid, null, (analyticParams == null || (itemId = analyticParams.getItemId()) == null) ? null : itemId.toString(), analyticParams != null ? analyticParams.getFromSource() : null, this.f443609c.l(linkedHashMap)));
    }

    @Override // yv0.InterfaceC50307a
    public final void c(@l ServiceTransportationWidget.AnalyticParams analyticParams, @k String str) {
        Long itemId;
        String mcid = analyticParams != null ? analyticParams.getMcid() : null;
        String q12 = analyticParams != null ? analyticParams.getQ() : null;
        this.f443608b.getClass();
        this.f443607a.c(new C50311e(mcid, q12, null, (analyticParams == null || (itemId = analyticParams.getItemId()) == null) ? null : itemId.toString(), analyticParams != null ? analyticParams.getFromSource() : null, str));
    }

    @Override // yv0.InterfaceC50307a
    public final void d(@l ServiceTransportationWidget.AnalyticParams analyticParams) {
        String fromPage;
        Long itemId;
        String mcid = analyticParams != null ? analyticParams.getMcid() : null;
        String q12 = analyticParams != null ? analyticParams.getQ() : null;
        this.f443608b.getClass();
        if (analyticParams == null || (fromPage = analyticParams.getFromPage()) == null) {
            fromPage = "serp";
        }
        this.f443607a.c(new C50313g(mcid, q12, null, (analyticParams == null || (itemId = analyticParams.getItemId()) == null) ? null : itemId.toString(), analyticParams != null ? analyticParams.getFromSource() : null, fromPage));
    }
}
