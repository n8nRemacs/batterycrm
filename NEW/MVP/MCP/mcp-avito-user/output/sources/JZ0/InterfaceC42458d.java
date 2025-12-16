package jz0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api4StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ljz0/d;", "", "a", "b", "Ljz0/d$a;", "Ljz0/d$b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jz0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC42458d {

    /* compiled from: Api4StrSellerOrdersListPostResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\"\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"Ljz0/d$a;", "Ljz0/d;", "Lcom/avito/android/remote/model/Image;", "circleImage", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/text/AttributedText;", "description", "details", "", "hasAction", "", "id", "image", "subtitle", "title", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "h", "i", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jz0.d$a */
    public static final class a implements InterfaceC42458d {

        @com.google.gson.annotations.c("circleImage")
        @l
        private final Image circleImage;

        @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
        @l
        private final DeepLink deepLink;

        @com.google.gson.annotations.c("description")
        @l
        private final AttributedText description;

        @com.google.gson.annotations.c("details")
        @l
        private final AttributedText details;

        @com.google.gson.annotations.c("hasAction")
        @l
        private final Boolean hasAction;

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("image")
        @k
        private final Image image;

        @com.google.gson.annotations.c("subtitle")
        @l
        private final AttributedText subtitle;

        @com.google.gson.annotations.c("title")
        @k
        private final AttributedText title;

        public a(@l Image image, @l DeepLink deepLink, @l AttributedText attributedText, @l AttributedText attributedText2, @l Boolean bool, @k String str, @k Image image2, @l AttributedText attributedText3, @k AttributedText attributedText4) {
            this.circleImage = image;
            this.deepLink = deepLink;
            this.description = attributedText;
            this.details = attributedText2;
            this.hasAction = bool;
            this.id = str;
            this.image = image2;
            this.subtitle = attributedText3;
            this.title = attributedText4;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final Image getCircleImage() {
            return this.circleImage;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final AttributedText getDetails() {
            return this.details;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final Boolean getHasAction() {
            return this.hasAction;
        }

        @k
        /* renamed from: f, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: g, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @k
        /* renamed from: i, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api4StrSellerOrdersListPostResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Ljz0/d$b;", "Ljz0/d;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "iconName", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jz0.d$b */
    public static final class b implements InterfaceC42458d {

        @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
        @l
        private final DeepLink deepLink;

        @com.google.gson.annotations.c("iconName")
        @l
        private final String iconName;

        @com.google.gson.annotations.c("subtitle")
        @l
        private final AttributedText subtitle;

        @com.google.gson.annotations.c("title")
        @l
        private final AttributedText title;

        public b(@l DeepLink deepLink, @l String str, @l AttributedText attributedText, @l AttributedText attributedText2) {
            this.deepLink = deepLink;
            this.iconName = str;
            this.subtitle = attributedText;
            this.title = attributedText2;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getIconName() {
            return this.iconName;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }
    }
}
