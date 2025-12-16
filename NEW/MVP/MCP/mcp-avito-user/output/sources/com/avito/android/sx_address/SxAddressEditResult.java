package com.avito.android.sx_address;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressDeeplinkResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/SxAddressEditResult;", "Lcom/avito/android/sx_address/SxAddressLinkResult;", "Failure", "Success", "Lcom/avito/android/sx_address/SxAddressEditResult$Failure;", "Lcom/avito/android/sx_address/SxAddressEditResult$Success;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SxAddressEditResult extends SxAddressLinkResult {

    /* compiled from: SxAddressDeeplinkResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/SxAddressEditResult$Failure;", "Lcom/avito/android/sx_address/SxAddressEditResult;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure implements SxAddressEditResult {

        @k
        public static final Parcelable.Creator<Failure> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f292537b;

        /* compiled from: SxAddressDeeplinkResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Failure> {
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                return new Failure((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i12) {
                return new Failure[i12];
            }
        }

        public Failure(@k Throwable th2) {
            this.f292537b = th2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && L.f(this.f292537b, ((Failure) obj).f292537b);
        }

        public final int hashCode() {
            return this.f292537b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Failure(error="), this.f292537b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeSerializable(this.f292537b);
        }
    }

    /* compiled from: SxAddressDeeplinkResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/SxAddressEditResult$Success;", "Lcom/avito/android/sx_address/SxAddressEditResult;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success implements SxAddressEditResult {

        @k
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f292538b;

        /* compiled from: SxAddressDeeplinkResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        public Success(@l String str) {
            this.f292538b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && L.f(this.f292538b, ((Success) obj).f292538b);
        }

        public final int hashCode() {
            String str = this.f292538b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Success(address="), this.f292538b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f292538b);
        }
    }
}
