package com.avito.android.cv_actualization.perf_const;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: JsxCvActualizationPerfConstants.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_actualization/perf_const/JobCvPhoneActualizationPhoneInputScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes12.dex */
public final class JobCvPhoneActualizationPhoneInputScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final JobCvPhoneActualizationPhoneInputScreen f131103d = new JobCvPhoneActualizationPhoneInputScreen();

    @k
    public static final Parcelable.Creator<JobCvPhoneActualizationPhoneInputScreen> CREATOR = new a();

    /* compiled from: JsxCvActualizationPerfConstants.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCvPhoneActualizationPhoneInputScreen> {
        @Override // android.os.Parcelable.Creator
        public final JobCvPhoneActualizationPhoneInputScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return JobCvPhoneActualizationPhoneInputScreen.f131103d;
        }

        @Override // android.os.Parcelable.Creator
        public final JobCvPhoneActualizationPhoneInputScreen[] newArray(int i12) {
            return new JobCvPhoneActualizationPhoneInputScreen[i12];
        }
    }

    public JobCvPhoneActualizationPhoneInputScreen() {
        super("JobCvPhoneActualizationPhoneInputScreen", false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
