package com.avito.android.remote.model.basic;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.extended.FieldModerationStatus;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BasicInfoWidget.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u000b\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidget;", "Lcom/avito/android/remote/model/basic/BasicSettingsWidget;", Navigation.CONFIG, "Lcom/avito/android/remote/model/basic/BasicInfoWidget$Config;", "newFields", "Lcom/avito/android/remote/model/basic/BasicInfoWidget$Records;", "(Lcom/avito/android/remote/model/basic/BasicInfoWidget$Config;Lcom/avito/android/remote/model/basic/BasicInfoWidget$Records;)V", "getConfig", "()Lcom/avito/android/remote/model/basic/BasicInfoWidget$Config;", "getNewFields", "()Lcom/avito/android/remote/model/basic/BasicInfoWidget$Records;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "Config", "RecordAvatar", "RecordAvatarImageValue", "RecordAvatarValue", "RecordIcon", "RecordInfo", "RecordText", "RecordTextValue", "RecordTooltip", "Records", "UserNamePopup", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BasicInfoWidget implements BasicSettingsWidget {

    @c(Navigation.CONFIG)
    @l
    private final Config config;

    @c("newFields")
    @l
    private final Records newFields;

    /* compiled from: BasicInfoWidget.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidget$Config;", "", "logoShape", "Lcom/avito/android/remote/model/AvatarShape;", "basicInfoWidgetAvatarActions", "", "Lcom/avito/android/remote/model/basic/BasicInfoWidgetAvatarAction;", "userNamePopup", "Lcom/avito/android/remote/model/basic/BasicInfoWidget$UserNamePopup;", "(Lcom/avito/android/remote/model/AvatarShape;Ljava/util/List;Lcom/avito/android/remote/model/basic/BasicInfoWidget$UserNamePopup;)V", "getBasicInfoWidgetAvatarActions", "()Ljava/util/List;", "getLogoShape", "()Lcom/avito/android/remote/model/AvatarShape;", "getUserNamePopup", "()Lcom/avito/android/remote/model/basic/BasicInfoWidget$UserNamePopup;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config {

        @c("avatarActions")
        @l
        private final List<BasicInfoWidgetAvatarAction> basicInfoWidgetAvatarActions;

        @c("logoShape")
        @l
        private final AvatarShape logoShape;

        @c("userNamePopup")
        @l
        private final UserNamePopup userNamePopup;

        public Config(@l AvatarShape avatarShape, @l List<BasicInfoWidgetAvatarAction> list, @l UserNamePopup userNamePopup) {
            this.logoShape = avatarShape;
            this.basicInfoWidgetAvatarActions = list;
            this.userNamePopup = userNamePopup;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Config copy$default(Config config, AvatarShape avatarShape, List list, UserNamePopup userNamePopup, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                avatarShape = config.logoShape;
            }
            if ((i12 & 2) != 0) {
                list = config.basicInfoWidgetAvatarActions;
            }
            if ((i12 & 4) != 0) {
                userNamePopup = config.userNamePopup;
            }
            return config.copy(avatarShape, list, userNamePopup);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final AvatarShape getLogoShape() {
            return this.logoShape;
        }

        @l
        public final List<BasicInfoWidgetAvatarAction> component2() {
            return this.basicInfoWidgetAvatarActions;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final UserNamePopup getUserNamePopup() {
            return this.userNamePopup;
        }

        @k
        public final Config copy(@l AvatarShape logoShape, @l List<BasicInfoWidgetAvatarAction> basicInfoWidgetAvatarActions, @l UserNamePopup userNamePopup) {
            return new Config(logoShape, basicInfoWidgetAvatarActions, userNamePopup);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return this.logoShape == config.logoShape && L.f(this.basicInfoWidgetAvatarActions, config.basicInfoWidgetAvatarActions) && L.f(this.userNamePopup, config.userNamePopup);
        }

        @l
        public final List<BasicInfoWidgetAvatarAction> getBasicInfoWidgetAvatarActions() {
            return this.basicInfoWidgetAvatarActions;
        }

        @l
        public final AvatarShape getLogoShape() {
            return this.logoShape;
        }

        @l
        public final UserNamePopup getUserNamePopup() {
            return this.userNamePopup;
        }

        public int hashCode() {
            AvatarShape avatarShape = this.logoShape;
            int iHashCode = (avatarShape == null ? 0 : avatarShape.hashCode()) * 31;
            List<BasicInfoWidgetAvatarAction> list = this.basicInfoWidgetAvatarActions;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            UserNamePopup userNamePopup = this.userNamePopup;
            return iHashCode2 + (userNamePopup != null ? userNamePopup.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Config(logoShape=" + this.logoShape + ", basicInfoWidgetAvatarActions=" + this.basicInfoWidgetAvatarActions + ", userNamePopup=" + this.userNamePopup + ')';
        }
    }

    /* compiled from: BasicInfoWidget.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordAvatar;", "", "type", "Lcom/avito/android/remote/model/AvatarShape;", "name", "", "values", "", "Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordAvatarValue;", "(Lcom/avito/android/remote/model/AvatarShape;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/avito/android/remote/model/AvatarShape;", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecordAvatar {

        @c("name")
        @l
        private final String name;

        @c("type")
        @l
        private final AvatarShape type;

        @c("values")
        @l
        private final List<RecordAvatarValue> values;

        public RecordAvatar(@l AvatarShape avatarShape, @l String str, @l List<RecordAvatarValue> list) {
            this.type = avatarShape;
            this.name = str;
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RecordAvatar copy$default(RecordAvatar recordAvatar, AvatarShape avatarShape, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                avatarShape = recordAvatar.type;
            }
            if ((i12 & 2) != 0) {
                str = recordAvatar.name;
            }
            if ((i12 & 4) != 0) {
                list = recordAvatar.values;
            }
            return recordAvatar.copy(avatarShape, str, list);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final AvatarShape getType() {
            return this.type;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        public final List<RecordAvatarValue> component3() {
            return this.values;
        }

        @k
        public final RecordAvatar copy(@l AvatarShape type, @l String name, @l List<RecordAvatarValue> values) {
            return new RecordAvatar(type, name, values);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecordAvatar)) {
                return false;
            }
            RecordAvatar recordAvatar = (RecordAvatar) other;
            return this.type == recordAvatar.type && L.f(this.name, recordAvatar.name) && L.f(this.values, recordAvatar.values);
        }

        @l
        public final String getName() {
            return this.name;
        }

        @l
        public final AvatarShape getType() {
            return this.type;
        }

        @l
        public final List<RecordAvatarValue> getValues() {
            return this.values;
        }

        public int hashCode() {
            AvatarShape avatarShape = this.type;
            int iHashCode = (avatarShape == null ? 0 : avatarShape.hashCode()) * 31;
            String str = this.name;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<RecordAvatarValue> list = this.values;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RecordAvatar(type=");
            sb2.append(this.type);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", values=");
            return H.p(sb2, this.values, ')');
        }
    }

    /* compiled from: BasicInfoWidget.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordAvatarImageValue;", "", "image", "Lcom/avito/android/remote/model/Image;", "(Lcom/avito/android/remote/model/Image;)V", "getImage", "()Lcom/avito/android/remote/model/Image;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecordAvatarImageValue {

        @c("image")
        @l
        private final Image image;

        public RecordAvatarImageValue(@l Image image) {
            this.image = image;
        }

        public static /* synthetic */ RecordAvatarImageValue copy$default(RecordAvatarImageValue recordAvatarImageValue, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                image = recordAvatarImageValue.image;
            }
            return recordAvatarImageValue.copy(image);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        public final RecordAvatarImageValue copy(@l Image image) {
            return new RecordAvatarImageValue(image);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RecordAvatarImageValue) && L.f(this.image, ((RecordAvatarImageValue) other).image);
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        public int hashCode() {
            Image image = this.image;
            if (image == null) {
                return 0;
            }
            return image.hashCode();
        }

        @k
        public String toString() {
            return AK.c.o(new StringBuilder("RecordAvatarImageValue(image="), this.image, ')');
        }
    }

    /* compiled from: BasicInfoWidget.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordAvatarValue;", "", "value", "Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordAvatarImageValue;", "status", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "(Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordAvatarImageValue;Lcom/avito/android/remote/model/extended/FieldModerationStatus;)V", "getStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getValue", "()Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordAvatarImageValue;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecordAvatarValue {

        @c("status")
        @l
        private final FieldModerationStatus status;

        @c("value")
        @l
        private final RecordAvatarImageValue value;

        public RecordAvatarValue(@l RecordAvatarImageValue recordAvatarImageValue, @l FieldModerationStatus fieldModerationStatus) {
            this.value = recordAvatarImageValue;
            this.status = fieldModerationStatus;
        }

        public static /* synthetic */ RecordAvatarValue copy$default(RecordAvatarValue recordAvatarValue, RecordAvatarImageValue recordAvatarImageValue, FieldModerationStatus fieldModerationStatus, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                recordAvatarImageValue = recordAvatarValue.value;
            }
            if ((i12 & 2) != 0) {
                fieldModerationStatus = recordAvatarValue.status;
            }
            return recordAvatarValue.copy(recordAvatarImageValue, fieldModerationStatus);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final RecordAvatarImageValue getValue() {
            return this.value;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @k
        public final RecordAvatarValue copy(@l RecordAvatarImageValue value, @l FieldModerationStatus status) {
            return new RecordAvatarValue(value, status);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecordAvatarValue)) {
                return false;
            }
            RecordAvatarValue recordAvatarValue = (RecordAvatarValue) other;
            return L.f(this.value, recordAvatarValue.value) && L.f(this.status, recordAvatarValue.status);
        }

        @l
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @l
        public final RecordAvatarImageValue getValue() {
            return this.value;
        }

        public int hashCode() {
            RecordAvatarImageValue recordAvatarImageValue = this.value;
            int iHashCode = (recordAvatarImageValue == null ? 0 : recordAvatarImageValue.hashCode()) * 31;
            FieldModerationStatus fieldModerationStatus = this.status;
            return iHashCode + (fieldModerationStatus != null ? fieldModerationStatus.hashCode() : 0);
        }

        @k
        public String toString() {
            return "RecordAvatarValue(value=" + this.value + ", status=" + this.status + ')';
        }
    }

    /* compiled from: BasicInfoWidget.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordIcon;", "", "color", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecordIcon {

        @c("color")
        @l
        private final String color;

        @c("name")
        @l
        private final String name;

        public RecordIcon(@l String str, @l String str2) {
            this.color = str;
            this.name = str2;
        }

        public static /* synthetic */ RecordIcon copy$default(RecordIcon recordIcon, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = recordIcon.color;
            }
            if ((i12 & 2) != 0) {
                str2 = recordIcon.name;
            }
            return recordIcon.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        public final RecordIcon copy(@l String color, @l String name) {
            return new RecordIcon(color, name);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecordIcon)) {
                return false;
            }
            RecordIcon recordIcon = (RecordIcon) other;
            return L.f(this.color, recordIcon.color) && L.f(this.name, recordIcon.name);
        }

        @l
        public final String getColor() {
            return this.color;
        }

        @l
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.color;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RecordIcon(color=");
            sb2.append(this.color);
            sb2.append(", name=");
            return C22026a.c(sb2, this.name, ')');
        }
    }

    /* compiled from: BasicInfoWidget.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordInfo;", "", "title", "", "subtitle", "buttonTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonTitle", "()Ljava/lang/String;", "getSubtitle", "getTitle", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecordInfo {

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        public RecordInfo(@l String str, @l String str2, @l String str3) {
            this.title = str;
            this.subtitle = str2;
            this.buttonTitle = str3;
        }

        public static /* synthetic */ RecordInfo copy$default(RecordInfo recordInfo, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = recordInfo.title;
            }
            if ((i12 & 2) != 0) {
                str2 = recordInfo.subtitle;
            }
            if ((i12 & 4) != 0) {
                str3 = recordInfo.buttonTitle;
            }
            return recordInfo.copy(str, str2, str3);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @k
        public final RecordInfo copy(@l String title, @l String subtitle, @l String buttonTitle) {
            return new RecordInfo(title, subtitle, buttonTitle);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecordInfo)) {
                return false;
            }
            RecordInfo recordInfo = (RecordInfo) other;
            return L.f(this.title, recordInfo.title) && L.f(this.subtitle, recordInfo.subtitle) && L.f(this.buttonTitle, recordInfo.buttonTitle);
        }

        @l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buttonTitle;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RecordInfo(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", buttonTitle=");
            return C22026a.c(sb2, this.buttonTitle, ')');
        }
    }

    /* compiled from: BasicInfoWidget.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0080\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\b\u0010\u001cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordText;", "", "type", "", "name", "values", "", "Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordTextValue;", "isEditable", "", "description", "icon", "Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordIcon;", RequestReviewResultKt.INFO_TYPE, "Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordInfo;", "onboarding", "Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordTooltip;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordIcon;Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordInfo;Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordTooltip;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getDescription", "()Ljava/lang/String;", "getIcon", "()Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordIcon;", "getInfo", "()Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordInfo;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "getOnboarding", "()Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordTooltip;", "getType", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordIcon;Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordInfo;Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordTooltip;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordText;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecordText {

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c("description")
        @l
        private final String description;

        @c("icon")
        @l
        private final RecordIcon icon;

        @c(RequestReviewResultKt.INFO_TYPE)
        @l
        private final RecordInfo info;

        @c("isEditable")
        @l
        private final Boolean isEditable;

        @c("name")
        @l
        private final String name;

        @c("onboarding")
        @l
        private final RecordTooltip onboarding;

        @c("type")
        @l
        private final String type;

        @c("values")
        @l
        private final List<RecordTextValue> values;

        public RecordText(@l String str, @l String str2, @l List<RecordTextValue> list, @l Boolean bool, @l String str3, @l RecordIcon recordIcon, @l RecordInfo recordInfo, @l RecordTooltip recordTooltip, @l DeepLink deepLink) {
            this.type = str;
            this.name = str2;
            this.values = list;
            this.isEditable = bool;
            this.description = str3;
            this.icon = recordIcon;
            this.info = recordInfo;
            this.onboarding = recordTooltip;
            this.deepLink = deepLink;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        public final List<RecordTextValue> component3() {
            return this.values;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Boolean getIsEditable() {
            return this.isEditable;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final RecordIcon getIcon() {
            return this.icon;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final RecordInfo getInfo() {
            return this.info;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final RecordTooltip getOnboarding() {
            return this.onboarding;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final RecordText copy(@l String type, @l String name, @l List<RecordTextValue> values, @l Boolean isEditable, @l String description, @l RecordIcon icon, @l RecordInfo info, @l RecordTooltip onboarding, @l DeepLink deepLink) {
            return new RecordText(type, name, values, isEditable, description, icon, info, onboarding, deepLink);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecordText)) {
                return false;
            }
            RecordText recordText = (RecordText) other;
            return L.f(this.type, recordText.type) && L.f(this.name, recordText.name) && L.f(this.values, recordText.values) && L.f(this.isEditable, recordText.isEditable) && L.f(this.description, recordText.description) && L.f(this.icon, recordText.icon) && L.f(this.info, recordText.info) && L.f(this.onboarding, recordText.onboarding) && L.f(this.deepLink, recordText.deepLink);
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final RecordIcon getIcon() {
            return this.icon;
        }

        @l
        public final RecordInfo getInfo() {
            return this.info;
        }

        @l
        public final String getName() {
            return this.name;
        }

        @l
        public final RecordTooltip getOnboarding() {
            return this.onboarding;
        }

        @l
        public final String getType() {
            return this.type;
        }

        @l
        public final List<RecordTextValue> getValues() {
            return this.values;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<RecordTextValue> list = this.values;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isEditable;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.description;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            RecordIcon recordIcon = this.icon;
            int iHashCode6 = (iHashCode5 + (recordIcon == null ? 0 : recordIcon.hashCode())) * 31;
            RecordInfo recordInfo = this.info;
            int iHashCode7 = (iHashCode6 + (recordInfo == null ? 0 : recordInfo.hashCode())) * 31;
            RecordTooltip recordTooltip = this.onboarding;
            int iHashCode8 = (iHashCode7 + (recordTooltip == null ? 0 : recordTooltip.hashCode())) * 31;
            DeepLink deepLink = this.deepLink;
            return iHashCode8 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @l
        public final Boolean isEditable() {
            return this.isEditable;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RecordText(type=");
            sb2.append(this.type);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", values=");
            sb2.append(this.values);
            sb2.append(", isEditable=");
            sb2.append(this.isEditable);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", info=");
            sb2.append(this.info);
            sb2.append(", onboarding=");
            sb2.append(this.onboarding);
            sb2.append(", deepLink=");
            return a.v(sb2, this.deepLink, ')');
        }
    }

    /* compiled from: BasicInfoWidget.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordTextValue;", "", "value", "", "status", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;)V", "getStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecordTextValue {

        @c("status")
        @l
        private final FieldModerationStatus status;

        @c("value")
        @l
        private final String value;

        public RecordTextValue(@l String str, @l FieldModerationStatus fieldModerationStatus) {
            this.value = str;
            this.status = fieldModerationStatus;
        }

        public static /* synthetic */ RecordTextValue copy$default(RecordTextValue recordTextValue, String str, FieldModerationStatus fieldModerationStatus, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = recordTextValue.value;
            }
            if ((i12 & 2) != 0) {
                fieldModerationStatus = recordTextValue.status;
            }
            return recordTextValue.copy(str, fieldModerationStatus);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @k
        public final RecordTextValue copy(@l String value, @l FieldModerationStatus status) {
            return new RecordTextValue(value, status);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecordTextValue)) {
                return false;
            }
            RecordTextValue recordTextValue = (RecordTextValue) other;
            return L.f(this.value, recordTextValue.value) && L.f(this.status, recordTextValue.status);
        }

        @l
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @l
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            FieldModerationStatus fieldModerationStatus = this.status;
            return iHashCode + (fieldModerationStatus != null ? fieldModerationStatus.hashCode() : 0);
        }

        @k
        public String toString() {
            return "RecordTextValue(value=" + this.value + ", status=" + this.status + ')';
        }
    }

    /* compiled from: BasicInfoWidget.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordTooltip;", "", "title", "", "subtitle", "buttonTitle", "onceShowId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonTitle", "()Ljava/lang/String;", "getOnceShowId", "getSubtitle", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecordTooltip {

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c("onceShowId")
        @l
        private final String onceShowId;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        public RecordTooltip(@l String str, @l String str2, @l String str3, @l String str4) {
            this.title = str;
            this.subtitle = str2;
            this.buttonTitle = str3;
            this.onceShowId = str4;
        }

        public static /* synthetic */ RecordTooltip copy$default(RecordTooltip recordTooltip, String str, String str2, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = recordTooltip.title;
            }
            if ((i12 & 2) != 0) {
                str2 = recordTooltip.subtitle;
            }
            if ((i12 & 4) != 0) {
                str3 = recordTooltip.buttonTitle;
            }
            if ((i12 & 8) != 0) {
                str4 = recordTooltip.onceShowId;
            }
            return recordTooltip.copy(str, str2, str3, str4);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @k
        public final RecordTooltip copy(@l String title, @l String subtitle, @l String buttonTitle, @l String onceShowId) {
            return new RecordTooltip(title, subtitle, buttonTitle, onceShowId);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecordTooltip)) {
                return false;
            }
            RecordTooltip recordTooltip = (RecordTooltip) other;
            return L.f(this.title, recordTooltip.title) && L.f(this.subtitle, recordTooltip.subtitle) && L.f(this.buttonTitle, recordTooltip.buttonTitle) && L.f(this.onceShowId, recordTooltip.onceShowId);
        }

        @l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buttonTitle;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.onceShowId;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RecordTooltip(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", buttonTitle=");
            sb2.append(this.buttonTitle);
            sb2.append(", onceShowId=");
            return C22026a.c(sb2, this.onceShowId, ')');
        }
    }

    /* compiled from: BasicInfoWidget.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidget$Records;", "", "text", "", "Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordText;", "avatar", "Lcom/avito/android/remote/model/basic/BasicInfoWidget$RecordAvatar;", "(Ljava/util/List;Ljava/util/List;)V", "getAvatar", "()Ljava/util/List;", "getText", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Records {

        @c("avatar")
        @l
        private final List<RecordAvatar> avatar;

        @c("text")
        @l
        private final List<RecordText> text;

        public Records(@l List<RecordText> list, @l List<RecordAvatar> list2) {
            this.text = list;
            this.avatar = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Records copy$default(Records records, List list, List list2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = records.text;
            }
            if ((i12 & 2) != 0) {
                list2 = records.avatar;
            }
            return records.copy(list, list2);
        }

        @l
        public final List<RecordText> component1() {
            return this.text;
        }

        @l
        public final List<RecordAvatar> component2() {
            return this.avatar;
        }

        @k
        public final Records copy(@l List<RecordText> text, @l List<RecordAvatar> avatar) {
            return new Records(text, avatar);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Records)) {
                return false;
            }
            Records records = (Records) other;
            return L.f(this.text, records.text) && L.f(this.avatar, records.avatar);
        }

        @l
        public final List<RecordAvatar> getAvatar() {
            return this.avatar;
        }

        @l
        public final List<RecordText> getText() {
            return this.text;
        }

        public int hashCode() {
            List<RecordText> list = this.text;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<RecordAvatar> list2 = this.avatar;
            return iHashCode + (list2 != null ? list2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Records(text=");
            sb2.append(this.text);
            sb2.append(", avatar=");
            return H.p(sb2, this.avatar, ')');
        }
    }

    /* compiled from: BasicInfoWidget.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/basic/BasicInfoWidget$UserNamePopup;", "", "title", "", ChannelContext.Item.PLACEHOLDER, "(Ljava/lang/String;Ljava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UserNamePopup {

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("title")
        @l
        private final String title;

        public UserNamePopup(@l String str, @l String str2) {
            this.title = str;
            this.placeholder = str2;
        }

        public static /* synthetic */ UserNamePopup copy$default(UserNamePopup userNamePopup, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = userNamePopup.title;
            }
            if ((i12 & 2) != 0) {
                str2 = userNamePopup.placeholder;
            }
            return userNamePopup.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @k
        public final UserNamePopup copy(@l String title, @l String placeholder) {
            return new UserNamePopup(title, placeholder);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserNamePopup)) {
                return false;
            }
            UserNamePopup userNamePopup = (UserNamePopup) other;
            return L.f(this.title, userNamePopup.title) && L.f(this.placeholder, userNamePopup.placeholder);
        }

        @l
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.placeholder;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("UserNamePopup(title=");
            sb2.append(this.title);
            sb2.append(", placeholder=");
            return C22026a.c(sb2, this.placeholder, ')');
        }
    }

    public BasicInfoWidget(@l Config config, @l Records records) {
        this.config = config;
        this.newFields = records;
    }

    public static /* synthetic */ BasicInfoWidget copy$default(BasicInfoWidget basicInfoWidget, Config config, Records records, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            config = basicInfoWidget.config;
        }
        if ((i12 & 2) != 0) {
            records = basicInfoWidget.newFields;
        }
        return basicInfoWidget.copy(config, records);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Records getNewFields() {
        return this.newFields;
    }

    @k
    public final BasicInfoWidget copy(@l Config config, @l Records newFields) {
        return new BasicInfoWidget(config, newFields);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicInfoWidget)) {
            return false;
        }
        BasicInfoWidget basicInfoWidget = (BasicInfoWidget) other;
        return L.f(this.config, basicInfoWidget.config) && L.f(this.newFields, basicInfoWidget.newFields);
    }

    @l
    public final Config getConfig() {
        return this.config;
    }

    @l
    public final Records getNewFields() {
        return this.newFields;
    }

    public int hashCode() {
        Config config = this.config;
        int iHashCode = (config == null ? 0 : config.hashCode()) * 31;
        Records records = this.newFields;
        return iHashCode + (records != null ? records.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BasicInfoWidget(config=" + this.config + ", newFields=" + this.newFields + ')';
    }
}
