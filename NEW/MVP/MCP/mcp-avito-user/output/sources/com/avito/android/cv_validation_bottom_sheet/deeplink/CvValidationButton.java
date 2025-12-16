package com.avito.android.cv_validation_bottom_sheet.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: CvValidationLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/deeplink/CvValidationButton;", "Landroid/os/Parcelable;", "_avito_job_cv-validation-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvValidationButton implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CvValidationButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f131791b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DeepLink f131792c;

    /* compiled from: CvValidationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvValidationButton> {
        @Override // android.os.Parcelable.Creator
        public final CvValidationButton createFromParcel(Parcel parcel) {
            return new CvValidationButton(parcel.readString(), (DeepLink) parcel.readParcelable(CvValidationButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CvValidationButton[] newArray(int i12) {
            return new CvValidationButton[i12];
        }
    }

    public CvValidationButton(@Y61.k String str, @Y61.k DeepLink deepLink) {
        this.f131791b = str;
        this.f131792c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f131791b);
        parcel.writeParcelable(this.f131792c, i12);
    }
}
