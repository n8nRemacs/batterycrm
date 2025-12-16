package com.avito.android.hotel_booking.select_radio.konveyor.radio;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.hotel_booking.Insight;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectRadioItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/konveyor/radio/c;", "Lcom/avito/conveyor_item/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f164006b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f164007c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f164008d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<Insight> f164009e;

    public c(@k String str, @l String str2, boolean z12, @l List<Insight> list) {
        this.f164006b = str;
        this.f164007c = str2;
        this.f164008d = z12;
        this.f164009e = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f164006b, cVar.f164006b) && L.f(this.f164007c, cVar.f164007c) && this.f164008d == cVar.f164008d && L.f(this.f164009e, cVar.f164009e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return getF73320d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF73320d() {
        return this.f164006b;
    }

    public final int hashCode() {
        int iHashCode = this.f164006b.hashCode() * 31;
        String str = this.f164007c;
        int i12 = r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f164008d);
        List<Insight> list = this.f164009e;
        return i12 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectRadioItem(stringId=");
        sb2.append(this.f164006b);
        sb2.append(", radioId=");
        sb2.append(this.f164007c);
        sb2.append(", isSelected=");
        sb2.append(this.f164008d);
        sb2.append(", insights=");
        return H.p(sb2, this.f164009e, ')');
    }
}
