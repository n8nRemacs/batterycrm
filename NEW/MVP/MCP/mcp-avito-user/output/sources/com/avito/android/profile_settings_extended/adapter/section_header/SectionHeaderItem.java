package com.avito.android.profile_settings_extended.adapter.section_header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_basic.adapter.BasicSettingsListItem;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SectionHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/section_header/SectionHeaderItem;", "Lcom/avito/android/profile_settings_basic/adapter/BasicSettingsListItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SectionHeaderItem implements BasicSettingsListItem, SettingsListItem {

    @k
    public static final Parcelable.Creator<SectionHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229801b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f229802c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f229803d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229804e;

    /* compiled from: SectionHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final SectionHeaderItem createFromParcel(Parcel parcel) {
            return new SectionHeaderItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SectionHeaderItem[] newArray(int i12) {
            return new SectionHeaderItem[i12];
        }
    }

    public SectionHeaderItem(@k String str, @k String str2, @l String str3) {
        this.f229801b = str;
        this.f229802c = str2;
        this.f229803d = str3;
        this.f229804e = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionHeaderItem)) {
            return false;
        }
        SectionHeaderItem sectionHeaderItem = (SectionHeaderItem) obj;
        return L.f(this.f229801b, sectionHeaderItem.f229801b) && L.f(this.f229802c, sectionHeaderItem.f229802c) && L.f(this.f229803d, sectionHeaderItem.f229803d);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154989c() {
        return this.f229804e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223381b() {
        return this.f229801b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f229801b.hashCode() * 31, 31, this.f229802c);
        String str = this.f229803d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionHeaderItem(stringId=");
        sb2.append(this.f229801b);
        sb2.append(", title=");
        sb2.append(this.f229802c);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f229803d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229801b);
        parcel.writeString(this.f229802c);
        parcel.writeString(this.f229803d);
    }

    public /* synthetic */ SectionHeaderItem(String str, String str2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "section_header_item" : str, str2, str3);
    }
}
