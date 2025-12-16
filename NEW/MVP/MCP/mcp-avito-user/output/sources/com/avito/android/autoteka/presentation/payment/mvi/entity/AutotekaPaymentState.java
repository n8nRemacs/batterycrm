package com.avito.android.autoteka.presentation.payment.mvi.entity;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.autoteka.helpers.AutotekaItem;
import com.avito.android.autoteka.items.fullScreenError.payment.PaymentErrorItem;
import com.avito.android.autoteka.items.payment.PaymentItem;
import com.avito.android.autoteka.items.skeleton.payment.PaymentSkeletonItem;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPaymentState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "a", "Error", "Loading", "Success", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState$Error;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState$Loading;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState$Success;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AutotekaPaymentState extends q implements Parcelable {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f97457c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Loading f97458d = new Loading(new PaymentSkeletonItem(null, 1, null));

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AutotekaItem f97459b;

    /* compiled from: AutotekaPaymentState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState$Error;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends AutotekaPaymentState {

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PaymentErrorItem f97460e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ApiError f97461f;

        /* compiled from: AutotekaPaymentState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(PaymentErrorItem.CREATOR.createFromParcel(parcel), (ApiError) parcel.readParcelable(Error.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(@k PaymentErrorItem paymentErrorItem, @k ApiError apiError) {
            super(paymentErrorItem, null);
            this.f97460e = paymentErrorItem;
            this.f97461f = apiError;
        }

        @Override // com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState
        /* renamed from: c */
        public final AutotekaItem getF97459b() {
            return this.f97460e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f97460e, error.f97460e) && L.f(this.f97461f, error.f97461f);
        }

        public final int hashCode() {
            return this.f97461f.hashCode() + (this.f97460e.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(item=");
            sb2.append(this.f97460e);
            sb2.append(", error=");
            return c.n(sb2, this.f97461f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f97460e.writeToParcel(parcel, i12);
            parcel.writeParcelable(this.f97461f, i12);
        }
    }

    /* compiled from: AutotekaPaymentState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState$Loading;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends AutotekaPaymentState {

        @k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PaymentSkeletonItem f97462e;

        /* compiled from: AutotekaPaymentState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                return new Loading(PaymentSkeletonItem.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i12) {
                return new Loading[i12];
            }
        }

        public Loading(@k PaymentSkeletonItem paymentSkeletonItem) {
            super(paymentSkeletonItem, null);
            this.f97462e = paymentSkeletonItem;
        }

        @Override // com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState
        /* renamed from: c */
        public final AutotekaItem getF97459b() {
            return this.f97462e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && L.f(this.f97462e, ((Loading) obj).f97462e);
        }

        public final int hashCode() {
            return this.f97462e.hashCode();
        }

        @k
        public final String toString() {
            return "Loading(item=" + this.f97462e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f97462e.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: AutotekaPaymentState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState$Success;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success extends AutotekaPaymentState {

        @k
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PaymentItem f97463e;

        /* compiled from: AutotekaPaymentState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(PaymentItem.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        public Success(@k PaymentItem paymentItem) {
            super(paymentItem, null);
            this.f97463e = paymentItem;
        }

        @Override // com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState
        /* renamed from: c */
        public final AutotekaItem getF97459b() {
            return this.f97463e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && L.f(this.f97463e, ((Success) obj).f97463e);
        }

        public final int hashCode() {
            return this.f97463e.hashCode();
        }

        @k
        public final String toString() {
            return "Success(item=" + this.f97463e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f97463e.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: AutotekaPaymentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState$a;", "", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public AutotekaPaymentState(AutotekaItem autotekaItem, C42822w c42822w) {
        this.f97459b = autotekaItem;
    }

    @k
    /* renamed from: c, reason: from getter */
    public AutotekaItem getF97459b() {
        return this.f97459b;
    }
}
