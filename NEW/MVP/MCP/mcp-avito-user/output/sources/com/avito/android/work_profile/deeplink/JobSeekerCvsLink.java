package com.avito.android.work_profile.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: JobSeekerCvsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/deeplink/JobSeekerCvsLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_job_work-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class JobSeekerCvsLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<JobSeekerCvsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f330618b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f330619c;

    /* compiled from: JobSeekerCvsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobSeekerCvsLink> {
        @Override // android.os.Parcelable.Creator
        public final JobSeekerCvsLink createFromParcel(Parcel parcel) {
            return new JobSeekerCvsLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobSeekerCvsLink[] newArray(int i12) {
            return new JobSeekerCvsLink[i12];
        }
    }

    public JobSeekerCvsLink(@k String str, @l String str2) {
        this.f330618b = str;
        this.f330619c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f330618b);
        parcel.writeString(this.f330619c);
    }
}
