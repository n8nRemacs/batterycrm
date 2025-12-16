package com.avito.android.cv_upload.screens.cv_upload;

import Y61.k;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: CvUploadParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/CvUploadParams;", "Landroid/os/Parcelable;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvUploadParams implements Parcelable {

    @k
    public static final Parcelable.Creator<CvUploadParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f131710b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f131711c;

    /* compiled from: CvUploadParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvUploadParams> {
        @Override // android.os.Parcelable.Creator
        public final CvUploadParams createFromParcel(Parcel parcel) {
            return new CvUploadParams((Uri) parcel.readParcelable(CvUploadParams.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CvUploadParams[] newArray(int i12) {
            return new CvUploadParams[i12];
        }
    }

    public CvUploadParams(@k Uri uri, @k String str) {
        this.f131710b = uri;
        this.f131711c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f131710b, i12);
        parcel.writeString(this.f131711c);
    }
}
