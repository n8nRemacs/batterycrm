package com.avito.android.crm_candidates.link;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: JobCrmCandidatesDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/link/JobCrmCandidatesDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class JobCrmCandidatesDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<JobCrmCandidatesDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f129737b;

    /* compiled from: JobCrmCandidatesDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmCandidatesDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmCandidatesDeeplink createFromParcel(Parcel parcel) {
            return new JobCrmCandidatesDeeplink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmCandidatesDeeplink[] newArray(int i12) {
            return new JobCrmCandidatesDeeplink[i12];
        }
    }

    public JobCrmCandidatesDeeplink(@l String str) {
        this.f129737b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f129737b);
    }
}
