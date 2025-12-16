package com.avito.android.profile_settings_extended.adapter.setting;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.profile_settings_extended.entity.SettingsActionButton;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SettingItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/setting/SettingItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SettingItem implements SettingsListItem {

    @Y61.k
    public static final Parcelable.Creator<SettingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f229841b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f229842c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f229843d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<SettingsActionButton> f229844e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final GridElementType.FullWidth f229845f;

    /* compiled from: SettingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SettingItem> {
        @Override // android.os.Parcelable.Creator
        public final SettingItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(SettingsActionButton.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SettingItem(string, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SettingItem[] newArray(int i12) {
            return new SettingItem[i12];
        }
    }

    public SettingItem(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k List<SettingsActionButton> list) {
        this.f229841b = str;
        this.f229842c = str2;
        this.f229843d = str3;
        this.f229844e = list;
        this.f229845f = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingItem)) {
            return false;
        }
        SettingItem settingItem = (SettingItem) obj;
        return L.f(this.f229841b, settingItem.f229841b) && L.f(this.f229842c, settingItem.f229842c) && L.f(this.f229843d, settingItem.f229843d) && L.f(this.f229844e, settingItem.f229844e);
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType */
    public final GridElementType getF154919c() {
        return this.f229845f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229403b() {
        return this.f229841b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f229841b.hashCode() * 31, 31, this.f229842c);
        String str = this.f229843d;
        return this.f229844e.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SettingItem(stringId=");
        sb2.append(this.f229841b);
        sb2.append(", title=");
        sb2.append(this.f229842c);
        sb2.append(", value=");
        sb2.append(this.f229843d);
        sb2.append(", buttons=");
        return H.p(sb2, this.f229844e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f229841b);
        parcel.writeString(this.f229842c);
        parcel.writeString(this.f229843d);
        Iterator itJ = C0.j(this.f229844e, parcel);
        while (itJ.hasNext()) {
            ((SettingsActionButton) itJ.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ SettingItem(String str, String str2, String str3, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "setting_item" : str, str2, str3, list);
    }
}
