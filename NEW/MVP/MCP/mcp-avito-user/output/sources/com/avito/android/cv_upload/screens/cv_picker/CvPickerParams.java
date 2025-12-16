package com.avito.android.cv_upload.screens.cv_picker;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deeplink.JobCvUploadLink;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: CvPickerParams.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_picker/CvPickerParams;", "Lcom/avito/android/util/OpenParams;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvPickerParams implements OpenParams {

    @k
    public static final Parcelable.Creator<CvPickerParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final JobCvUploadLink f131691b;

    /* compiled from: CvPickerParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvPickerParams> {
        @Override // android.os.Parcelable.Creator
        public final CvPickerParams createFromParcel(Parcel parcel) {
            return new CvPickerParams((JobCvUploadLink) parcel.readParcelable(CvPickerParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CvPickerParams[] newArray(int i12) {
            return new CvPickerParams[i12];
        }
    }

    public CvPickerParams(@k JobCvUploadLink jobCvUploadLink) {
        this.f131691b = jobCvUploadLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f131691b, i12);
    }
}
