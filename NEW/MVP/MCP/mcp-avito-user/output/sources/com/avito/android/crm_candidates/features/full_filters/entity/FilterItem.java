package com.avito.android.crm_candidates.features.full_filters.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: FilterItem.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/entity/FilterItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "FilterType", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FilterItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<FilterItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f129564b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FilterType f129565c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f129566d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<JobCrmListFilterItem> f129567e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FilterItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/entity/FilterItem$FilterType;", "", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FilterType {

        /* renamed from: b, reason: collision with root package name */
        public static final FilterType f129568b;

        /* renamed from: c, reason: collision with root package name */
        public static final FilterType f129569c;

        /* renamed from: d, reason: collision with root package name */
        public static final FilterType f129570d;

        /* renamed from: e, reason: collision with root package name */
        public static final FilterType f129571e;

        /* renamed from: f, reason: collision with root package name */
        public static final FilterType f129572f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ FilterType[] f129573g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f129574h;

        static {
            FilterType filterType = new FilterType("DATE", 0);
            f129568b = filterType;
            FilterType filterType2 = new FilterType("LIST_SELECT", 1);
            f129569c = filterType2;
            FilterType filterType3 = new FilterType("LIST_MULTISELECT", 2);
            f129570d = filterType3;
            FilterType filterType4 = new FilterType("RANGE", 3);
            f129571e = filterType4;
            FilterType filterType5 = new FilterType("CHIPS", 4);
            f129572f = filterType5;
            FilterType[] filterTypeArr = {filterType, filterType2, filterType3, filterType4, filterType5};
            f129573g = filterTypeArr;
            f129574h = c.a(filterTypeArr);
        }

        public FilterType() {
            throw null;
        }

        public static FilterType valueOf(String str) {
            return (FilterType) Enum.valueOf(FilterType.class, str);
        }

        public static FilterType[] values() {
            return (FilterType[]) f129573g.clone();
        }
    }

    /* compiled from: FilterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FilterItem> {
        @Override // android.os.Parcelable.Creator
        public final FilterItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            FilterType filterTypeValueOf = FilterType.valueOf(parcel.readString());
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(JobCrmListFilterItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new FilterItem(string, filterTypeValueOf, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FilterItem[] newArray(int i12) {
            return new FilterItem[i12];
        }
    }

    public FilterItem(@k String str, @k FilterType filterType, @k String str2, @k List<JobCrmListFilterItem> list) {
        this.f129564b = str;
        this.f129565c = filterType;
        this.f129566d = str2;
        this.f129567e = list;
    }

    public static FilterItem a(FilterItem filterItem, List list) {
        return new FilterItem(filterItem.f129564b, filterItem.f129565c, filterItem.f129566d, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterItem)) {
            return false;
        }
        FilterItem filterItem = (FilterItem) obj;
        return L.f(this.f129564b, filterItem.f129564b) && this.f129565c == filterItem.f129565c && L.f(this.f129566d, filterItem.f129566d) && L.f(this.f129567e, filterItem.f129567e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF106500f() {
        return this.f129564b;
    }

    public final int hashCode() {
        return this.f129567e.hashCode() + H.d((this.f129565c.hashCode() + (this.f129564b.hashCode() * 31)) * 31, 31, this.f129566d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilterItem(stringId=");
        sb2.append(this.f129564b);
        sb2.append(", type=");
        sb2.append(this.f129565c);
        sb2.append(", title=");
        sb2.append(this.f129566d);
        sb2.append(", options=");
        return H.p(sb2, this.f129567e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f129564b);
        parcel.writeString(this.f129565c.name());
        parcel.writeString(this.f129566d);
        Iterator itJ = C0.j(this.f129567e, parcel);
        while (itJ.hasNext()) {
            ((JobCrmListFilterItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
