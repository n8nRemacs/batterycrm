package com.avito.android.str_booking.ui.payment_details.divider;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingDividerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/payment_details/divider/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f286125b;

    public c(@k String str) {
        this.f286125b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f286125b, ((c) obj).f286125b);
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
        return this.f286125b;
    }

    public final int hashCode() {
        return this.f286125b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("StrBookingDividerItem(stringId="), this.f286125b, ')');
    }
}
