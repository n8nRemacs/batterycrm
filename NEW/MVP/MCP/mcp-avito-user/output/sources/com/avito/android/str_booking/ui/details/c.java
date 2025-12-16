package com.avito.android.str_booking.ui.details;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.str_booking.network.models.sections.DetailsContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingDetailsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/details/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DetailsContent f285999b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f286000c;

    public c(@k String str, @l DetailsContent detailsContent) {
        this.f285999b = detailsContent;
        this.f286000c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f285999b, cVar.f285999b) && L.f(this.f286000c, cVar.f286000c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF284782b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF284782b() {
        return this.f286000c;
    }

    public final int hashCode() {
        DetailsContent detailsContent = this.f285999b;
        return this.f286000c.hashCode() + ((detailsContent == null ? 0 : detailsContent.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrBookingDetailsItem(detailsContent=");
        sb2.append(this.f285999b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f286000c, ')');
    }
}
