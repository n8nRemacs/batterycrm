package com.avito.android.job.interview.links;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: JobInterviewInvitationLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/links/JobInterviewInvitationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_job_interview_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final class JobInterviewInvitationLink extends DeepLink {

    @k
    public static final Parcelable.Creator<JobInterviewInvitationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174566b;

    /* compiled from: JobInterviewInvitationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobInterviewInvitationLink> {
        @Override // android.os.Parcelable.Creator
        public final JobInterviewInvitationLink createFromParcel(Parcel parcel) {
            return new JobInterviewInvitationLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobInterviewInvitationLink[] newArray(int i12) {
            return new JobInterviewInvitationLink[i12];
        }
    }

    public JobInterviewInvitationLink(@k String str) {
        this.f174566b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f174566b);
    }
}
