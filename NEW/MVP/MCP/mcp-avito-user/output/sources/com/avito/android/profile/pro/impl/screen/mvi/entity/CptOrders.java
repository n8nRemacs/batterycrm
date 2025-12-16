package com.avito.android.profile.pro.impl.screen.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DashboardAction.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/mvi/entity/CptOrders;", "Landroid/os/Parcelable;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CptOrders implements Parcelable {

    @k
    public static final Parcelable.Creator<CptOrders> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223694b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f223695c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f223696d;

    /* compiled from: DashboardAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CptOrders> {
        @Override // android.os.Parcelable.Creator
        public final CptOrders createFromParcel(Parcel parcel) {
            return new CptOrders(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CptOrders[] newArray(int i12) {
            return new CptOrders[i12];
        }
    }

    public CptOrders(@k String str, @l Long l12, @l Long l13) {
        this.f223694b = str;
        this.f223695c = l12;
        this.f223696d = l13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CptOrders)) {
            return false;
        }
        CptOrders cptOrders = (CptOrders) obj;
        return L.f(this.f223694b, cptOrders.f223694b) && L.f(this.f223695c, cptOrders.f223695c) && L.f(this.f223696d, cptOrders.f223696d);
    }

    public final int hashCode() {
        int iHashCode = this.f223694b.hashCode() * 31;
        Long l12 = this.f223695c;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f223696d;
        return iHashCode2 + (l13 != null ? l13.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptOrders(period=");
        sb2.append(this.f223694b);
        sb2.append(", price=");
        sb2.append(this.f223695c);
        sb2.append(", percent=");
        return m.m(sb2, this.f223696d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223694b);
        Long l12 = this.f223695c;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f223696d;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
    }
}
