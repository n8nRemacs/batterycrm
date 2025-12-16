package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: JsxActualizationBottomSheetResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetResult;", "Landroid/os/Parcelable;", "()V", "Dismiss", "Error", "Success", "Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetResult$Dismiss;", "Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetResult$Error;", "Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetResult$Success;", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class JsxActualizationBottomSheetResult implements Parcelable {

    /* compiled from: JsxActualizationBottomSheetResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetResult$Dismiss;", "Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetResult;", "<init>", "()V", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Dismiss extends JsxActualizationBottomSheetResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Dismiss f131554b = new Dismiss();

        @k
        public static final Parcelable.Creator<Dismiss> CREATOR = new a();

        /* compiled from: JsxActualizationBottomSheetResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Dismiss> {
            @Override // android.os.Parcelable.Creator
            public final Dismiss createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Dismiss.f131554b;
            }

            @Override // android.os.Parcelable.Creator
            public final Dismiss[] newArray(int i12) {
                return new Dismiss[i12];
            }
        }

        public Dismiss() {
            super(null);
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

    /* compiled from: JsxActualizationBottomSheetResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetResult$Error;", "Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetResult;", "<init>", "()V", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error extends JsxActualizationBottomSheetResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Error f131555b = new Error();

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* compiled from: JsxActualizationBottomSheetResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Error.f131555b;
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error() {
            super(null);
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

    /* compiled from: JsxActualizationBottomSheetResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetResult$Success;", "Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetResult;", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Success extends JsxActualizationBottomSheetResult {

        @k
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f131556b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f131557c;

        /* compiled from: JsxActualizationBottomSheetResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success((DeepLink) parcel.readParcelable(Success.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        public Success(@l DeepLink deepLink, @l String str) {
            super(null);
            this.f131556b = deepLink;
            this.f131557c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f131556b, i12);
            parcel.writeString(this.f131557c);
        }
    }

    public /* synthetic */ JsxActualizationBottomSheetResult(C42822w c42822w) {
        this();
    }

    public JsxActualizationBottomSheetResult() {
    }
}
