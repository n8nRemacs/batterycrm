package NP0;

import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.widget_filters.remote.model.widgets.DateParam;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DatesRangeParameter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/g;", "LNP0/t;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class g implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f11444a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11445b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11446c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11447d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f11448e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DateParam f11449f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final DateParam f11450g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final SelectedDateRange f11451h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Date f11452i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Date f11453j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11454k;

    public g(@Y61.l String str, boolean z12, boolean z13, boolean z14, @Y61.l String str2, @Y61.l DateParam dateParam, @Y61.l DateParam dateParam2, @Y61.l SelectedDateRange selectedDateRange, @Y61.l Date date, @Y61.l Date date2, boolean z15) {
        this.f11444a = str;
        this.f11445b = z12;
        this.f11446c = z13;
        this.f11447d = z14;
        this.f11448e = str2;
        this.f11449f = dateParam;
        this.f11450g = dateParam2;
        this.f11451h = selectedDateRange;
        this.f11452i = date;
        this.f11453j = date2;
        this.f11454k = z15;
    }

    public static g a(g gVar, SelectedDateRange selectedDateRange) {
        String str = gVar.f11444a;
        boolean z12 = gVar.f11445b;
        boolean z13 = gVar.f11446c;
        boolean z14 = gVar.f11447d;
        String str2 = gVar.f11448e;
        DateParam dateParam = gVar.f11449f;
        DateParam dateParam2 = gVar.f11450g;
        Date date = gVar.f11452i;
        Date date2 = gVar.f11453j;
        boolean z15 = gVar.f11454k;
        gVar.getClass();
        return new g(str, z12, z13, z14, str2, dateParam, dateParam2, selectedDateRange, date, date2, z15);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f11444a, gVar.f11444a) && this.f11445b == gVar.f11445b && this.f11446c == gVar.f11446c && this.f11447d == gVar.f11447d && L.f(this.f11448e, gVar.f11448e) && L.f(this.f11449f, gVar.f11449f) && L.f(this.f11450g, gVar.f11450g) && L.f(this.f11451h, gVar.f11451h) && L.f(this.f11452i, gVar.f11452i) && L.f(this.f11453j, gVar.f11453j) && this.f11454k == gVar.f11454k;
    }

    public final int hashCode() {
        String str = this.f11444a;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f11445b), 31, this.f11446c), 31, this.f11447d);
        String str2 = this.f11448e;
        int iHashCode = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateParam dateParam = this.f11449f;
        int iHashCode2 = (iHashCode + (dateParam == null ? 0 : dateParam.hashCode())) * 31;
        DateParam dateParam2 = this.f11450g;
        int iHashCode3 = (iHashCode2 + (dateParam2 == null ? 0 : dateParam2.hashCode())) * 31;
        SelectedDateRange selectedDateRange = this.f11451h;
        int iHashCode4 = (iHashCode3 + (selectedDateRange == null ? 0 : selectedDateRange.hashCode())) * 31;
        Date date = this.f11452i;
        int iHashCode5 = (iHashCode4 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f11453j;
        return Boolean.hashCode(this.f11454k) + ((iHashCode5 + (date2 != null ? date2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DatesRangeParameter(id=");
        sb2.append(this.f11444a);
        sb2.append(", isRequired=");
        sb2.append(this.f11445b);
        sb2.append(", updatesForm=");
        sb2.append(this.f11446c);
        sb2.append(", isVisible=");
        sb2.append(this.f11447d);
        sb2.append(", notSelectedErrorText=");
        sb2.append(this.f11448e);
        sb2.append(", checkInParam=");
        sb2.append(this.f11449f);
        sb2.append(", checkOutParam=");
        sb2.append(this.f11450g);
        sb2.append(", selectedDateRange=");
        sb2.append(this.f11451h);
        sb2.append(", firstAvailableDate=");
        sb2.append(this.f11452i);
        sb2.append(", lastAvailableDate=");
        sb2.append(this.f11453j);
        sb2.append(", canSelectSingleDay=");
        return androidx.appcompat.app.r.x(sb2, this.f11454k, ')');
    }
}
