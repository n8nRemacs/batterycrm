package com.avito.android.services_transportation_widget.location_sheet;

import Y41.l;
import android.util.SparseArray;
import com.avito.android.location.LocationSource;
import com.avito.android.remote.model.CaseText;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceTransportationLocationSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Location;", "selectedLocation", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements l<Location, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ServiceTransportationLocationSheet f280676l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ServiceTransportationLocationSheet serviceTransportationLocationSheet) {
        super(1);
        this.f280676l = serviceTransportationLocationSheet;
    }

    @Override // Y41.l
    public final G0 invoke(Location location) {
        Location location2 = location;
        ServiceTransportationLocationSheet serviceTransportationLocationSheet = this.f280676l;
        a aVar = serviceTransportationLocationSheet.f280666i0;
        if (aVar != null) {
            aVar.f280671a.f280672a.a(new Location(location2.getId(), new CaseText((SparseArray<String>) new SparseArray()), false, false, false, false, null, null, false, null, null, null, 4092, null), LocationSource.f181713e, true);
        }
        a aVar2 = serviceTransportationLocationSheet.f280666i0;
        if (aVar2 != null) {
            Coordinates coordinates = location2.getCoordinates();
            if (coordinates == null) {
                coordinates = new Coordinates(0.0d, 0.0d);
            }
            aVar2.b(new ServiceTransportationWidget.LocationField.LocationValue(coordinates, location2.getF119974b()));
        }
        return G0.f406611a;
    }
}
