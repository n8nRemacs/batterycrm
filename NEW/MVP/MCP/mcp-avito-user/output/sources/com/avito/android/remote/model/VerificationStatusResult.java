package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;

/* compiled from: VerificationStatusResult.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0004\u001d\u001e\u001f BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b¢\u0006\u0002\u0010\u0010R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/VerificationStatusResult;", "", "title", "", "description", "Lcom/avito/android/remote/model/text/AttributedText;", "footerInfo", "buttons", "", "Lcom/avito/android/remote/model/VerificationStatusResult$Button;", AdFormat.BANNER, "Lcom/avito/android/remote/model/VerificationStatusResult$Banner;", "image", "Lcom/avito/android/remote/model/Image;", "actions", "Lcom/avito/android/remote/model/VerificationStatusResult$Action;", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/VerificationStatusResult$Banner;Lcom/avito/android/remote/model/Image;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getBanner", "()Lcom/avito/android/remote/model/VerificationStatusResult$Banner;", "getButtons", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "getFooterInfo", "getImage", "()Lcom/avito/android/remote/model/Image;", "getTitle", "()Ljava/lang/String;", "Action", "Banner", "Button", "DeepLinkInfo", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VerificationStatusResult {

    @c("actions")
    @l
    private final List<Action> actions;

    @c(AdFormat.BANNER)
    @l
    private final Banner banner;

    @c("buttons")
    @l
    private final List<Button> buttons;

    @c("description")
    @l
    private final AttributedText description;

    @c("footerInfo")
    @l
    private final AttributedText footerInfo;

    @c("image")
    @l
    private final Image image;

    @c("title")
    @l
    private final String title;

    /* compiled from: VerificationStatusResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/VerificationStatusResult$Action;", "", "type", "", Constants.DEEPLINK, "Lcom/avito/android/remote/model/VerificationStatusResult$DeepLinkInfo;", "(Ljava/lang/String;Lcom/avito/android/remote/model/VerificationStatusResult$DeepLinkInfo;)V", "getDeeplink", "()Lcom/avito/android/remote/model/VerificationStatusResult$DeepLinkInfo;", "getType", "()Ljava/lang/String;", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action {

        @c(ContextActionHandler.Link.DEEPLINK)
        @k
        private final DeepLinkInfo deeplink;

        @c("type")
        @k
        private final String type;

        public Action(@k String str, @k DeepLinkInfo deepLinkInfo) {
            this.type = str;
            this.deeplink = deepLinkInfo;
        }

        @k
        public final DeepLinkInfo getDeeplink() {
            return this.deeplink;
        }

        @k
        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: VerificationStatusResult.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/VerificationStatusResult$Banner;", "", "title", "", "type", "description", "detailsLink", "Lcom/avito/android/remote/model/text/AttributedText;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "getDescription", "()Ljava/lang/String;", "getDetailsLink", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getType", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Banner {

        @c("description")
        @k
        private final String description;

        @c("detailsLink")
        @l
        private final AttributedText detailsLink;

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final String type;

        public Banner(@k String str, @k String str2, @k String str3, @l AttributedText attributedText) {
            this.title = str;
            this.type = str2;
            this.description = str3;
            this.detailsLink = attributedText;
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @l
        public final AttributedText getDetailsLink() {
            return this.detailsLink;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: VerificationStatusResult.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/VerificationStatusResult$Button;", "", "title", "", "type", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "isEnabled", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Z)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "()Z", "getTitle", "()Ljava/lang/String;", "getType", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Button {

        @c(ContextActionHandler.Link.DEEPLINK)
        @k
        private final DeepLink deeplink;

        @c("isEnabled")
        private final boolean isEnabled;

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final String type;

        public Button(@k String str, @k String str2, @k DeepLink deepLink, boolean z12) {
            this.title = str;
            this.type = str2;
            this.deeplink = deepLink;
            this.isEnabled = z12;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getType() {
            return this.type;
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    /* compiled from: VerificationStatusResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/VerificationStatusResult$DeepLinkInfo;", "", "title", "", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getTitle", "()Ljava/lang/String;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DeepLinkInfo {

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        public DeepLinkInfo(@k String str, @k DeepLink deepLink) {
            this.title = str;
            this.uri = deepLink;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final DeepLink getUri() {
            return this.uri;
        }
    }

    public VerificationStatusResult(@l String str, @l AttributedText attributedText, @l AttributedText attributedText2, @l List<Button> list, @l Banner banner, @l Image image, @l List<Action> list2) {
        this.title = str;
        this.description = attributedText;
        this.footerInfo = attributedText2;
        this.buttons = list;
        this.banner = banner;
        this.image = image;
        this.actions = list2;
    }

    @l
    public final List<Action> getActions() {
        return this.actions;
    }

    @l
    public final Banner getBanner() {
        return this.banner;
    }

    @l
    public final List<Button> getButtons() {
        return this.buttons;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final AttributedText getFooterInfo() {
        return this.footerInfo;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final String getTitle() {
        return this.title;
    }
}
