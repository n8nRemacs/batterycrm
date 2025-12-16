package com.avito.android.remote.model.basic;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: BasicInfoWidget.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\b\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction;", "", "type", "Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction$AvatarActionType;", "title", "", "icon", "Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction$AvatarActionIconType;", "isRemovePublic", "", "(Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction$AvatarActionType;Ljava/lang/String;Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction$AvatarActionIconType;Ljava/lang/Boolean;)V", "getIcon", "()Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction$AvatarActionIconType;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "getType", "()Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction$AvatarActionType;", "component1", "component2", "component3", "component4", "copy", "(Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction$AvatarActionType;Ljava/lang/String;Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction$AvatarActionIconType;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "AvatarActionIconType", "AvatarActionType", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BasicInfoWidgetAvatarAction {

    @c("icon")
    @l
    private final AvatarActionIconType icon;

    @c("isRemovePublic")
    @l
    private final Boolean isRemovePublic;

    @c("title")
    @l
    private final String title;

    @c("type")
    @l
    private final AvatarActionType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BasicInfoWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction$AvatarActionIconType;", "", "(Ljava/lang/String;I)V", "UPLOAD", "REMOVE", "REVERT", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AvatarActionIconType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AvatarActionIconType[] $VALUES;

        @c("upload")
        public static final AvatarActionIconType UPLOAD = new AvatarActionIconType("UPLOAD", 0);

        @c("remove")
        public static final AvatarActionIconType REMOVE = new AvatarActionIconType("REMOVE", 1);

        @c("revert")
        public static final AvatarActionIconType REVERT = new AvatarActionIconType("REVERT", 2);

        private static final /* synthetic */ AvatarActionIconType[] $values() {
            return new AvatarActionIconType[]{UPLOAD, REMOVE, REVERT};
        }

        static {
            AvatarActionIconType[] avatarActionIconTypeArr$values = $values();
            $VALUES = avatarActionIconTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(avatarActionIconTypeArr$values);
        }

        private AvatarActionIconType(String str, int i12) {
        }

        @k
        public static a<AvatarActionIconType> getEntries() {
            return $ENTRIES;
        }

        public static AvatarActionIconType valueOf(String str) {
            return (AvatarActionIconType) Enum.valueOf(AvatarActionIconType.class, str);
        }

        public static AvatarActionIconType[] values() {
            return (AvatarActionIconType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BasicInfoWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction$AvatarActionType;", "", "(Ljava/lang/String;I)V", "UPLOAD", "REMOVE", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AvatarActionType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AvatarActionType[] $VALUES;

        @c("upload")
        public static final AvatarActionType UPLOAD = new AvatarActionType("UPLOAD", 0);

        @c("remove")
        public static final AvatarActionType REMOVE = new AvatarActionType("REMOVE", 1);

        private static final /* synthetic */ AvatarActionType[] $values() {
            return new AvatarActionType[]{UPLOAD, REMOVE};
        }

        static {
            AvatarActionType[] avatarActionTypeArr$values = $values();
            $VALUES = avatarActionTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(avatarActionTypeArr$values);
        }

        private AvatarActionType(String str, int i12) {
        }

        @k
        public static a<AvatarActionType> getEntries() {
            return $ENTRIES;
        }

        public static AvatarActionType valueOf(String str) {
            return (AvatarActionType) Enum.valueOf(AvatarActionType.class, str);
        }

        public static AvatarActionType[] values() {
            return (AvatarActionType[]) $VALUES.clone();
        }
    }

    public BasicInfoWidgetAvatarAction(@l AvatarActionType avatarActionType, @l String str, @l AvatarActionIconType avatarActionIconType, @l Boolean bool) {
        this.type = avatarActionType;
        this.title = str;
        this.icon = avatarActionIconType;
        this.isRemovePublic = bool;
    }

    public static /* synthetic */ BasicInfoWidgetAvatarAction copy$default(BasicInfoWidgetAvatarAction basicInfoWidgetAvatarAction, AvatarActionType avatarActionType, String str, AvatarActionIconType avatarActionIconType, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            avatarActionType = basicInfoWidgetAvatarAction.type;
        }
        if ((i12 & 2) != 0) {
            str = basicInfoWidgetAvatarAction.title;
        }
        if ((i12 & 4) != 0) {
            avatarActionIconType = basicInfoWidgetAvatarAction.icon;
        }
        if ((i12 & 8) != 0) {
            bool = basicInfoWidgetAvatarAction.isRemovePublic;
        }
        return basicInfoWidgetAvatarAction.copy(avatarActionType, str, avatarActionIconType, bool);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AvatarActionType getType() {
        return this.type;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AvatarActionIconType getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsRemovePublic() {
        return this.isRemovePublic;
    }

    @k
    public final BasicInfoWidgetAvatarAction copy(@l AvatarActionType type, @l String title, @l AvatarActionIconType icon, @l Boolean isRemovePublic) {
        return new BasicInfoWidgetAvatarAction(type, title, icon, isRemovePublic);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicInfoWidgetAvatarAction)) {
            return false;
        }
        BasicInfoWidgetAvatarAction basicInfoWidgetAvatarAction = (BasicInfoWidgetAvatarAction) other;
        return this.type == basicInfoWidgetAvatarAction.type && L.f(this.title, basicInfoWidgetAvatarAction.title) && this.icon == basicInfoWidgetAvatarAction.icon && L.f(this.isRemovePublic, basicInfoWidgetAvatarAction.isRemovePublic);
    }

    @l
    public final AvatarActionIconType getIcon() {
        return this.icon;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final AvatarActionType getType() {
        return this.type;
    }

    public int hashCode() {
        AvatarActionType avatarActionType = this.type;
        int iHashCode = (avatarActionType == null ? 0 : avatarActionType.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AvatarActionIconType avatarActionIconType = this.icon;
        int iHashCode3 = (iHashCode2 + (avatarActionIconType == null ? 0 : avatarActionIconType.hashCode())) * 31;
        Boolean bool = this.isRemovePublic;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @l
    public final Boolean isRemovePublic() {
        return this.isRemovePublic;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BasicInfoWidgetAvatarAction(type=");
        sb2.append(this.type);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", isRemovePublic=");
        return C0.g(sb2, this.isRemovePublic, ')');
    }
}
