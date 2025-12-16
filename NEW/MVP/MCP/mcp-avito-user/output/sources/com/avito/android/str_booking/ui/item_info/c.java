package com.avito.android.str_booking.ui.item_info;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingItemInfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/item_info/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f286078b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f286079c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f286080d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f286081e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f286082f;

    public c(@l String str, @l String str2, @l String str3, @l String str4, @k String str5) {
        this.f286078b = str;
        this.f286079c = str2;
        this.f286080d = str3;
        this.f286081e = str4;
        this.f286082f = str5;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f286078b, cVar.f286078b) && L.f(this.f286079c, cVar.f286079c) && L.f(this.f286080d, cVar.f286080d) && L.f(this.f286081e, cVar.f286081e) && L.f(this.f286082f, cVar.f286082f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF282036b() {
        return getF281166b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281166b() {
        return this.f286082f;
    }

    public final int hashCode() {
        String str = this.f286078b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f286079c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f286080d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f286081e;
        return this.f286082f.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrBookingItemInfoItem(image=");
        sb2.append(this.f286078b);
        sb2.append(", title=");
        sb2.append(this.f286079c);
        sb2.append(", address=");
        sb2.append(this.f286080d);
        sb2.append(", url=");
        sb2.append(this.f286081e);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f286082f, ')');
    }
}
