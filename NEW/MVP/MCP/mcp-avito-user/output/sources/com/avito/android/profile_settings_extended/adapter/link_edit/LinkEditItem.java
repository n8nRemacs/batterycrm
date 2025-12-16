package com.avito.android.profile_settings_extended.adapter.link_edit;

import Rb0.InterfaceC15025a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditConfig;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LinkEditItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/link_edit/LinkEditItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "Action", "ActionType", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LinkEditItem implements SettingsListItem, InterfaceC15025a {

    @k
    public static final Parcelable.Creator<LinkEditItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229640b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f229641c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f229642d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f229643e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f229644f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ModerationStatus f229645g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final PersonalLinkEditConfig f229646h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<Action> f229647i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f229648j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229649k;

    /* compiled from: LinkEditItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/link_edit/LinkEditItem$Action;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229650b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ActionType f229651c;

        /* compiled from: LinkEditItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action(parcel.readString(), ActionType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k String str, @k ActionType actionType) {
            this.f229650b = str;
            this.f229651c = actionType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return L.f(this.f229650b, action.f229650b) && this.f229651c == action.f229651c;
        }

        public final int hashCode() {
            return this.f229651c.hashCode() + (this.f229650b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Action(title=" + this.f229650b + ", type=" + this.f229651c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f229650b);
            parcel.writeString(this.f229651c.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LinkEditItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/link_edit/LinkEditItem$ActionType;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        /* renamed from: b, reason: collision with root package name */
        public static final ActionType f229652b;

        /* renamed from: c, reason: collision with root package name */
        public static final ActionType f229653c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f229654d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f229655e;

        static {
            ActionType actionType = new ActionType("EDIT", 0);
            f229652b = actionType;
            ActionType actionType2 = new ActionType("COPY", 1);
            f229653c = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            f229654d = actionTypeArr;
            f229655e = kotlin.enums.c.a(actionTypeArr);
        }

        public ActionType() {
            throw null;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f229654d.clone();
        }
    }

    /* compiled from: LinkEditItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LinkEditItem> {
        @Override // android.os.Parcelable.Creator
        public final LinkEditItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(LinkEditItem.class.getClassLoader());
            ModerationStatus moderationStatus = (ModerationStatus) parcel.readParcelable(LinkEditItem.class.getClassLoader());
            PersonalLinkEditConfig personalLinkEditConfig = (PersonalLinkEditConfig) parcel.readParcelable(LinkEditItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Action.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new LinkEditItem(string, string2, string3, string4, deepLink, moderationStatus, personalLinkEditConfig, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final LinkEditItem[] newArray(int i12) {
            return new LinkEditItem[i12];
        }
    }

    public LinkEditItem(@k String str, @k String str2, @k String str3, @k String str4, @l DeepLink deepLink, @l ModerationStatus moderationStatus, @l PersonalLinkEditConfig personalLinkEditConfig, @k List<Action> list, boolean z12) {
        this.f229640b = str;
        this.f229641c = str2;
        this.f229642d = str3;
        this.f229643e = str4;
        this.f229644f = deepLink;
        this.f229645g = moderationStatus;
        this.f229646h = personalLinkEditConfig;
        this.f229647i = list;
        this.f229648j = z12;
        this.f229649k = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkEditItem)) {
            return false;
        }
        LinkEditItem linkEditItem = (LinkEditItem) obj;
        return L.f(this.f229640b, linkEditItem.f229640b) && L.f(this.f229641c, linkEditItem.f229641c) && L.f(this.f229642d, linkEditItem.f229642d) && L.f(this.f229643e, linkEditItem.f229643e) && L.f(this.f229644f, linkEditItem.f229644f) && L.f(this.f229645g, linkEditItem.f229645g) && L.f(this.f229646h, linkEditItem.f229646h) && L.f(this.f229647i, linkEditItem.f229647i) && this.f229648j == linkEditItem.f229648j;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154248c() {
        return this.f229649k;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229086b() {
        return this.f229640b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.f229640b.hashCode() * 31, 31, this.f229641c), 31, this.f229642d), 31, this.f229643e);
        DeepLink deepLink = this.f229644f;
        int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        ModerationStatus moderationStatus = this.f229645g;
        int iHashCode2 = (iHashCode + (moderationStatus == null ? 0 : moderationStatus.hashCode())) * 31;
        PersonalLinkEditConfig personalLinkEditConfig = this.f229646h;
        return Boolean.hashCode(this.f229648j) + H.e((iHashCode2 + (personalLinkEditConfig != null ? personalLinkEditConfig.hashCode() : 0)) * 31, 31, this.f229647i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LinkEditItem(stringId=");
        sb2.append(this.f229640b);
        sb2.append(", title=");
        sb2.append(this.f229641c);
        sb2.append(", prefixedPersonalLink=");
        sb2.append(this.f229642d);
        sb2.append(", urlToCopy=");
        sb2.append(this.f229643e);
        sb2.append(", linkDeeplink=");
        sb2.append(this.f229644f);
        sb2.append(", moderationStatus=");
        sb2.append(this.f229645g);
        sb2.append(", editorConfig=");
        sb2.append(this.f229646h);
        sb2.append(", actions=");
        sb2.append(this.f229647i);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229648j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229640b);
        parcel.writeString(this.f229641c);
        parcel.writeString(this.f229642d);
        parcel.writeString(this.f229643e);
        parcel.writeParcelable(this.f229644f, i12);
        parcel.writeParcelable(this.f229645g, i12);
        parcel.writeParcelable(this.f229646h, i12);
        Iterator itJ = C0.j(this.f229647i, parcel);
        while (itJ.hasNext()) {
            ((Action) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f229648j ? 1 : 0);
    }

    public /* synthetic */ LinkEditItem(String str, String str2, String str3, String str4, DeepLink deepLink, ModerationStatus moderationStatus, PersonalLinkEditConfig personalLinkEditConfig, List list, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "link_edit_item" : str, str2, str3, str4, deepLink, moderationStatus, personalLinkEditConfig, list, z12);
    }
}
