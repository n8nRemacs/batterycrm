package com.avito.android.early_access.adapter.selectable_price;

import Jx.InterfaceC14257a;
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

/* compiled from: EarlyAccessSelectablePriceItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access/adapter/selectable_price/EarlyAccessSelectablePriceItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "LJx/a;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessSelectablePriceItem implements ParcelableItem, InterfaceC14257a {

    @k
    public static final Parcelable.Creator<EarlyAccessSelectablePriceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145156b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f145157c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f145158d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f145159e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f145160f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f145161g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f145162h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f145163i;

    /* compiled from: EarlyAccessSelectablePriceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessSelectablePriceItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessSelectablePriceItem createFromParcel(Parcel parcel) {
            return new EarlyAccessSelectablePriceItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessSelectablePriceItem[] newArray(int i12) {
            return new EarlyAccessSelectablePriceItem[i12];
        }
    }

    public EarlyAccessSelectablePriceItem(@k String str, @k String str2, @k String str3, @k String str4, boolean z12, @l String str5, @l String str6, @l String str7) {
        this.f145156b = str;
        this.f145157c = str2;
        this.f145158d = z12;
        this.f145159e = str3;
        this.f145160f = str4;
        this.f145161g = str5;
        this.f145162h = str6;
        this.f145163i = str7;
    }

    public static EarlyAccessSelectablePriceItem a(EarlyAccessSelectablePriceItem earlyAccessSelectablePriceItem, boolean z12) {
        String str = earlyAccessSelectablePriceItem.f145156b;
        String str2 = earlyAccessSelectablePriceItem.f145157c;
        String str3 = earlyAccessSelectablePriceItem.f145159e;
        String str4 = earlyAccessSelectablePriceItem.f145160f;
        String str5 = earlyAccessSelectablePriceItem.f145161g;
        String str6 = earlyAccessSelectablePriceItem.f145162h;
        String str7 = earlyAccessSelectablePriceItem.f145163i;
        earlyAccessSelectablePriceItem.getClass();
        return new EarlyAccessSelectablePriceItem(str, str2, str3, str4, z12, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessSelectablePriceItem)) {
            return false;
        }
        EarlyAccessSelectablePriceItem earlyAccessSelectablePriceItem = (EarlyAccessSelectablePriceItem) obj;
        return L.f(this.f145156b, earlyAccessSelectablePriceItem.f145156b) && L.f(this.f145157c, earlyAccessSelectablePriceItem.f145157c) && this.f145158d == earlyAccessSelectablePriceItem.f145158d && L.f(this.f145159e, earlyAccessSelectablePriceItem.f145159e) && L.f(this.f145160f, earlyAccessSelectablePriceItem.f145160f) && L.f(this.f145161g, earlyAccessSelectablePriceItem.f145161g) && L.f(this.f145162h, earlyAccessSelectablePriceItem.f145162h) && L.f(this.f145163i, earlyAccessSelectablePriceItem.f145163i);
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
        return this.f145156b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(r.i(H.d(this.f145156b.hashCode() * 31, 31, this.f145157c), 31, this.f145158d), 31, this.f145159e), 31, this.f145160f);
        String str = this.f145161g;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f145162h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f145163i;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessSelectablePriceItem(stringId=");
        sb2.append(this.f145156b);
        sb2.append(", itemId=");
        sb2.append(this.f145157c);
        sb2.append(", selected=");
        sb2.append(this.f145158d);
        sb2.append(", title=");
        sb2.append(this.f145159e);
        sb2.append(", price=");
        sb2.append(this.f145160f);
        sb2.append(", oldPrice=");
        sb2.append(this.f145161g);
        sb2.append(", discount=");
        sb2.append(this.f145162h);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f145163i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145156b);
        parcel.writeString(this.f145157c);
        parcel.writeInt(this.f145158d ? 1 : 0);
        parcel.writeString(this.f145159e);
        parcel.writeString(this.f145160f);
        parcel.writeString(this.f145161g);
        parcel.writeString(this.f145162h);
        parcel.writeString(this.f145163i);
    }

    public /* synthetic */ EarlyAccessSelectablePriceItem(String str, String str2, boolean z12, String str3, String str4, String str5, String str6, String str7, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessSelectablePriceItem.class.getName() : str, str2, str3, str4, z12, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, (i12 & 128) != 0 ? null : str7);
    }

    public EarlyAccessSelectablePriceItem(@k ReEarlyAccessData.Package r12, boolean z12) {
        this(null, r12.f145354h, z12, r12.f145348b, r12.f145349c, r12.f145352f, r12.f145353g, r12.f145351e, 1, null);
    }
}
