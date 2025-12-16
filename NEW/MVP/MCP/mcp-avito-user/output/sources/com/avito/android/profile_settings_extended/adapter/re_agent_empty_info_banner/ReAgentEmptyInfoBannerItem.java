package com.avito.android.profile_settings_extended.adapter.re_agent_empty_info_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentEmptyInfoBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/re_agent_empty_info_banner/ReAgentEmptyInfoBannerItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "ButtonData", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ReAgentEmptyInfoBannerItem implements SettingsListItem {

    @k
    public static final Parcelable.Creator<ReAgentEmptyInfoBannerItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229755b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f229756c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f229757d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ButtonData f229758e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229759f;

    /* compiled from: ReAgentEmptyInfoBannerItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/re_agent_empty_info_banner/ReAgentEmptyInfoBannerItem$ButtonData;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ButtonData implements Parcelable {

        @k
        public static final Parcelable.Creator<ButtonData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229760b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f229761c;

        /* compiled from: ReAgentEmptyInfoBannerItem.kt */
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
            this.f229760b = str;
            this.f229761c = deepLink;
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
            return L.f(this.f229760b, buttonData.f229760b) && L.f(this.f229761c, buttonData.f229761c);
        }

        public final int hashCode() {
            return this.f229761c.hashCode() + (this.f229760b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonData(title=");
            sb2.append(this.f229760b);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f229761c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f229760b);
            parcel.writeParcelable(this.f229761c, i12);
        }
    }

    /* compiled from: ReAgentEmptyInfoBannerItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/re_agent_empty_info_banner/ReAgentEmptyInfoBannerItem$a;", "", "<init>", "()V", "", "RE_AGENT_EMPTY_INFO_BANNER_NAME", "Ljava/lang/String;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReAgentEmptyInfoBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ReAgentEmptyInfoBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final ReAgentEmptyInfoBannerItem createFromParcel(Parcel parcel) {
            return new ReAgentEmptyInfoBannerItem(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(ReAgentEmptyInfoBannerItem.class.getClassLoader()), ButtonData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ReAgentEmptyInfoBannerItem[] newArray(int i12) {
            return new ReAgentEmptyInfoBannerItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public ReAgentEmptyInfoBannerItem(@k String str, @k String str2, @k AttributedText attributedText, @k ButtonData buttonData) {
        this.f229755b = str;
        this.f229756c = str2;
        this.f229757d = attributedText;
        this.f229758e = buttonData;
        this.f229759f = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReAgentEmptyInfoBannerItem)) {
            return false;
        }
        ReAgentEmptyInfoBannerItem reAgentEmptyInfoBannerItem = (ReAgentEmptyInfoBannerItem) obj;
        return L.f(this.f229755b, reAgentEmptyInfoBannerItem.f229755b) && L.f(this.f229756c, reAgentEmptyInfoBannerItem.f229756c) && L.f(this.f229757d, reAgentEmptyInfoBannerItem.f229757d) && L.f(this.f229758e, reAgentEmptyInfoBannerItem.f229758e);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154919c() {
        return this.f229759f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229755b() {
        return this.f229755b;
    }

    public final int hashCode() {
        return this.f229758e.hashCode() + com.avito.android.actions_sheet.a.b(H.d(this.f229755b.hashCode() * 31, 31, this.f229756c), 31, this.f229757d);
    }

    @k
    public final String toString() {
        return "ReAgentEmptyInfoBannerItem(stringId=" + this.f229755b + ", title=" + this.f229756c + ", description=" + this.f229757d + ", actionButton=" + this.f229758e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229755b);
        parcel.writeString(this.f229756c);
        parcel.writeParcelable(this.f229757d, i12);
        this.f229758e.writeToParcel(parcel, i12);
    }

    public /* synthetic */ ReAgentEmptyInfoBannerItem(String str, String str2, AttributedText attributedText, ButtonData buttonData, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "agent-profile/empty-info" : str, str2, attributedText, buttonData);
    }
}
