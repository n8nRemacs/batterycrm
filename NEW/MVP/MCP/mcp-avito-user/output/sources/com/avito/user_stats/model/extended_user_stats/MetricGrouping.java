package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfigStatsV2.kt */
@d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/MetricGrouping;", "Landroid/os/Parcelable;", "", "slug", "title", "hint", "Lcom/avito/user_stats/model/extended_user_stats/GroupingSearch;", SingleLineInputModel.STYLE_SEARCH, "Lcom/avito/user_stats/model/extended_user_stats/GroupingSort;", SearchParamsConverterKt.SORT, "Lcom/avito/user_stats/model/extended_user_stats/MetricBadge;", "badge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/user_stats/model/extended_user_stats/GroupingSearch;Lcom/avito/user_stats/model/extended_user_stats/GroupingSort;Lcom/avito/user_stats/model/extended_user_stats/MetricBadge;)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "getTitle", "c", "Lcom/avito/user_stats/model/extended_user_stats/GroupingSearch;", "getSearch", "()Lcom/avito/user_stats/model/extended_user_stats/GroupingSearch;", "Lcom/avito/user_stats/model/extended_user_stats/GroupingSort;", "getSort", "()Lcom/avito/user_stats/model/extended_user_stats/GroupingSort;", "Lcom/avito/user_stats/model/extended_user_stats/MetricBadge;", "getBadge", "()Lcom/avito/user_stats/model/extended_user_stats/MetricBadge;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MetricGrouping implements Parcelable {

    @k
    public static final Parcelable.Creator<MetricGrouping> CREATOR = new a();

    @c("badge")
    @l
    private final MetricBadge badge;

    @c("hint")
    @l
    private final String hint;

    @c(SingleLineInputModel.STYLE_SEARCH)
    @l
    private final GroupingSearch search;

    @c("slug")
    @k
    private final String slug;

    @c(SearchParamsConverterKt.SORT)
    @l
    private final GroupingSort sort;

    @c("title")
    @l
    private final String title;

    /* compiled from: ConfigStatsV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetricGrouping> {
        @Override // android.os.Parcelable.Creator
        public final MetricGrouping createFromParcel(Parcel parcel) {
            return new MetricGrouping(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GroupingSearch.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupingSort.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MetricBadge.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MetricGrouping[] newArray(int i12) {
            return new MetricGrouping[i12];
        }
    }

    public MetricGrouping(@k String str, @l String str2, @l String str3, @l GroupingSearch groupingSearch, @l GroupingSort groupingSort, @l MetricBadge metricBadge) {
        this.slug = str;
        this.title = str2;
        this.hint = str3;
        this.search = groupingSearch;
        this.sort = groupingSort;
        this.badge = metricBadge;
    }

    public static MetricGrouping a(MetricGrouping metricGrouping, String str) {
        return new MetricGrouping(metricGrouping.slug, str, metricGrouping.hint, metricGrouping.search, metricGrouping.sort, metricGrouping.badge);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricGrouping)) {
            return false;
        }
        MetricGrouping metricGrouping = (MetricGrouping) obj;
        return L.f(this.slug, metricGrouping.slug) && L.f(this.title, metricGrouping.title) && L.f(this.hint, metricGrouping.hint) && L.f(this.search, metricGrouping.search) && L.f(this.sort, metricGrouping.sort) && L.f(this.badge, metricGrouping.badge);
    }

    @k
    public final String getSlug() {
        return this.slug;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.slug.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hint;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GroupingSearch groupingSearch = this.search;
        int iHashCode4 = (iHashCode3 + (groupingSearch == null ? 0 : groupingSearch.hashCode())) * 31;
        GroupingSort groupingSort = this.sort;
        int iHashCode5 = (iHashCode4 + (groupingSort == null ? 0 : groupingSort.hashCode())) * 31;
        MetricBadge metricBadge = this.badge;
        return iHashCode5 + (metricBadge != null ? metricBadge.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "MetricGrouping(slug=" + this.slug + ", title=" + this.title + ", hint=" + this.hint + ", search=" + this.search + ", sort=" + this.sort + ", badge=" + this.badge + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.slug);
        parcel.writeString(this.title);
        parcel.writeString(this.hint);
        GroupingSearch groupingSearch = this.search;
        if (groupingSearch == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupingSearch.writeToParcel(parcel, i12);
        }
        GroupingSort groupingSort = this.sort;
        if (groupingSort == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupingSort.writeToParcel(parcel, i12);
        }
        MetricBadge metricBadge = this.badge;
        if (metricBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            metricBadge.writeToParcel(parcel, i12);
        }
    }
}
