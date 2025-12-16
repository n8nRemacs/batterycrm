package pw0;

import androidx.compose.foundation.H;
import com.avito.android.short_term_rent.common.entity.GuestsDetailedValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BookingData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/d;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pw0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47160d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f428863a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f428864b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final GuestsDetailedValue f428865c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f428866d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f428867e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f428868f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f428869g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final List<e> f428870h;

    public C47160d() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47160d)) {
            return false;
        }
        C47160d c47160d = (C47160d) obj;
        return L.f(this.f428863a, c47160d.f428863a) && L.f(this.f428864b, c47160d.f428864b) && L.f(this.f428865c, c47160d.f428865c) && L.f(this.f428866d, c47160d.f428866d) && L.f(this.f428867e, c47160d.f428867e) && L.f(this.f428868f, c47160d.f428868f) && L.f(this.f428869g, c47160d.f428869g) && L.f(this.f428870h, c47160d.f428870h);
    }

    public final int hashCode() {
        String str = this.f428863a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f428864b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        GuestsDetailedValue guestsDetailedValue = this.f428865c;
        int iHashCode3 = (iHashCode2 + (guestsDetailedValue == null ? 0 : guestsDetailedValue.hashCode())) * 31;
        String str3 = this.f428866d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f428867e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f428868f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f428869g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<e> list = this.f428870h;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsDetailed(displayTitle=");
        sb2.append(this.f428863a);
        sb2.append(", placeholder=");
        sb2.append(this.f428864b);
        sb2.append(", value=");
        sb2.append(this.f428865c);
        sb2.append(", title=");
        sb2.append(this.f428866d);
        sb2.append(", maxGuestsCount=");
        sb2.append(this.f428867e);
        sb2.append(", minGuestsCount=");
        sb2.append(this.f428868f);
        sb2.append(", buttonTitle=");
        sb2.append(this.f428869g);
        sb2.append(", ages=");
        return H.p(sb2, this.f428870h, ')');
    }

    public C47160d(@Y61.l String str, @Y61.l String str2, @Y61.l GuestsDetailedValue guestsDetailedValue, @Y61.l String str3, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l String str4, @Y61.l List<e> list) {
        this.f428863a = str;
        this.f428864b = str2;
        this.f428865c = guestsDetailedValue;
        this.f428866d = str3;
        this.f428867e = num;
        this.f428868f = num2;
        this.f428869g = str4;
        this.f428870h = list;
    }

    public /* synthetic */ C47160d(String str, String str2, GuestsDetailedValue guestsDetailedValue, String str3, Integer num, Integer num2, String str4, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : guestsDetailedValue, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? null : num2, (i12 & 64) != 0 ? null : str4, (i12 & 128) == 0 ? list : null);
    }
}
