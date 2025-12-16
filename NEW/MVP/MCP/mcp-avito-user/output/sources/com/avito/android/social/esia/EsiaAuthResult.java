package com.avito.android.social.esia;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.esiasdk.android.EsiaErrorResponse;
import com.esiasdk.android.esiaLoginClient.TokenParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EsiaAuthResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/social/esia/EsiaAuthResult;", "Landroid/os/Parcelable;", "Canceled", "Failed", "Success", "Lcom/avito/android/social/esia/EsiaAuthResult$Canceled;", "Lcom/avito/android/social/esia/EsiaAuthResult$Failed;", "Lcom/avito/android/social/esia/EsiaAuthResult$Success;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EsiaAuthResult extends Parcelable {

    /* compiled from: EsiaAuthResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/esia/EsiaAuthResult$Canceled;", "Lcom/avito/android/social/esia/EsiaAuthResult;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Canceled implements EsiaAuthResult {

        @k
        public static final Parcelable.Creator<Canceled> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final EsiaErrorResponse f284382b;

        /* compiled from: EsiaAuthResult.kt */
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
            this.f284382b = esiaErrorResponse;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Canceled) && L.f(this.f284382b, ((Canceled) obj).f284382b);
        }

        public final int hashCode() {
            return this.f284382b.hashCode();
        }

        @k
        public final String toString() {
            return "Canceled(errorResponse=" + this.f284382b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f284382b, i12);
        }
    }

    /* compiled from: EsiaAuthResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/esia/EsiaAuthResult$Failed;", "Lcom/avito/android/social/esia/EsiaAuthResult;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failed implements EsiaAuthResult {

        @k
        public static final Parcelable.Creator<Failed> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final EsiaErrorResponse f284383b;

        /* compiled from: EsiaAuthResult.kt */
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
            this.f284383b = esiaErrorResponse;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && L.f(this.f284383b, ((Failed) obj).f284383b);
        }

        public final int hashCode() {
            return this.f284383b.hashCode();
        }

        @k
        public final String toString() {
            return "Failed(errorResponse=" + this.f284383b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f284383b, i12);
        }
    }

    /* compiled from: EsiaAuthResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/esia/EsiaAuthResult$Success;", "Lcom/avito/android/social/esia/EsiaAuthResult;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Success implements EsiaAuthResult {

        @k
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TokenParameters f284384b;

        /* compiled from: EsiaAuthResult.kt */
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
            this.f284384b = tokenParameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f284384b, i12);
        }
    }
}
