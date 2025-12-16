package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: Location.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a \u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"createLocation", "Lcom/avito/android/remote/model/Location;", "id", "", "locationName", "createLocationWithCoordinates", ServiceTransportationWidget.LocationField.COORDINATES, "Lcom/avito/android/remote/model/Coordinates;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class LocationKt {
    @k
    public static final Location createLocation(@k String str, @k String str2) {
        CaseText caseText = new CaseText();
        caseText.setName(1, str2);
        return new Location(str, caseText, false, false, false, false, null, null, false, null, null, null, 4092, null);
    }

    @k
    public static final Location createLocationWithCoordinates(@k String str, @k String str2, @l Coordinates coordinates) {
        CaseText caseText = new CaseText();
        caseText.setName(1, str2);
        return new Location(str, caseText, false, false, false, false, null, null, false, coordinates, null, null, 3580, null);
    }
}
