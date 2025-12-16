package com.avito.android.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SimpleUserDialog;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ModalState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/payment/ModalState;", "", "<init>", "()V", "a", "b", "NotifyingDialog", "SBOLAppLaunchError", "SBOLResultDialog", "Lcom/avito/android/payment/ModalState$a;", "Lcom/avito/android/payment/ModalState$b;", "Lcom/avito/android/payment/ModalState$NotifyingDialog;", "Lcom/avito/android/payment/ModalState$SBOLAppLaunchError;", "Lcom/avito/android/payment/ModalState$SBOLResultDialog;", "_avito_payment-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ModalState {

    /* compiled from: ModalState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/ModalState$NotifyingDialog;", "Lcom/avito/android/payment/ModalState;", "Landroid/os/Parcelable;", "_avito_payment-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotifyingDialog extends ModalState implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<NotifyingDialog> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SimpleUserDialog f213976b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f213977c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final PaymentStatusResult.PaymentStatus f213978d;

        /* compiled from: ModalState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NotifyingDialog> {
            @Override // android.os.Parcelable.Creator
            public final NotifyingDialog createFromParcel(Parcel parcel) {
                return new NotifyingDialog((SimpleUserDialog) parcel.readParcelable(NotifyingDialog.class.getClassLoader()), parcel.readInt() != 0, (PaymentStatusResult.PaymentStatus) parcel.readParcelable(NotifyingDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NotifyingDialog[] newArray(int i12) {
                return new NotifyingDialog[i12];
            }
        }

        public /* synthetic */ NotifyingDialog(SimpleUserDialog simpleUserDialog, boolean z12, PaymentStatusResult.PaymentStatus paymentStatus, int i12, C42822w c42822w) {
            this(simpleUserDialog, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : paymentStatus);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f213976b, i12);
            parcel.writeInt(this.f213977c ? 1 : 0);
            parcel.writeParcelable(this.f213978d, i12);
        }

        public NotifyingDialog(@Y61.k SimpleUserDialog simpleUserDialog, boolean z12, @Y61.l PaymentStatusResult.PaymentStatus paymentStatus) {
            super(null);
            this.f213976b = simpleUserDialog;
            this.f213977c = z12;
            this.f213978d = paymentStatus;
        }
    }

    /* compiled from: ModalState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/payment/ModalState$SBOLAppLaunchError;", "Lcom/avito/android/payment/ModalState;", "Landroid/os/Parcelable;", "<init>", "()V", "_avito_payment-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SBOLAppLaunchError extends ModalState implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final SBOLAppLaunchError f213979b = new SBOLAppLaunchError();

        @Y61.k
        public static final Parcelable.Creator<SBOLAppLaunchError> CREATOR = new a();

        /* compiled from: ModalState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SBOLAppLaunchError> {
            @Override // android.os.Parcelable.Creator
            public final SBOLAppLaunchError createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SBOLAppLaunchError.f213979b;
            }

            @Override // android.os.Parcelable.Creator
            public final SBOLAppLaunchError[] newArray(int i12) {
                return new SBOLAppLaunchError[i12];
            }
        }

        public SBOLAppLaunchError() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ModalState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/ModalState$SBOLResultDialog;", "Lcom/avito/android/payment/ModalState;", "Landroid/os/Parcelable;", "_avito_payment-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SBOLResultDialog extends ModalState implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<SBOLResultDialog> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f213980b;

        /* compiled from: ModalState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SBOLResultDialog> {
            @Override // android.os.Parcelable.Creator
            public final SBOLResultDialog createFromParcel(Parcel parcel) {
                return new SBOLResultDialog(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SBOLResultDialog[] newArray(int i12) {
                return new SBOLResultDialog[i12];
            }
        }

        public SBOLResultDialog(boolean z12) {
            super(null);
            this.f213980b = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f213980b ? 1 : 0);
        }
    }

    /* compiled from: ModalState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/ModalState$a;", "Lcom/avito/android/payment/ModalState;", "<init>", "()V", "_avito_payment-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ModalState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f213981b = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: ModalState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/ModalState$b;", "Lcom/avito/android/payment/ModalState;", "_avito_payment-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends ModalState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f213982b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final ApiError f213983c;

        public b(@Y61.l ApiError apiError, @Y61.k String str) {
            super(null);
            this.f213982b = str;
            this.f213983c = apiError;
        }

        public /* synthetic */ b(String str, ApiError apiError, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : apiError, str);
        }
    }

    public /* synthetic */ ModalState(C42822w c42822w) {
        this();
    }

    public ModalState() {
    }
}
