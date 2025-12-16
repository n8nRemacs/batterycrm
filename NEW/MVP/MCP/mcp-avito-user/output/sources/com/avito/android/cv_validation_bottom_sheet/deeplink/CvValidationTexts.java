package com.avito.android.cv_validation_bottom_sheet.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: CvValidationLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/deeplink/CvValidationTexts;", "Landroid/os/Parcelable;", "_avito_job_cv-validation-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvValidationTexts implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CvValidationTexts> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f131800b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f131801c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f131802d;

    /* compiled from: CvValidationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvValidationTexts> {
        @Override // android.os.Parcelable.Creator
        public final CvValidationTexts createFromParcel(Parcel parcel) {
            return new CvValidationTexts(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(CvValidationTexts.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CvValidationTexts[] newArray(int i12) {
            return new CvValidationTexts[i12];
        }
    }

    public CvValidationTexts(@Y61.k String str, @Y61.k String str2, @Y61.l AttributedText attributedText) {
        this.f131800b = str;
        this.f131801c = str2;
        this.f131802d = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f131800b);
        parcel.writeString(this.f131801c);
        parcel.writeParcelable(this.f131802d, i12);
    }
}
