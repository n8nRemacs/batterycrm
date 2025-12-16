package com.avito.android;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: SxAddressListLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/SelectAddressListLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "SelectAddressListResult", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes10.dex */
public final class SelectAddressListLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<SelectAddressListLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f67539b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Long f67540c;

    /* compiled from: SxAddressListLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/SelectAddressListLink$SelectAddressListResult;", "LJu/c$b;", "Landroid/os/Parcelable;", "Failure", "Success", "Lcom/avito/android/SelectAddressListLink$SelectAddressListResult$Failure;", "Lcom/avito/android/SelectAddressListLink$SelectAddressListResult$Success;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SelectAddressListResult extends InterfaceC14249c.b, Parcelable {

        /* compiled from: SxAddressListLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/SelectAddressListLink$SelectAddressListResult$Failure;", "Lcom/avito/android/SelectAddressListLink$SelectAddressListResult;", "<init>", "()V", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Failure implements SelectAddressListResult {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Failure f67541b = new Failure();

            @Y61.k
            public static final Parcelable.Creator<Failure> CREATOR = new a();

            /* compiled from: SxAddressListLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Failure> {
                @Override // android.os.Parcelable.Creator
                public final Failure createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Failure.f67541b;
                }

                @Override // android.os.Parcelable.Creator
                public final Failure[] newArray(int i12) {
                    return new Failure[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Failure);
            }

            public final int hashCode() {
                return -2137083962;
            }

            @Y61.k
            public final String toString() {
                return "Failure";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: SxAddressListLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/SelectAddressListLink$SelectAddressListResult$Success;", "Lcom/avito/android/SelectAddressListLink$SelectAddressListResult;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success implements SelectAddressListResult {

            @Y61.k
            public static final Parcelable.Creator<Success> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final AddressParameter.Value f67542b;

            /* compiled from: SxAddressListLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Success> {
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    return new Success((AddressParameter.Value) parcel.readParcelable(Success.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i12) {
                    return new Success[i12];
                }
            }

            public Success(@Y61.k AddressParameter.Value value) {
                this.f67542b = value;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && kotlin.jvm.internal.L.f(this.f67542b, ((Success) obj).f67542b);
            }

            public final int hashCode() {
                return this.f67542b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Success(address=" + this.f67542b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f67542b, i12);
            }
        }
    }

    /* compiled from: SxAddressListLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectAddressListLink> {
        @Override // android.os.Parcelable.Creator
        public final SelectAddressListLink createFromParcel(Parcel parcel) {
            return new SelectAddressListLink(parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final SelectAddressListLink[] newArray(int i12) {
            return new SelectAddressListLink[i12];
        }
    }

    public SelectAddressListLink(long j12, @Y61.l Long l12) {
        this.f67539b = j12;
        this.f67540c = l12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f67539b);
        Long l12 = this.f67540c;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            com.akita.compose.theme.re23.style.C0.m(parcel, 1, l12);
        }
    }
}
