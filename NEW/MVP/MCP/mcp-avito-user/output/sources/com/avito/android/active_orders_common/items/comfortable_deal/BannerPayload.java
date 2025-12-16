package com.avito.android.active_orders_common.items.comfortable_deal;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders_common/items/comfortable_deal/BannerPayload;", "Landroid/os/Parcelable;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BannerPayload implements Parcelable {

    @k
    public static final Parcelable.Creator<BannerPayload> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f68317b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f68318c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f68319d;

    /* compiled from: ComfortableDealItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BannerPayload> {
        @Override // android.os.Parcelable.Creator
        public final BannerPayload createFromParcel(Parcel parcel) {
            return new BannerPayload(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BannerPayload[] newArray(int i12) {
            return new BannerPayload[i12];
        }
    }

    public BannerPayload(@l String str, @l String str2, @l String str3) {
        this.f68317b = str;
        this.f68318c = str2;
        this.f68319d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerPayload)) {
            return false;
        }
        BannerPayload bannerPayload = (BannerPayload) obj;
        return L.f(this.f68317b, bannerPayload.f68317b) && L.f(this.f68318c, bannerPayload.f68318c) && L.f(this.f68319d, bannerPayload.f68319d);
    }

    public final int hashCode() {
        String str = this.f68317b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f68318c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f68319d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerPayload(position=");
        sb2.append(this.f68317b);
        sb2.append(", page=");
        sb2.append(this.f68318c);
        sb2.append(", bannerId=");
        return C22026a.c(sb2, this.f68319d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f68317b);
        parcel.writeString(this.f68318c);
        parcel.writeString(this.f68319d);
    }
}
