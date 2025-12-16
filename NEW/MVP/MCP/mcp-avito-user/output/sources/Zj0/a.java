package ZJ0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3SellersPrivateStatisticsGeneralConfigPostResponse.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0002\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0002\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b*\u0010\u001fR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b+\u0010\u001fR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b,\u0010\u001fR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b-\u0010\u001fR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b.\u0010\u001fR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b/\u0010\u001fR\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b0\u0010\u001fR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"LZJ0/a;", "", "", "LZJ0/k;", "actions", "LZJ0/m;", "categories", "LZJ0/e;", "employees", "LZJ0/f;", "features", "LZJ0/g;", "groupingPeriods", "LZJ0/h;", "items", "locations", "LZJ0/i;", "metricGroups", "", "metricSuggests", "LZJ0/n;", "spaces", "LZJ0/j;", "spendings", "LZJ0/b;", "splits", "startCalendar", "<init>", "(Ljava/util/List;Ljava/util/List;LZJ0/e;LZJ0/f;LZJ0/g;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "LZJ0/e;", "c", "()LZJ0/e;", "LZJ0/f;", "d", "()LZJ0/f;", "LZJ0/g;", "getGroupingPeriods", "()LZJ0/g;", "e", "f", "g", "h", "i", "j", "k", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    @com.google.gson.annotations.c("actions")
    @Y61.l
    private final List<k> actions;

    @com.google.gson.annotations.c("categories")
    @Y61.k
    private final List<m> categories;

    @com.google.gson.annotations.c("employees")
    @Y61.l
    private final e employees;

    @com.google.gson.annotations.c("features")
    @Y61.k
    private final f features;

    @com.google.gson.annotations.c("groupingPeriods")
    @Y61.l
    private final g groupingPeriods;

    @com.google.gson.annotations.c("items")
    @Y61.l
    private final List<h> items;

    @com.google.gson.annotations.c("locations")
    @Y61.k
    private final List<m> locations;

    @com.google.gson.annotations.c("metricGroups")
    @Y61.l
    private final List<i> metricGroups;

    @com.google.gson.annotations.c("metricSuggests")
    @Y61.l
    private final List<String> metricSuggests;

    @com.google.gson.annotations.c("spaces")
    @Y61.l
    private final List<n> spaces;

    @com.google.gson.annotations.c("spendings")
    @Y61.l
    private final List<j> spendings;

    @com.google.gson.annotations.c("splits")
    @Y61.l
    private final List<b> splits;

    @com.google.gson.annotations.c("startCalendar")
    @Y61.l
    private final String startCalendar;

    public a(@Y61.l List<k> list, @Y61.k List<m> list2, @Y61.l e eVar, @Y61.k f fVar, @Y61.l g gVar, @Y61.l List<h> list3, @Y61.k List<m> list4, @Y61.l List<i> list5, @Y61.l List<String> list6, @Y61.l List<n> list7, @Y61.l List<j> list8, @Y61.l List<b> list9, @Y61.l String str) {
        this.actions = list;
        this.categories = list2;
        this.employees = eVar;
        this.features = fVar;
        this.groupingPeriods = gVar;
        this.items = list3;
        this.locations = list4;
        this.metricGroups = list5;
        this.metricSuggests = list6;
        this.spaces = list7;
        this.spendings = list8;
        this.splits = list9;
        this.startCalendar = str;
    }

    @Y61.l
    public final List<k> a() {
        return this.actions;
    }

    @Y61.k
    public final List<m> b() {
        return this.categories;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final e getEmployees() {
        return this.employees;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final f getFeatures() {
        return this.features;
    }

    @Y61.l
    public final List<h> e() {
        return this.items;
    }

    @Y61.k
    public final List<m> f() {
        return this.locations;
    }

    @Y61.l
    public final List<i> g() {
        return this.metricGroups;
    }

    @Y61.l
    public final List<String> h() {
        return this.metricSuggests;
    }

    @Y61.l
    public final List<n> i() {
        return this.spaces;
    }

    @Y61.l
    public final List<j> j() {
        return this.spendings;
    }

    @Y61.l
    public final List<b> k() {
        return this.splits;
    }

    @Y61.l
    /* renamed from: l, reason: from getter */
    public final String getStartCalendar() {
        return this.startCalendar;
    }
}
