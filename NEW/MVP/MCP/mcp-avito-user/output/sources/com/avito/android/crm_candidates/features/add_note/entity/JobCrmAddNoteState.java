package com.avito.android.crm_candidates.features.add_note.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;

/* compiled from: JobCrmAddNoteState.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JobCrmAddNoteState extends q implements Parcelable {

    @k
    public static final Parcelable.Creator<JobCrmAddNoteState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f129430b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f129431c;

    /* compiled from: JobCrmAddNoteState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmAddNoteState> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmAddNoteState createFromParcel(Parcel parcel) {
            return new JobCrmAddNoteState(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmAddNoteState[] newArray(int i12) {
            return new JobCrmAddNoteState[i12];
        }
    }

    public JobCrmAddNoteState(boolean z12, boolean z13) {
        this.f129430b = z12;
        this.f129431c = z13;
    }

    public static JobCrmAddNoteState a(JobCrmAddNoteState jobCrmAddNoteState, boolean z12, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            z12 = jobCrmAddNoteState.f129430b;
        }
        if ((i12 & 2) != 0) {
            z13 = jobCrmAddNoteState.f129431c;
        }
        jobCrmAddNoteState.getClass();
        return new JobCrmAddNoteState(z12, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobCrmAddNoteState)) {
            return false;
        }
        JobCrmAddNoteState jobCrmAddNoteState = (JobCrmAddNoteState) obj;
        return this.f129430b == jobCrmAddNoteState.f129430b && this.f129431c == jobCrmAddNoteState.f129431c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129431c) + (Boolean.hashCode(this.f129430b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCrmAddNoteState(isButtonAvailable=");
        sb2.append(this.f129430b);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f129431c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f129430b ? 1 : 0);
        parcel.writeInt(this.f129431c ? 1 : 0);
    }
}
