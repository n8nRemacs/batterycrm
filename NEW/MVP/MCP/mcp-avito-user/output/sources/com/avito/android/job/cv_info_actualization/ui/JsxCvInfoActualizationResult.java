package com.avito.android.job.cv_info_actualization.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: JsxCvInfoActualizationResult.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/JsxCvInfoActualizationResult;", "Landroid/os/Parcelable;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class JsxCvInfoActualizationResult implements Parcelable {

    @k
    public static final Parcelable.Creator<JsxCvInfoActualizationResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f174211b;

    /* compiled from: JsxCvInfoActualizationResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxCvInfoActualizationResult> {
        @Override // android.os.Parcelable.Creator
        public final JsxCvInfoActualizationResult createFromParcel(Parcel parcel) {
            return new JsxCvInfoActualizationResult((DeepLink) parcel.readParcelable(JsxCvInfoActualizationResult.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final JsxCvInfoActualizationResult[] newArray(int i12) {
            return new JsxCvInfoActualizationResult[i12];
        }
    }

    public JsxCvInfoActualizationResult(@l DeepLink deepLink) {
        this.f174211b = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f174211b, i12);
    }
}
