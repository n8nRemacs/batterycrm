package com.avito.android.remote.model.profile_removal;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RemovalProcessItem.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem;", "", "()V", "Banner", "Header", "Link", "ListItem", "SpacerItem", "Subtitle", "Text", "TextArea", "Title", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Banner;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Header;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Link;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$ListItem;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$SpacerItem;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Subtitle;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Text;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$TextArea;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Title;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class RemovalProcessItem {

    /* compiled from: RemovalProcessItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Banner;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem;", "title", "", "description", "link", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Banner$Link;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Banner$Link;)V", "getDescription", "()Ljava/lang/String;", "getLink", "()Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Banner$Link;", "getTitle", "Link", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Banner extends RemovalProcessItem {

        @c("text")
        @k
        private final String description;

        @c("link")
        @l
        private final Link link;

        @c("title")
        @k
        private final String title;

        /* compiled from: RemovalProcessItem.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Banner$Link;", "", "text", "", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getText", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Link {

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @k
            private final DeepLink deeplink;

            @c("title")
            @k
            private final String text;

            public Link(@k String str, @k DeepLink deepLink) {
                this.text = str;
                this.deeplink = deepLink;
            }

            @k
            public final DeepLink getDeeplink() {
                return this.deeplink;
            }

            @k
            public final String getText() {
                return this.text;
            }
        }

        public Banner(@k String str, @k String str2, @l Link link) {
            super(null);
            this.title = str;
            this.description = str2;
            this.link = link;
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @l
        public final Link getLink() {
            return this.link;
        }

        @k
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: RemovalProcessItem.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Header;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem;", "title", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getTitle", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Header extends RemovalProcessItem {

        @c("description")
        @l
        private final String description;

        @c("text")
        @k
        private final String title;

        public Header(@k String str, @l String str2) {
            super(null);
            this.title = str;
            this.description = str2;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @k
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: RemovalProcessItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Link;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem;", "title", "", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Link extends RemovalProcessItem {

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        @c("text")
        @k
        private final String title;

        public Link(@k String str, @k DeepLink deepLink) {
            super(null);
            this.title = str;
            this.deeplink = deepLink;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: RemovalProcessItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$ListItem;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem;", "title", "", "next", "Lcom/avito/android/remote/model/profile_removal/ProfileRemovalScreen;", "(Ljava/lang/String;Lcom/avito/android/remote/model/profile_removal/ProfileRemovalScreen;)V", "getNext", "()Lcom/avito/android/remote/model/profile_removal/ProfileRemovalScreen;", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ListItem extends RemovalProcessItem {

        @c("next")
        @k
        private final ProfileRemovalScreen next;

        @c("text")
        @k
        private final String title;

        public ListItem(@k String str, @k ProfileRemovalScreen profileRemovalScreen) {
            super(null);
            this.title = str;
            this.next = profileRemovalScreen;
        }

        @k
        public final ProfileRemovalScreen getNext() {
            return this.next;
        }

        @k
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: RemovalProcessItem.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$SpacerItem;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem;", "value", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$SpacerItem$Value;", "(Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$SpacerItem$Value;)V", "getValue", "()Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$SpacerItem$Value;", "Value", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SpacerItem extends RemovalProcessItem {

        @c("value")
        @k
        private final Value value;

        /* compiled from: RemovalProcessItem.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$SpacerItem$Value;", "", "height", "", "(I)V", "getHeight", "()I", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Value {

            @c("height")
            private final int height;

            public Value(int i12) {
                this.height = i12;
            }

            public final int getHeight() {
                return this.height;
            }
        }

        public SpacerItem(@k Value value) {
            super(null);
            this.value = value;
        }

        @k
        public final Value getValue() {
            return this.value;
        }
    }

    /* compiled from: RemovalProcessItem.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Subtitle;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Subtitle extends RemovalProcessItem {

        @c("text")
        @k
        private final String title;

        public Subtitle(@k String str) {
            super(null);
            this.title = str;
        }

        @k
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: RemovalProcessItem.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Text;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem;", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Text extends RemovalProcessItem {

        @c("value")
        @k
        private final AttributedText title;

        public Text(@k AttributedText attributedText) {
            super(null);
            this.title = attributedText;
        }

        @k
        public final AttributedText getTitle() {
            return this.title;
        }
    }

    /* compiled from: RemovalProcessItem.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$TextArea;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem;", "text", "Lcom/avito/android/remote/model/text/AttributedText;", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextArea extends RemovalProcessItem {

        @c("value")
        @k
        private final AttributedText text;

        public TextArea(@k AttributedText attributedText) {
            super(null);
            this.text = attributedText;
        }

        @k
        public final AttributedText getText() {
            return this.text;
        }
    }

    /* compiled from: RemovalProcessItem.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem$Title;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem;", "title", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getTitle", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Title extends RemovalProcessItem {

        @c("description")
        @l
        private final String description;

        @c("text")
        @k
        private final String title;

        public Title(@k String str, @l String str2) {
            super(null);
            this.title = str;
            this.description = str2;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @k
        public final String getTitle() {
            return this.title;
        }
    }

    public /* synthetic */ RemovalProcessItem(C42822w c42822w) {
        this();
    }

    private RemovalProcessItem() {
    }
}
