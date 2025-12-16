package com.avito.android.hotel_booking.konveyor.select;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormSelectItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/select/c;", "Lcom/avito/conveyor_item/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f163758b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f163759c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BookingFormSelectState f163760d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f163761e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f163762f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public DeepLink f163763g;

    public c(@l String str, boolean z12, @k BookingFormSelectState bookingFormSelectState, @l String str2, @l String str3) {
        this.f163758b = str;
        this.f163759c = z12;
        this.f163760d = bookingFormSelectState;
        this.f163761e = str2;
        this.f163762f = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f163758b, cVar.f163758b) && this.f163759c == cVar.f163759c && L.f(this.f163760d, cVar.f163760d) && L.f(this.f163761e, cVar.f163761e) && L.f(this.f163762f, cVar.f163762f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79432j() {
        return 1191571255;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF163067b() {
        return "selectId";
    }

    public final int hashCode() {
        String str = this.f163758b;
        int iHashCode = (this.f163760d.hashCode() + r.i(((-1715996759) + (str == null ? 0 : str.hashCode())) * 31, 31, this.f163759c)) * 31;
        String str2 = this.f163761e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f163762f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormSelectItem(stringId=selectId, parameterId=");
        sb2.append(this.f163758b);
        sb2.append(", isEnabled=");
        sb2.append(this.f163759c);
        sb2.append(", state=");
        sb2.append(this.f163760d);
        sb2.append(", hint=");
        sb2.append(this.f163761e);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f163762f, ')');
    }
}
