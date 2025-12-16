package com.avito.android.hotel_booking.select_single_value.konveyor.checkmark;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckmarkItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/select_single_value/konveyor/checkmark/c;", "Lcom/avito/conveyor_item/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f164081b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f164082c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f164083d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f164084e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f164085f;

    public c(@k String str, @l String str2, @l String str3, @l String str4, boolean z12) {
        this.f164081b = str;
        this.f164082c = str2;
        this.f164083d = str3;
        this.f164084e = str4;
        this.f164085f = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f164081b, cVar.f164081b) && L.f(this.f164082c, cVar.f164082c) && L.f(this.f164083d, cVar.f164083d) && L.f(this.f164084e, cVar.f164084e) && this.f164085f == cVar.f164085f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return getF154824b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF163623b() {
        return this.f164081b;
    }

    public final int hashCode() {
        int iHashCode = this.f164081b.hashCode() * 31;
        String str = this.f164082c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f164083d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f164084e;
        return Boolean.hashCode(this.f164085f) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckmarkItem(stringId=");
        sb2.append(this.f164081b);
        sb2.append(", valueId=");
        sb2.append(this.f164082c);
        sb2.append(", title=");
        sb2.append(this.f164083d);
        sb2.append(", subtitle=");
        sb2.append(this.f164084e);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f164085f, ')');
    }
}
