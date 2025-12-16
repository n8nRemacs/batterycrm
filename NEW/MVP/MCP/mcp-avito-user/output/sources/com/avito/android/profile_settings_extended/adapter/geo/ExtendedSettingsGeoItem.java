package com.avito.android.profile_settings_extended.adapter.geo;

import Rb0.InterfaceC15025a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.profile_settings_extended.entity.AddressValue;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedSettingsGeoItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo/ExtendedSettingsGeoItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ExtendedSettingsGeoItem implements SettingsListItem, InterfaceC15025a {

    @Y61.k
    public static final Parcelable.Creator<ExtendedSettingsGeoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f229449b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f229450c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f229451d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f229452e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f229453f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f229454g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final List<AddressValue> f229455h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f229456i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final GridElementType.FullWidth f229457j;

    /* compiled from: ExtendedSettingsGeoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedSettingsGeoItem> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsGeoItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AddressValue.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new ExtendedSettingsGeoItem(string, string2, string3, string4, string5, numValueOf, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsGeoItem[] newArray(int i12) {
            return new ExtendedSettingsGeoItem[i12];
        }
    }

    public ExtendedSettingsGeoItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.l Integer num, @Y61.l List<AddressValue> list, boolean z12) {
        this.f229449b = str;
        this.f229450c = str2;
        this.f229451d = str3;
        this.f229452e = str4;
        this.f229453f = str5;
        this.f229454g = num;
        this.f229455h = list;
        this.f229456i = z12;
        this.f229457j = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedSettingsGeoItem)) {
            return false;
        }
        ExtendedSettingsGeoItem extendedSettingsGeoItem = (ExtendedSettingsGeoItem) obj;
        return L.f(this.f229449b, extendedSettingsGeoItem.f229449b) && L.f(this.f229450c, extendedSettingsGeoItem.f229450c) && L.f(this.f229451d, extendedSettingsGeoItem.f229451d) && L.f(this.f229452e, extendedSettingsGeoItem.f229452e) && L.f(this.f229453f, extendedSettingsGeoItem.f229453f) && L.f(this.f229454g, extendedSettingsGeoItem.f229454g) && L.f(this.f229455h, extendedSettingsGeoItem.f229455h) && this.f229456i == extendedSettingsGeoItem.f229456i;
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType */
    public final GridElementType getF154209c() {
        return this.f229457j;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223585b() {
        return this.f229449b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(H.d(this.f229449b.hashCode() * 31, 31, this.f229450c), 31, this.f229451d), 31, this.f229452e), 31, this.f229453f);
        Integer num = this.f229454g;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        List<AddressValue> list = this.f229455h;
        return Boolean.hashCode(this.f229456i) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedSettingsGeoItem(stringId=");
        sb2.append(this.f229449b);
        sb2.append(", fieldName=");
        sb2.append(this.f229450c);
        sb2.append(", title=");
        sb2.append(this.f229451d);
        sb2.append(", subtitle=");
        sb2.append(this.f229452e);
        sb2.append(", buttonText=");
        sb2.append(this.f229453f);
        sb2.append(", maxCount=");
        sb2.append(this.f229454g);
        sb2.append(", addresses=");
        sb2.append(this.f229455h);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229456i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f229449b);
        parcel.writeString(this.f229450c);
        parcel.writeString(this.f229451d);
        parcel.writeString(this.f229452e);
        parcel.writeString(this.f229453f);
        Integer num = this.f229454g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        List<AddressValue> list = this.f229455h;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AddressValue) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeInt(this.f229456i ? 1 : 0);
    }

    public /* synthetic */ ExtendedSettingsGeoItem(String str, String str2, String str3, String str4, String str5, Integer num, List list, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "geo_item" : str, str2, str3, str4, str5, num, list, z12);
    }
}
