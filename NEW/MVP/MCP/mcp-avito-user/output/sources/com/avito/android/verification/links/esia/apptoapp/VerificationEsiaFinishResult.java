package com.avito.android.verification.links.esia.apptoapp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.esiasdk.android.EsiaErrorResponse;
import com.esiasdk.android.esiaLoginClient.TokenParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationEsiaFinishResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/verification/links/esia/apptoapp/VerificationEsiaFinishResult;", "Landroid/os/Parcelable;", "Canceled", "Failed", "Success", "Lcom/avito/android/verification/links/esia/apptoapp/VerificationEsiaFinishResult$Canceled;", "Lcom/avito/android/verification/links/esia/apptoapp/VerificationEsiaFinishResult$Failed;", "Lcom/avito/android/verification/links/esia/apptoapp/VerificationEsiaFinishResult$Success;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface VerificationEsiaFinishResult extends Parcelable {

    /* compiled from: VerificationEsiaFinishResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/esia/apptoapp/VerificationEsiaFinishResult$Canceled;", "Lcom/avito/android/verification/links/esia/apptoapp/VerificationEsiaFinishResult;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Canceled implements VerificationEsiaFinishResult {

        @k
        public static final Parcelable.Creator<Canceled> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final EsiaErrorResponse f324227b;

        /* compiled from: VerificationEsiaFinishResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Canceled> {
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                return new Canceled((EsiaErrorResponse) parcel.readParcelable(Canceled.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i12) {
                return new Canceled[i12];
            }
        }

        public Canceled(@k EsiaErrorResponse esiaErrorResponse) {
            this.f324227b = esiaErrorResponse;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Canceled) && L.f(this.f324227b, ((Canceled) obj).f324227b);
        }

        public final int hashCode() {
            return this.f324227b.hashCode();
        }

        @k
        public final String toString() {
            return "Canceled(errorResponse=" + this.f324227b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f324227b, i12);
        }
    }

    /* compiled from: VerificationEsiaFinishResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/esia/apptoapp/VerificationEsiaFinishResult$Failed;", "Lcom/avito/android/verification/links/esia/apptoapp/VerificationEsiaFinishResult;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failed implements VerificationEsiaFinishResult {

        @k
        public static final Parcelable.Creator<Failed> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final EsiaErrorResponse f324228b;

        /* compiled from: VerificationEsiaFinishResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Failed> {
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                return new Failed((EsiaErrorResponse) parcel.readParcelable(Failed.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i12) {
                return new Failed[i12];
            }
        }

        public Failed(@k EsiaErrorResponse esiaErrorResponse) {
            this.f324228b = esiaErrorResponse;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && L.f(this.f324228b, ((Failed) obj).f324228b);
        }

        public final int hashCode() {
            return this.f324228b.hashCode();
        }

        @k
        public final String toString() {
            return "Failed(errorResponse=" + this.f324228b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f324228b, i12);
        }
    }

    /* compiled from: VerificationEsiaFinishResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/esia/apptoapp/VerificationEsiaFinishResult$Success;", "Lcom/avito/android/verification/links/esia/apptoapp/VerificationEsiaFinishResult;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Success implements VerificationEsiaFinishResult {

        @k
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TokenParameters f324229b;

        /* compiled from: VerificationEsiaFinishResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success((TokenParameters) parcel.readParcelable(Success.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        public Success(@k TokenParameters tokenParameters) {
            this.f324229b = tokenParameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f324229b, i12);
        }
    }
}
