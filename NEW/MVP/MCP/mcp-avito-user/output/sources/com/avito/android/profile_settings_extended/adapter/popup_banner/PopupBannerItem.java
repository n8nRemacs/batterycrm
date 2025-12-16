package com.avito.android.profile_settings_extended.adapter.popup_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PopupBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/popup_banner/PopupBannerItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "a", "PopupButtonData", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PopupBannerItem implements SettingsListItem {

    @k
    public static final Parcelable.Creator<PopupBannerItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229736b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f229737c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f229738d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PopupButtonData f229739e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229740f;

    /* compiled from: PopupBannerItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/popup_banner/PopupBannerItem$PopupButtonData;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class PopupButtonData implements Parcelable {

        @k
        public static final Parcelable.Creator<PopupButtonData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229741b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f229742c;

        /* compiled from: PopupBannerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PopupButtonData> {
            @Override // android.os.Parcelable.Creator
            public final PopupButtonData createFromParcel(Parcel parcel) {
                return new PopupButtonData(parcel.readString(), (DeepLink) parcel.readParcelable(PopupButtonData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PopupButtonData[] newArray(int i12) {
                return new PopupButtonData[i12];
            }
        }

        public PopupButtonData(@k String str, @k DeepLink deepLink) {
            this.f229741b = str;
            this.f229742c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PopupButtonData)) {
                return false;
            }
            PopupButtonData popupButtonData = (PopupButtonData) obj;
            return L.f(this.f229741b, popupButtonData.f229741b) && L.f(this.f229742c, popupButtonData.f229742c);
        }

        public final int hashCode() {
            return this.f229742c.hashCode() + (this.f229741b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PopupButtonData(title=");
            sb2.append(this.f229741b);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f229742c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f229741b);
            parcel.writeParcelable(this.f229742c, i12);
        }
    }

    /* compiled from: PopupBannerItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/popup_banner/PopupBannerItem$a;", "", "<init>", "()V", "", "RE_AGENT_POPUP_BANNER_NAME", "Ljava/lang/String;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PopupBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PopupBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final PopupBannerItem createFromParcel(Parcel parcel) {
            return new PopupBannerItem(parcel.readString(), parcel.readString(), parcel.readString(), PopupButtonData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PopupBannerItem[] newArray(int i12) {
            return new PopupBannerItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public PopupBannerItem(@k String str, @k String str2, @k String str3, @k PopupButtonData popupButtonData) {
        this.f229736b = str;
        this.f229737c = str2;
        this.f229738d = str3;
        this.f229739e = popupButtonData;
        this.f229740f = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupBannerItem)) {
            return false;
        }
        PopupBannerItem popupBannerItem = (PopupBannerItem) obj;
        return L.f(this.f229736b, popupBannerItem.f229736b) && L.f(this.f229737c, popupBannerItem.f229737c) && L.f(this.f229738d, popupBannerItem.f229738d) && L.f(this.f229739e, popupBannerItem.f229739e);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154919c() {
        return this.f229740f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229403b() {
        return this.f229736b;
    }

    public final int hashCode() {
        return this.f229739e.hashCode() + H.d(H.d(this.f229736b.hashCode() * 31, 31, this.f229737c), 31, this.f229738d);
    }

    @k
    public final String toString() {
        return "PopupBannerItem(stringId=" + this.f229736b + ", title=" + this.f229737c + ", description=" + this.f229738d + ", button=" + this.f229739e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229736b);
        parcel.writeString(this.f229737c);
        parcel.writeString(this.f229738d);
        this.f229739e.writeToParcel(parcel, i12);
    }

    public /* synthetic */ PopupBannerItem(String str, String str2, String str3, PopupButtonData popupButtonData, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "agent-profile/best-sides" : str, str2, str3, popupButtonData);
    }
}
