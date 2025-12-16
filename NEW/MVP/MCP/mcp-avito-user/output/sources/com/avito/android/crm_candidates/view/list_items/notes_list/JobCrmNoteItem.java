package com.avito.android.crm_candidates.view.list_items.notes_list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmNoteItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/notes_list/JobCrmNoteItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JobCrmNoteItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<JobCrmNoteItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f130163b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f130164c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f130165d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f130166e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f130167f;

    /* compiled from: JobCrmNoteItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmNoteItem> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmNoteItem createFromParcel(Parcel parcel) {
            return new JobCrmNoteItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmNoteItem[] newArray(int i12) {
            return new JobCrmNoteItem[i12];
        }
    }

    public JobCrmNoteItem(@k String str, @k String str2, @k String str3, @k String str4, boolean z12) {
        this.f130163b = str;
        this.f130164c = str2;
        this.f130165d = str3;
        this.f130166e = str4;
        this.f130167f = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobCrmNoteItem)) {
            return false;
        }
        JobCrmNoteItem jobCrmNoteItem = (JobCrmNoteItem) obj;
        return L.f(this.f130163b, jobCrmNoteItem.f130163b) && L.f(this.f130164c, jobCrmNoteItem.f130164c) && L.f(this.f130165d, jobCrmNoteItem.f130165d) && L.f(this.f130166e, jobCrmNoteItem.f130166e) && this.f130167f == jobCrmNoteItem.f130167f;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF124943b() {
        return this.f130163b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130167f) + H.d(H.d(H.d(this.f130163b.hashCode() * 31, 31, this.f130164c), 31, this.f130165d), 31, this.f130166e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCrmNoteItem(stringId=");
        sb2.append(this.f130163b);
        sb2.append(", recruiterName=");
        sb2.append(this.f130164c);
        sb2.append(", dateInfo=");
        sb2.append(this.f130165d);
        sb2.append(", noteText=");
        sb2.append(this.f130166e);
        sb2.append(", isCurrentUserNote=");
        return r.x(sb2, this.f130167f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130163b);
        parcel.writeString(this.f130164c);
        parcel.writeString(this.f130165d);
        parcel.writeString(this.f130166e);
        parcel.writeInt(this.f130167f ? 1 : 0);
    }
}
