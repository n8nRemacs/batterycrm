package com.avito.android.sx_address;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressDeeplinkResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/SxAddressDeleteResult;", "Lcom/avito/android/sx_address/SxAddressLinkResult;", "Failure", "Success", "Lcom/avito/android/sx_address/SxAddressDeleteResult$Failure;", "Lcom/avito/android/sx_address/SxAddressDeleteResult$Success;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SxAddressDeleteResult extends SxAddressLinkResult {

    /* compiled from: SxAddressDeeplinkResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/SxAddressDeleteResult$Failure;", "Lcom/avito/android/sx_address/SxAddressDeleteResult;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure implements SxAddressDeleteResult {

        @k
        public static final Parcelable.Creator<Failure> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f292529b;

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
            this.f292529b = th2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && L.f(this.f292529b, ((Failure) obj).f292529b);
        }

        public final int hashCode() {
            return this.f292529b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Failure(error="), this.f292529b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeSerializable(this.f292529b);
        }
    }

    /* compiled from: SxAddressDeeplinkResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/SxAddressDeleteResult$Success;", "Lcom/avito/android/sx_address/SxAddressDeleteResult;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success implements SxAddressDeleteResult {

        @k
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f292530b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Long f292531c;

        /* compiled from: SxAddressDeeplinkResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        public Success(@l String str, @l Long l12) {
            this.f292530b = str;
            this.f292531c = l12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return L.f(this.f292530b, success.f292530b) && L.f(this.f292531c, success.f292531c);
        }

        public final int hashCode() {
            String str = this.f292530b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l12 = this.f292531c;
            return iHashCode + (l12 != null ? l12.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(address=");
            sb2.append(this.f292530b);
            sb2.append(", addressCount=");
            return m.m(sb2, this.f292531c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f292530b);
            Long l12 = this.f292531c;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
        }
    }
}
