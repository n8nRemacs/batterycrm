package com.avito.android.remote.model.extended;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: Widgets.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001:\u0017\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget;", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", "widgetName", "", Navigation.CONFIG, "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Config;", LocalPublishState.FIELDS, "", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Field;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Config;Ljava/util/List;)V", "getConfig", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Config;", "getFields", "()Ljava/util/List;", "getWidgetName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Actions", "AvatarValue", "Config", "DeeplinkAction", "DisableVerticalAction", "EditorActionButtonConfig", "EditorAvatarConfig", "EditorConfig", "EditorNameConfig", "EditorPersonalLinkConfig", "EditorSpecificConfig", "EditorVerticalConfig", "Field", "FieldValue", "Icon", "Onboarding", "PersonalLinkFieldValue", "ServicesProfileType", "ServicesSellerTypeConfig", "UserNameFieldValue", "Value", "Verification", "VerificationStatus", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BasicInfoV2Widget implements ExtendedSettingsWidget {

    @c(Navigation.CONFIG)
    @k
    private final Config config;

    @c(LocalPublishState.FIELDS)
    @l
    private final List<Field> fields;

    @c("widgetName")
    @k
    private final String widgetName;

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Actions;", "", "shareTitle", "", "myProfileTitle", "disableVerticalAction", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DisableVerticalAction;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DisableVerticalAction;)V", "getDisableVerticalAction", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DisableVerticalAction;", "getMyProfileTitle", "()Ljava/lang/String;", "getShareTitle", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Actions {

        @c("disableVertical")
        @l
        private final DisableVerticalAction disableVerticalAction;

        @c("myProfileTitle")
        @k
        private final String myProfileTitle;

        @c("shareTitle")
        @k
        private final String shareTitle;

        public Actions(@k String str, @k String str2, @l DisableVerticalAction disableVerticalAction) {
            this.shareTitle = str;
            this.myProfileTitle = str2;
            this.disableVerticalAction = disableVerticalAction;
        }

        public static /* synthetic */ Actions copy$default(Actions actions, String str, String str2, DisableVerticalAction disableVerticalAction, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = actions.shareTitle;
            }
            if ((i12 & 2) != 0) {
                str2 = actions.myProfileTitle;
            }
            if ((i12 & 4) != 0) {
                disableVerticalAction = actions.disableVerticalAction;
            }
            return actions.copy(str, str2, disableVerticalAction);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getShareTitle() {
            return this.shareTitle;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getMyProfileTitle() {
            return this.myProfileTitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DisableVerticalAction getDisableVerticalAction() {
            return this.disableVerticalAction;
        }

        @k
        public final Actions copy(@k String shareTitle, @k String myProfileTitle, @l DisableVerticalAction disableVerticalAction) {
            return new Actions(shareTitle, myProfileTitle, disableVerticalAction);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Actions)) {
                return false;
            }
            Actions actions = (Actions) other;
            return L.f(this.shareTitle, actions.shareTitle) && L.f(this.myProfileTitle, actions.myProfileTitle) && L.f(this.disableVerticalAction, actions.disableVerticalAction);
        }

        @l
        public final DisableVerticalAction getDisableVerticalAction() {
            return this.disableVerticalAction;
        }

        @k
        public final String getMyProfileTitle() {
            return this.myProfileTitle;
        }

        @k
        public final String getShareTitle() {
            return this.shareTitle;
        }

        public int hashCode() {
            int iD2 = H.d(this.shareTitle.hashCode() * 31, 31, this.myProfileTitle);
            DisableVerticalAction disableVerticalAction = this.disableVerticalAction;
            return iD2 + (disableVerticalAction == null ? 0 : disableVerticalAction.hashCode());
        }

        @k
        public String toString() {
            return "Actions(shareTitle=" + this.shareTitle + ", myProfileTitle=" + this.myProfileTitle + ", disableVerticalAction=" + this.disableVerticalAction + ')';
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$AvatarValue;", "", "status", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "image", "Lcom/avito/android/remote/model/Image;", "(Lcom/avito/android/remote/model/extended/FieldModerationStatus;Lcom/avito/android/remote/model/Image;)V", "getImage", "()Lcom/avito/android/remote/model/Image;", "getStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvatarValue {

        @c("image")
        @l
        private final Image image;

        @c("status")
        @l
        private final FieldModerationStatus status;

        public AvatarValue(@l FieldModerationStatus fieldModerationStatus, @l Image image) {
            this.status = fieldModerationStatus;
            this.image = image;
        }

        public static /* synthetic */ AvatarValue copy$default(AvatarValue avatarValue, FieldModerationStatus fieldModerationStatus, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                fieldModerationStatus = avatarValue.status;
            }
            if ((i12 & 2) != 0) {
                image = avatarValue.image;
            }
            return avatarValue.copy(fieldModerationStatus, image);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        public final AvatarValue copy(@l FieldModerationStatus status, @l Image image) {
            return new AvatarValue(status, image);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvatarValue)) {
                return false;
            }
            AvatarValue avatarValue = (AvatarValue) other;
            return L.f(this.status, avatarValue.status) && L.f(this.image, avatarValue.image);
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @l
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            FieldModerationStatus fieldModerationStatus = this.status;
            int iHashCode = (fieldModerationStatus == null ? 0 : fieldModerationStatus.hashCode()) * 31;
            Image image = this.image;
            return iHashCode + (image != null ? image.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AvatarValue(status=");
            sb2.append(this.status);
            sb2.append(", image=");
            return AK.c.o(sb2, this.image, ')');
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003Jq\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Config;", "", "avatar", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$AvatarValue;", "profileType", "", "registeredTime", ChannelContext.Item.USER_ID, "userIdToCopy", "profileCategory", "verification", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Verification;", "actions", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Actions;", "editorConfig", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorConfig;", "servicesProfileType", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$ServicesProfileType;", "(Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$AvatarValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Verification;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Actions;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorConfig;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$ServicesProfileType;)V", "getActions", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Actions;", "getAvatar", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$AvatarValue;", "getEditorConfig", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorConfig;", "getProfileCategory", "()Ljava/lang/String;", "getProfileType", "getRegisteredTime", "getServicesProfileType", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$ServicesProfileType;", "getUserId", "getUserIdToCopy", "getVerification", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Verification;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config {

        @c("actions")
        @k
        private final Actions actions;

        @c("avatar")
        @k
        private final AvatarValue avatar;

        @c("editorConfig")
        @k
        private final EditorConfig editorConfig;

        @c("profileCategory")
        @k
        private final String profileCategory;

        @c("profileType")
        @k
        private final String profileType;

        @c("registeredTime")
        @k
        private final String registeredTime;

        @c("servicesProfileType")
        @l
        private final ServicesProfileType servicesProfileType;

        @c(ChannelContext.Item.USER_ID)
        @k
        private final String userId;

        @c("userIdToCopy")
        @k
        private final String userIdToCopy;

        @c("verification")
        @l
        private final Verification verification;

        public Config(@k AvatarValue avatarValue, @k String str, @k String str2, @k String str3, @k String str4, @k String str5, @l Verification verification, @k Actions actions, @k EditorConfig editorConfig, @l ServicesProfileType servicesProfileType) {
            this.avatar = avatarValue;
            this.profileType = str;
            this.registeredTime = str2;
            this.userId = str3;
            this.userIdToCopy = str4;
            this.profileCategory = str5;
            this.verification = verification;
            this.actions = actions;
            this.editorConfig = editorConfig;
            this.servicesProfileType = servicesProfileType;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AvatarValue getAvatar() {
            return this.avatar;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final ServicesProfileType getServicesProfileType() {
            return this.servicesProfileType;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getProfileType() {
            return this.profileType;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getRegisteredTime() {
            return this.registeredTime;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getUserIdToCopy() {
            return this.userIdToCopy;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final String getProfileCategory() {
            return this.profileCategory;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Verification getVerification() {
            return this.verification;
        }

        @k
        /* renamed from: component8, reason: from getter */
        public final Actions getActions() {
            return this.actions;
        }

        @k
        /* renamed from: component9, reason: from getter */
        public final EditorConfig getEditorConfig() {
            return this.editorConfig;
        }

        @k
        public final Config copy(@k AvatarValue avatar, @k String profileType, @k String registeredTime, @k String userId, @k String userIdToCopy, @k String profileCategory, @l Verification verification, @k Actions actions, @k EditorConfig editorConfig, @l ServicesProfileType servicesProfileType) {
            return new Config(avatar, profileType, registeredTime, userId, userIdToCopy, profileCategory, verification, actions, editorConfig, servicesProfileType);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.avatar, config.avatar) && L.f(this.profileType, config.profileType) && L.f(this.registeredTime, config.registeredTime) && L.f(this.userId, config.userId) && L.f(this.userIdToCopy, config.userIdToCopy) && L.f(this.profileCategory, config.profileCategory) && L.f(this.verification, config.verification) && L.f(this.actions, config.actions) && L.f(this.editorConfig, config.editorConfig) && L.f(this.servicesProfileType, config.servicesProfileType);
        }

        @k
        public final Actions getActions() {
            return this.actions;
        }

        @k
        public final AvatarValue getAvatar() {
            return this.avatar;
        }

        @k
        public final EditorConfig getEditorConfig() {
            return this.editorConfig;
        }

        @k
        public final String getProfileCategory() {
            return this.profileCategory;
        }

        @k
        public final String getProfileType() {
            return this.profileType;
        }

        @k
        public final String getRegisteredTime() {
            return this.registeredTime;
        }

        @l
        public final ServicesProfileType getServicesProfileType() {
            return this.servicesProfileType;
        }

        @k
        public final String getUserId() {
            return this.userId;
        }

        @k
        public final String getUserIdToCopy() {
            return this.userIdToCopy;
        }

        @l
        public final Verification getVerification() {
            return this.verification;
        }

        public int hashCode() {
            int iD2 = H.d(H.d(H.d(H.d(H.d(this.avatar.hashCode() * 31, 31, this.profileType), 31, this.registeredTime), 31, this.userId), 31, this.userIdToCopy), 31, this.profileCategory);
            Verification verification = this.verification;
            int iHashCode = (this.editorConfig.hashCode() + ((this.actions.hashCode() + ((iD2 + (verification == null ? 0 : verification.hashCode())) * 31)) * 31)) * 31;
            ServicesProfileType servicesProfileType = this.servicesProfileType;
            return iHashCode + (servicesProfileType != null ? servicesProfileType.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Config(avatar=" + this.avatar + ", profileType=" + this.profileType + ", registeredTime=" + this.registeredTime + ", userId=" + this.userId + ", userIdToCopy=" + this.userIdToCopy + ", profileCategory=" + this.profileCategory + ", verification=" + this.verification + ", actions=" + this.actions + ", editorConfig=" + this.editorConfig + ", servicesProfileType=" + this.servicesProfileType + ')';
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DeeplinkAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DeeplinkAction$Type;", "type", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DeeplinkAction$Type;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DeeplinkAction$Type;", "getType", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DeeplinkAction$Type;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Type", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class DeeplinkAction implements Parcelable {

        @k
        public static final Parcelable.Creator<DeeplinkAction> CREATOR = new Creator();

        @c("type")
        @l
        private final Type type;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: Widgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DeeplinkAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DeeplinkAction createFromParcel(@k Parcel parcel) {
                return new DeeplinkAction(parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(DeeplinkAction.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DeeplinkAction[] newArray(int i12) {
                return new DeeplinkAction[i12];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DeeplinkAction$Type;", "", "(Ljava/lang/String;I)V", "LINK", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @c("link")
            public static final Type LINK = new Type("LINK", 0);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{LINK};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = kotlin.enums.c.a(typeArr$values);
            }

            private Type(String str, int i12) {
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
        }

        public DeeplinkAction(@l Type type, @l DeepLink deepLink) {
            this.type = type;
            this.uri = deepLink;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Type getType() {
            return this.type;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Type type = this.type;
            if (type == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(type.name());
            }
            parcel.writeParcelable(this.uri, flags);
        }
    }

    /* compiled from: Widgets.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DisableVerticalAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DeeplinkAction;", "action", "", "title", "<init>", "(Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DeeplinkAction;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DeeplinkAction;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DeeplinkAction;Ljava/lang/String;)Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DisableVerticalAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$DeeplinkAction;", "getAction", "Ljava/lang/String;", "getTitle", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DisableVerticalAction implements Parcelable {

        @k
        public static final Parcelable.Creator<DisableVerticalAction> CREATOR = new Creator();

        @c("action")
        @k
        private final DeeplinkAction action;

        @c("title")
        @k
        private final String title;

        /* compiled from: Widgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DisableVerticalAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DisableVerticalAction createFromParcel(@k Parcel parcel) {
                return new DisableVerticalAction(DeeplinkAction.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DisableVerticalAction[] newArray(int i12) {
                return new DisableVerticalAction[i12];
            }
        }

        public DisableVerticalAction(@k DeeplinkAction deeplinkAction, @k String str) {
            this.action = deeplinkAction;
            this.title = str;
        }

        public static /* synthetic */ DisableVerticalAction copy$default(DisableVerticalAction disableVerticalAction, DeeplinkAction deeplinkAction, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deeplinkAction = disableVerticalAction.action;
            }
            if ((i12 & 2) != 0) {
                str = disableVerticalAction.title;
            }
            return disableVerticalAction.copy(deeplinkAction, str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final DeeplinkAction getAction() {
            return this.action;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final DisableVerticalAction copy(@k DeeplinkAction action, @k String title) {
            return new DisableVerticalAction(action, title);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisableVerticalAction)) {
                return false;
            }
            DisableVerticalAction disableVerticalAction = (DisableVerticalAction) other;
            return L.f(this.action, disableVerticalAction.action) && L.f(this.title, disableVerticalAction.title);
        }

        @k
        public final DeeplinkAction getAction() {
            return this.action;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.action.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DisableVerticalAction(action=");
            sb2.append(this.action);
            sb2.append(", title=");
            return C22026a.c(sb2, this.title, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.action.writeToParcel(parcel, flags);
            parcel.writeString(this.title);
        }
    }

    /* compiled from: Widgets.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorActionButtonConfig;", "Landroid/os/Parcelable;", "", "title", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorActionButtonConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EditorActionButtonConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<EditorActionButtonConfig> CREATOR = new Creator();

        @c("title")
        @k
        private final String title;

        /* compiled from: Widgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EditorActionButtonConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorActionButtonConfig createFromParcel(@k Parcel parcel) {
                return new EditorActionButtonConfig(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorActionButtonConfig[] newArray(int i12) {
                return new EditorActionButtonConfig[i12];
            }
        }

        public EditorActionButtonConfig(@k String str) {
            this.title = str;
        }

        public static /* synthetic */ EditorActionButtonConfig copy$default(EditorActionButtonConfig editorActionButtonConfig, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = editorActionButtonConfig.title;
            }
            return editorActionButtonConfig.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final EditorActionButtonConfig copy(@k String title) {
            return new EditorActionButtonConfig(title);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditorActionButtonConfig) && L.f(this.title, ((EditorActionButtonConfig) other).title);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("EditorActionButtonConfig(title="), this.title, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
        }
    }

    /* compiled from: Widgets.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorAvatarConfig;", "Landroid/os/Parcelable;", "", "hasAvatar", "", "loadNewActionTitle", "deleteActionTitle", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorAvatarConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getHasAvatar", "Ljava/lang/String;", "getLoadNewActionTitle", "getDeleteActionTitle", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EditorAvatarConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<EditorAvatarConfig> CREATOR = new Creator();

        @c("deleteActionTitle")
        @k
        private final String deleteActionTitle;

        @c("hasAvatar")
        private final boolean hasAvatar;

        @c("loadNewActionTitle")
        @k
        private final String loadNewActionTitle;

        /* compiled from: Widgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EditorAvatarConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorAvatarConfig createFromParcel(@k Parcel parcel) {
                return new EditorAvatarConfig(parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorAvatarConfig[] newArray(int i12) {
                return new EditorAvatarConfig[i12];
            }
        }

        public EditorAvatarConfig(boolean z12, @k String str, @k String str2) {
            this.hasAvatar = z12;
            this.loadNewActionTitle = str;
            this.deleteActionTitle = str2;
        }

        public static /* synthetic */ EditorAvatarConfig copy$default(EditorAvatarConfig editorAvatarConfig, boolean z12, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = editorAvatarConfig.hasAvatar;
            }
            if ((i12 & 2) != 0) {
                str = editorAvatarConfig.loadNewActionTitle;
            }
            if ((i12 & 4) != 0) {
                str2 = editorAvatarConfig.deleteActionTitle;
            }
            return editorAvatarConfig.copy(z12, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHasAvatar() {
            return this.hasAvatar;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getLoadNewActionTitle() {
            return this.loadNewActionTitle;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getDeleteActionTitle() {
            return this.deleteActionTitle;
        }

        @k
        public final EditorAvatarConfig copy(boolean hasAvatar, @k String loadNewActionTitle, @k String deleteActionTitle) {
            return new EditorAvatarConfig(hasAvatar, loadNewActionTitle, deleteActionTitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditorAvatarConfig)) {
                return false;
            }
            EditorAvatarConfig editorAvatarConfig = (EditorAvatarConfig) other;
            return this.hasAvatar == editorAvatarConfig.hasAvatar && L.f(this.loadNewActionTitle, editorAvatarConfig.loadNewActionTitle) && L.f(this.deleteActionTitle, editorAvatarConfig.deleteActionTitle);
        }

        @k
        public final String getDeleteActionTitle() {
            return this.deleteActionTitle;
        }

        public final boolean getHasAvatar() {
            return this.hasAvatar;
        }

        @k
        public final String getLoadNewActionTitle() {
            return this.loadNewActionTitle;
        }

        public int hashCode() {
            return this.deleteActionTitle.hashCode() + H.d(Boolean.hashCode(this.hasAvatar) * 31, 31, this.loadNewActionTitle);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("EditorAvatarConfig(hasAvatar=");
            sb2.append(this.hasAvatar);
            sb2.append(", loadNewActionTitle=");
            sb2.append(this.loadNewActionTitle);
            sb2.append(", deleteActionTitle=");
            return C22026a.c(sb2, this.deleteActionTitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.hasAvatar ? 1 : 0);
            parcel.writeString(this.loadNewActionTitle);
            parcel.writeString(this.deleteActionTitle);
        }
    }

    /* compiled from: Widgets.kt */
    @d
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ^\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010\u001bR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010\u001f¨\u0006B"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorAvatarConfig;", "avatar", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorNameConfig;", "name", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorVerticalConfig;", "vertical", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorSpecificConfig;", "specific", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorPersonalLinkConfig;", "personalLink", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorActionButtonConfig;", "actionButton", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$ServicesSellerTypeConfig;", "sellerType", "<init>", "(Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorAvatarConfig;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorNameConfig;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorVerticalConfig;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorSpecificConfig;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorPersonalLinkConfig;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorActionButtonConfig;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$ServicesSellerTypeConfig;)V", "component1", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorAvatarConfig;", "component2", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorNameConfig;", "component3", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorVerticalConfig;", "component4", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorSpecificConfig;", "component5", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorPersonalLinkConfig;", "component6", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorActionButtonConfig;", "component7", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$ServicesSellerTypeConfig;", "copy", "(Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorAvatarConfig;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorNameConfig;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorVerticalConfig;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorSpecificConfig;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorPersonalLinkConfig;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorActionButtonConfig;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$ServicesSellerTypeConfig;)Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorAvatarConfig;", "getAvatar", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorNameConfig;", "getName", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorVerticalConfig;", "getVertical", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorSpecificConfig;", "getSpecific", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorPersonalLinkConfig;", "getPersonalLink", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorActionButtonConfig;", "getActionButton", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$ServicesSellerTypeConfig;", "getSellerType", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EditorConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<EditorConfig> CREATOR = new Creator();

        @c("actionButton")
        @k
        private final EditorActionButtonConfig actionButton;

        @c("avatar")
        @k
        private final EditorAvatarConfig avatar;

        @c("name")
        @k
        private final EditorNameConfig name;

        @c("personalLink")
        @l
        private final EditorPersonalLinkConfig personalLink;

        @c("servicesSellerType")
        @l
        private final ServicesSellerTypeConfig sellerType;

        @c("specific")
        @l
        private final EditorSpecificConfig specific;

        @c("vertical")
        @l
        private final EditorVerticalConfig vertical;

        /* compiled from: Widgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EditorConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorConfig createFromParcel(@k Parcel parcel) {
                return new EditorConfig(EditorAvatarConfig.CREATOR.createFromParcel(parcel), EditorNameConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EditorVerticalConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EditorSpecificConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EditorPersonalLinkConfig.CREATOR.createFromParcel(parcel), EditorActionButtonConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ServicesSellerTypeConfig.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorConfig[] newArray(int i12) {
                return new EditorConfig[i12];
            }
        }

        public EditorConfig(@k EditorAvatarConfig editorAvatarConfig, @k EditorNameConfig editorNameConfig, @l EditorVerticalConfig editorVerticalConfig, @l EditorSpecificConfig editorSpecificConfig, @l EditorPersonalLinkConfig editorPersonalLinkConfig, @k EditorActionButtonConfig editorActionButtonConfig, @l ServicesSellerTypeConfig servicesSellerTypeConfig) {
            this.avatar = editorAvatarConfig;
            this.name = editorNameConfig;
            this.vertical = editorVerticalConfig;
            this.specific = editorSpecificConfig;
            this.personalLink = editorPersonalLinkConfig;
            this.actionButton = editorActionButtonConfig;
            this.sellerType = servicesSellerTypeConfig;
        }

        public static /* synthetic */ EditorConfig copy$default(EditorConfig editorConfig, EditorAvatarConfig editorAvatarConfig, EditorNameConfig editorNameConfig, EditorVerticalConfig editorVerticalConfig, EditorSpecificConfig editorSpecificConfig, EditorPersonalLinkConfig editorPersonalLinkConfig, EditorActionButtonConfig editorActionButtonConfig, ServicesSellerTypeConfig servicesSellerTypeConfig, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                editorAvatarConfig = editorConfig.avatar;
            }
            if ((i12 & 2) != 0) {
                editorNameConfig = editorConfig.name;
            }
            EditorNameConfig editorNameConfig2 = editorNameConfig;
            if ((i12 & 4) != 0) {
                editorVerticalConfig = editorConfig.vertical;
            }
            EditorVerticalConfig editorVerticalConfig2 = editorVerticalConfig;
            if ((i12 & 8) != 0) {
                editorSpecificConfig = editorConfig.specific;
            }
            EditorSpecificConfig editorSpecificConfig2 = editorSpecificConfig;
            if ((i12 & 16) != 0) {
                editorPersonalLinkConfig = editorConfig.personalLink;
            }
            EditorPersonalLinkConfig editorPersonalLinkConfig2 = editorPersonalLinkConfig;
            if ((i12 & 32) != 0) {
                editorActionButtonConfig = editorConfig.actionButton;
            }
            EditorActionButtonConfig editorActionButtonConfig2 = editorActionButtonConfig;
            if ((i12 & 64) != 0) {
                servicesSellerTypeConfig = editorConfig.sellerType;
            }
            return editorConfig.copy(editorAvatarConfig, editorNameConfig2, editorVerticalConfig2, editorSpecificConfig2, editorPersonalLinkConfig2, editorActionButtonConfig2, servicesSellerTypeConfig);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final EditorAvatarConfig getAvatar() {
            return this.avatar;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final EditorNameConfig getName() {
            return this.name;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final EditorVerticalConfig getVertical() {
            return this.vertical;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final EditorSpecificConfig getSpecific() {
            return this.specific;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final EditorPersonalLinkConfig getPersonalLink() {
            return this.personalLink;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final EditorActionButtonConfig getActionButton() {
            return this.actionButton;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final ServicesSellerTypeConfig getSellerType() {
            return this.sellerType;
        }

        @k
        public final EditorConfig copy(@k EditorAvatarConfig avatar, @k EditorNameConfig name, @l EditorVerticalConfig vertical, @l EditorSpecificConfig specific, @l EditorPersonalLinkConfig personalLink, @k EditorActionButtonConfig actionButton, @l ServicesSellerTypeConfig sellerType) {
            return new EditorConfig(avatar, name, vertical, specific, personalLink, actionButton, sellerType);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditorConfig)) {
                return false;
            }
            EditorConfig editorConfig = (EditorConfig) other;
            return L.f(this.avatar, editorConfig.avatar) && L.f(this.name, editorConfig.name) && L.f(this.vertical, editorConfig.vertical) && L.f(this.specific, editorConfig.specific) && L.f(this.personalLink, editorConfig.personalLink) && L.f(this.actionButton, editorConfig.actionButton) && L.f(this.sellerType, editorConfig.sellerType);
        }

        @k
        public final EditorActionButtonConfig getActionButton() {
            return this.actionButton;
        }

        @k
        public final EditorAvatarConfig getAvatar() {
            return this.avatar;
        }

        @k
        public final EditorNameConfig getName() {
            return this.name;
        }

        @l
        public final EditorPersonalLinkConfig getPersonalLink() {
            return this.personalLink;
        }

        @l
        public final ServicesSellerTypeConfig getSellerType() {
            return this.sellerType;
        }

        @l
        public final EditorSpecificConfig getSpecific() {
            return this.specific;
        }

        @l
        public final EditorVerticalConfig getVertical() {
            return this.vertical;
        }

        public int hashCode() {
            int iHashCode = (this.name.hashCode() + (this.avatar.hashCode() * 31)) * 31;
            EditorVerticalConfig editorVerticalConfig = this.vertical;
            int iHashCode2 = (iHashCode + (editorVerticalConfig == null ? 0 : editorVerticalConfig.hashCode())) * 31;
            EditorSpecificConfig editorSpecificConfig = this.specific;
            int iHashCode3 = (iHashCode2 + (editorSpecificConfig == null ? 0 : editorSpecificConfig.hashCode())) * 31;
            EditorPersonalLinkConfig editorPersonalLinkConfig = this.personalLink;
            int iHashCode4 = (this.actionButton.hashCode() + ((iHashCode3 + (editorPersonalLinkConfig == null ? 0 : editorPersonalLinkConfig.hashCode())) * 31)) * 31;
            ServicesSellerTypeConfig servicesSellerTypeConfig = this.sellerType;
            return iHashCode4 + (servicesSellerTypeConfig != null ? servicesSellerTypeConfig.hashCode() : 0);
        }

        @k
        public String toString() {
            return "EditorConfig(avatar=" + this.avatar + ", name=" + this.name + ", vertical=" + this.vertical + ", specific=" + this.specific + ", personalLink=" + this.personalLink + ", actionButton=" + this.actionButton + ", sellerType=" + this.sellerType + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.avatar.writeToParcel(parcel, flags);
            this.name.writeToParcel(parcel, flags);
            EditorVerticalConfig editorVerticalConfig = this.vertical;
            if (editorVerticalConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                editorVerticalConfig.writeToParcel(parcel, flags);
            }
            EditorSpecificConfig editorSpecificConfig = this.specific;
            if (editorSpecificConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                editorSpecificConfig.writeToParcel(parcel, flags);
            }
            EditorPersonalLinkConfig editorPersonalLinkConfig = this.personalLink;
            if (editorPersonalLinkConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                editorPersonalLinkConfig.writeToParcel(parcel, flags);
            }
            this.actionButton.writeToParcel(parcel, flags);
            ServicesSellerTypeConfig servicesSellerTypeConfig = this.sellerType;
            if (servicesSellerTypeConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                servicesSellerTypeConfig.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: Widgets.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorNameConfig;", "Landroid/os/Parcelable;", "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorNameConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EditorNameConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<EditorNameConfig> CREATOR = new Creator();

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        /* compiled from: Widgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EditorNameConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorNameConfig createFromParcel(@k Parcel parcel) {
                return new EditorNameConfig(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorNameConfig[] newArray(int i12) {
                return new EditorNameConfig[i12];
            }
        }

        public EditorNameConfig(@l String str, @l String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        public static /* synthetic */ EditorNameConfig copy$default(EditorNameConfig editorNameConfig, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = editorNameConfig.title;
            }
            if ((i12 & 2) != 0) {
                str2 = editorNameConfig.subtitle;
            }
            return editorNameConfig.copy(str, str2);
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

        @k
        public final EditorNameConfig copy(@l String title, @l String subtitle) {
            return new EditorNameConfig(title, subtitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditorNameConfig)) {
                return false;
            }
            EditorNameConfig editorNameConfig = (EditorNameConfig) other;
            return L.f(this.title, editorNameConfig.title) && L.f(this.subtitle, editorNameConfig.subtitle);
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
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("EditorNameConfig(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.subtitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
        }
    }

    /* compiled from: Widgets.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ\\\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0012J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b.\u0010\u000e¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorPersonalLinkConfig;", "Landroid/os/Parcelable;", "", "title", "subtitle", ChannelContext.Item.PLACEHOLDER, "", "minLengthCount", "maxLengthCount", "prefix", "hint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorPersonalLinkConfig;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getPlaceholder", "I", "getMinLengthCount", "getMaxLengthCount", "getPrefix", "getHint", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EditorPersonalLinkConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<EditorPersonalLinkConfig> CREATOR = new Creator();

        @c("hint")
        @l
        private final String hint;

        @c("maxLengthCount")
        private final int maxLengthCount;

        @c("minLengthCount")
        private final int minLengthCount;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("prefix")
        @k
        private final String prefix;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: Widgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EditorPersonalLinkConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorPersonalLinkConfig createFromParcel(@k Parcel parcel) {
                return new EditorPersonalLinkConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorPersonalLinkConfig[] newArray(int i12) {
                return new EditorPersonalLinkConfig[i12];
            }
        }

        public EditorPersonalLinkConfig(@k String str, @l String str2, @l String str3, int i12, int i13, @k String str4, @l String str5) {
            this.title = str;
            this.subtitle = str2;
            this.placeholder = str3;
            this.minLengthCount = i12;
            this.maxLengthCount = i13;
            this.prefix = str4;
            this.hint = str5;
        }

        public static /* synthetic */ EditorPersonalLinkConfig copy$default(EditorPersonalLinkConfig editorPersonalLinkConfig, String str, String str2, String str3, int i12, int i13, String str4, String str5, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = editorPersonalLinkConfig.title;
            }
            if ((i14 & 2) != 0) {
                str2 = editorPersonalLinkConfig.subtitle;
            }
            String str6 = str2;
            if ((i14 & 4) != 0) {
                str3 = editorPersonalLinkConfig.placeholder;
            }
            String str7 = str3;
            if ((i14 & 8) != 0) {
                i12 = editorPersonalLinkConfig.minLengthCount;
            }
            int i15 = i12;
            if ((i14 & 16) != 0) {
                i13 = editorPersonalLinkConfig.maxLengthCount;
            }
            int i16 = i13;
            if ((i14 & 32) != 0) {
                str4 = editorPersonalLinkConfig.prefix;
            }
            String str8 = str4;
            if ((i14 & 64) != 0) {
                str5 = editorPersonalLinkConfig.hint;
            }
            return editorPersonalLinkConfig.copy(str, str6, str7, i15, i16, str8, str5);
        }

        @k
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
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMinLengthCount() {
            return this.minLengthCount;
        }

        /* renamed from: component5, reason: from getter */
        public final int getMaxLengthCount() {
            return this.maxLengthCount;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final String getPrefix() {
            return this.prefix;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @k
        public final EditorPersonalLinkConfig copy(@k String title, @l String subtitle, @l String placeholder, int minLengthCount, int maxLengthCount, @k String prefix, @l String hint) {
            return new EditorPersonalLinkConfig(title, subtitle, placeholder, minLengthCount, maxLengthCount, prefix, hint);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditorPersonalLinkConfig)) {
                return false;
            }
            EditorPersonalLinkConfig editorPersonalLinkConfig = (EditorPersonalLinkConfig) other;
            return L.f(this.title, editorPersonalLinkConfig.title) && L.f(this.subtitle, editorPersonalLinkConfig.subtitle) && L.f(this.placeholder, editorPersonalLinkConfig.placeholder) && this.minLengthCount == editorPersonalLinkConfig.minLengthCount && this.maxLengthCount == editorPersonalLinkConfig.maxLengthCount && L.f(this.prefix, editorPersonalLinkConfig.prefix) && L.f(this.hint, editorPersonalLinkConfig.hint);
        }

        @l
        public final String getHint() {
            return this.hint;
        }

        public final int getMaxLengthCount() {
            return this.maxLengthCount;
        }

        public final int getMinLengthCount() {
            return this.minLengthCount;
        }

        @l
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @k
        public final String getPrefix() {
            return this.prefix;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placeholder;
            int iD2 = H.d(r.e(this.maxLengthCount, r.e(this.minLengthCount, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.prefix);
            String str3 = this.hint;
            return iD2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("EditorPersonalLinkConfig(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", placeholder=");
            sb2.append(this.placeholder);
            sb2.append(", minLengthCount=");
            sb2.append(this.minLengthCount);
            sb2.append(", maxLengthCount=");
            sb2.append(this.maxLengthCount);
            sb2.append(", prefix=");
            sb2.append(this.prefix);
            sb2.append(", hint=");
            return C22026a.c(sb2, this.hint, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.placeholder);
            parcel.writeInt(this.minLengthCount);
            parcel.writeInt(this.maxLengthCount);
            parcel.writeString(this.prefix);
            parcel.writeString(this.hint);
        }
    }

    /* compiled from: Widgets.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0011¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorSpecificConfig;", "Landroid/os/Parcelable;", "", "title", "value", "", "id", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;ILcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorSpecificConfig;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getValue", "I", "getId", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EditorSpecificConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<EditorSpecificConfig> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c("id")
        private final int id;

        @c("title")
        @l
        private final String title;

        @c("value")
        @k
        private final String value;

        /* compiled from: Widgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EditorSpecificConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorSpecificConfig createFromParcel(@k Parcel parcel) {
                return new EditorSpecificConfig(parcel.readString(), parcel.readString(), parcel.readInt(), (DeepLink) parcel.readParcelable(EditorSpecificConfig.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorSpecificConfig[] newArray(int i12) {
                return new EditorSpecificConfig[i12];
            }
        }

        public EditorSpecificConfig(@l String str, @k String str2, int i12, @l DeepLink deepLink) {
            this.title = str;
            this.value = str2;
            this.id = i12;
            this.deeplink = deepLink;
        }

        public static /* synthetic */ EditorSpecificConfig copy$default(EditorSpecificConfig editorSpecificConfig, String str, String str2, int i12, DeepLink deepLink, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = editorSpecificConfig.title;
            }
            if ((i13 & 2) != 0) {
                str2 = editorSpecificConfig.value;
            }
            if ((i13 & 4) != 0) {
                i12 = editorSpecificConfig.id;
            }
            if ((i13 & 8) != 0) {
                deepLink = editorSpecificConfig.deeplink;
            }
            return editorSpecificConfig.copy(str, str2, i12, deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final EditorSpecificConfig copy(@l String title, @k String value, int id2, @l DeepLink deeplink) {
            return new EditorSpecificConfig(title, value, id2, deeplink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditorSpecificConfig)) {
                return false;
            }
            EditorSpecificConfig editorSpecificConfig = (EditorSpecificConfig) other;
            return L.f(this.title, editorSpecificConfig.title) && L.f(this.value, editorSpecificConfig.value) && this.id == editorSpecificConfig.id && L.f(this.deeplink, editorSpecificConfig.deeplink);
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        public final int getId() {
            return this.id;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.title;
            int iE2 = r.e(this.id, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.value), 31);
            DeepLink deepLink = this.deeplink;
            return iE2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("EditorSpecificConfig(title=");
            sb2.append(this.title);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", id=");
            sb2.append(this.id);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.value);
            parcel.writeInt(this.id);
            parcel.writeParcelable(this.deeplink, flags);
        }
    }

    /* compiled from: Widgets.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ^\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u0013J \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b\n\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b2\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u001a¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorVerticalConfig;", "Landroid/os/Parcelable;", "", "title", "value", "", "id", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "isEditable", "hint", "hasMultipleSpecifics", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/avito/android/deep_linking/links/DeepLink;ZLjava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "()Z", "component6", "component7", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;ILcom/avito/android/deep_linking/links/DeepLink;ZLjava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$EditorVerticalConfig;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getValue", "I", "getId", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Z", "getHint", "Ljava/lang/Boolean;", "getHasMultipleSpecifics", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EditorVerticalConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<EditorVerticalConfig> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c("hasMultipleSpecifics")
        @l
        private final Boolean hasMultipleSpecifics;

        @c("hint")
        @l
        private final String hint;

        @c("id")
        private final int id;

        @c("isEditable")
        private final boolean isEditable;

        @c("title")
        @l
        private final String title;

        @c("value")
        @k
        private final String value;

        /* compiled from: Widgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EditorVerticalConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorVerticalConfig createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i12 = parcel.readInt();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(EditorVerticalConfig.class.getClassLoader());
                boolean z12 = parcel.readInt() != 0;
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new EditorVerticalConfig(string, string2, i12, deepLink, z12, string3, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EditorVerticalConfig[] newArray(int i12) {
                return new EditorVerticalConfig[i12];
            }
        }

        public EditorVerticalConfig(@l String str, @k String str2, int i12, @l DeepLink deepLink, boolean z12, @l String str3, @l Boolean bool) {
            this.title = str;
            this.value = str2;
            this.id = i12;
            this.deeplink = deepLink;
            this.isEditable = z12;
            this.hint = str3;
            this.hasMultipleSpecifics = bool;
        }

        public static /* synthetic */ EditorVerticalConfig copy$default(EditorVerticalConfig editorVerticalConfig, String str, String str2, int i12, DeepLink deepLink, boolean z12, String str3, Boolean bool, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = editorVerticalConfig.title;
            }
            if ((i13 & 2) != 0) {
                str2 = editorVerticalConfig.value;
            }
            String str4 = str2;
            if ((i13 & 4) != 0) {
                i12 = editorVerticalConfig.id;
            }
            int i14 = i12;
            if ((i13 & 8) != 0) {
                deepLink = editorVerticalConfig.deeplink;
            }
            DeepLink deepLink2 = deepLink;
            if ((i13 & 16) != 0) {
                z12 = editorVerticalConfig.isEditable;
            }
            boolean z13 = z12;
            if ((i13 & 32) != 0) {
                str3 = editorVerticalConfig.hint;
            }
            String str5 = str3;
            if ((i13 & 64) != 0) {
                bool = editorVerticalConfig.hasMultipleSpecifics;
            }
            return editorVerticalConfig.copy(str, str4, i14, deepLink2, z13, str5, bool);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsEditable() {
            return this.isEditable;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Boolean getHasMultipleSpecifics() {
            return this.hasMultipleSpecifics;
        }

        @k
        public final EditorVerticalConfig copy(@l String title, @k String value, int id2, @l DeepLink deeplink, boolean isEditable, @l String hint, @l Boolean hasMultipleSpecifics) {
            return new EditorVerticalConfig(title, value, id2, deeplink, isEditable, hint, hasMultipleSpecifics);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditorVerticalConfig)) {
                return false;
            }
            EditorVerticalConfig editorVerticalConfig = (EditorVerticalConfig) other;
            return L.f(this.title, editorVerticalConfig.title) && L.f(this.value, editorVerticalConfig.value) && this.id == editorVerticalConfig.id && L.f(this.deeplink, editorVerticalConfig.deeplink) && this.isEditable == editorVerticalConfig.isEditable && L.f(this.hint, editorVerticalConfig.hint) && L.f(this.hasMultipleSpecifics, editorVerticalConfig.hasMultipleSpecifics);
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final Boolean getHasMultipleSpecifics() {
            return this.hasMultipleSpecifics;
        }

        @l
        public final String getHint() {
            return this.hint;
        }

        public final int getId() {
            return this.id;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.title;
            int iE2 = r.e(this.id, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.value), 31);
            DeepLink deepLink = this.deeplink;
            int i12 = r.i((iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.isEditable);
            String str2 = this.hint;
            int iHashCode = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.hasMultipleSpecifics;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final boolean isEditable() {
            return this.isEditable;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("EditorVerticalConfig(title=");
            sb2.append(this.title);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", id=");
            sb2.append(this.id);
            sb2.append(", deeplink=");
            sb2.append(this.deeplink);
            sb2.append(", isEditable=");
            sb2.append(this.isEditable);
            sb2.append(", hint=");
            sb2.append(this.hint);
            sb2.append(", hasMultipleSpecifics=");
            return C0.g(sb2, this.hasMultipleSpecifics, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.value);
            parcel.writeInt(this.id);
            parcel.writeParcelable(this.deeplink, flags);
            parcel.writeInt(this.isEditable ? 1 : 0);
            parcel.writeString(this.hint);
            Boolean bool = this.hasMultipleSpecifics;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Field;", "", "values", "", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$FieldValue;", "(Ljava/util/List;)V", "getValues", "()Ljava/util/List;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Field {

        @c("values")
        @l
        private final List<FieldValue> values;

        public Field(@l List<FieldValue> list) {
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Field copy$default(Field field, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = field.values;
            }
            return field.copy(list);
        }

        @l
        public final List<FieldValue> component1() {
            return this.values;
        }

        @k
        public final Field copy(@l List<FieldValue> values) {
            return new Field(values);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Field) && L.f(this.values, ((Field) other).values);
        }

        @l
        public final List<FieldValue> getValues() {
            return this.values;
        }

        public int hashCode() {
            List<FieldValue> list = this.values;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public String toString() {
            return H.p(new StringBuilder("Field(values="), this.values, ')');
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$FieldValue;", "", "status", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "value", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Value;", "(Lcom/avito/android/remote/model/extended/FieldModerationStatus;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Value;)V", "getStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getValue", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Value;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FieldValue {

        @c("status")
        @l
        private final FieldModerationStatus status;

        @c("value")
        @k
        private final Value value;

        public FieldValue(@l FieldModerationStatus fieldModerationStatus, @k Value value) {
            this.status = fieldModerationStatus;
            this.value = value;
        }

        public static /* synthetic */ FieldValue copy$default(FieldValue fieldValue, FieldModerationStatus fieldModerationStatus, Value value, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                fieldModerationStatus = fieldValue.status;
            }
            if ((i12 & 2) != 0) {
                value = fieldValue.value;
            }
            return fieldValue.copy(fieldModerationStatus, value);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Value getValue() {
            return this.value;
        }

        @k
        public final FieldValue copy(@l FieldModerationStatus status, @k Value value) {
            return new FieldValue(status, value);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldValue)) {
                return false;
            }
            FieldValue fieldValue = (FieldValue) other;
            return L.f(this.status, fieldValue.status) && L.f(this.value, fieldValue.value);
        }

        @l
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @k
        public final Value getValue() {
            return this.value;
        }

        public int hashCode() {
            FieldModerationStatus fieldModerationStatus = this.status;
            return this.value.hashCode() + ((fieldModerationStatus == null ? 0 : fieldModerationStatus.hashCode()) * 31);
        }

        @k
        public String toString() {
            return "FieldValue(status=" + this.status + ", value=" + this.value + ')';
        }
    }

    /* compiled from: Widgets.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Icon;", "Landroid/os/Parcelable;", "", "color", "iconName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Icon;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getColor", "getIconName", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Icon implements Parcelable {

        @k
        public static final Parcelable.Creator<Icon> CREATOR = new Creator();

        @c("color")
        @k
        private final String color;

        @c("name")
        @k
        private final String iconName;

        /* compiled from: Widgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Icon> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Icon createFromParcel(@k Parcel parcel) {
                return new Icon(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Icon[] newArray(int i12) {
                return new Icon[i12];
            }
        }

        public Icon(@k String str, @k String str2) {
            this.color = str;
            this.iconName = str2;
        }

        public static /* synthetic */ Icon copy$default(Icon icon, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = icon.color;
            }
            if ((i12 & 2) != 0) {
                str2 = icon.iconName;
            }
            return icon.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getIconName() {
            return this.iconName;
        }

        @k
        public final Icon copy(@k String color, @k String iconName) {
            return new Icon(color, iconName);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return L.f(this.color, icon.color) && L.f(this.iconName, icon.iconName);
        }

        @k
        public final String getColor() {
            return this.color;
        }

        @k
        public final String getIconName() {
            return this.iconName;
        }

        public int hashCode() {
            return this.iconName.hashCode() + (this.color.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Icon(color=");
            sb2.append(this.color);
            sb2.append(", iconName=");
            return C22026a.c(sb2, this.iconName, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.color);
            parcel.writeString(this.iconName);
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Onboarding;", "", "onceShowId", "", "subtitle", "title", "buttonTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonTitle", "()Ljava/lang/String;", "getOnceShowId", "getSubtitle", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Onboarding {

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c("onceShowId")
        @k
        private final String onceShowId;

        @c("subtitle")
        @k
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        public Onboarding(@k String str, @k String str2, @k String str3, @l String str4) {
            this.onceShowId = str;
            this.subtitle = str2;
            this.title = str3;
            this.buttonTitle = str4;
        }

        public static /* synthetic */ Onboarding copy$default(Onboarding onboarding, String str, String str2, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = onboarding.onceShowId;
            }
            if ((i12 & 2) != 0) {
                str2 = onboarding.subtitle;
            }
            if ((i12 & 4) != 0) {
                str3 = onboarding.title;
            }
            if ((i12 & 8) != 0) {
                str4 = onboarding.buttonTitle;
            }
            return onboarding.copy(str, str2, str3, str4);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @k
        public final Onboarding copy(@k String onceShowId, @k String subtitle, @k String title, @l String buttonTitle) {
            return new Onboarding(onceShowId, subtitle, title, buttonTitle);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) other;
            return L.f(this.onceShowId, onboarding.onceShowId) && L.f(this.subtitle, onboarding.subtitle) && L.f(this.title, onboarding.title) && L.f(this.buttonTitle, onboarding.buttonTitle);
        }

        @l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @k
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @k
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iD2 = H.d(H.d(this.onceShowId.hashCode() * 31, 31, this.subtitle), 31, this.title);
            String str = this.buttonTitle;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Onboarding(onceShowId=");
            sb2.append(this.onceShowId);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", buttonTitle=");
            return C22026a.c(sb2, this.buttonTitle, ')');
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$PersonalLinkFieldValue;", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Value;", "personalLink", "", "urlToCopy", "prefixedPersonalLink", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getPersonalLink", "()Ljava/lang/String;", "getPrefixedPersonalLink", "getUrlToCopy", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PersonalLinkFieldValue implements Value {

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c("personalLink")
        @k
        private final String personalLink;

        @c("prefixedPersonalLink")
        @k
        private final String prefixedPersonalLink;

        @c("urlToCopy")
        @k
        private final String urlToCopy;

        public PersonalLinkFieldValue(@k String str, @k String str2, @k String str3, @l DeepLink deepLink) {
            this.personalLink = str;
            this.urlToCopy = str2;
            this.prefixedPersonalLink = str3;
            this.deeplink = deepLink;
        }

        public static /* synthetic */ PersonalLinkFieldValue copy$default(PersonalLinkFieldValue personalLinkFieldValue, String str, String str2, String str3, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = personalLinkFieldValue.personalLink;
            }
            if ((i12 & 2) != 0) {
                str2 = personalLinkFieldValue.urlToCopy;
            }
            if ((i12 & 4) != 0) {
                str3 = personalLinkFieldValue.prefixedPersonalLink;
            }
            if ((i12 & 8) != 0) {
                deepLink = personalLinkFieldValue.deeplink;
            }
            return personalLinkFieldValue.copy(str, str2, str3, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getPersonalLink() {
            return this.personalLink;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getUrlToCopy() {
            return this.urlToCopy;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getPrefixedPersonalLink() {
            return this.prefixedPersonalLink;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final PersonalLinkFieldValue copy(@k String personalLink, @k String urlToCopy, @k String prefixedPersonalLink, @l DeepLink deeplink) {
            return new PersonalLinkFieldValue(personalLink, urlToCopy, prefixedPersonalLink, deeplink);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PersonalLinkFieldValue)) {
                return false;
            }
            PersonalLinkFieldValue personalLinkFieldValue = (PersonalLinkFieldValue) other;
            return L.f(this.personalLink, personalLinkFieldValue.personalLink) && L.f(this.urlToCopy, personalLinkFieldValue.urlToCopy) && L.f(this.prefixedPersonalLink, personalLinkFieldValue.prefixedPersonalLink) && L.f(this.deeplink, personalLinkFieldValue.deeplink);
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final String getPersonalLink() {
            return this.personalLink;
        }

        @k
        public final String getPrefixedPersonalLink() {
            return this.prefixedPersonalLink;
        }

        @k
        public final String getUrlToCopy() {
            return this.urlToCopy;
        }

        public int hashCode() {
            int iD2 = H.d(H.d(this.personalLink.hashCode() * 31, 31, this.urlToCopy), 31, this.prefixedPersonalLink);
            DeepLink deepLink = this.deeplink;
            return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PersonalLinkFieldValue(personalLink=");
            sb2.append(this.personalLink);
            sb2.append(", urlToCopy=");
            sb2.append(this.urlToCopy);
            sb2.append(", prefixedPersonalLink=");
            sb2.append(this.prefixedPersonalLink);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$ServicesProfileType;", "", "title", "", "onboarding", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Onboarding;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Onboarding;)V", "getOnboarding", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Onboarding;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServicesProfileType {

        @c("onboarding")
        @k
        private final Onboarding onboarding;

        @c("title")
        @k
        private final String title;

        public ServicesProfileType(@k String str, @k Onboarding onboarding) {
            this.title = str;
            this.onboarding = onboarding;
        }

        public static /* synthetic */ ServicesProfileType copy$default(ServicesProfileType servicesProfileType, String str, Onboarding onboarding, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = servicesProfileType.title;
            }
            if ((i12 & 2) != 0) {
                onboarding = servicesProfileType.onboarding;
            }
            return servicesProfileType.copy(str, onboarding);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Onboarding getOnboarding() {
            return this.onboarding;
        }

        @k
        public final ServicesProfileType copy(@k String title, @k Onboarding onboarding) {
            return new ServicesProfileType(title, onboarding);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServicesProfileType)) {
                return false;
            }
            ServicesProfileType servicesProfileType = (ServicesProfileType) other;
            return L.f(this.title, servicesProfileType.title) && L.f(this.onboarding, servicesProfileType.onboarding);
        }

        @k
        public final Onboarding getOnboarding() {
            return this.onboarding;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.onboarding.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            return "ServicesProfileType(title=" + this.title + ", onboarding=" + this.onboarding + ')';
        }
    }

    /* compiled from: Widgets.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\\\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011J\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u0014J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b\t\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001c¨\u00068"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$ServicesSellerTypeConfig;", "Landroid/os/Parcelable;", "", "title", "value", "", "typeId", "subtypeId", "", "isEditable", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Icon;", "icon", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLcom/avito/android/remote/model/extended/BasicInfoV2Widget$Icon;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Ljava/lang/Integer;", "component5", "()Z", "component6", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Icon;", "component7", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLcom/avito/android/remote/model/extended/BasicInfoV2Widget$Icon;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$ServicesSellerTypeConfig;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getValue", "I", "getTypeId", "Ljava/lang/Integer;", "getSubtypeId", "Z", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Icon;", "getIcon", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServicesSellerTypeConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<ServicesSellerTypeConfig> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c("icon")
        @l
        private final Icon icon;

        @c("isEditable")
        private final boolean isEditable;

        @c("valueSubtypeId")
        @l
        private final Integer subtypeId;

        @c("title")
        @k
        private final String title;

        @c("valueTypeId")
        private final int typeId;

        @c("value")
        @k
        private final String value;

        /* compiled from: Widgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ServicesSellerTypeConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ServicesSellerTypeConfig createFromParcel(@k Parcel parcel) {
                return new ServicesSellerTypeConfig(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0 ? Icon.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(ServicesSellerTypeConfig.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ServicesSellerTypeConfig[] newArray(int i12) {
                return new ServicesSellerTypeConfig[i12];
            }
        }

        public ServicesSellerTypeConfig(@k String str, @k String str2, int i12, @l Integer num, boolean z12, @l Icon icon, @l DeepLink deepLink) {
            this.title = str;
            this.value = str2;
            this.typeId = i12;
            this.subtypeId = num;
            this.isEditable = z12;
            this.icon = icon;
            this.deeplink = deepLink;
        }

        public static /* synthetic */ ServicesSellerTypeConfig copy$default(ServicesSellerTypeConfig servicesSellerTypeConfig, String str, String str2, int i12, Integer num, boolean z12, Icon icon, DeepLink deepLink, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = servicesSellerTypeConfig.title;
            }
            if ((i13 & 2) != 0) {
                str2 = servicesSellerTypeConfig.value;
            }
            String str3 = str2;
            if ((i13 & 4) != 0) {
                i12 = servicesSellerTypeConfig.typeId;
            }
            int i14 = i12;
            if ((i13 & 8) != 0) {
                num = servicesSellerTypeConfig.subtypeId;
            }
            Integer num2 = num;
            if ((i13 & 16) != 0) {
                z12 = servicesSellerTypeConfig.isEditable;
            }
            boolean z13 = z12;
            if ((i13 & 32) != 0) {
                icon = servicesSellerTypeConfig.icon;
            }
            Icon icon2 = icon;
            if ((i13 & 64) != 0) {
                deepLink = servicesSellerTypeConfig.deeplink;
            }
            return servicesSellerTypeConfig.copy(str, str3, i14, num2, z13, icon2, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTypeId() {
            return this.typeId;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Integer getSubtypeId() {
            return this.subtypeId;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsEditable() {
            return this.isEditable;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final ServicesSellerTypeConfig copy(@k String title, @k String value, int typeId, @l Integer subtypeId, boolean isEditable, @l Icon icon, @l DeepLink deeplink) {
            return new ServicesSellerTypeConfig(title, value, typeId, subtypeId, isEditable, icon, deeplink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServicesSellerTypeConfig)) {
                return false;
            }
            ServicesSellerTypeConfig servicesSellerTypeConfig = (ServicesSellerTypeConfig) other;
            return L.f(this.title, servicesSellerTypeConfig.title) && L.f(this.value, servicesSellerTypeConfig.value) && this.typeId == servicesSellerTypeConfig.typeId && L.f(this.subtypeId, servicesSellerTypeConfig.subtypeId) && this.isEditable == servicesSellerTypeConfig.isEditable && L.f(this.icon, servicesSellerTypeConfig.icon) && L.f(this.deeplink, servicesSellerTypeConfig.deeplink);
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final Icon getIcon() {
            return this.icon;
        }

        @l
        public final Integer getSubtypeId() {
            return this.subtypeId;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int getTypeId() {
            return this.typeId;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int iE2 = r.e(this.typeId, H.d(this.title.hashCode() * 31, 31, this.value), 31);
            Integer num = this.subtypeId;
            int i12 = r.i((iE2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.isEditable);
            Icon icon = this.icon;
            int iHashCode = (i12 + (icon == null ? 0 : icon.hashCode())) * 31;
            DeepLink deepLink = this.deeplink;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        public final boolean isEditable() {
            return this.isEditable;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ServicesSellerTypeConfig(title=");
            sb2.append(this.title);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", typeId=");
            sb2.append(this.typeId);
            sb2.append(", subtypeId=");
            sb2.append(this.subtypeId);
            sb2.append(", isEditable=");
            sb2.append(this.isEditable);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.value);
            parcel.writeInt(this.typeId);
            Integer num = this.subtypeId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeInt(this.isEditable ? 1 : 0);
            Icon icon = this.icon;
            if (icon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                icon.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.deeplink, flags);
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$UserNameFieldValue;", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Value;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UserNameFieldValue implements Value {

        @c("text")
        @k
        private final String text;

        public UserNameFieldValue(@k String str) {
            this.text = str;
        }

        public static /* synthetic */ UserNameFieldValue copy$default(UserNameFieldValue userNameFieldValue, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = userNameFieldValue.text;
            }
            return userNameFieldValue.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        public final UserNameFieldValue copy(@k String text) {
            return new UserNameFieldValue(text);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserNameFieldValue) && L.f(this.text, ((UserNameFieldValue) other).text);
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("UserNameFieldValue(text="), this.text, ')');
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Value;", "", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$PersonalLinkFieldValue;", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$UserNameFieldValue;", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Value {
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$Verification;", "", "status", "Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$VerificationStatus;", "title", "", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$VerificationStatus;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getStatus", "()Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$VerificationStatus;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Verification {

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c("status")
        @l
        private final VerificationStatus status;

        @c("title")
        @k
        private final String title;

        public Verification(@l VerificationStatus verificationStatus, @k String str, @l DeepLink deepLink) {
            this.status = verificationStatus;
            this.title = str;
            this.deeplink = deepLink;
        }

        public static /* synthetic */ Verification copy$default(Verification verification, VerificationStatus verificationStatus, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                verificationStatus = verification.status;
            }
            if ((i12 & 2) != 0) {
                str = verification.title;
            }
            if ((i12 & 4) != 0) {
                deepLink = verification.deeplink;
            }
            return verification.copy(verificationStatus, str, deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final VerificationStatus getStatus() {
            return this.status;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final Verification copy(@l VerificationStatus status, @k String title, @l DeepLink deeplink) {
            return new Verification(status, title, deeplink);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Verification)) {
                return false;
            }
            Verification verification = (Verification) other;
            return this.status == verification.status && L.f(this.title, verification.title) && L.f(this.deeplink, verification.deeplink);
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final VerificationStatus getStatus() {
            return this.status;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            VerificationStatus verificationStatus = this.status;
            int iD2 = H.d((verificationStatus == null ? 0 : verificationStatus.hashCode()) * 31, 31, this.title);
            DeepLink deepLink = this.deeplink;
            return iD2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Verification(status=");
            sb2.append(this.status);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/extended/BasicInfoV2Widget$VerificationStatus;", "", "(Ljava/lang/String;I)V", "VERIFY", "UNDER_VERIFICATION", "VERIFIED", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VerificationStatus {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ VerificationStatus[] $VALUES;

        @c("Verify")
        public static final VerificationStatus VERIFY = new VerificationStatus("VERIFY", 0);

        @c("UnderVerification")
        public static final VerificationStatus UNDER_VERIFICATION = new VerificationStatus("UNDER_VERIFICATION", 1);

        @c("Verified")
        public static final VerificationStatus VERIFIED = new VerificationStatus("VERIFIED", 2);

        private static final /* synthetic */ VerificationStatus[] $values() {
            return new VerificationStatus[]{VERIFY, UNDER_VERIFICATION, VERIFIED};
        }

        static {
            VerificationStatus[] verificationStatusArr$values = $values();
            $VALUES = verificationStatusArr$values;
            $ENTRIES = kotlin.enums.c.a(verificationStatusArr$values);
        }

        private VerificationStatus(String str, int i12) {
        }

        @k
        public static a<VerificationStatus> getEntries() {
            return $ENTRIES;
        }

        public static VerificationStatus valueOf(String str) {
            return (VerificationStatus) Enum.valueOf(VerificationStatus.class, str);
        }

        public static VerificationStatus[] values() {
            return (VerificationStatus[]) $VALUES.clone();
        }
    }

    public BasicInfoV2Widget(@k String str, @k Config config, @l List<Field> list) {
        this.widgetName = str;
        this.config = config;
        this.fields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasicInfoV2Widget copy$default(BasicInfoV2Widget basicInfoV2Widget, String str, Config config, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = basicInfoV2Widget.widgetName;
        }
        if ((i12 & 2) != 0) {
            config = basicInfoV2Widget.config;
        }
        if ((i12 & 4) != 0) {
            list = basicInfoV2Widget.fields;
        }
        return basicInfoV2Widget.copy(str, config, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    @l
    public final List<Field> component3() {
        return this.fields;
    }

    @k
    public final BasicInfoV2Widget copy(@k String widgetName, @k Config config, @l List<Field> fields) {
        return new BasicInfoV2Widget(widgetName, config, fields);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicInfoV2Widget)) {
            return false;
        }
        BasicInfoV2Widget basicInfoV2Widget = (BasicInfoV2Widget) other;
        return L.f(this.widgetName, basicInfoV2Widget.widgetName) && L.f(this.config, basicInfoV2Widget.config) && L.f(this.fields, basicInfoV2Widget.fields);
    }

    @k
    public final Config getConfig() {
        return this.config;
    }

    @l
    public final List<Field> getFields() {
        return this.fields;
    }

    @k
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int iHashCode = (this.config.hashCode() + (this.widgetName.hashCode() * 31)) * 31;
        List<Field> list = this.fields;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BasicInfoV2Widget(widgetName=");
        sb2.append(this.widgetName);
        sb2.append(", config=");
        sb2.append(this.config);
        sb2.append(", fields=");
        return H.p(sb2, this.fields, ')');
    }
}
