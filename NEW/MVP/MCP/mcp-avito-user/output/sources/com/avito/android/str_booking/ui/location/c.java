package com.avito.android.str_booking.ui.location;

import Y61.k;
import Y61.l;
import com.avito.android.str_booking.network.models.sections.LocationContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingLocationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/location/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final LocationContent f286104b;

    public c(@l LocationContent locationContent) {
        this.f286104b = locationContent;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return L.f(this.f286104b, ((c) obj).f286104b);
        }
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return 1901043637;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF282186b() {
        return "location";
    }

    public final int hashCode() {
        LocationContent locationContent = this.f286104b;
        return ((locationContent == null ? 0 : locationContent.hashCode()) * 31) + 1901043637;
    }

    @k
    public final String toString() {
        return "StrBookingLocationItem(locationContent=" + this.f286104b + ", stringId=location)";
    }
}
