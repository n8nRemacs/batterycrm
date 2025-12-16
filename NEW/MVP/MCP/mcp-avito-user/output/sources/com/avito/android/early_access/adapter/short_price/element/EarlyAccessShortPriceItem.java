package com.avito.android.early_access.adapter.short_price.element;

import Jx.InterfaceC14257a;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessPriceItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access/adapter/short_price/element/EarlyAccessShortPriceItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "LJx/a;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessShortPriceItem implements ParcelableItem, InterfaceC14257a {

    @k
    public static final Parcelable.Creator<EarlyAccessShortPriceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145229b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f145230c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f145231d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f145232e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f145233f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f145234g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f145235h;

    /* compiled from: EarlyAccessPriceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessShortPriceItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessShortPriceItem createFromParcel(Parcel parcel) {
            return new EarlyAccessShortPriceItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessShortPriceItem[] newArray(int i12) {
            return new EarlyAccessShortPriceItem[i12];
        }
    }

    public EarlyAccessShortPriceItem(@k String str, @k String str2, @k String str3, @k String str4, @l String str5, boolean z12, @l String str6) {
        this.f145229b = str;
        this.f145230c = str2;
        this.f145231d = z12;
        this.f145232e = str3;
        this.f145233f = str4;
        this.f145234g = str5;
        this.f145235h = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessShortPriceItem)) {
            return false;
        }
        EarlyAccessShortPriceItem earlyAccessShortPriceItem = (EarlyAccessShortPriceItem) obj;
        return L.f(this.f145229b, earlyAccessShortPriceItem.f145229b) && L.f(this.f145230c, earlyAccessShortPriceItem.f145230c) && this.f145231d == earlyAccessShortPriceItem.f145231d && L.f(this.f145232e, earlyAccessShortPriceItem.f145232e) && L.f(this.f145233f, earlyAccessShortPriceItem.f145233f) && L.f(this.f145234g, earlyAccessShortPriceItem.f145234g) && L.f(this.f145235h, earlyAccessShortPriceItem.f145235h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145229b() {
        return this.f145229b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(r.i(H.d(this.f145229b.hashCode() * 31, 31, this.f145230c), 31, this.f145231d), 31, this.f145232e), 31, this.f145233f);
        String str = this.f145234g;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f145235h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessShortPriceItem(stringId=");
        sb2.append(this.f145229b);
        sb2.append(", itemId=");
        sb2.append(this.f145230c);
        sb2.append(", selected=");
        sb2.append(this.f145231d);
        sb2.append(", title=");
        sb2.append(this.f145232e);
        sb2.append(", price=");
        sb2.append(this.f145233f);
        sb2.append(", oldPrice=");
        sb2.append(this.f145234g);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f145235h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145229b);
        parcel.writeString(this.f145230c);
        parcel.writeInt(this.f145231d ? 1 : 0);
        parcel.writeString(this.f145232e);
        parcel.writeString(this.f145233f);
        parcel.writeString(this.f145234g);
        parcel.writeString(this.f145235h);
    }

    public /* synthetic */ EarlyAccessShortPriceItem(String str, String str2, boolean z12, String str3, String str4, String str5, String str6, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessShortPriceItem.class.getName() : str, str2, str3, str4, (i12 & 32) != 0 ? null : str5, z12, (i12 & 64) != 0 ? null : str6);
    }

    public EarlyAccessShortPriceItem(@k ReEarlyAccessData.Package r112, boolean z12) {
        this(null, r112.f145354h, z12, r112.f145348b, r112.f145349c, r112.f145352f, r112.f145351e, 1, null);
    }
}
