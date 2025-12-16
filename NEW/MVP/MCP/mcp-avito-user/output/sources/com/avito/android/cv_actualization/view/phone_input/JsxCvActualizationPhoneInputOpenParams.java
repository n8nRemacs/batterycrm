package com.avito.android.cv_actualization.view.phone_input;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: JsxCvActualizationPhoneInputOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_input/JsxCvActualizationPhoneInputOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JsxCvActualizationPhoneInputOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<JsxCvActualizationPhoneInputOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f131248b;

    /* compiled from: JsxCvActualizationPhoneInputOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxCvActualizationPhoneInputOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneInputOpenParams createFromParcel(Parcel parcel) {
            return new JsxCvActualizationPhoneInputOpenParams(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneInputOpenParams[] newArray(int i12) {
            return new JsxCvActualizationPhoneInputOpenParams[i12];
        }
    }

    public JsxCvActualizationPhoneInputOpenParams(boolean z12) {
        this.f131248b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JsxCvActualizationPhoneInputOpenParams) && this.f131248b == ((JsxCvActualizationPhoneInputOpenParams) obj).f131248b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131248b);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("JsxCvActualizationPhoneInputOpenParams(isScreenFirstInSteps="), this.f131248b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f131248b ? 1 : 0);
    }
}
