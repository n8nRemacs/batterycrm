package com.avito.android.cv_validation_bottom_sheet.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: CvValidationLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/deeplink/CvForValidation;", "Landroid/os/Parcelable;", "_avito_job_cv-validation-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvForValidation implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CvForValidation> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f131787b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f131788c;

    /* renamed from: d, reason: collision with root package name */
    public final long f131789d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Image f131790e;

    /* compiled from: CvValidationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvForValidation> {
        @Override // android.os.Parcelable.Creator
        public final CvForValidation createFromParcel(Parcel parcel) {
            return new CvForValidation(parcel.readString(), parcel.readString(), parcel.readLong(), (Image) parcel.readParcelable(CvForValidation.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CvForValidation[] newArray(int i12) {
            return new CvForValidation[i12];
        }
    }

    public CvForValidation(@Y61.k String str, @Y61.k String str2, long j12, @Y61.l Image image) {
        this.f131787b = str;
        this.f131788c = str2;
        this.f131789d = j12;
        this.f131790e = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f131787b);
        parcel.writeString(this.f131788c);
        parcel.writeLong(this.f131789d);
        parcel.writeParcelable(this.f131790e, i12);
    }
}
