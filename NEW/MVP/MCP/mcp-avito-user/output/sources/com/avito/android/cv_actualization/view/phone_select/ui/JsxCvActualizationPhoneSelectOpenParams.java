package com.avito.android.cv_actualization.view.phone_select.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: JsxCvActualizationPhoneSelectOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/ui/JsxCvActualizationPhoneSelectOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JsxCvActualizationPhoneSelectOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<JsxCvActualizationPhoneSelectOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f131393b;

    /* compiled from: JsxCvActualizationPhoneSelectOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxCvActualizationPhoneSelectOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneSelectOpenParams createFromParcel(Parcel parcel) {
            return new JsxCvActualizationPhoneSelectOpenParams(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationPhoneSelectOpenParams[] newArray(int i12) {
            return new JsxCvActualizationPhoneSelectOpenParams[i12];
        }
    }

    public JsxCvActualizationPhoneSelectOpenParams(boolean z12) {
        this.f131393b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JsxCvActualizationPhoneSelectOpenParams) && this.f131393b == ((JsxCvActualizationPhoneSelectOpenParams) obj).f131393b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131393b);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("JsxCvActualizationPhoneSelectOpenParams(showAllPhones="), this.f131393b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f131393b ? 1 : 0);
    }
}
