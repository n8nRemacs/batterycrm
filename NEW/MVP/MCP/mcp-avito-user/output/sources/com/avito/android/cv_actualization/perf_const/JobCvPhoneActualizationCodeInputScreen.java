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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_actualization/perf_const/JobCvPhoneActualizationCodeInputScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes12.dex */
public final class JobCvPhoneActualizationCodeInputScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final JobCvPhoneActualizationCodeInputScreen f131102d = new JobCvPhoneActualizationCodeInputScreen();

    @k
    public static final Parcelable.Creator<JobCvPhoneActualizationCodeInputScreen> CREATOR = new a();

    /* compiled from: JsxCvActualizationPerfConstants.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCvPhoneActualizationCodeInputScreen> {
        @Override // android.os.Parcelable.Creator
        public final JobCvPhoneActualizationCodeInputScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return JobCvPhoneActualizationCodeInputScreen.f131102d;
        }

        @Override // android.os.Parcelable.Creator
        public final JobCvPhoneActualizationCodeInputScreen[] newArray(int i12) {
            return new JobCvPhoneActualizationCodeInputScreen[i12];
        }
    }

    public JobCvPhoneActualizationCodeInputScreen() {
        super("JobCvPhoneActualizationCodeInputScreen", false);
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
