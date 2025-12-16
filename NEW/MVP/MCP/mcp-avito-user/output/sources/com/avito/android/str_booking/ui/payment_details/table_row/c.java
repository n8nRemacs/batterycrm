package com.avito.android.str_booking.ui.payment_details.table_row;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingPaymentItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/payment_details/table_row/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<AttributedText> f286131b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f286132c;

    public c(@k List<AttributedText> list, @k String str) {
        this.f286131b = list;
        this.f286132c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f286131b, cVar.f286131b) && L.f(this.f286132c, cVar.f286132c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF286000c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF286000c() {
        return this.f286132c;
    }

    public final int hashCode() {
        return this.f286132c.hashCode() + (this.f286131b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrBookingPaymentItem(content=");
        sb2.append(this.f286131b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f286132c, ')');
    }
}
