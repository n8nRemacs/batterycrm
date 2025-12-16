package com.avito.android.cv_validation_bottom_sheet.ui;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CvValidationBottomSheetResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/ui/CvValidationBottomSheetResult;", "Landroid/os/Parcelable;", "()V", "Error", "OpenMessenger", "Lcom/avito/android/cv_validation_bottom_sheet/ui/CvValidationBottomSheetResult$Error;", "Lcom/avito/android/cv_validation_bottom_sheet/ui/CvValidationBottomSheetResult$OpenMessenger;", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CvValidationBottomSheetResult implements Parcelable {

    /* compiled from: CvValidationBottomSheetResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/ui/CvValidationBottomSheetResult$Error;", "Lcom/avito/android/cv_validation_bottom_sheet/ui/CvValidationBottomSheetResult;", "<init>", "()V", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends CvValidationBottomSheetResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Error f131953b = new Error();

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* compiled from: CvValidationBottomSheetResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Error.f131953b;
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

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 1175038979;
        }

        @k
        public final String toString() {
            return "Error";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: CvValidationBottomSheetResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/ui/CvValidationBottomSheetResult$OpenMessenger;", "Lcom/avito/android/cv_validation_bottom_sheet/ui/CvValidationBottomSheetResult;", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenMessenger extends CvValidationBottomSheetResult {

        @k
        public static final Parcelable.Creator<OpenMessenger> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f131954b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f131955c;

        /* compiled from: CvValidationBottomSheetResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OpenMessenger> {
            @Override // android.os.Parcelable.Creator
            public final OpenMessenger createFromParcel(Parcel parcel) {
                return new OpenMessenger(parcel.readBundle(OpenMessenger.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenMessenger[] newArray(int i12) {
                return new OpenMessenger[i12];
            }
        }

        public OpenMessenger(@l Bundle bundle, @k String str) {
            super(null);
            this.f131954b = str;
            this.f131955c = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f131954b);
            parcel.writeBundle(this.f131955c);
        }
    }

    public /* synthetic */ CvValidationBottomSheetResult(C42822w c42822w) {
        this();
    }

    public CvValidationBottomSheetResult() {
    }
}
