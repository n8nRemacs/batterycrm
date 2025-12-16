package com.avito.android.hotel_booking.konveyor.checkbox;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormCheckboxItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/checkbox/c;", "Lcom/avito/conveyor_item/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f163631b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f163632c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f163633d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f163634e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f163635f;

    public c(@l String str, @l String str2, boolean z12, @l String str3, boolean z13) {
        this.f163631b = str;
        this.f163632c = z12;
        this.f163633d = z13;
        this.f163634e = str2;
        this.f163635f = str3;
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
        return L.f(this.f163631b, cVar.f163631b) && this.f163632c == cVar.f163632c && this.f163633d == cVar.f163633d && L.f(this.f163634e, cVar.f163634e) && L.f(this.f163635f, cVar.f163635f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF155325b() {
        return -515686338;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF161879b() {
        return "checkboxId";
    }

    public final int hashCode() {
        String str = this.f163631b;
        int i12 = r.i(r.i((1193592706 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f163632c), 31, this.f163633d);
        String str2 = this.f163634e;
        int iHashCode = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f163635f;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormCheckboxItem(stringId=checkboxId, parameterId=");
        sb2.append(this.f163631b);
        sb2.append(", isChecked=");
        sb2.append(this.f163632c);
        sb2.append(", isEnabled=");
        sb2.append(this.f163633d);
        sb2.append(", title=");
        sb2.append(this.f163634e);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f163635f, ')');
    }
}
