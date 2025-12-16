package com.avito.android.profile_settings_extended.adapter.geo_v2.address;

import Rb0.InterfaceC15025a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedSettingsGeoV2AddressItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo_v2/address/ExtendedSettingsGeoV2AddressItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ExtendedSettingsGeoV2AddressItem implements SettingsListItem, InterfaceC15025a {

    @k
    public static final Parcelable.Creator<ExtendedSettingsGeoV2AddressItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229479b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f229480c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f229481d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f229482e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229483f;

    /* compiled from: ExtendedSettingsGeoV2AddressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedSettingsGeoV2AddressItem> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsGeoV2AddressItem createFromParcel(Parcel parcel) {
            return new ExtendedSettingsGeoV2AddressItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsGeoV2AddressItem[] newArray(int i12) {
            return new ExtendedSettingsGeoV2AddressItem[i12];
        }
    }

    public ExtendedSettingsGeoV2AddressItem(@k String str, @l String str2, @l String str3, boolean z12) {
        this.f229479b = str;
        this.f229480c = str2;
        this.f229481d = str3;
        this.f229482e = z12;
        this.f229483f = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedSettingsGeoV2AddressItem)) {
            return false;
        }
        ExtendedSettingsGeoV2AddressItem extendedSettingsGeoV2AddressItem = (ExtendedSettingsGeoV2AddressItem) obj;
        return L.f(this.f229479b, extendedSettingsGeoV2AddressItem.f229479b) && L.f(this.f229480c, extendedSettingsGeoV2AddressItem.f229480c) && L.f(this.f229481d, extendedSettingsGeoV2AddressItem.f229481d) && this.f229482e == extendedSettingsGeoV2AddressItem.f229482e;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154683c() {
        return this.f229483f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222262b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF215037b() {
        return this.f229479b;
    }

    public final int hashCode() {
        int iHashCode = this.f229479b.hashCode() * 31;
        String str = this.f229480c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f229481d;
        return Boolean.hashCode(this.f229482e) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedSettingsGeoV2AddressItem(stringId=");
        sb2.append(this.f229479b);
        sb2.append(", addressName=");
        sb2.append(this.f229480c);
        sb2.append(", address=");
        sb2.append(this.f229481d);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229482e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229479b);
        parcel.writeString(this.f229480c);
        parcel.writeString(this.f229481d);
        parcel.writeInt(this.f229482e ? 1 : 0);
    }

    public /* synthetic */ ExtendedSettingsGeoV2AddressItem(String str, String str2, String str3, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "geo_v2_address_item" : str, str2, str3, z12);
    }
}
