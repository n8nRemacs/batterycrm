package com.avito.android.important_addresses_selection.presentation.items.address;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesSelectionAddressItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/items/address/ImportantAddressesSelectionAddressItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImportantAddressesSelectionAddressItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ImportantAddressesSelectionAddressItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f169839b;

    /* renamed from: c, reason: collision with root package name */
    public final int f169840c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f169841d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f169842e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f169843f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f169844g;

    /* compiled from: ImportantAddressesSelectionAddressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImportantAddressesSelectionAddressItem> {
        @Override // android.os.Parcelable.Creator
        public final ImportantAddressesSelectionAddressItem createFromParcel(Parcel parcel) {
            return new ImportantAddressesSelectionAddressItem(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ImportantAddressesSelectionAddressItem[] newArray(int i12) {
            return new ImportantAddressesSelectionAddressItem[i12];
        }
    }

    public ImportantAddressesSelectionAddressItem(int i12, @k String str, @k String str2, @k String str3, boolean z12, boolean z13) {
        this.f169839b = str;
        this.f169840c = i12;
        this.f169841d = str2;
        this.f169842e = str3;
        this.f169843f = z12;
        this.f169844g = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportantAddressesSelectionAddressItem)) {
            return false;
        }
        ImportantAddressesSelectionAddressItem importantAddressesSelectionAddressItem = (ImportantAddressesSelectionAddressItem) obj;
        return L.f(this.f169839b, importantAddressesSelectionAddressItem.f169839b) && this.f169840c == importantAddressesSelectionAddressItem.f169840c && L.f(this.f169841d, importantAddressesSelectionAddressItem.f169841d) && L.f(this.f169842e, importantAddressesSelectionAddressItem.f169842e) && this.f169843f == importantAddressesSelectionAddressItem.f169843f && this.f169844g == importantAddressesSelectionAddressItem.f169844g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF155325b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154833b() {
        return this.f169839b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f169844g) + r.i(H.d(H.d(r.e(this.f169840c, this.f169839b.hashCode() * 31, 31), 31, this.f169841d), 31, this.f169842e), 31, this.f169843f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImportantAddressesSelectionAddressItem(stringId=");
        sb2.append(this.f169839b);
        sb2.append(", addressId=");
        sb2.append(this.f169840c);
        sb2.append(", title=");
        sb2.append(this.f169841d);
        sb2.append(", location=");
        sb2.append(this.f169842e);
        sb2.append(", checked=");
        sb2.append(this.f169843f);
        sb2.append(", enabled=");
        return r.x(sb2, this.f169844g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f169839b);
        parcel.writeInt(this.f169840c);
        parcel.writeString(this.f169841d);
        parcel.writeString(this.f169842e);
        parcel.writeInt(this.f169843f ? 1 : 0);
        parcel.writeInt(this.f169844g ? 1 : 0);
    }
}
