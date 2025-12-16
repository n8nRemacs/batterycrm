package com.avito.android.hotel_booking.konveyor.offer;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormOfferItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/offer/c;", "Lcom/avito/conveyor_item/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f163718b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f163719c;

    public c(@l Image image, @l AttributedText attributedText) {
        this.f163718b = image;
        this.f163719c = attributedText;
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
        return L.f(this.f163718b, cVar.f163718b) && L.f(this.f163719c, cVar.f163719c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268422b() {
        return -1548813161;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF84571b() {
        return "offerId";
    }

    public final int hashCode() {
        Image image = this.f163718b;
        int iHashCode = ((-768567735) + (image == null ? 0 : image.hashCode())) * 31;
        AttributedText attributedText = this.f163719c;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormOfferItem(stringId=offerId, image=");
        sb2.append(this.f163718b);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f163719c, ')');
    }
}
