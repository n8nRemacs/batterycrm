package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: ProfileSettingsResult.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/ProfileSettingsResult;", "", "title", "", "dontShowProfileViewLink", "", "showAllWidgetsWithoutTabsPicker", "tabs", "", "Lcom/avito/android/remote/model/ProfileSettingsResult$Tab;", "action", "Lcom/avito/android/remote/model/DeeplinkAction;", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/DeeplinkAction;)V", "getAction", "()Lcom/avito/android/remote/model/DeeplinkAction;", "getDontShowProfileViewLink", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowAllWidgetsWithoutTabsPicker", "getTabs", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/DeeplinkAction;)Lcom/avito/android/remote/model/ProfileSettingsResult;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "Tab", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ProfileSettingsResult {

    @c("action")
    @l
    private final DeeplinkAction action;

    @c("dontShowProfileViewLink")
    @l
    private final Boolean dontShowProfileViewLink;

    @c("showAllWidgetsWithoutTabsPicker")
    @l
    private final Boolean showAllWidgetsWithoutTabsPicker;

    @c("tabs")
    @l
    private final List<Tab> tabs;

    @c("title")
    @l
    private final String title;

    /* compiled from: ProfileSettingsResult.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/ProfileSettingsResult$Tab;", "", "title", "", "type", "Lcom/avito/android/remote/model/ProfileSettingsResult$Tab$Type;", "(Ljava/lang/String;Lcom/avito/android/remote/model/ProfileSettingsResult$Tab$Type;)V", "getTitle", "()Ljava/lang/String;", "getType", "()Lcom/avito/android/remote/model/ProfileSettingsResult$Tab$Type;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Type", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Tab {

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ProfileSettingsResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/ProfileSettingsResult$Tab$Type;", "", "shortcut", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getShortcut", "()Ljava/lang/String;", "BASIC", "EXTENDED", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @c("basic")
            public static final Type BASIC = new Type("BASIC", 0, "basic");

            @c(MessageBody.SystemMessageBody.Platform.Bubble.Item.EXTENDED)
            public static final Type EXTENDED = new Type("EXTENDED", 1, MessageBody.SystemMessageBody.Platform.Bubble.Item.EXTENDED);

            @k
            private final String shortcut;

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{BASIC, EXTENDED};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = kotlin.enums.c.a(typeArr$values);
            }

            private Type(String str, int i12, String str2) {
                this.shortcut = str2;
            }

            @k
            public static a<Type> getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            @k
            public final String getShortcut() {
                return this.shortcut;
            }
        }

        public Tab(@k String str, @k Type type) {
            this.title = str;
            this.type = type;
        }

        public static /* synthetic */ Tab copy$default(Tab tab, String str, Type type, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = tab.title;
            }
            if ((i12 & 2) != 0) {
                type = tab.type;
            }
            return tab.copy(str, type);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        @k
        public final Tab copy(@k String title, @k Type type) {
            return new Tab(title, type);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return L.f(this.title, tab.title) && this.type == tab.type;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            return "Tab(title=" + this.title + ", type=" + this.type + ')';
        }
    }

    public ProfileSettingsResult(@l String str, @l Boolean bool, @l Boolean bool2, @l List<Tab> list, @l DeeplinkAction deeplinkAction) {
        this.title = str;
        this.dontShowProfileViewLink = bool;
        this.showAllWidgetsWithoutTabsPicker = bool2;
        this.tabs = list;
        this.action = deeplinkAction;
    }

    public static /* synthetic */ ProfileSettingsResult copy$default(ProfileSettingsResult profileSettingsResult, String str, Boolean bool, Boolean bool2, List list, DeeplinkAction deeplinkAction, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = profileSettingsResult.title;
        }
        if ((i12 & 2) != 0) {
            bool = profileSettingsResult.dontShowProfileViewLink;
        }
        Boolean bool3 = bool;
        if ((i12 & 4) != 0) {
            bool2 = profileSettingsResult.showAllWidgetsWithoutTabsPicker;
        }
        Boolean bool4 = bool2;
        if ((i12 & 8) != 0) {
            list = profileSettingsResult.tabs;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            deeplinkAction = profileSettingsResult.action;
        }
        return profileSettingsResult.copy(str, bool3, bool4, list2, deeplinkAction);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getDontShowProfileViewLink() {
        return this.dontShowProfileViewLink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getShowAllWidgetsWithoutTabsPicker() {
        return this.showAllWidgetsWithoutTabsPicker;
    }

    @l
    public final List<Tab> component4() {
        return this.tabs;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DeeplinkAction getAction() {
        return this.action;
    }

    @k
    public final ProfileSettingsResult copy(@l String title, @l Boolean dontShowProfileViewLink, @l Boolean showAllWidgetsWithoutTabsPicker, @l List<Tab> tabs, @l DeeplinkAction action) {
        return new ProfileSettingsResult(title, dontShowProfileViewLink, showAllWidgetsWithoutTabsPicker, tabs, action);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileSettingsResult)) {
            return false;
        }
        ProfileSettingsResult profileSettingsResult = (ProfileSettingsResult) other;
        return L.f(this.title, profileSettingsResult.title) && L.f(this.dontShowProfileViewLink, profileSettingsResult.dontShowProfileViewLink) && L.f(this.showAllWidgetsWithoutTabsPicker, profileSettingsResult.showAllWidgetsWithoutTabsPicker) && L.f(this.tabs, profileSettingsResult.tabs) && L.f(this.action, profileSettingsResult.action);
    }

    @l
    public final DeeplinkAction getAction() {
        return this.action;
    }

    @l
    public final Boolean getDontShowProfileViewLink() {
        return this.dontShowProfileViewLink;
    }

    @l
    public final Boolean getShowAllWidgetsWithoutTabsPicker() {
        return this.showAllWidgetsWithoutTabsPicker;
    }

    @l
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.dontShowProfileViewLink;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showAllWidgetsWithoutTabsPicker;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Tab> list = this.tabs;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        DeeplinkAction deeplinkAction = this.action;
        return iHashCode4 + (deeplinkAction != null ? deeplinkAction.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ProfileSettingsResult(title=" + this.title + ", dontShowProfileViewLink=" + this.dontShowProfileViewLink + ", showAllWidgetsWithoutTabsPicker=" + this.showAllWidgetsWithoutTabsPicker + ", tabs=" + this.tabs + ", action=" + this.action + ')';
    }
}
