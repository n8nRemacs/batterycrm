package Sz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarDayInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSz0/b;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C15273b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15237a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15238b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC15272a f15239c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f15240d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f15241e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f15242f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15243g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15244h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15245i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Date f15246j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f15247k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final InterfaceC15275d f15248l;

    public C15273b(@k String str, @k String str2, @k InterfaceC15272a interfaceC15272a, @k String str3, @l String str4, @l Integer num, boolean z12, boolean z13, boolean z14, @l Date date, boolean z15, @k InterfaceC15275d interfaceC15275d) {
        this.f15237a = str;
        this.f15238b = str2;
        this.f15239c = interfaceC15272a;
        this.f15240d = str3;
        this.f15241e = str4;
        this.f15242f = num;
        this.f15243g = z12;
        this.f15244h = z13;
        this.f15245i = z14;
        this.f15246j = date;
        this.f15247k = z15;
        this.f15248l = interfaceC15275d;
    }

    public static C15273b a(C15273b c15273b, InterfaceC15272a interfaceC15272a, String str, String str2, Integer num, boolean z12, boolean z13, boolean z14, boolean z15, int i12) {
        String str3 = c15273b.f15237a;
        String str4 = c15273b.f15238b;
        InterfaceC15272a interfaceC15272a2 = (i12 & 4) != 0 ? c15273b.f15239c : interfaceC15272a;
        String str5 = (i12 & 8) != 0 ? c15273b.f15240d : str;
        String str6 = (i12 & 16) != 0 ? c15273b.f15241e : str2;
        Integer num2 = (i12 & 32) != 0 ? c15273b.f15242f : num;
        boolean z16 = (i12 & 64) != 0 ? c15273b.f15243g : z12;
        boolean z17 = (i12 & 128) != 0 ? c15273b.f15244h : z13;
        boolean z18 = (i12 & 256) != 0 ? c15273b.f15245i : z14;
        Date date = c15273b.f15246j;
        boolean z19 = (i12 & 1024) != 0 ? c15273b.f15247k : z15;
        InterfaceC15275d interfaceC15275d = c15273b.f15248l;
        c15273b.getClass();
        return new C15273b(str3, str4, interfaceC15272a2, str5, str6, num2, z16, z17, z18, date, z19, interfaceC15275d);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15273b)) {
            return false;
        }
        C15273b c15273b = (C15273b) obj;
        return L.f(this.f15237a, c15273b.f15237a) && L.f(this.f15238b, c15273b.f15238b) && L.f(this.f15239c, c15273b.f15239c) && L.f(this.f15240d, c15273b.f15240d) && L.f(this.f15241e, c15273b.f15241e) && L.f(this.f15242f, c15273b.f15242f) && this.f15243g == c15273b.f15243g && this.f15244h == c15273b.f15244h && this.f15245i == c15273b.f15245i && L.f(this.f15246j, c15273b.f15246j) && this.f15247k == c15273b.f15247k && L.f(this.f15248l, c15273b.f15248l);
    }

    public final int hashCode() {
        int iD2 = H.d((this.f15239c.hashCode() + H.d(this.f15237a.hashCode() * 31, 31, this.f15238b)) * 31, 31, this.f15240d);
        String str = this.f15241e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f15242f;
        int i12 = r.i(r.i(r.i((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f15243g), 31, this.f15244h), 31, this.f15245i);
        Date date = this.f15246j;
        return this.f15248l.hashCode() + r.i((i12 + (date != null ? date.hashCode() : 0)) * 31, 31, this.f15247k);
    }

    @k
    public final String toString() {
        return "CalendarDayInfoRedesign(id=" + this.f15237a + ", itemId=" + this.f15238b + ", availabilityType=" + this.f15239c + ", mainPrice=" + this.f15240d + ", secondaryPrice=" + this.f15241e + ", minNights=" + this.f15242f + ", hasInstantBooking=" + this.f15243g + ", hasLastMinuteOffer=" + this.f15244h + ", hasPromo=" + this.f15245i + ", date=" + this.f15246j + ", isSelected=" + this.f15247k + ", tagType=" + this.f15248l + ')';
    }
}
