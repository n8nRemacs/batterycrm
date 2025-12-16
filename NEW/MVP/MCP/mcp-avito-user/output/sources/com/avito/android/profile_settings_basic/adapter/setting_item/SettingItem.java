package com.avito.android.profile_settings_basic.adapter.setting_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_basic.adapter.BasicSettingsListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SettingItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/setting_item/SettingItem;", "Lcom/avito/android/profile_settings_basic/adapter/BasicSettingsListItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SettingItem implements BasicSettingsListItem {

    @k
    public static final Parcelable.Creator<SettingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f228686b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f228687c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f228688d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f228689e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ModerationStatus f228690f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f228691g;

    /* compiled from: SettingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SettingItem> {
        @Override // android.os.Parcelable.Creator
        public final SettingItem createFromParcel(Parcel parcel) {
            return new SettingItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ModerationStatus) parcel.readParcelable(SettingItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SettingItem[] newArray(int i12) {
            return new SettingItem[i12];
        }
    }

    public SettingItem(@k String str, @k String str2, @l String str3, @l String str4, @l ModerationStatus moderationStatus, @l String str5) {
        this.f228686b = str;
        this.f228687c = str2;
        this.f228688d = str3;
        this.f228689e = str4;
        this.f228690f = moderationStatus;
        this.f228691g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingItem)) {
            return false;
        }
        SettingItem settingItem = (SettingItem) obj;
        return L.f(this.f228686b, settingItem.f228686b) && L.f(this.f228687c, settingItem.f228687c) && L.f(this.f228688d, settingItem.f228688d) && L.f(this.f228689e, settingItem.f228689e) && L.f(this.f228690f, settingItem.f228690f) && L.f(this.f228691g, settingItem.f228691g);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF228686b() {
        return this.f228686b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f228686b.hashCode() * 31, 31, this.f228687c);
        String str = this.f228688d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f228689e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ModerationStatus moderationStatus = this.f228690f;
        int iHashCode3 = (iHashCode2 + (moderationStatus == null ? 0 : moderationStatus.hashCode())) * 31;
        String str3 = this.f228691g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SettingItem(stringId=");
        sb2.append(this.f228686b);
        sb2.append(", title=");
        sb2.append(this.f228687c);
        sb2.append(", value=");
        sb2.append(this.f228688d);
        sb2.append(", placeholder=");
        sb2.append(this.f228689e);
        sb2.append(", moderationStatus=");
        sb2.append(this.f228690f);
        sb2.append(", fieldName=");
        return C22026a.c(sb2, this.f228691g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f228686b);
        parcel.writeString(this.f228687c);
        parcel.writeString(this.f228688d);
        parcel.writeString(this.f228689e);
        parcel.writeParcelable(this.f228690f, i12);
        parcel.writeString(this.f228691g);
    }

    public /* synthetic */ SettingItem(String str, String str2, String str3, String str4, ModerationStatus moderationStatus, String str5, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "setting_item" : str, str2, str3, str4, moderationStatus, str5);
    }
}
