package I91;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f8028a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8029b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8030c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8031d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8032e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8033f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f8034g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8035h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8036i;

    /* renamed from: j, reason: collision with root package name */
    public final String f8037j;

    public d(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9) {
        this.f8028a = str;
        this.f8029b = str2;
        this.f8030c = str3;
        this.f8031d = str4;
        this.f8032e = str5;
        this.f8033f = str6;
        this.f8034g = num;
        this.f8035h = str7;
        this.f8036i = str8;
        this.f8037j = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f8028a, dVar.f8028a) && L.f(this.f8029b, dVar.f8029b) && L.f(this.f8030c, dVar.f8030c) && L.f(this.f8031d, dVar.f8031d) && L.f(this.f8032e, dVar.f8032e) && L.f(this.f8033f, dVar.f8033f) && L.f(this.f8034g, dVar.f8034g) && L.f(this.f8035h, dVar.f8035h) && L.f(this.f8036i, dVar.f8036i) && L.f(this.f8037j, dVar.f8037j);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f8028a.hashCode() * 31, 31, this.f8029b);
        String str = this.f8030c;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8031d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8032e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f8033f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f8034g;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f8035h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f8036i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f8037j;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UiAddressItem(shortAddress=");
        sb2.append(this.f8028a);
        sb2.append(", fullAddress=");
        sb2.append(this.f8029b);
        sb2.append(", city=");
        sb2.append(this.f8030c);
        sb2.append(", district=");
        sb2.append(this.f8031d);
        sb2.append(", house=");
        sb2.append(this.f8032e);
        sb2.append(", block=");
        sb2.append(this.f8033f);
        sb2.append(", index=");
        sb2.append(this.f8034g);
        sb2.append(", numberFlat=");
        sb2.append(this.f8035h);
        sb2.append(", region=");
        sb2.append(this.f8036i);
        sb2.append(", street=");
        return C22026a.c(sb2, this.f8037j, ')');
    }
}
