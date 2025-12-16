package com.avito.android.job.cv_info_actualization.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: JsxCvInfoActualizationOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/JsxCvInfoActualizationOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class JsxCvInfoActualizationOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<JsxCvInfoActualizationOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f174209b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f174210c;

    /* compiled from: JsxCvInfoActualizationOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxCvInfoActualizationOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final JsxCvInfoActualizationOpenParams createFromParcel(Parcel parcel) {
            return new JsxCvInfoActualizationOpenParams((DeepLink) parcel.readParcelable(JsxCvInfoActualizationOpenParams.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JsxCvInfoActualizationOpenParams[] newArray(int i12) {
            return new JsxCvInfoActualizationOpenParams[i12];
        }
    }

    public JsxCvInfoActualizationOpenParams(@l DeepLink deepLink, @k String str) {
        this.f174209b = deepLink;
        this.f174210c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f174209b, i12);
        parcel.writeString(this.f174210c);
    }
}
