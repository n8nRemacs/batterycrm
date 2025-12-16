package com.avito.android.remote.model.profile_removal;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RemovalButton.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalButton;", "", "()V", "Continue", "External", "Internal", "Lcom/avito/android/remote/model/profile_removal/RemovalButton$Continue;", "Lcom/avito/android/remote/model/profile_removal/RemovalButton$External;", "Lcom/avito/android/remote/model/profile_removal/RemovalButton$Internal;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class RemovalButton {

    /* compiled from: RemovalButton.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalButton$Continue;", "Lcom/avito/android/remote/model/profile_removal/RemovalButton;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Continue extends RemovalButton {

        @c("title")
        @k
        private final String title;

        public Continue(@k String str) {
            super(null);
            this.title = str;
        }

        @k
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: RemovalButton.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalButton$External;", "Lcom/avito/android/remote/model/profile_removal/RemovalButton;", "title", "", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "type", "Lcom/avito/android/remote/model/profile_removal/ButtonTypes;", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/profile_removal/ButtonTypes;)V", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getTitle", "()Ljava/lang/String;", "getType", "()Lcom/avito/android/remote/model/profile_removal/ButtonTypes;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class External extends RemovalButton {

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deepLink;

        @c("title")
        @k
        private final String title;

        @c("type")
        @l
        private final ButtonTypes type;

        public External(@k String str, @l DeepLink deepLink, @l ButtonTypes buttonTypes) {
            super(null);
            this.title = str;
            this.deepLink = deepLink;
            this.type = buttonTypes;
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final ButtonTypes getType() {
            return this.type;
        }
    }

    /* compiled from: RemovalButton.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalButton$Internal;", "Lcom/avito/android/remote/model/profile_removal/RemovalButton;", "title", "", "hasPassword", "", "restoreDeeplink", "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;ZLcom/avito/android/deep_linking/links/DeepLink;)V", "getHasPassword", "()Z", "getRestoreDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Internal extends RemovalButton {

        @c("hasPassword")
        private final boolean hasPassword;

        @c("restoreAction")
        @l
        private final DeepLink restoreDeeplink;

        @c("title")
        @k
        private final String title;

        public Internal(@k String str, boolean z12, @l DeepLink deepLink) {
            super(null);
            this.title = str;
            this.hasPassword = z12;
            this.restoreDeeplink = deepLink;
        }

        public final boolean getHasPassword() {
            return this.hasPassword;
        }

        @l
        public final DeepLink getRestoreDeeplink() {
            return this.restoreDeeplink;
        }

        @k
        public final String getTitle() {
            return this.title;
        }
    }

    public /* synthetic */ RemovalButton(C42822w c42822w) {
        this();
    }

    private RemovalButton() {
    }
}
