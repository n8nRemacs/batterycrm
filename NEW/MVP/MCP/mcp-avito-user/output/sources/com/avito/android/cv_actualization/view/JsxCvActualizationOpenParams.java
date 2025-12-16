package com.avito.android.cv_actualization.view;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: JsxCvActualizationOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/JsxCvActualizationOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JsxCvActualizationOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<JsxCvActualizationOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f131107b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f131108c;

    /* compiled from: JsxCvActualizationOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxCvActualizationOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationOpenParams createFromParcel(Parcel parcel) {
            return new JsxCvActualizationOpenParams(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationOpenParams[] newArray(int i12) {
            return new JsxCvActualizationOpenParams[i12];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JsxCvActualizationOpenParams() {
        boolean z12 = false;
        this(z12, z12, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f131107b ? 1 : 0);
        parcel.writeInt(this.f131108c ? 1 : 0);
    }

    public JsxCvActualizationOpenParams(boolean z12, boolean z13) {
        this.f131107b = z12;
        this.f131108c = z13;
    }

    public /* synthetic */ JsxCvActualizationOpenParams(boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
    }
}
