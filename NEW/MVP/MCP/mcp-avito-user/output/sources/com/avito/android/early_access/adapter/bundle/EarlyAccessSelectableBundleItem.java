package com.avito.android.early_access.adapter.bundle;

import Jx.InterfaceC14257a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessBundleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access/adapter/bundle/EarlyAccessSelectableBundleItem;", "Lcom/avito/android/early_access/adapter/bundle/EarlyAccessBundleItem;", "LJx/a;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessSelectableBundleItem extends EarlyAccessBundleItem implements InterfaceC14257a {

    @Y61.k
    public static final Parcelable.Creator<EarlyAccessSelectableBundleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f145099b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f145100c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f145101d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f145102e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f145103f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f145104g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f145105h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f145106i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f145107j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f145108k;

    /* compiled from: EarlyAccessBundleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessSelectableBundleItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessSelectableBundleItem createFromParcel(Parcel parcel) {
            return new EarlyAccessSelectableBundleItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessSelectableBundleItem[] newArray(int i12) {
            return new EarlyAccessSelectableBundleItem[i12];
        }
    }

    public /* synthetic */ EarlyAccessSelectableBundleItem(String str, String str2, boolean z12, String str3, String str4, String str5, String str6, String str7, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessSelectableBundleItem.class.getName() : str, str2, (i12 & 4) != 0 ? false : z12, str3, str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, (i12 & 128) != 0 ? null : str7, (i12 & 256) != 0 ? true : z13, (i12 & 512) != 0 ? true : z14);
    }

    public static EarlyAccessSelectableBundleItem a(EarlyAccessSelectableBundleItem earlyAccessSelectableBundleItem, boolean z12) {
        String str = earlyAccessSelectableBundleItem.f145099b;
        String str2 = earlyAccessSelectableBundleItem.f145100c;
        String str3 = earlyAccessSelectableBundleItem.f145102e;
        String str4 = earlyAccessSelectableBundleItem.f145103f;
        String str5 = earlyAccessSelectableBundleItem.f145104g;
        String str6 = earlyAccessSelectableBundleItem.f145105h;
        String str7 = earlyAccessSelectableBundleItem.f145106i;
        boolean z13 = earlyAccessSelectableBundleItem.f145107j;
        boolean z14 = earlyAccessSelectableBundleItem.f145108k;
        earlyAccessSelectableBundleItem.getClass();
        return new EarlyAccessSelectableBundleItem(str, str2, z12, str3, str4, str5, str6, str7, z13, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessSelectableBundleItem)) {
            return false;
        }
        EarlyAccessSelectableBundleItem earlyAccessSelectableBundleItem = (EarlyAccessSelectableBundleItem) obj;
        return L.f(this.f145099b, earlyAccessSelectableBundleItem.f145099b) && L.f(this.f145100c, earlyAccessSelectableBundleItem.f145100c) && this.f145101d == earlyAccessSelectableBundleItem.f145101d && L.f(this.f145102e, earlyAccessSelectableBundleItem.f145102e) && L.f(this.f145103f, earlyAccessSelectableBundleItem.f145103f) && L.f(this.f145104g, earlyAccessSelectableBundleItem.f145104g) && L.f(this.f145105h, earlyAccessSelectableBundleItem.f145105h) && L.f(this.f145106i, earlyAccessSelectableBundleItem.f145106i) && this.f145107j == earlyAccessSelectableBundleItem.f145107j && this.f145108k == earlyAccessSelectableBundleItem.f145108k;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145099b() {
        return this.f145099b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(r.i(H.d(this.f145099b.hashCode() * 31, 31, this.f145100c), 31, this.f145101d), 31, this.f145102e), 31, this.f145103f);
        String str = this.f145104g;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f145105h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f145106i;
        return Boolean.hashCode(this.f145108k) + r.i((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f145107j);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessSelectableBundleItem(stringId=");
        sb2.append(this.f145099b);
        sb2.append(", itemId=");
        sb2.append(this.f145100c);
        sb2.append(", selected=");
        sb2.append(this.f145101d);
        sb2.append(", title=");
        sb2.append(this.f145102e);
        sb2.append(", price=");
        sb2.append(this.f145103f);
        sb2.append(", oldPrice=");
        sb2.append(this.f145104g);
        sb2.append(", discount=");
        sb2.append(this.f145105h);
        sb2.append(", description=");
        sb2.append(this.f145106i);
        sb2.append(", isBoldTitle=");
        sb2.append(this.f145107j);
        sb2.append(", isSubtitleColorChanges=");
        return r.x(sb2, this.f145108k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f145099b);
        parcel.writeString(this.f145100c);
        parcel.writeInt(this.f145101d ? 1 : 0);
        parcel.writeString(this.f145102e);
        parcel.writeString(this.f145103f);
        parcel.writeString(this.f145104g);
        parcel.writeString(this.f145105h);
        parcel.writeString(this.f145106i);
        parcel.writeInt(this.f145107j ? 1 : 0);
        parcel.writeInt(this.f145108k ? 1 : 0);
    }

    public EarlyAccessSelectableBundleItem(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, boolean z13, boolean z14) {
        super(null);
        this.f145099b = str;
        this.f145100c = str2;
        this.f145101d = z12;
        this.f145102e = str3;
        this.f145103f = str4;
        this.f145104g = str5;
        this.f145105h = str6;
        this.f145106i = str7;
        this.f145107j = z13;
        this.f145108k = z14;
    }

    public /* synthetic */ EarlyAccessSelectableBundleItem(ReEarlyAccessData.Package r22, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(r22, z12, (i12 & 4) != 0 ? true : z13, (i12 & 8) != 0 ? true : z14);
    }

    public EarlyAccessSelectableBundleItem(@Y61.k ReEarlyAccessData.Package r14, boolean z12, boolean z13, boolean z14) {
        this(null, r14.f145354h, z12, r14.f145348b, r14.f145349c, r14.f145352f, r14.f145353g, r14.f145355i, z13, z14, 1, null);
    }
}
