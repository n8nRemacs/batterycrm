package com.avito.android.services_transportation_widget.location_sheet;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.location.r;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.services_transportation_widget.location_sheet.ServiceTransportationLocationSheet;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ServiceTransportationLocationDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/location_sheet/b;", "", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final r f280672a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<ServiceTransportationWidget.LocationField.LocationValue, G0> f280673b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f280674c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ServiceTransportationLocationSheet f280675d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k String str, @k String str2, @k r rVar, @k FragmentManager fragmentManager, @k l<? super ServiceTransportationWidget.LocationField.LocationValue, G0> lVar, @k Y41.a<G0> aVar) {
        this.f280672a = rVar;
        this.f280673b = lVar;
        this.f280674c = aVar;
        Fragment fragmentH = fragmentManager.H("tag.suggest_location_dialog_fragment");
        ServiceTransportationLocationSheet serviceTransportationLocationSheet = fragmentH instanceof ServiceTransportationLocationSheet ? (ServiceTransportationLocationSheet) fragmentH : null;
        if (serviceTransportationLocationSheet == null) {
            ServiceTransportationLocationSheet.a aVar2 = ServiceTransportationLocationSheet.f280664j0;
            a aVar3 = new a(this);
            aVar2.getClass();
            serviceTransportationLocationSheet = new ServiceTransportationLocationSheet();
            serviceTransportationLocationSheet.f280666i0 = aVar3;
            Bundle bundle = new Bundle();
            bundle.putString("key.title", str);
            bundle.putString("key.query", str2);
            serviceTransportationLocationSheet.setArguments(bundle);
        }
        this.f280675d = serviceTransportationLocationSheet;
    }
}
