package com.avito.android.crm_candidates.view.list_items.applications_list.error_item;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: JobCrmErrorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/error_item/JobCrmErrorItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JobCrmErrorItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<JobCrmErrorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f130069b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f130070c;

    /* compiled from: JobCrmErrorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmErrorItem> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmErrorItem createFromParcel(Parcel parcel) {
            return new JobCrmErrorItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmErrorItem[] newArray(int i12) {
            return new JobCrmErrorItem[i12];
        }
    }

    public JobCrmErrorItem(@k String str, @k String str2) {
        this.f130069b = str;
        this.f130070c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF94474b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF130070c() {
        return this.f130070c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130069b);
        parcel.writeString(this.f130070c);
    }

    public /* synthetic */ JobCrmErrorItem(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? "candidates_error_item_id" : str2);
    }
}
