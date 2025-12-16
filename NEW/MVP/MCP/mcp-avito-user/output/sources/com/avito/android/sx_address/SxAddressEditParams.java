package com.avito.android.sx_address;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.SxAddAddressSource;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SxNewAddressOpenParams.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/SxAddressEditParams;", "Lcom/avito/android/sx_address/SxAddressControl;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SxAddressEditParams implements SxAddressControl {

    @k
    public static final Parcelable.Creator<SxAddressEditParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f292532b;

    /* renamed from: c, reason: collision with root package name */
    public final long f292533c;

    /* renamed from: d, reason: collision with root package name */
    public final long f292534d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Boolean f292535e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SxAddAddressSource f292536f;

    /* compiled from: SxNewAddressOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SxAddressEditParams> {
        @Override // android.os.Parcelable.Creator
        public final SxAddressEditParams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            long j12 = parcel.readLong();
            long j13 = parcel.readLong();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SxAddressEditParams(string, j12, j13, boolValueOf, SxAddAddressSource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SxAddressEditParams[] newArray(int i12) {
            return new SxAddressEditParams[i12];
        }
    }

    public SxAddressEditParams(@l String str, long j12, long j13, @l Boolean bool, @k SxAddAddressSource sxAddAddressSource) {
        this.f292532b = str;
        this.f292533c = j12;
        this.f292534d = j13;
        this.f292535e = bool;
        this.f292536f = sxAddAddressSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SxAddressEditParams)) {
            return false;
        }
        SxAddressEditParams sxAddressEditParams = (SxAddressEditParams) obj;
        return L.f(this.f292532b, sxAddressEditParams.f292532b) && this.f292533c == sxAddressEditParams.f292533c && this.f292534d == sxAddressEditParams.f292534d && L.f(this.f292535e, sxAddressEditParams.f292535e) && this.f292536f == sxAddressEditParams.f292536f;
    }

    public final int hashCode() {
        String str = this.f292532b;
        int iG2 = r.g(r.g((str == null ? 0 : str.hashCode()) * 31, 31, this.f292533c), 31, this.f292534d);
        Boolean bool = this.f292535e;
        return this.f292536f.hashCode() + ((iG2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "SxAddressEditParams(esid=" + this.f292532b + ", sellerAddressId=" + this.f292533c + ", verticalId=" + this.f292534d + ", showsSuccessToast=" + this.f292535e + ", source=" + this.f292536f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f292532b);
        parcel.writeLong(this.f292533c);
        parcel.writeLong(this.f292534d);
        Boolean bool = this.f292535e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f292536f.name());
    }
}
