package com.avito.android.hotel_booking.enter_data.konveyor.text;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: EnterDataTextItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/konveyor/text/c;", "Lcom/avito/conveyor_item/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f163538b;

    public c(@k String str) {
        this.f163538b = str;
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
        return this.f163538b.equals(cVar.f163538b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124070b() {
        return -1370337232;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF272243c() {
        return "enter_data_title_id";
    }

    public final int hashCode() {
        return this.f163538b.hashCode() + 469218768;
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("EnterDataTextItem(stringId=enter_data_title_id, text="), this.f163538b, ')');
    }
}
