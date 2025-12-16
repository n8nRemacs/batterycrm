package com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.autoteka.items.fullScreenError.waitingForPaymentError.WaitingForPaymentErrorItem;
import com.avito.android.autoteka.items.waitingForPayment.WaitingForPaymentItem;
import com.avito.android.autoteka.items.waitingForPaymentResponseItem.WaitingForPaymentResponseItem;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaWaitingForPaymentState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "Error", "Response", "Waiting", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState$Error;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState$Response;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState$Waiting;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AutotekaWaitingForPaymentState extends q implements Parcelable {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f97891c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final WaitingForPaymentItem f97892d = new WaitingForPaymentItem(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.conveyor_item.a f97893b;

    /* compiled from: AutotekaWaitingForPaymentState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState$Error;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends AutotekaWaitingForPaymentState {

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        @k
        public final WaitingForPaymentErrorItem f97894e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ApiError f97895f;

        /* compiled from: AutotekaWaitingForPaymentState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(WaitingForPaymentErrorItem.CREATOR.createFromParcel(parcel), (ApiError) parcel.readParcelable(Error.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(@k WaitingForPaymentErrorItem waitingForPaymentErrorItem, @k ApiError apiError) {
            super(waitingForPaymentErrorItem, null);
            this.f97894e = waitingForPaymentErrorItem;
            this.f97895f = apiError;
        }

        @Override // com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentState
        /* renamed from: c */
        public final com.avito.conveyor_item.a getF97893b() {
            return this.f97894e;
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
            return L.f(this.f97894e, error.f97894e) && L.f(this.f97895f, error.f97895f);
        }

        public final int hashCode() {
            return this.f97895f.hashCode() + (this.f97894e.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(item=");
            sb2.append(this.f97894e);
            sb2.append(", apiError=");
            return c.n(sb2, this.f97895f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f97894e.writeToParcel(parcel, i12);
            parcel.writeParcelable(this.f97895f, i12);
        }
    }

    /* compiled from: AutotekaWaitingForPaymentState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState$Response;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Response extends AutotekaWaitingForPaymentState {

        @k
        public static final Parcelable.Creator<Response> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        @k
        public final WaitingForPaymentResponseItem f97896e;

        /* compiled from: AutotekaWaitingForPaymentState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Response> {
            @Override // android.os.Parcelable.Creator
            public final Response createFromParcel(Parcel parcel) {
                return new Response(WaitingForPaymentResponseItem.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Response[] newArray(int i12) {
                return new Response[i12];
            }
        }

        public Response(@k WaitingForPaymentResponseItem waitingForPaymentResponseItem) {
            super(waitingForPaymentResponseItem, null);
            this.f97896e = waitingForPaymentResponseItem;
        }

        @Override // com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentState
        /* renamed from: c */
        public final com.avito.conveyor_item.a getF97893b() {
            return this.f97896e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Response) && L.f(this.f97896e, ((Response) obj).f97896e);
        }

        public final int hashCode() {
            return this.f97896e.hashCode();
        }

        @k
        public final String toString() {
            return "Response(item=" + this.f97896e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f97896e.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: AutotekaWaitingForPaymentState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState$Waiting;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Waiting extends AutotekaWaitingForPaymentState {

        @k
        public static final Parcelable.Creator<Waiting> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        @k
        public final WaitingForPaymentItem f97897e;

        /* compiled from: AutotekaWaitingForPaymentState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Waiting> {
            @Override // android.os.Parcelable.Creator
            public final Waiting createFromParcel(Parcel parcel) {
                return new Waiting(WaitingForPaymentItem.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Waiting[] newArray(int i12) {
                return new Waiting[i12];
            }
        }

        public Waiting(@k WaitingForPaymentItem waitingForPaymentItem) {
            super(waitingForPaymentItem, null);
            this.f97897e = waitingForPaymentItem;
        }

        @Override // com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentState
        /* renamed from: c */
        public final com.avito.conveyor_item.a getF97893b() {
            return this.f97897e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Waiting) && L.f(this.f97897e, ((Waiting) obj).f97897e);
        }

        public final int hashCode() {
            return this.f97897e.f97029b.hashCode();
        }

        @k
        public final String toString() {
            return "Waiting(item=" + this.f97897e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f97897e.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: AutotekaWaitingForPaymentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState$a;", "", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public AutotekaWaitingForPaymentState(com.avito.conveyor_item.a aVar, C42822w c42822w) {
        this.f97893b = aVar;
    }

    @k
    /* renamed from: c, reason: from getter */
    public com.avito.conveyor_item.a getF97893b() {
        return this.f97893b;
    }
}
