package com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner;

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

/* compiled from: ReAgentShortFlowCreationBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/re_agent_short_flow_creation_banner/ReAgentShortFlowCreationBannerItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "ButtonData", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ReAgentShortFlowCreationBannerItem implements SettingsListItem {

    @k
    public static final Parcelable.Creator<ReAgentShortFlowCreationBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229776b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f229777c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f229778d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ButtonData f229779e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ButtonData f229780f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229781g;

    /* compiled from: ReAgentShortFlowCreationBannerItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/re_agent_short_flow_creation_banner/ReAgentShortFlowCreationBannerItem$ButtonData;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ButtonData implements Parcelable {

        @k
        public static final Parcelable.Creator<ButtonData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229782b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f229783c;

        /* compiled from: ReAgentShortFlowCreationBannerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ButtonData> {
            @Override // android.os.Parcelable.Creator
            public final ButtonData createFromParcel(Parcel parcel) {
                return new ButtonData(parcel.readString(), (DeepLink) parcel.readParcelable(ButtonData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonData[] newArray(int i12) {
                return new ButtonData[i12];
            }
        }

        public ButtonData(@k String str, @k DeepLink deepLink) {
            this.f229782b = str;
            this.f229783c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonData)) {
                return false;
            }
            ButtonData buttonData = (ButtonData) obj;
            return L.f(this.f229782b, buttonData.f229782b) && L.f(this.f229783c, buttonData.f229783c);
        }

        public final int hashCode() {
            return this.f229783c.hashCode() + (this.f229782b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonData(title=");
            sb2.append(this.f229782b);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f229783c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f229782b);
            parcel.writeParcelable(this.f229783c, i12);
        }
    }

    /* compiled from: ReAgentShortFlowCreationBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReAgentShortFlowCreationBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final ReAgentShortFlowCreationBannerItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Parcelable.Creator<ButtonData> creator = ButtonData.CREATOR;
            return new ReAgentShortFlowCreationBannerItem(string, string2, string3, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ReAgentShortFlowCreationBannerItem[] newArray(int i12) {
            return new ReAgentShortFlowCreationBannerItem[i12];
        }
    }

    public ReAgentShortFlowCreationBannerItem(@k String str, @k String str2, @k String str3, @k ButtonData buttonData, @k ButtonData buttonData2) {
        this.f229776b = str;
        this.f229777c = str2;
        this.f229778d = str3;
        this.f229779e = buttonData;
        this.f229780f = buttonData2;
        this.f229781g = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReAgentShortFlowCreationBannerItem)) {
            return false;
        }
        ReAgentShortFlowCreationBannerItem reAgentShortFlowCreationBannerItem = (ReAgentShortFlowCreationBannerItem) obj;
        return L.f(this.f229776b, reAgentShortFlowCreationBannerItem.f229776b) && L.f(this.f229777c, reAgentShortFlowCreationBannerItem.f229777c) && L.f(this.f229778d, reAgentShortFlowCreationBannerItem.f229778d) && L.f(this.f229779e, reAgentShortFlowCreationBannerItem.f229779e) && L.f(this.f229780f, reAgentShortFlowCreationBannerItem.f229780f);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154919c() {
        return this.f229781g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229776b() {
        return this.f229776b;
    }

    public final int hashCode() {
        return this.f229780f.hashCode() + ((this.f229779e.hashCode() + H.d(H.d(this.f229776b.hashCode() * 31, 31, this.f229777c), 31, this.f229778d)) * 31);
    }

    @k
    public final String toString() {
        return "ReAgentShortFlowCreationBannerItem(stringId=" + this.f229776b + ", title=" + this.f229777c + ", description=" + this.f229778d + ", startButton=" + this.f229779e + ", infoButton=" + this.f229780f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229776b);
        parcel.writeString(this.f229777c);
        parcel.writeString(this.f229778d);
        this.f229779e.writeToParcel(parcel, i12);
        this.f229780f.writeToParcel(parcel, i12);
    }

    public /* synthetic */ ReAgentShortFlowCreationBannerItem(String str, String str2, String str3, ButtonData buttonData, ButtonData buttonData2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "agent-profile/short-flow-entry-point" : str, str2, str3, buttonData, buttonData2);
    }
}
