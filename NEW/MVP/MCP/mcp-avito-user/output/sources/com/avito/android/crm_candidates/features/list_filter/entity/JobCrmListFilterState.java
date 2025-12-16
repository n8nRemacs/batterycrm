package com.avito.android.crm_candidates.features.list_filter.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmListFilterState.kt */
@d
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/list_filter/entity/JobCrmListFilterState;", "Landroid/os/Parcelable;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JobCrmListFilterState implements Parcelable {

    @k
    public static final Parcelable.Creator<JobCrmListFilterState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f129672b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<JobCrmListFilterItem> f129673c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<JobCrmListFilterItem> f129674d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f129675e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ResetState f129676f;

    /* compiled from: JobCrmListFilterState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmListFilterState> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmListFilterState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(JobCrmListFilterItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iC3 = 0;
            while (iC3 != i13) {
                iC3 = com.avito.android.actions_sheet.a.c(JobCrmListFilterItem.CREATOR, parcel, arrayList2, iC3, 1);
            }
            return new JobCrmListFilterState(string, arrayList, arrayList2, parcel.readInt() != 0, ResetState.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmListFilterState[] newArray(int i12) {
            return new JobCrmListFilterState[i12];
        }
    }

    public JobCrmListFilterState() {
        this(null, null, null, false, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JobCrmListFilterState a(JobCrmListFilterState jobCrmListFilterState, ArrayList arrayList, ArrayList arrayList2, ResetState resetState, int i12) {
        String str = jobCrmListFilterState.f129672b;
        List list = arrayList;
        if ((i12 & 2) != 0) {
            list = jobCrmListFilterState.f129673c;
        }
        List list2 = list;
        boolean z12 = jobCrmListFilterState.f129675e;
        if ((i12 & 16) != 0) {
            resetState = jobCrmListFilterState.f129676f;
        }
        jobCrmListFilterState.getClass();
        return new JobCrmListFilterState(str, list2, arrayList2, z12, resetState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobCrmListFilterState)) {
            return false;
        }
        JobCrmListFilterState jobCrmListFilterState = (JobCrmListFilterState) obj;
        return L.f(this.f129672b, jobCrmListFilterState.f129672b) && L.f(this.f129673c, jobCrmListFilterState.f129673c) && L.f(this.f129674d, jobCrmListFilterState.f129674d) && this.f129675e == jobCrmListFilterState.f129675e && this.f129676f == jobCrmListFilterState.f129676f;
    }

    public final int hashCode() {
        return this.f129676f.hashCode() + r.i(H.e(H.e(this.f129672b.hashCode() * 31, 31, this.f129673c), 31, this.f129674d), 31, this.f129675e);
    }

    @k
    public final String toString() {
        return "JobCrmListFilterState(listId=" + this.f129672b + ", fullList=" + this.f129673c + ", showList=" + this.f129674d + ", isSearchVisible=" + this.f129675e + ", resetState=" + this.f129676f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f129672b);
        Iterator itJ = C0.j(this.f129673c, parcel);
        while (itJ.hasNext()) {
            ((JobCrmListFilterItem) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.f129674d, parcel);
        while (itJ2.hasNext()) {
            ((JobCrmListFilterItem) itJ2.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f129675e ? 1 : 0);
        parcel.writeString(this.f129676f.name());
    }

    public JobCrmListFilterState(@k String str, @k List<JobCrmListFilterItem> list, @k List<JobCrmListFilterItem> list2, boolean z12, @k ResetState resetState) {
        this.f129672b = str;
        this.f129673c = list;
        this.f129674d = list2;
        this.f129675e = z12;
        this.f129676f = resetState;
    }

    public JobCrmListFilterState(String str, List list, List list2, boolean z12, ResetState resetState, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? C42784z0.f406748b : list2, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? ResetState.f129677b : resetState);
    }
}
