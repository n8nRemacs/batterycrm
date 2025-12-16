package Uz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.component.accordion.s;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUz0/a;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Uz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C15589a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f16811a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Date f16812b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16813c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Date f16814d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f16815e;

    public C15589a(@k String str, @k Date date, int i12, @l Date date2, @l Integer num) {
        this.f16811a = str;
        this.f16812b = date;
        this.f16813c = i12;
        this.f16814d = date2;
        this.f16815e = num;
    }

    public static C15589a a(C15589a c15589a, Date date, int i12, Date date2, Integer num, int i13) {
        String str = c15589a.f16811a;
        if ((i13 & 2) != 0) {
            date = c15589a.f16812b;
        }
        Date date3 = date;
        if ((i13 & 4) != 0) {
            i12 = c15589a.f16813c;
        }
        int i14 = i12;
        if ((i13 & 8) != 0) {
            date2 = c15589a.f16814d;
        }
        Date date4 = date2;
        if ((i13 & 16) != 0) {
            num = c15589a.f16815e;
        }
        c15589a.getClass();
        return new C15589a(str, date3, i14, date4, num);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15589a)) {
            return false;
        }
        C15589a c15589a = (C15589a) obj;
        return L.f(this.f16811a, c15589a.f16811a) && L.f(this.f16812b, c15589a.f16812b) && this.f16813c == c15589a.f16813c && L.f(this.f16814d, c15589a.f16814d) && L.f(this.f16815e, c15589a.f16815e);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f16813c, m.f(this.f16812b, this.f16811a.hashCode() * 31, 31), 31);
        Date date = this.f16814d;
        int iHashCode = (iE2 + (date == null ? 0 : date.hashCode())) * 31;
        Integer num = this.f16815e;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedDateRangeState(itemId=");
        sb2.append(this.f16811a);
        sb2.append(", startDate=");
        sb2.append(this.f16812b);
        sb2.append(", startDateCacheIndex=");
        sb2.append(this.f16813c);
        sb2.append(", endDate=");
        sb2.append(this.f16814d);
        sb2.append(", endDateCacheIndex=");
        return s.j(sb2, this.f16815e, ')');
    }
}
