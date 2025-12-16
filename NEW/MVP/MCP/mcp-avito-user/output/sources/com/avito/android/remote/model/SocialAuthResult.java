package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SocialAuthResult.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult;", "", "()V", "BlockedAccount", "DuplicatedPD", "FailedWithDialog", "FollowDeeplink", "NeedPhoneVerification", "Ok", "ParsingPermission", "PassportBlocked", "TfaCheckWithPush", "WrongSocialUser", "Lcom/avito/android/remote/model/SocialAuthResult$BlockedAccount;", "Lcom/avito/android/remote/model/SocialAuthResult$DuplicatedPD;", "Lcom/avito/android/remote/model/SocialAuthResult$FailedWithDialog;", "Lcom/avito/android/remote/model/SocialAuthResult$FollowDeeplink;", "Lcom/avito/android/remote/model/SocialAuthResult$NeedPhoneVerification;", "Lcom/avito/android/remote/model/SocialAuthResult$Ok;", "Lcom/avito/android/remote/model/SocialAuthResult$ParsingPermission;", "Lcom/avito/android/remote/model/SocialAuthResult$PassportBlocked;", "Lcom/avito/android/remote/model/SocialAuthResult$TfaCheckWithPush;", "Lcom/avito/android/remote/model/SocialAuthResult$WrongSocialUser;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SocialAuthResult {

    /* compiled from: SocialAuthResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult$BlockedAccount;", "Lcom/avito/android/remote/model/SocialAuthResult;", "userDialog", "Lcom/avito/android/remote/model/UserDialog;", "(Lcom/avito/android/remote/model/UserDialog;)V", "getUserDialog", "()Lcom/avito/android/remote/model/UserDialog;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BlockedAccount extends SocialAuthResult {

        @c("userDialog")
        @k
        private final UserDialog userDialog;

        public BlockedAccount(@k UserDialog userDialog) {
            super(null);
            this.userDialog = userDialog;
        }

        @k
        public final UserDialog getUserDialog() {
            return this.userDialog;
        }
    }

    /* compiled from: SocialAuthResult.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult$DuplicatedPD;", "Lcom/avito/android/remote/model/SocialAuthResult;", "phoneHint", "", "supportLink", "firstButton", "Lcom/avito/android/remote/model/SocialAuthResult$DuplicatedPD$Button;", "secondButton", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SocialAuthResult$DuplicatedPD$Button;Lcom/avito/android/remote/model/SocialAuthResult$DuplicatedPD$Button;)V", "getFirstButton", "()Lcom/avito/android/remote/model/SocialAuthResult$DuplicatedPD$Button;", "getPhoneHint", "()Ljava/lang/String;", "getSecondButton", "getSupportLink", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Button", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DuplicatedPD extends SocialAuthResult {

        @c("firstHelpButton")
        @l
        private final Button firstButton;

        @c("phoneHint")
        @l
        private final String phoneHint;

        @c("secondHelpButton")
        @l
        private final Button secondButton;

        @c("supportLink")
        @l
        private final String supportLink;

        /* compiled from: SocialAuthResult.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult$DuplicatedPD$Button;", "", "name", "", ContextActionHandler.Link.URL, "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Button {

            @c("name")
            @l
            private final String name;

            @c(ContextActionHandler.Link.URL)
            @l
            private final String url;

            public Button(@l String str, @l String str2) {
                this.name = str;
                this.url = str2;
            }

            public static /* synthetic */ Button copy$default(Button button, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = button.name;
                }
                if ((i12 & 2) != 0) {
                    str2 = button.url;
                }
                return button.copy(str, str2);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            @k
            public final Button copy(@l String name, @l String url) {
                return new Button(name, url);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return L.f(this.name, button.name) && L.f(this.url, button.url);
            }

            @l
            public final String getName() {
                return this.name;
            }

            @l
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.name;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.url;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Button(name=");
                sb2.append(this.name);
                sb2.append(", url=");
                return C22026a.c(sb2, this.url, ')');
            }
        }

        public DuplicatedPD(@l String str, @l String str2, @l Button button, @l Button button2) {
            super(null);
            this.phoneHint = str;
            this.supportLink = str2;
            this.firstButton = button;
            this.secondButton = button2;
        }

        public static /* synthetic */ DuplicatedPD copy$default(DuplicatedPD duplicatedPD, String str, String str2, Button button, Button button2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = duplicatedPD.phoneHint;
            }
            if ((i12 & 2) != 0) {
                str2 = duplicatedPD.supportLink;
            }
            if ((i12 & 4) != 0) {
                button = duplicatedPD.firstButton;
            }
            if ((i12 & 8) != 0) {
                button2 = duplicatedPD.secondButton;
            }
            return duplicatedPD.copy(str, str2, button, button2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getPhoneHint() {
            return this.phoneHint;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSupportLink() {
            return this.supportLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Button getFirstButton() {
            return this.firstButton;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Button getSecondButton() {
            return this.secondButton;
        }

        @k
        public final DuplicatedPD copy(@l String phoneHint, @l String supportLink, @l Button firstButton, @l Button secondButton) {
            return new DuplicatedPD(phoneHint, supportLink, firstButton, secondButton);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DuplicatedPD)) {
                return false;
            }
            DuplicatedPD duplicatedPD = (DuplicatedPD) other;
            return L.f(this.phoneHint, duplicatedPD.phoneHint) && L.f(this.supportLink, duplicatedPD.supportLink) && L.f(this.firstButton, duplicatedPD.firstButton) && L.f(this.secondButton, duplicatedPD.secondButton);
        }

        @l
        public final Button getFirstButton() {
            return this.firstButton;
        }

        @l
        public final String getPhoneHint() {
            return this.phoneHint;
        }

        @l
        public final Button getSecondButton() {
            return this.secondButton;
        }

        @l
        public final String getSupportLink() {
            return this.supportLink;
        }

        public int hashCode() {
            String str = this.phoneHint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.supportLink;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Button button = this.firstButton;
            int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.secondButton;
            return iHashCode3 + (button2 != null ? button2.hashCode() : 0);
        }

        @k
        public String toString() {
            return "DuplicatedPD(phoneHint=" + this.phoneHint + ", supportLink=" + this.supportLink + ", firstButton=" + this.firstButton + ", secondButton=" + this.secondButton + ')';
        }
    }

    /* compiled from: SocialAuthResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult$FailedWithDialog;", "Lcom/avito/android/remote/model/SocialAuthResult;", "userDialog", "Lcom/avito/android/remote/model/UserDialog;", "(Lcom/avito/android/remote/model/UserDialog;)V", "getUserDialog", "()Lcom/avito/android/remote/model/UserDialog;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FailedWithDialog extends SocialAuthResult {

        @c("userDialog")
        @k
        private final UserDialog userDialog;

        public FailedWithDialog(@k UserDialog userDialog) {
            super(null);
            this.userDialog = userDialog;
        }

        @k
        public final UserDialog getUserDialog() {
            return this.userDialog;
        }
    }

    /* compiled from: SocialAuthResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult$FollowDeeplink;", "Lcom/avito/android/remote/model/SocialAuthResult;", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FollowDeeplink extends SocialAuthResult {

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deeplink;

        public FollowDeeplink(@k DeepLink deepLink) {
            super(null);
            this.deeplink = deepLink;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }
    }

    /* compiled from: SocialAuthResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult$NeedPhoneVerification;", "Lcom/avito/android/remote/model/SocialAuthResult;", "phone", "", "(Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NeedPhoneVerification extends SocialAuthResult {

        @c("phoneHint")
        @l
        private final String phone;

        /* JADX WARN: Multi-variable type inference failed */
        public NeedPhoneVerification() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NeedPhoneVerification copy$default(NeedPhoneVerification needPhoneVerification, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = needPhoneVerification.phone;
            }
            return needPhoneVerification.copy(str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @k
        public final NeedPhoneVerification copy(@l String phone) {
            return new NeedPhoneVerification(phone);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NeedPhoneVerification) && L.f(this.phone, ((NeedPhoneVerification) other).phone);
        }

        @l
        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            String str = this.phone;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("NeedPhoneVerification(phone="), this.phone, ')');
        }

        public /* synthetic */ NeedPhoneVerification(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }

        public NeedPhoneVerification(@l String str) {
            super(null);
            this.phone = str;
        }
    }

    /* compiled from: SocialAuthResult.kt */
    @InterfaceC19823a
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult$Ok;", "Lcom/avito/android/remote/model/SocialAuthResult;", "authResult", "Lcom/avito/android/remote/model/AuthResult;", "(Lcom/avito/android/remote/model/AuthResult;)V", "getAuthResult", "()Lcom/avito/android/remote/model/AuthResult;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok extends SocialAuthResult {

        @k
        private final AuthResult authResult;

        public Ok(@k AuthResult authResult) {
            super(null);
            this.authResult = authResult;
        }

        @k
        public final AuthResult getAuthResult() {
            return this.authResult;
        }
    }

    /* compiled from: SocialAuthResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult$ParsingPermission;", "Lcom/avito/android/remote/model/SocialAuthResult;", "name", "", "phones", "", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getPhones", "()Ljava/util/List;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ParsingPermission extends SocialAuthResult {

        @c("name")
        @l
        private final String name;

        @c("phone")
        @l
        private final List<String> phones;

        public ParsingPermission(@l String str, @l List<String> list) {
            super(null);
            this.name = str;
            this.phones = list;
        }

        @l
        public final String getName() {
            return this.name;
        }

        @l
        public final List<String> getPhones() {
            return this.phones;
        }
    }

    /* compiled from: SocialAuthResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult$PassportBlocked;", "Lcom/avito/android/remote/model/SocialAuthResult;", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PassportBlocked extends SocialAuthResult {

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        public PassportBlocked(@k DeepLink deepLink) {
            super(null);
            this.deeplink = deepLink;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }
    }

    /* compiled from: SocialAuthResult.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\nR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult$TfaCheckWithPush;", "Lcom/avito/android/remote/model/SocialAuthResult;", "phoneList", "", "", "src", "Lcom/avito/android/remote/model/TfaSource;", MessageBody.SystemMessageBody.Platform.FLOW, "Lcom/avito/android/remote/model/TfaFlow;", "phone", "(Ljava/util/List;Lcom/avito/android/remote/model/TfaSource;Lcom/avito/android/remote/model/TfaFlow;Ljava/lang/String;)V", "getFlow", "()Lcom/avito/android/remote/model/TfaFlow;", "getPhone", "()Ljava/lang/String;", "getPhoneList", "()Ljava/util/List;", "getSrc", "()Lcom/avito/android/remote/model/TfaSource;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TfaCheckWithPush extends SocialAuthResult {

        @c(MessageBody.SystemMessageBody.Platform.FLOW)
        @k
        private final TfaFlow flow;

        @c("phone")
        @l
        private final String phone;

        @c("phoneList")
        @k
        private final List<String> phoneList;

        @c("src")
        @k
        private final TfaSource src;

        public /* synthetic */ TfaCheckWithPush(List list, TfaSource tfaSource, TfaFlow tfaFlow, String str, int i12, C42822w c42822w) {
            this(list, tfaSource, tfaFlow, (i12 & 8) != 0 ? null : str);
        }

        @k
        public final TfaFlow getFlow() {
            return this.flow;
        }

        @l
        public final String getPhone() {
            return this.phone;
        }

        @k
        public final List<String> getPhoneList() {
            return this.phoneList;
        }

        @k
        public final TfaSource getSrc() {
            return this.src;
        }

        public TfaCheckWithPush(@k List<String> list, @k TfaSource tfaSource, @k TfaFlow tfaFlow, @l String str) {
            super(null);
            this.phoneList = list;
            this.src = tfaSource;
            this.flow = tfaFlow;
            this.phone = str;
        }
    }

    /* compiled from: SocialAuthResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult$WrongSocialUser;", "Lcom/avito/android/remote/model/SocialAuthResult;", "userDialog", "Lcom/avito/android/remote/model/UserDialog;", "(Lcom/avito/android/remote/model/UserDialog;)V", "getUserDialog", "()Lcom/avito/android/remote/model/UserDialog;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WrongSocialUser extends SocialAuthResult {

        @c("userDialog")
        @k
        private final UserDialog userDialog;

        public WrongSocialUser(@k UserDialog userDialog) {
            super(null);
            this.userDialog = userDialog;
        }

        @k
        public final UserDialog getUserDialog() {
            return this.userDialog;
        }
    }

    public /* synthetic */ SocialAuthResult(C42822w c42822w) {
        this();
    }

    private SocialAuthResult() {
    }
}
