package com.avito.android.hotel_booking.konveyor.input;

import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.lib.design.input.FormatterType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormInputItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/input/c;", "Lcom/avito/conveyor_item/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f163671b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f163672c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f163673d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f163674e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FormatterType f163675f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final BookingFormInputState f163676g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f163677h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f163678i;

    public c(@Y61.l String str, @Y61.l String str2, boolean z12, @Y61.l String str3, @Y61.k FormatterType formatterType, @Y61.k BookingFormInputState bookingFormInputState, @Y61.l Integer num, @Y61.l Integer num2) {
        this.f163671b = str;
        this.f163672c = str2;
        this.f163673d = z12;
        this.f163674e = str3;
        this.f163675f = formatterType;
        this.f163676g = bookingFormInputState;
        this.f163677h = num;
        this.f163678i = num2;
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
        return L.f(this.f163671b, cVar.f163671b) && L.f(this.f163672c, cVar.f163672c) && this.f163673d == cVar.f163673d && L.f(this.f163674e, cVar.f163674e) && L.f(this.f163675f, cVar.f163675f) && L.f(this.f163676g, cVar.f163676g) && L.f(this.f163677h, cVar.f163677h) && L.f(this.f163678i, cVar.f163678i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return 1954846341;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF154352b() {
        return "inputId";
    }

    public final int hashCode() {
        String str = this.f163671b;
        int iHashCode = (470694427 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f163672c;
        int i12 = r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f163673d);
        String str3 = this.f163674e;
        int iHashCode2 = (this.f163676g.hashCode() + ((this.f163675f.hashCode() + ((i12 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        Integer num = this.f163677h;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f163678i;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormInputItem(stringId=inputId, parameterId=");
        sb2.append(this.f163671b);
        sb2.append(", value=");
        sb2.append(this.f163672c);
        sb2.append(", isEnabled=");
        sb2.append(this.f163673d);
        sb2.append(", hint=");
        sb2.append(this.f163674e);
        sb2.append(", formatterType=");
        sb2.append(this.f163675f);
        sb2.append(", state=");
        sb2.append(this.f163676g);
        sb2.append(", minLines=");
        sb2.append(this.f163677h);
        sb2.append(", maxLines=");
        return s.j(sb2, this.f163678i, ')');
    }
}
