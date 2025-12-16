package Ns0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.events.SaveStatusToast;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.events.SelectSheetEventType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: SaveStatusToastEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNs0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SelectSheetEventType f11782b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SaveStatusToast f11783c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11784d;

    public b(@k SelectSheetEventType selectSheetEventType, @k SaveStatusToast saveStatusToast) {
        this.f11782b = selectSheetEventType;
        this.f11783c = saveStatusToast;
        this.f11784d = new ParametrizedClickStreamEvent(16331, 1, P0.g(new Q("from_page", selectSheetEventType.f274876b), new Q("action_type", saveStatusToast.f274871b)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11782b == bVar.f11782b && this.f11783c == bVar.f11783c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f11784d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11784d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f11784d.f90248c;
    }

    public final int hashCode() {
        return this.f11783c.hashCode() + (this.f11782b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "SaveStatusToastEvent(fromPage=" + this.f11782b + ", actionType=" + this.f11783c + ')';
    }
}
