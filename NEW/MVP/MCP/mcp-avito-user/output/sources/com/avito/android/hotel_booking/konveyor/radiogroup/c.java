package com.avito.android.hotel_booking.konveyor.radiogroup;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.hotel.model.HotelBookingRadioGroupItem;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormRadioOptionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/radiogroup/c;", "Lcom/avito/conveyor_item/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f163728b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f163729c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f163730d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final AttributedText f163731e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f163732f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final HotelBookingRadioGroupItem.OptionIcon f163733g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f163734h;

    public c(@Y61.l String str, @Y61.k String str2, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, boolean z12, @Y61.l HotelBookingRadioGroupItem.OptionIcon optionIcon, boolean z13) {
        this.f163728b = str;
        this.f163729c = str2;
        this.f163730d = attributedText;
        this.f163731e = attributedText2;
        this.f163732f = z12;
        this.f163733g = optionIcon;
        this.f163734h = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f163728b, cVar.f163728b) && L.f(this.f163729c, cVar.f163729c) && L.f(this.f163730d, cVar.f163730d) && L.f(this.f163731e, cVar.f163731e) && this.f163732f == cVar.f163732f && L.f(this.f163733g, cVar.f163733g) && this.f163734h == cVar.f163734h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74860b() {
        return -990997109;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF155493b() {
        return "radioOptionId";
    }

    public final int hashCode() {
        String str = this.f163728b;
        int iD2 = H.d(((-656139307) + (str == null ? 0 : str.hashCode())) * 31, 31, this.f163729c);
        AttributedText attributedText = this.f163730d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f163731e;
        int i12 = r.i((iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31, 31, this.f163732f);
        HotelBookingRadioGroupItem.OptionIcon optionIcon = this.f163733g;
        return Boolean.hashCode(this.f163734h) + ((i12 + (optionIcon != null ? optionIcon.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormRadioOptionItem(stringId=radioOptionId, parameterId=");
        sb2.append(this.f163728b);
        sb2.append(", valueId=");
        sb2.append(this.f163729c);
        sb2.append(", title=");
        sb2.append(this.f163730d);
        sb2.append(", description=");
        sb2.append(this.f163731e);
        sb2.append(", showNewBadge=");
        sb2.append(this.f163732f);
        sb2.append(", icon=");
        sb2.append(this.f163733g);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f163734h, ')');
    }
}
