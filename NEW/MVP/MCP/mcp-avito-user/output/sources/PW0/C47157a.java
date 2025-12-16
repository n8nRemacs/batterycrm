package pw0;

import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.select.Arguments;
import com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.GuestCountOption;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/a;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47157a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Date f428847a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Date f428848b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f428849c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final GuestCountOption f428850d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Arguments f428851e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final C47160d f428852f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f428853g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final DeepLink f428854h;

    public C47157a(@Y61.l Date date, @Y61.l Date date2, @Y61.l String str, @Y61.l GuestCountOption guestCountOption, @Y61.l Arguments arguments, @Y61.l C47160d c47160d, boolean z12, @Y61.l DeepLink deepLink) {
        this.f428847a = date;
        this.f428848b = date2;
        this.f428849c = str;
        this.f428850d = guestCountOption;
        this.f428851e = arguments;
        this.f428852f = c47160d;
        this.f428853g = z12;
        this.f428854h = deepLink;
    }

    public static C47157a a(C47157a c47157a, Date date, Date date2, GuestCountOption guestCountOption, Arguments arguments, C47160d c47160d, DeepLink deepLink, int i12) {
        Date date3 = (i12 & 1) != 0 ? c47157a.f428847a : date;
        Date date4 = (i12 & 2) != 0 ? c47157a.f428848b : date2;
        String str = c47157a.f428849c;
        GuestCountOption guestCountOption2 = (i12 & 8) != 0 ? c47157a.f428850d : guestCountOption;
        Arguments arguments2 = (i12 & 16) != 0 ? c47157a.f428851e : arguments;
        C47160d c47160d2 = (i12 & 32) != 0 ? c47157a.f428852f : c47160d;
        boolean z12 = c47157a.f428853g;
        DeepLink deepLink2 = (i12 & 128) != 0 ? c47157a.f428854h : deepLink;
        c47157a.getClass();
        return new C47157a(date3, date4, str, guestCountOption2, arguments2, c47160d2, z12, deepLink2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47157a)) {
            return false;
        }
        C47157a c47157a = (C47157a) obj;
        return L.f(this.f428847a, c47157a.f428847a) && L.f(this.f428848b, c47157a.f428848b) && L.f(this.f428849c, c47157a.f428849c) && L.f(this.f428850d, c47157a.f428850d) && L.f(this.f428851e, c47157a.f428851e) && L.f(this.f428852f, c47157a.f428852f) && this.f428853g == c47157a.f428853g && L.f(this.f428854h, c47157a.f428854h);
    }

    public final int hashCode() {
        Date date = this.f428847a;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.f428848b;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.f428849c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        GuestCountOption guestCountOption = this.f428850d;
        int iHashCode4 = (iHashCode3 + (guestCountOption == null ? 0 : guestCountOption.hashCode())) * 31;
        Arguments arguments = this.f428851e;
        int iHashCode5 = (iHashCode4 + (arguments == null ? 0 : arguments.hashCode())) * 31;
        C47160d c47160d = this.f428852f;
        int i12 = r.i((iHashCode5 + (c47160d == null ? 0 : c47160d.hashCode())) * 31, 31, this.f428853g);
        DeepLink deepLink = this.f428854h;
        return i12 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingData(checkInDate=");
        sb2.append(this.f428847a);
        sb2.append(", checkOutDate=");
        sb2.append(this.f428848b);
        sb2.append(", advertId=");
        sb2.append(this.f428849c);
        sb2.append(", guestCountOption=");
        sb2.append(this.f428850d);
        sb2.append(", guestsCountsArguments=");
        sb2.append(this.f428851e);
        sb2.append(", guestsDetailed=");
        sb2.append(this.f428852f);
        sb2.append(", withChildren=");
        sb2.append(this.f428853g);
        sb2.append(", dateRangeDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f428854h, ')');
    }
}
