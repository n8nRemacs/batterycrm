package com.avito.android.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CvUploadedOpenDraftLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink/CvUploadedOpenDraftLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_job_cv-upload_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CvUploadedOpenDraftLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CvUploadedOpenDraftLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f134078b;

    /* compiled from: CvUploadedOpenDraftLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvUploadedOpenDraftLink> {
        @Override // android.os.Parcelable.Creator
        public final CvUploadedOpenDraftLink createFromParcel(Parcel parcel) {
            return new CvUploadedOpenDraftLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CvUploadedOpenDraftLink[] newArray(int i12) {
            return new CvUploadedOpenDraftLink[i12];
        }
    }

    public CvUploadedOpenDraftLink(@k String str) {
        this.f134078b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CvUploadedOpenDraftLink) && L.f(this.f134078b, ((CvUploadedOpenDraftLink) obj).f134078b);
    }

    public final int hashCode() {
        return this.f134078b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("CvUploadedOpenDraftLink(draftId="), this.f134078b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f134078b);
    }
}
