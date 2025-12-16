package com.avito.android.sx_address.new_address.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HideAddress.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/HideAddress;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HideAddress implements Parcelable {

    @k
    public static final Parcelable.Creator<HideAddress> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f293614b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f293615c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f293616d;

    /* compiled from: HideAddress.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HideAddress> {
        @Override // android.os.Parcelable.Creator
        public final HideAddress createFromParcel(Parcel parcel) {
            return new HideAddress(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final HideAddress[] newArray(int i12) {
            return new HideAddress[i12];
        }
    }

    public HideAddress(@k String str, @k String str2, boolean z12) {
        this.f293614b = str;
        this.f293615c = str2;
        this.f293616d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HideAddress)) {
            return false;
        }
        HideAddress hideAddress = (HideAddress) obj;
        return L.f(this.f293614b, hideAddress.f293614b) && L.f(this.f293615c, hideAddress.f293615c) && this.f293616d == hideAddress.f293616d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f293616d) + H.d(this.f293614b.hashCode() * 31, 31, this.f293615c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HideAddress(id=");
        sb2.append(this.f293614b);
        sb2.append(", title=");
        sb2.append(this.f293615c);
        sb2.append(", value=");
        return r.x(sb2, this.f293616d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f293614b);
        parcel.writeString(this.f293615c);
        parcel.writeInt(this.f293616d ? 1 : 0);
    }
}
