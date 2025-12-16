package MY;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DTOs.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/n;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f10817a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GeoMarker[] f10818b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final MarkersRequest f10819c;

    public n(@Y61.k String str, @Y61.k GeoMarker[] geoMarkerArr, @Y61.l MarkersRequest markersRequest) {
        this.f10817a = str;
        this.f10818b = geoMarkerArr;
        this.f10819c = markersRequest;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f10817a, nVar.f10817a) && Arrays.equals(this.f10818b, nVar.f10818b) && L.f(this.f10819c, nVar.f10819c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f10817a.hashCode() * 31) + Arrays.hashCode(this.f10818b)) * 31;
        MarkersRequest markersRequest = this.f10819c;
        return iHashCode + (markersRequest != null ? markersRequest.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "PlatformMapData(title=" + this.f10817a + ", markers=" + Arrays.toString(this.f10818b) + ", markersRequest=" + this.f10819c + ')';
    }
}
