package com.avito.android.cv_actualization.view.code_input;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvActualizationCodeInputOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/code_input/JsxCvActualizationCodeInputOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JsxCvActualizationCodeInputOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<JsxCvActualizationCodeInputOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f131141b;

    /* renamed from: c, reason: collision with root package name */
    public final long f131142c;

    /* compiled from: JsxCvActualizationCodeInputOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxCvActualizationCodeInputOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationCodeInputOpenParams createFromParcel(Parcel parcel) {
            return new JsxCvActualizationCodeInputOpenParams(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationCodeInputOpenParams[] newArray(int i12) {
            return new JsxCvActualizationCodeInputOpenParams[i12];
        }
    }

    public JsxCvActualizationCodeInputOpenParams(@k String str, long j12) {
        this.f131141b = str;
        this.f131142c = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsxCvActualizationCodeInputOpenParams)) {
            return false;
        }
        JsxCvActualizationCodeInputOpenParams jsxCvActualizationCodeInputOpenParams = (JsxCvActualizationCodeInputOpenParams) obj;
        return L.f(this.f131141b, jsxCvActualizationCodeInputOpenParams.f131141b) && this.f131142c == jsxCvActualizationCodeInputOpenParams.f131142c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f131142c) + (this.f131141b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvActualizationCodeInputOpenParams(phoneNumber=");
        sb2.append(this.f131141b);
        sb2.append(", nextTryTime=");
        return r.u(sb2, this.f131142c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f131141b);
        parcel.writeLong(this.f131142c);
    }
}
