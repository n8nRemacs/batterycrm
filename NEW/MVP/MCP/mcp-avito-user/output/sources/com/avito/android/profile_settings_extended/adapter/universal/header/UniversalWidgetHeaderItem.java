package com.avito.android.profile_settings_extended.adapter.universal.header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/universal/header/UniversalWidgetHeaderItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UniversalWidgetHeaderItem implements SettingsListItem {

    @k
    public static final Parcelable.Creator<UniversalWidgetHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229901b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f229902c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f229903d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229904e;

    /* compiled from: UniversalWidgetHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalWidgetHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetHeaderItem createFromParcel(Parcel parcel) {
            return new UniversalWidgetHeaderItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetHeaderItem[] newArray(int i12) {
            return new UniversalWidgetHeaderItem[i12];
        }
    }

    public UniversalWidgetHeaderItem(@k String str, @l String str2, @l String str3) {
        this.f229901b = str;
        this.f229902c = str2;
        this.f229903d = str3;
        this.f229904e = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalWidgetHeaderItem)) {
            return false;
        }
        UniversalWidgetHeaderItem universalWidgetHeaderItem = (UniversalWidgetHeaderItem) obj;
        return L.f(this.f229901b, universalWidgetHeaderItem.f229901b) && L.f(this.f229902c, universalWidgetHeaderItem.f229902c) && L.f(this.f229903d, universalWidgetHeaderItem.f229903d);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154989c() {
        return this.f229904e;
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
        return this.f229901b;
    }

    public final int hashCode() {
        int iHashCode = this.f229901b.hashCode() * 31;
        String str = this.f229902c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f229903d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalWidgetHeaderItem(stringId=");
        sb2.append(this.f229901b);
        sb2.append(", title=");
        sb2.append(this.f229902c);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f229903d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229901b);
        parcel.writeString(this.f229902c);
        parcel.writeString(this.f229903d);
    }

    public /* synthetic */ UniversalWidgetHeaderItem(String str, String str2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "universal_widget_header_item" : str, str2, str3);
    }
}
