package com.avito.android.profile_settings_extended.adapter.geo_v2.footer;

import Rb0.InterfaceC15025a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedSettingsGeoV2FooterItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo_v2/footer/ExtendedSettingsGeoV2FooterItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ExtendedSettingsGeoV2FooterItem implements SettingsListItem, InterfaceC15025a {

    @k
    public static final Parcelable.Creator<ExtendedSettingsGeoV2FooterItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229492b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeeplinkAction f229493c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f229494d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229495e;

    /* compiled from: ExtendedSettingsGeoV2FooterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedSettingsGeoV2FooterItem> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsGeoV2FooterItem createFromParcel(Parcel parcel) {
            return new ExtendedSettingsGeoV2FooterItem(parcel.readString(), (DeeplinkAction) parcel.readParcelable(ExtendedSettingsGeoV2FooterItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsGeoV2FooterItem[] newArray(int i12) {
            return new ExtendedSettingsGeoV2FooterItem[i12];
        }
    }

    public ExtendedSettingsGeoV2FooterItem(@k String str, @l DeeplinkAction deeplinkAction, boolean z12) {
        this.f229492b = str;
        this.f229493c = deeplinkAction;
        this.f229494d = z12;
        this.f229495e = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedSettingsGeoV2FooterItem)) {
            return false;
        }
        ExtendedSettingsGeoV2FooterItem extendedSettingsGeoV2FooterItem = (ExtendedSettingsGeoV2FooterItem) obj;
        return L.f(this.f229492b, extendedSettingsGeoV2FooterItem.f229492b) && L.f(this.f229493c, extendedSettingsGeoV2FooterItem.f229493c) && this.f229494d == extendedSettingsGeoV2FooterItem.f229494d;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154934c() {
        return this.f229495e;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223334b() {
        return this.f229492b;
    }

    public final int hashCode() {
        int iHashCode = this.f229492b.hashCode() * 31;
        DeeplinkAction deeplinkAction = this.f229493c;
        return Boolean.hashCode(this.f229494d) + ((iHashCode + (deeplinkAction == null ? 0 : deeplinkAction.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedSettingsGeoV2FooterItem(stringId=");
        sb2.append(this.f229492b);
        sb2.append(", actionButton=");
        sb2.append(this.f229493c);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229494d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229492b);
        parcel.writeParcelable(this.f229493c, i12);
        parcel.writeInt(this.f229494d ? 1 : 0);
    }

    public /* synthetic */ ExtendedSettingsGeoV2FooterItem(String str, DeeplinkAction deeplinkAction, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "geo_v2_footer_item" : str, deeplinkAction, z12);
    }
}
