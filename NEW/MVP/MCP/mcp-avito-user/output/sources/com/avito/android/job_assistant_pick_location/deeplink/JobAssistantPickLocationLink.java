package com.avito.android.job_assistant_pick_location.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: JobAssistantPickLocationLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job_assistant_pick_location/deeplink/JobAssistantPickLocationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_location-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final class JobAssistantPickLocationLink extends DeepLink {

    @k
    public static final Parcelable.Creator<JobAssistantPickLocationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174713b;

    /* compiled from: JobAssistantPickLocationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobAssistantPickLocationLink> {
        @Override // android.os.Parcelable.Creator
        public final JobAssistantPickLocationLink createFromParcel(Parcel parcel) {
            return new JobAssistantPickLocationLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobAssistantPickLocationLink[] newArray(int i12) {
            return new JobAssistantPickLocationLink[i12];
        }
    }

    public JobAssistantPickLocationLink(@k String str) {
        this.f174713b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f174713b);
    }
}
