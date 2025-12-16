package uF;

import Y61.k;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.Metadata;

/* compiled from: CurrentCoordinates.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LuF/g;", "", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "<init>", "(Lcom/avito/android/remote/model/Coordinates;)V", "Lcom/avito/android/remote/model/Coordinates;", "a", "()Lcom/avito/android/remote/model/Coordinates;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g {

    @com.google.gson.annotations.c(ServiceTransportationWidget.LocationField.COORDINATES)
    @k
    private final Coordinates coordinates;

    public g(@k Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }
}
