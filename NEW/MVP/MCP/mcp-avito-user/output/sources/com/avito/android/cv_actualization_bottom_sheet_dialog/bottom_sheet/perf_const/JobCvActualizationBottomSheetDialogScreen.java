package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.perf_const;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: JsxActualizationBottomSheetPerfConstants.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/perf_const/JobCvActualizationBottomSheetDialogScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes12.dex */
public final class JobCvActualizationBottomSheetDialogScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final JobCvActualizationBottomSheetDialogScreen f131529d = new JobCvActualizationBottomSheetDialogScreen();

    @k
    public static final Parcelable.Creator<JobCvActualizationBottomSheetDialogScreen> CREATOR = new a();

    /* compiled from: JsxActualizationBottomSheetPerfConstants.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCvActualizationBottomSheetDialogScreen> {
        @Override // android.os.Parcelable.Creator
        public final JobCvActualizationBottomSheetDialogScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return JobCvActualizationBottomSheetDialogScreen.f131529d;
        }

        @Override // android.os.Parcelable.Creator
        public final JobCvActualizationBottomSheetDialogScreen[] newArray(int i12) {
            return new JobCvActualizationBottomSheetDialogScreen[i12];
        }
    }

    public JobCvActualizationBottomSheetDialogScreen() {
        super("JobCvActualizationBottomSheetDialogScreen", false);
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
