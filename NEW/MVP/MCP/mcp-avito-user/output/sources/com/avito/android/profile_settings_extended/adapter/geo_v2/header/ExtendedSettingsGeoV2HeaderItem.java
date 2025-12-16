package com.avito.android.profile_settings_extended.adapter.geo_v2.header;

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

/* compiled from: ExtendedSettingsGeoV2HeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo_v2/header/ExtendedSettingsGeoV2HeaderItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ExtendedSettingsGeoV2HeaderItem implements SettingsListItem, InterfaceC15025a {

    @k
    public static final Parcelable.Creator<ExtendedSettingsGeoV2HeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229507b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f229508c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f229509d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f229510e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229511f;

    /* compiled from: ExtendedSettingsGeoV2HeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedSettingsGeoV2HeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsGeoV2HeaderItem createFromParcel(Parcel parcel) {
            return new ExtendedSettingsGeoV2HeaderItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsGeoV2HeaderItem[] newArray(int i12) {
            return new ExtendedSettingsGeoV2HeaderItem[i12];
        }
    }

    public ExtendedSettingsGeoV2HeaderItem(@k String str, @l String str2, @l String str3, boolean z12) {
        this.f229507b = str;
        this.f229508c = str2;
        this.f229509d = str3;
        this.f229510e = z12;
        this.f229511f = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedSettingsGeoV2HeaderItem)) {
            return false;
        }
        ExtendedSettingsGeoV2HeaderItem extendedSettingsGeoV2HeaderItem = (ExtendedSettingsGeoV2HeaderItem) obj;
        return L.f(this.f229507b, extendedSettingsGeoV2HeaderItem.f229507b) && L.f(this.f229508c, extendedSettingsGeoV2HeaderItem.f229508c) && L.f(this.f229509d, extendedSettingsGeoV2HeaderItem.f229509d) && this.f229510e == extendedSettingsGeoV2HeaderItem.f229510e;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154683c() {
        return this.f229511f;
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
        return this.f229507b;
    }

    public final int hashCode() {
        int iHashCode = this.f229507b.hashCode() * 31;
        String str = this.f229508c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f229509d;
        return Boolean.hashCode(this.f229510e) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedSettingsGeoV2HeaderItem(stringId=");
        sb2.append(this.f229507b);
        sb2.append(", title=");
        sb2.append(this.f229508c);
        sb2.append(", subtitle=");
        sb2.append(this.f229509d);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229510e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229507b);
        parcel.writeString(this.f229508c);
        parcel.writeString(this.f229509d);
        parcel.writeInt(this.f229510e ? 1 : 0);
    }

    public /* synthetic */ ExtendedSettingsGeoV2HeaderItem(String str, String str2, String str3, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "geo_v2_header_item" : str, str2, str3, z12);
    }
}
