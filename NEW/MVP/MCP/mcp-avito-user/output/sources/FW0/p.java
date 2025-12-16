package fW0;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedUserStatsRequest.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"LfW0/p;", "", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "group", "", "categories", "employees", "spendings", "locations", "metrics", "spaces", "itemIDs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "j", "d", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "i", "f", "g", "h", "e", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class p {

    @com.google.gson.annotations.c("categories")
    @Y61.l
    private final List<String> categories;

    @com.google.gson.annotations.c("employees")
    @Y61.l
    private final List<String> employees;

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
    @Y61.l
    private final String from;

    @com.google.gson.annotations.c("group")
    @Y61.l
    private final String group;

    @com.google.gson.annotations.c("itemIDs")
    @Y61.l
    private final List<String> itemIDs;

    @com.google.gson.annotations.c("locations")
    @Y61.l
    private final List<String> locations;

    @com.google.gson.annotations.c("metrics")
    @Y61.l
    private final List<String> metrics;

    @com.google.gson.annotations.c("spaces")
    @Y61.l
    private final List<String> spaces;

    @com.google.gson.annotations.c("spendings")
    @Y61.l
    private final List<String> spendings;

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
    @Y61.l
    private final String to;

    public p() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Y61.l
    public final List<String> a() {
        return this.categories;
    }

    @Y61.l
    public final List<String> b() {
        return this.employees;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    @Y61.l
    public final List<String> e() {
        return this.itemIDs;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.from, pVar.from) && L.f(this.to, pVar.to) && L.f(this.group, pVar.group) && L.f(this.categories, pVar.categories) && L.f(this.employees, pVar.employees) && L.f(this.spendings, pVar.spendings) && L.f(this.locations, pVar.locations) && L.f(this.metrics, pVar.metrics) && L.f(this.spaces, pVar.spaces) && L.f(this.itemIDs, pVar.itemIDs);
    }

    @Y61.l
    public final List<String> f() {
        return this.locations;
    }

    @Y61.l
    public final List<String> g() {
        return this.metrics;
    }

    @Y61.l
    public final List<String> h() {
        return this.spaces;
    }

    public final int hashCode() {
        String str = this.from;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.to;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.group;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.categories;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.employees;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.spendings;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.locations;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.metrics;
        int iHashCode8 = (iHashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.spaces;
        int iHashCode9 = (iHashCode8 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<String> list7 = this.itemIDs;
        return iHashCode9 + (list7 != null ? list7.hashCode() : 0);
    }

    @Y61.l
    public final List<String> i() {
        return this.spendings;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedUserStatsRequest(from=");
        sb2.append(this.from);
        sb2.append(", to=");
        sb2.append(this.to);
        sb2.append(", group=");
        sb2.append(this.group);
        sb2.append(", categories=");
        sb2.append(this.categories);
        sb2.append(", employees=");
        sb2.append(this.employees);
        sb2.append(", spendings=");
        sb2.append(this.spendings);
        sb2.append(", locations=");
        sb2.append(this.locations);
        sb2.append(", metrics=");
        sb2.append(this.metrics);
        sb2.append(", spaces=");
        sb2.append(this.spaces);
        sb2.append(", itemIDs=");
        return H.p(sb2, this.itemIDs, ')');
    }

    public p(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l List<String> list, @Y61.l List<String> list2, @Y61.l List<String> list3, @Y61.l List<String> list4, @Y61.l List<String> list5, @Y61.l List<String> list6, @Y61.l List<String> list7) {
        this.from = str;
        this.to = str2;
        this.group = str3;
        this.categories = list;
        this.employees = list2;
        this.spendings = list3;
        this.locations = list4;
        this.metrics = list5;
        this.spaces = list6;
        this.itemIDs = list7;
    }

    public /* synthetic */ p(String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : list2, (i12 & 32) != 0 ? null : list3, (i12 & 64) != 0 ? null : list4, (i12 & 128) != 0 ? null : list5, (i12 & 256) != 0 ? null : list6, (i12 & 512) == 0 ? list7 : null);
    }
}
