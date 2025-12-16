package com.avito.android.early_access.adapter.short_bundle;

import Jx.InterfaceC14257a;
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

/* compiled from: EarlyAccessShortBundleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access/adapter/short_bundle/EarlyAccessShortBundleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "LJx/a;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessShortBundleItem implements ParcelableItem, InterfaceC14257a {

    @Y61.k
    public static final Parcelable.Creator<EarlyAccessShortBundleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f145178b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f145179c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f145180d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f145181e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f145182f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f145183g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f145184h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f145185i;

    /* compiled from: EarlyAccessShortBundleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessShortBundleItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessShortBundleItem createFromParcel(Parcel parcel) {
            return new EarlyAccessShortBundleItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessShortBundleItem[] newArray(int i12) {
            return new EarlyAccessShortBundleItem[i12];
        }
    }

    public EarlyAccessShortBundleItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, boolean z12, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7) {
        this.f145178b = str;
        this.f145179c = str2;
        this.f145180d = z12;
        this.f145181e = str3;
        this.f145182f = str4;
        this.f145183g = str5;
        this.f145184h = str6;
        this.f145185i = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessShortBundleItem)) {
            return false;
        }
        EarlyAccessShortBundleItem earlyAccessShortBundleItem = (EarlyAccessShortBundleItem) obj;
        return L.f(this.f145178b, earlyAccessShortBundleItem.f145178b) && L.f(this.f145179c, earlyAccessShortBundleItem.f145179c) && this.f145180d == earlyAccessShortBundleItem.f145180d && L.f(this.f145181e, earlyAccessShortBundleItem.f145181e) && L.f(this.f145182f, earlyAccessShortBundleItem.f145182f) && L.f(this.f145183g, earlyAccessShortBundleItem.f145183g) && L.f(this.f145184h, earlyAccessShortBundleItem.f145184h) && L.f(this.f145185i, earlyAccessShortBundleItem.f145185i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145229b() {
        return this.f145178b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(r.i(H.d(this.f145178b.hashCode() * 31, 31, this.f145179c), 31, this.f145180d), 31, this.f145181e), 31, this.f145182f);
        String str = this.f145183g;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f145184h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f145185i;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessShortBundleItem(stringId=");
        sb2.append(this.f145178b);
        sb2.append(", itemId=");
        sb2.append(this.f145179c);
        sb2.append(", selected=");
        sb2.append(this.f145180d);
        sb2.append(", title=");
        sb2.append(this.f145181e);
        sb2.append(", price=");
        sb2.append(this.f145182f);
        sb2.append(", discount=");
        sb2.append(this.f145183g);
        sb2.append(", oldPrice=");
        sb2.append(this.f145184h);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f145185i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f145178b);
        parcel.writeString(this.f145179c);
        parcel.writeInt(this.f145180d ? 1 : 0);
        parcel.writeString(this.f145181e);
        parcel.writeString(this.f145182f);
        parcel.writeString(this.f145183g);
        parcel.writeString(this.f145184h);
        parcel.writeString(this.f145185i);
    }

    public /* synthetic */ EarlyAccessShortBundleItem(String str, String str2, boolean z12, String str3, String str4, String str5, String str6, String str7, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessShortBundleItem.class.getName() : str, str2, str3, str4, z12, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, (i12 & 128) != 0 ? null : str7);
    }

    public EarlyAccessShortBundleItem(@Y61.k ReEarlyAccessData.Package r12, boolean z12) {
        this(null, r12.f145354h, z12, r12.f145348b, r12.f145349c, r12.f145353g, r12.f145352f, r12.f145355i, 1, null);
    }
}
