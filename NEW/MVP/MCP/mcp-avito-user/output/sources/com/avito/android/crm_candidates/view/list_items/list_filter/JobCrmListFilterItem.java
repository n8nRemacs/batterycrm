package com.avito.android.crm_candidates.view.list_items.list_filter;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.crm_candidates.domain.DateInterval;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmListFilterItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/list_filter/JobCrmListFilterItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JobCrmListFilterItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<JobCrmListFilterItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f130136b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f130137c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f130138d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f130139e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f130140f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f130141g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DateInterval f130142h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Q<Long, Long> f130143i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f130144j;

    /* compiled from: JobCrmListFilterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmListFilterItem> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmListFilterItem createFromParcel(Parcel parcel) {
            return new JobCrmListFilterItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (DateInterval) parcel.readParcelable(JobCrmListFilterItem.class.getClassLoader()), (Q) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmListFilterItem[] newArray(int i12) {
            return new JobCrmListFilterItem[i12];
        }
    }

    public JobCrmListFilterItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, boolean z13, boolean z14, @l DateInterval dateInterval, @l Q<Long, Long> q12, @Y61.k String str4) {
        this.f130136b = str;
        this.f130137c = str2;
        this.f130138d = str3;
        this.f130139e = z12;
        this.f130140f = z13;
        this.f130141g = z14;
        this.f130142h = dateInterval;
        this.f130143i = q12;
        this.f130144j = str4;
    }

    public static JobCrmListFilterItem a(JobCrmListFilterItem jobCrmListFilterItem, boolean z12, DateInterval dateInterval, Q q12, int i12) {
        String str = jobCrmListFilterItem.f130136b;
        String str2 = jobCrmListFilterItem.f130137c;
        String str3 = jobCrmListFilterItem.f130138d;
        boolean z13 = jobCrmListFilterItem.f130140f;
        boolean z14 = jobCrmListFilterItem.f130141g;
        if ((i12 & 64) != 0) {
            dateInterval = jobCrmListFilterItem.f130142h;
        }
        DateInterval dateInterval2 = dateInterval;
        if ((i12 & 128) != 0) {
            q12 = jobCrmListFilterItem.f130143i;
        }
        String str4 = jobCrmListFilterItem.f130144j;
        jobCrmListFilterItem.getClass();
        return new JobCrmListFilterItem(str, str2, str3, z12, z13, z14, dateInterval2, q12, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobCrmListFilterItem)) {
            return false;
        }
        JobCrmListFilterItem jobCrmListFilterItem = (JobCrmListFilterItem) obj;
        return L.f(this.f130136b, jobCrmListFilterItem.f130136b) && L.f(this.f130137c, jobCrmListFilterItem.f130137c) && L.f(this.f130138d, jobCrmListFilterItem.f130138d) && this.f130139e == jobCrmListFilterItem.f130139e && this.f130140f == jobCrmListFilterItem.f130140f && this.f130141g == jobCrmListFilterItem.f130141g && L.f(this.f130142h, jobCrmListFilterItem.f130142h) && L.f(this.f130143i, jobCrmListFilterItem.f130143i) && L.f(this.f130144j, jobCrmListFilterItem.f130144j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF259043b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF321049b() {
        return this.f130144j;
    }

    public final int hashCode() {
        int i12 = r.i(r.i(r.i(H.d(H.d(this.f130136b.hashCode() * 31, 31, this.f130137c), 31, this.f130138d), 31, this.f130139e), 31, this.f130140f), 31, this.f130141g);
        DateInterval dateInterval = this.f130142h;
        int iHashCode = (i12 + (dateInterval == null ? 0 : dateInterval.hashCode())) * 31;
        Q<Long, Long> q12 = this.f130143i;
        return this.f130144j.hashCode() + ((iHashCode + (q12 != null ? q12.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCrmListFilterItem(title=");
        sb2.append(this.f130136b);
        sb2.append(", description=");
        sb2.append(this.f130137c);
        sb2.append(", counter=");
        sb2.append(this.f130138d);
        sb2.append(", isSelected=");
        sb2.append(this.f130139e);
        sb2.append(", isMultiSelect=");
        sb2.append(this.f130140f);
        sb2.append(", hasAction=");
        sb2.append(this.f130141g);
        sb2.append(", dateInterval=");
        sb2.append(this.f130142h);
        sb2.append(", range=");
        sb2.append(this.f130143i);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f130144j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f130136b);
        parcel.writeString(this.f130137c);
        parcel.writeString(this.f130138d);
        parcel.writeInt(this.f130139e ? 1 : 0);
        parcel.writeInt(this.f130140f ? 1 : 0);
        parcel.writeInt(this.f130141g ? 1 : 0);
        parcel.writeParcelable(this.f130142h, i12);
        parcel.writeSerializable(this.f130143i);
        parcel.writeString(this.f130144j);
    }

    public /* synthetic */ JobCrmListFilterItem(String str, String str2, String str3, boolean z12, boolean z13, boolean z14, DateInterval dateInterval, Q q12, String str4, int i12, C42822w c42822w) {
        this(str, str2, str3, z12, z13, z14, dateInterval, (i12 & 128) != 0 ? null : q12, str4);
    }
}
