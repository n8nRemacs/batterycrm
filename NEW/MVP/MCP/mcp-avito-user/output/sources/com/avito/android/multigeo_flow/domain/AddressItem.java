package com.avito.android.multigeo_flow.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddressItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/domain/AddressItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AddressItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AddressItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f206874b;

    /* renamed from: c, reason: collision with root package name */
    public final int f206875c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f206876d;

    /* renamed from: e, reason: collision with root package name */
    public final double f206877e;

    /* renamed from: f, reason: collision with root package name */
    public final double f206878f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f206879g;

    /* compiled from: AddressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressItem> {
        @Override // android.os.Parcelable.Creator
        public final AddressItem createFromParcel(Parcel parcel) {
            return new AddressItem(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressItem[] newArray(int i12) {
            return new AddressItem[i12];
        }
    }

    public AddressItem(@k String str, int i12, @l Integer num, double d12, double d13, @k String str2) {
        this.f206874b = str;
        this.f206875c = i12;
        this.f206876d = num;
        this.f206877e = d12;
        this.f206878f = d13;
        this.f206879g = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressItem)) {
            return false;
        }
        AddressItem addressItem = (AddressItem) obj;
        return L.f(this.f206874b, addressItem.f206874b) && this.f206875c == addressItem.f206875c && L.f(this.f206876d, addressItem.f206876d) && Double.compare(this.f206877e, addressItem.f206877e) == 0 && Double.compare(this.f206878f, addressItem.f206878f) == 0 && L.f(this.f206879g, addressItem.f206879g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80137b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80138c() {
        return this.f206879g;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f206875c, this.f206874b.hashCode() * 31, 31);
        Integer num = this.f206876d;
        return this.f206879g.hashCode() + androidx.compose.ui.graphics.colorspace.e.d(androidx.compose.ui.graphics.colorspace.e.d((iE2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f206877e), 31, this.f206878f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressItem(address=");
        sb2.append(this.f206874b);
        sb2.append(", addressId=");
        sb2.append(this.f206875c);
        sb2.append(", locationId=");
        sb2.append(this.f206876d);
        sb2.append(", longitude=");
        sb2.append(this.f206877e);
        sb2.append(", latitude=");
        sb2.append(this.f206878f);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f206879g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f206874b);
        parcel.writeInt(this.f206875c);
        Integer num = this.f206876d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeDouble(this.f206877e);
        parcel.writeDouble(this.f206878f);
        parcel.writeString(this.f206879g);
    }

    public /* synthetic */ AddressItem(String str, int i12, Integer num, double d12, double d13, String str2, int i13, C42822w c42822w) {
        this(str, i12, num, d12, d13, (i13 & 32) != 0 ? "ADDRESS_ID" : str2);
    }
}
