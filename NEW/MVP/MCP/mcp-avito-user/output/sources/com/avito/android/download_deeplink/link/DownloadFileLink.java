package com.avito.android.download_deeplink.link;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: DownloadFileLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/download_deeplink/link/DownloadFileLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class DownloadFileLink extends DeepLink {

    @k
    public static final Parcelable.Creator<DownloadFileLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f144897b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f144898c;

    /* compiled from: DownloadFileLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DownloadFileLink> {
        @Override // android.os.Parcelable.Creator
        public final DownloadFileLink createFromParcel(Parcel parcel) {
            return new DownloadFileLink((Uri) parcel.readParcelable(DownloadFileLink.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadFileLink[] newArray(int i12) {
            return new DownloadFileLink[i12];
        }
    }

    public DownloadFileLink(@k Uri uri, @l String str) {
        this.f144897b = uri;
        this.f144898c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadFileLink)) {
            return false;
        }
        DownloadFileLink downloadFileLink = (DownloadFileLink) obj;
        return L.f(this.f144897b, downloadFileLink.f144897b) && L.f(this.f144898c, downloadFileLink.f144898c);
    }

    public final int hashCode() {
        int iHashCode = this.f144897b.hashCode() * 31;
        String str = this.f144898c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DownloadFileLink(url=");
        sb2.append(this.f144897b);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f144898c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f144897b, i12);
        parcel.writeString(this.f144898c);
    }
}
