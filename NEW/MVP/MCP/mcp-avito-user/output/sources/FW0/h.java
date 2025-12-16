package fW0;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.Action;
import com.avito.user_stats.model.extended_user_stats.ItemValueStats;
import com.avito.user_stats.model.extended_user_stats.MetricGrouping;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfigStatsV2.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\"R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b'\u0010\"R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b(\u0010\"R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b)\u0010\"R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b*\u0010\"R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b.\u0010\"R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b/\u0010\"R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b0\u0010\"R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b1\u0010\"R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b2\u0010\"¨\u00063"}, d2 = {"LfW0/h;", "", "LfW0/r;", "features", "", "LfW0/o;", "categories", "LfW0/m;", "employees", "locations", "developments", "LfW0/x;", "spendings", "spaces", "metrics", "Ljava/util/Date;", "startCalendar", "Lcom/avito/user_stats/model/extended_user_stats/MetricGrouping;", "metricGroupings", "Lcom/avito/user_stats/model/extended_user_stats/ItemValueStats;", "items", "Lcom/avito/android/remote/model/Action;", "actions", "", "metricSuggests", "LfW0/k;", "metricGroupItems", "<init>", "(LfW0/r;Ljava/util/List;LfW0/m;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "LfW0/r;", "d", "()LfW0/r;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LfW0/m;", "c", "()LfW0/m;", "f", "getDevelopments", "l", "k", "j", "Ljava/util/Date;", "m", "()Ljava/util/Date;", "h", "e", "a", "i", "g", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h {

    @com.google.gson.annotations.c("actions")
    @Y61.l
    private final List<Action> actions;

    @com.google.gson.annotations.c("categories")
    @Y61.l
    private final List<o> categories;

    @com.google.gson.annotations.c("developments")
    @Y61.l
    private final List<o> developments;

    @com.google.gson.annotations.c("employees")
    @Y61.l
    private final m employees;

    @com.google.gson.annotations.c("features")
    @Y61.l
    private final r features;

    @com.google.gson.annotations.c("items")
    @Y61.l
    private final List<ItemValueStats> items;

    @com.google.gson.annotations.c("locations")
    @Y61.l
    private final List<o> locations;

    @com.google.gson.annotations.c("metricGroupItems")
    @Y61.l
    private final List<k> metricGroupItems;

    @com.google.gson.annotations.c("metricGroupings")
    @Y61.l
    private final List<MetricGrouping> metricGroupings;

    @com.google.gson.annotations.c("metricSuggests")
    @Y61.l
    private final List<String> metricSuggests;

    @com.google.gson.annotations.c("metrics")
    @Y61.l
    private final List<x> metrics;

    @com.google.gson.annotations.c("spaces")
    @Y61.l
    private final List<x> spaces;

    @com.google.gson.annotations.c("spendings")
    @Y61.l
    private final List<x> spendings;

    @com.google.gson.annotations.c("startCalendar")
    @Y61.k
    private final Date startCalendar;

    public h(@Y61.l r rVar, @Y61.l List<o> list, @Y61.l m mVar, @Y61.l List<o> list2, @Y61.l List<o> list3, @Y61.l List<x> list4, @Y61.l List<x> list5, @Y61.l List<x> list6, @Y61.k Date date, @Y61.l List<MetricGrouping> list7, @Y61.l List<ItemValueStats> list8, @Y61.l List<Action> list9, @Y61.l List<String> list10, @Y61.l List<k> list11) {
        this.features = rVar;
        this.categories = list;
        this.employees = mVar;
        this.locations = list2;
        this.developments = list3;
        this.spendings = list4;
        this.spaces = list5;
        this.metrics = list6;
        this.startCalendar = date;
        this.metricGroupings = list7;
        this.items = list8;
        this.actions = list9;
        this.metricSuggests = list10;
        this.metricGroupItems = list11;
    }

    @Y61.l
    public final List<Action> a() {
        return this.actions;
    }

    @Y61.l
    public final List<o> b() {
        return this.categories;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final m getEmployees() {
        return this.employees;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final r getFeatures() {
        return this.features;
    }

    @Y61.l
    public final List<ItemValueStats> e() {
        return this.items;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.features, hVar.features) && L.f(this.categories, hVar.categories) && L.f(this.employees, hVar.employees) && L.f(this.locations, hVar.locations) && L.f(this.developments, hVar.developments) && L.f(this.spendings, hVar.spendings) && L.f(this.spaces, hVar.spaces) && L.f(this.metrics, hVar.metrics) && L.f(this.startCalendar, hVar.startCalendar) && L.f(this.metricGroupings, hVar.metricGroupings) && L.f(this.items, hVar.items) && L.f(this.actions, hVar.actions) && L.f(this.metricSuggests, hVar.metricSuggests) && L.f(this.metricGroupItems, hVar.metricGroupItems);
    }

    @Y61.l
    public final List<o> f() {
        return this.locations;
    }

    @Y61.l
    public final List<k> g() {
        return this.metricGroupItems;
    }

    @Y61.l
    public final List<MetricGrouping> h() {
        return this.metricGroupings;
    }

    public final int hashCode() {
        r rVar = this.features;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        List<o> list = this.categories;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        m mVar = this.employees;
        int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        List<o> list2 = this.locations;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<o> list3 = this.developments;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<x> list4 = this.spendings;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<x> list5 = this.spaces;
        int iHashCode7 = (iHashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<x> list6 = this.metrics;
        int iF2 = androidx.media3.exoplayer.analytics.m.f(this.startCalendar, (iHashCode7 + (list6 == null ? 0 : list6.hashCode())) * 31, 31);
        List<MetricGrouping> list7 = this.metricGroupings;
        int iHashCode8 = (iF2 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<ItemValueStats> list8 = this.items;
        int iHashCode9 = (iHashCode8 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<Action> list9 = this.actions;
        int iHashCode10 = (iHashCode9 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<String> list10 = this.metricSuggests;
        int iHashCode11 = (iHashCode10 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<k> list11 = this.metricGroupItems;
        return iHashCode11 + (list11 != null ? list11.hashCode() : 0);
    }

    @Y61.l
    public final List<String> i() {
        return this.metricSuggests;
    }

    @Y61.l
    public final List<x> j() {
        return this.metrics;
    }

    @Y61.l
    public final List<x> k() {
        return this.spaces;
    }

    @Y61.l
    public final List<x> l() {
        return this.spendings;
    }

    @Y61.k
    /* renamed from: m, reason: from getter */
    public final Date getStartCalendar() {
        return this.startCalendar;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigStatsV2(features=");
        sb2.append(this.features);
        sb2.append(", categories=");
        sb2.append(this.categories);
        sb2.append(", employees=");
        sb2.append(this.employees);
        sb2.append(", locations=");
        sb2.append(this.locations);
        sb2.append(", developments=");
        sb2.append(this.developments);
        sb2.append(", spendings=");
        sb2.append(this.spendings);
        sb2.append(", spaces=");
        sb2.append(this.spaces);
        sb2.append(", metrics=");
        sb2.append(this.metrics);
        sb2.append(", startCalendar=");
        sb2.append(this.startCalendar);
        sb2.append(", metricGroupings=");
        sb2.append(this.metricGroupings);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", metricSuggests=");
        sb2.append(this.metricSuggests);
        sb2.append(", metricGroupItems=");
        return H.p(sb2, this.metricGroupItems, ')');
    }
}
