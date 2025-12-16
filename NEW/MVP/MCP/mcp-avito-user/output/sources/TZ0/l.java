package Tz0;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarBookingsResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTz0/l;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f16068a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f16069b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16070c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16071d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f16072e;

    public l(@Y61.k String str, @Y61.k String str2, boolean z12, int i12, @Y61.k UniversalColor universalColor) {
        this.f16068a = str;
        this.f16069b = str2;
        this.f16070c = z12;
        this.f16071d = i12;
        this.f16072e = universalColor;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f16068a, lVar.f16068a) && L.f(this.f16069b, lVar.f16069b) && this.f16070c == lVar.f16070c && this.f16071d == lVar.f16071d && L.f(this.f16072e, lVar.f16072e);
    }

    public final int hashCode() {
        return this.f16072e.hashCode() + r.e(this.f16071d, r.i(H.d(this.f16068a.hashCode() * 31, 31, this.f16069b), 31, this.f16070c), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersCalendarTagInfo(title=");
        sb2.append(this.f16068a);
        sb2.append(", subtitle=");
        sb2.append(this.f16069b);
        sb2.append(", areTextColorsInverse=");
        sb2.append(this.f16070c);
        sb2.append(", actionCount=");
        sb2.append(this.f16071d);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f16072e, ')');
    }
}
