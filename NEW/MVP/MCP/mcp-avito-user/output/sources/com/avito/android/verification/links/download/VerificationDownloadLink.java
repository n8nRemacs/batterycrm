package com.avito.android.verification.links.download;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: VerificationDownloadLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/download/VerificationDownloadLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VerificationDownloadLink extends DeepLink {

    @k
    public static final Parcelable.Creator<VerificationDownloadLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f324186b;

    /* compiled from: VerificationDownloadLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationDownloadLink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationDownloadLink createFromParcel(Parcel parcel) {
            return new VerificationDownloadLink((Uri) parcel.readParcelable(VerificationDownloadLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationDownloadLink[] newArray(int i12) {
            return new VerificationDownloadLink[i12];
        }
    }

    public VerificationDownloadLink(@k Uri uri) {
        this.f324186b = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerificationDownloadLink) && L.f(this.f324186b, ((VerificationDownloadLink) obj).f324186b);
    }

    public final int hashCode() {
        return this.f324186b.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.t(new StringBuilder("VerificationDownloadLink(downloadUri="), this.f324186b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f324186b, i12);
    }
}
