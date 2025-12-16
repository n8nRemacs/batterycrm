package com.avito.android.success_screen_after_apply.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuccessScreenAfterApplyResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/success_screen_after_apply/ui/SuccessScreenAfterApplyResult;", "Landroid/os/Parcelable;", "()V", "Dismiss", "OpenEdit", "Lcom/avito/android/success_screen_after_apply/ui/SuccessScreenAfterApplyResult$Dismiss;", "Lcom/avito/android/success_screen_after_apply/ui/SuccessScreenAfterApplyResult$OpenEdit;", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SuccessScreenAfterApplyResult implements Parcelable {

    /* compiled from: SuccessScreenAfterApplyResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success_screen_after_apply/ui/SuccessScreenAfterApplyResult$Dismiss;", "Lcom/avito/android/success_screen_after_apply/ui/SuccessScreenAfterApplyResult;", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Dismiss extends SuccessScreenAfterApplyResult {

        @k
        public static final Parcelable.Creator<Dismiss> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f291775b;

        /* compiled from: SuccessScreenAfterApplyResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Dismiss> {
            @Override // android.os.Parcelable.Creator
            public final Dismiss createFromParcel(Parcel parcel) {
                return new Dismiss((DeepLink) parcel.readParcelable(Dismiss.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Dismiss[] newArray(int i12) {
                return new Dismiss[i12];
            }
        }

        public Dismiss(@l DeepLink deepLink) {
            super(null);
            this.f291775b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dismiss) && L.f(this.f291775b, ((Dismiss) obj).f291775b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f291775b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Dismiss(deepLink="), this.f291775b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f291775b, i12);
        }
    }

    /* compiled from: SuccessScreenAfterApplyResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success_screen_after_apply/ui/SuccessScreenAfterApplyResult$OpenEdit;", "Lcom/avito/android/success_screen_after_apply/ui/SuccessScreenAfterApplyResult;", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenEdit extends SuccessScreenAfterApplyResult {

        @k
        public static final Parcelable.Creator<OpenEdit> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f291776b;

        /* compiled from: SuccessScreenAfterApplyResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OpenEdit> {
            @Override // android.os.Parcelable.Creator
            public final OpenEdit createFromParcel(Parcel parcel) {
                return new OpenEdit((DeepLink) parcel.readParcelable(OpenEdit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OpenEdit[] newArray(int i12) {
                return new OpenEdit[i12];
            }
        }

        public OpenEdit(@k DeepLink deepLink) {
            super(null);
            this.f291776b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenEdit) && L.f(this.f291776b, ((OpenEdit) obj).f291776b);
        }

        public final int hashCode() {
            return this.f291776b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenEdit(deepLink="), this.f291776b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f291776b, i12);
        }
    }

    public /* synthetic */ SuccessScreenAfterApplyResult(C42822w c42822w) {
        this();
    }

    public SuccessScreenAfterApplyResult() {
    }
}
