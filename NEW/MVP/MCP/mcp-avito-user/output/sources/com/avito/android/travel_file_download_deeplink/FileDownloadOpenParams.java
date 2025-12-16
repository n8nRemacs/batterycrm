package com.avito.android.travel_file_download_deeplink;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileDownloadOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/FileDownloadOpenParams;", "Landroid/os/Parcelable;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FileDownloadOpenParams implements Parcelable {

    @k
    public static final Parcelable.Creator<FileDownloadOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f301666b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f301667c;

    /* compiled from: FileDownloadOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FileDownloadOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final FileDownloadOpenParams createFromParcel(Parcel parcel) {
            return new FileDownloadOpenParams((Uri) parcel.readParcelable(FileDownloadOpenParams.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FileDownloadOpenParams[] newArray(int i12) {
            return new FileDownloadOpenParams[i12];
        }
    }

    public FileDownloadOpenParams(@k Uri uri, @k String str) {
        this.f301666b = uri;
        this.f301667c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileDownloadOpenParams)) {
            return false;
        }
        FileDownloadOpenParams fileDownloadOpenParams = (FileDownloadOpenParams) obj;
        return L.f(this.f301666b, fileDownloadOpenParams.f301666b) && L.f(this.f301667c, fileDownloadOpenParams.f301667c);
    }

    public final int hashCode() {
        return this.f301667c.hashCode() + (this.f301666b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileDownloadOpenParams(url=");
        sb2.append(this.f301666b);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f301667c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f301666b, i12);
        parcel.writeString(this.f301667c);
    }
}
