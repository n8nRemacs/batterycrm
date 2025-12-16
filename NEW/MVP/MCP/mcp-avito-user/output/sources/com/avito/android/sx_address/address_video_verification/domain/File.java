package com.avito.android.sx_address.address_video_verification.domain;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.sx_address.address_video_verification.domain.FileUploadState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: File.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/domain/File;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class File implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<File> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f292595b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f292596c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Long f292597d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Uri f292598e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FileUploadState f292599f;

    /* compiled from: File.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<File> {
        @Override // android.os.Parcelable.Creator
        public final File createFromParcel(Parcel parcel) {
            return new File(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (Uri) parcel.readParcelable(File.class.getClassLoader()), (FileUploadState) parcel.readParcelable(File.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final File[] newArray(int i12) {
            return new File[i12];
        }
    }

    public File(long j12, @Y61.k String str, @Y61.l Long l12, @Y61.l Uri uri, @Y61.k FileUploadState fileUploadState) {
        this.f292595b = j12;
        this.f292596c = str;
        this.f292597d = l12;
        this.f292598e = uri;
        this.f292599f = fileUploadState;
    }

    public static File a(File file, FileUploadState fileUploadState) {
        return new File(file.f292595b, file.f292596c, file.f292597d, file.f292598e, fileUploadState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof File)) {
            return false;
        }
        File file = (File) obj;
        return this.f292595b == file.f292595b && L.f(this.f292596c, file.f292596c) && L.f(this.f292597d, file.f292597d) && L.f(this.f292598e, file.f292598e) && L.f(this.f292599f, file.f292599f);
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f292595b) * 31, 31, this.f292596c);
        Long l12 = this.f292597d;
        int iHashCode = (iD2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Uri uri = this.f292598e;
        return this.f292599f.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "File(id=" + this.f292595b + ", name=" + this.f292596c + ", sizeBytes=" + this.f292597d + ", uri=" + this.f292598e + ", state=" + this.f292599f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f292595b);
        parcel.writeString(this.f292596c);
        Long l12 = this.f292597d;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeParcelable(this.f292598e, i12);
        parcel.writeParcelable(this.f292599f, i12);
    }

    public /* synthetic */ File(long j12, String str, Long l12, Uri uri, FileUploadState fileUploadState, int i12, C42822w c42822w) {
        this(j12, str, l12, uri, (i12 & 16) != 0 ? new FileUploadState.Uploading(0.0f) : fileUploadState);
    }
}
