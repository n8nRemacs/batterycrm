package com.avito.android.crm_candidates.view.list_items.applications_list.loading_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmLoadingItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/loading_item/JobCrmLoadingItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JobCrmLoadingItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<JobCrmLoadingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f130081b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f130082c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f130083d;

    /* compiled from: JobCrmLoadingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmLoadingItem> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmLoadingItem createFromParcel(Parcel parcel) {
            return new JobCrmLoadingItem(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmLoadingItem[] newArray(int i12) {
            return new JobCrmLoadingItem[i12];
        }
    }

    public JobCrmLoadingItem(@k String str, boolean z12, @k String str2) {
        this.f130081b = str;
        this.f130082c = z12;
        this.f130083d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobCrmLoadingItem)) {
            return false;
        }
        JobCrmLoadingItem jobCrmLoadingItem = (JobCrmLoadingItem) obj;
        return L.f(this.f130081b, jobCrmLoadingItem.f130081b) && this.f130082c == jobCrmLoadingItem.f130082c && L.f(this.f130083d, jobCrmLoadingItem.f130083d);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF113720c() {
        return this.f130083d;
    }

    public final int hashCode() {
        return this.f130083d.hashCode() + r.i(this.f130081b.hashCode() * 31, 31, this.f130082c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCrmLoadingItem(lastHashId=");
        sb2.append(this.f130081b);
        sb2.append(", loadingStarted=");
        sb2.append(this.f130082c);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f130083d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130081b);
        parcel.writeInt(this.f130082c ? 1 : 0);
        parcel.writeString(this.f130083d);
    }

    public /* synthetic */ JobCrmLoadingItem(String str, boolean z12, String str2, int i12, C42822w c42822w) {
        this(str, z12, (i12 & 4) != 0 ? "candidates_loading_item_id" : str2);
    }
}
