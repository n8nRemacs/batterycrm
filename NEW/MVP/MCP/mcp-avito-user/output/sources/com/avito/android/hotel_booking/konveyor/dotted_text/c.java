package com.avito.android.hotel_booking.konveyor.dotted_text;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormDottedTextItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/dotted_text/c;", "Lcom/avito/conveyor_item/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f163652b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f163653c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f163654d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f163655e;

    public c(@k String str, @l String str2, @l AttributedText attributedText, @l AttributedText attributedText2) {
        this.f163652b = str;
        this.f163653c = str2;
        this.f163654d = attributedText;
        this.f163655e = attributedText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f163652b, cVar.f163652b) && L.f(this.f163653c, cVar.f163653c) && L.f(this.f163654d, cVar.f163654d) && L.f(this.f163655e, cVar.f163655e);
    }

    @Override // TV0.a
    public final long getId() {
        return getF131998b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF131998b() {
        return this.f163652b;
    }

    public final int hashCode() {
        int iHashCode = this.f163652b.hashCode() * 31;
        String str = this.f163653c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f163654d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f163655e;
        return iHashCode3 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormDottedTextItem(stringId=");
        sb2.append(this.f163652b);
        sb2.append(", parameterId=");
        sb2.append(this.f163653c);
        sb2.append(", leftText=");
        sb2.append(this.f163654d);
        sb2.append(", rightText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f163655e, ')');
    }
}
