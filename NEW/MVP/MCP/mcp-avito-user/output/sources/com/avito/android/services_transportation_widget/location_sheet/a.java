package com.avito.android.services_transportation_widget.location_sheet;

import Y61.k;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.services_transportation_widget.location_sheet.ServiceTransportationLocationSheet;
import kotlin.Metadata;

/* compiled from: ServiceTransportationLocationDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/location_sheet/a;", "Lcom/avito/android/services_transportation_widget/location_sheet/ServiceTransportationLocationSheet$b;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements ServiceTransportationLocationSheet.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f280671a;

    public a(b bVar) {
        this.f280671a = bVar;
    }

    public final void a() {
        b bVar = this.f280671a;
        ServiceTransportationLocationSheet serviceTransportationLocationSheet = bVar.f280675d;
        if (serviceTransportationLocationSheet != null) {
            serviceTransportationLocationSheet.dismiss();
        }
        bVar.f280674c.invoke();
    }

    public final void b(@k ServiceTransportationWidget.LocationField.LocationValue locationValue) {
        b bVar = this.f280671a;
        ServiceTransportationLocationSheet serviceTransportationLocationSheet = bVar.f280675d;
        if (serviceTransportationLocationSheet != null) {
            serviceTransportationLocationSheet.dismiss();
        }
        bVar.f280673b.invoke(locationValue);
    }
}
