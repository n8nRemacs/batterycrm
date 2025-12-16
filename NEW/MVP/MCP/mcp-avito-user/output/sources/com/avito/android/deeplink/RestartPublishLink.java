package com.avito.android.deeplink;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: RestartPublishLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink/RestartPublishLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_job_cv-upload_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class RestartPublishLink extends DeepLink {

    @k
    public static final Parcelable.Creator<RestartPublishLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f134094b;

    /* compiled from: RestartPublishLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RestartPublishLink> {
        @Override // android.os.Parcelable.Creator
        public final RestartPublishLink createFromParcel(Parcel parcel) {
            return new RestartPublishLink((DeepLink) parcel.readParcelable(RestartPublishLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RestartPublishLink[] newArray(int i12) {
            return new RestartPublishLink[i12];
        }
    }

    public RestartPublishLink(@k DeepLink deepLink) {
        this.f134094b = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f134094b, i12);
    }
}
