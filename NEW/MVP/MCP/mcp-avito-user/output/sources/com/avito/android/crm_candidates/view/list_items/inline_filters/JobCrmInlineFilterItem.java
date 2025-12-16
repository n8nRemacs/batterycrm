package com.avito.android.crm_candidates.view.list_items.inline_filters;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmInlineFilterItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/inline_filters/JobCrmInlineFilterItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "FilterType", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JobCrmInlineFilterItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<JobCrmInlineFilterItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f130103b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FilterType f130104c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f130105d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f130106e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f130107f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JobCrmInlineFilterItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/inline_filters/JobCrmInlineFilterItem$FilterType;", "", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FilterType {

        /* renamed from: c, reason: collision with root package name */
        public static final FilterType f130108c;

        /* renamed from: d, reason: collision with root package name */
        public static final FilterType f130109d;

        /* renamed from: e, reason: collision with root package name */
        public static final FilterType f130110e;

        /* renamed from: f, reason: collision with root package name */
        public static final FilterType f130111f;

        /* renamed from: g, reason: collision with root package name */
        public static final FilterType f130112g;

        /* renamed from: h, reason: collision with root package name */
        public static final FilterType f130113h;

        /* renamed from: i, reason: collision with root package name */
        public static final FilterType f130114i;

        /* renamed from: j, reason: collision with root package name */
        public static final FilterType f130115j;

        /* renamed from: k, reason: collision with root package name */
        public static final FilterType f130116k;

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ FilterType[] f130117l;

        /* renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f130118m;

        /* renamed from: b, reason: collision with root package name */
        public final int f130119b;

        static {
            FilterType filterType = new FilterType("STATUS", 0, 1);
            f130108c = filterType;
            FilterType filterType2 = new FilterType("DATE", 1, 2);
            f130109d = filterType2;
            FilterType filterType3 = new FilterType("LOCATION", 2, 3);
            f130110e = filterType3;
            FilterType filterType4 = new FilterType("VACANCY", 3, 4);
            f130111f = filterType4;
            FilterType filterType5 = new FilterType("APPLICATION_STATUS", 4, 5);
            f130112g = filterType5;
            FilterType filterType6 = new FilterType("EMPLOYEE", 5, 6);
            f130113h = filterType6;
            FilterType filterType7 = new FilterType("AGE", 6, 7);
            FilterType filterType8 = new FilterType("GENDER", 7, 8);
            f130114i = filterType8;
            FilterType filterType9 = new FilterType("BOOLEAN", 8, 9);
            f130115j = filterType9;
            FilterType filterType10 = new FilterType("ALL_FILTERS", 9, 10);
            f130116k = filterType10;
            FilterType[] filterTypeArr = {filterType, filterType2, filterType3, filterType4, filterType5, filterType6, filterType7, filterType8, filterType9, filterType10};
            f130117l = filterTypeArr;
            f130118m = kotlin.enums.c.a(filterTypeArr);
        }

        public FilterType(String str, int i12, int i13) {
            this.f130119b = i13;
        }

        public static FilterType valueOf(String str) {
            return (FilterType) Enum.valueOf(FilterType.class, str);
        }

        public static FilterType[] values() {
            return (FilterType[]) f130117l.clone();
        }
    }

    /* compiled from: JobCrmInlineFilterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmInlineFilterItem> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmInlineFilterItem createFromParcel(Parcel parcel) {
            return new JobCrmInlineFilterItem(parcel.readString(), FilterType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmInlineFilterItem[] newArray(int i12) {
            return new JobCrmInlineFilterItem[i12];
        }
    }

    public JobCrmInlineFilterItem(@Y61.k String str, @Y61.k FilterType filterType, @Y61.k String str2, boolean z12, @Y61.k String str3) {
        this.f130103b = str;
        this.f130104c = filterType;
        this.f130105d = str2;
        this.f130106e = z12;
        this.f130107f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobCrmInlineFilterItem)) {
            return false;
        }
        JobCrmInlineFilterItem jobCrmInlineFilterItem = (JobCrmInlineFilterItem) obj;
        return L.f(this.f130103b, jobCrmInlineFilterItem.f130103b) && this.f130104c == jobCrmInlineFilterItem.f130104c && L.f(this.f130105d, jobCrmInlineFilterItem.f130105d) && this.f130106e == jobCrmInlineFilterItem.f130106e && L.f(this.f130107f, jobCrmInlineFilterItem.f130107f);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF300304b() {
        return this.f130103b;
    }

    public final int hashCode() {
        return this.f130107f.hashCode() + r.i(H.d((this.f130104c.hashCode() + (this.f130103b.hashCode() * 31)) * 31, 31, this.f130105d), 31, this.f130106e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCrmInlineFilterItem(stringId=");
        sb2.append(this.f130103b);
        sb2.append(", type=");
        sb2.append(this.f130104c);
        sb2.append(", title=");
        sb2.append(this.f130105d);
        sb2.append(", isSelected=");
        sb2.append(this.f130106e);
        sb2.append(", bottomSheetTitle=");
        return C22026a.c(sb2, this.f130107f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f130103b);
        parcel.writeString(this.f130104c.name());
        parcel.writeString(this.f130105d);
        parcel.writeInt(this.f130106e ? 1 : 0);
        parcel.writeString(this.f130107f);
    }
}
