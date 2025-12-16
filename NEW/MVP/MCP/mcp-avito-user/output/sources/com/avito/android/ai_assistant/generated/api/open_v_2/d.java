package com.avito.android.ai_assistant.generated.api.open_v_2;

import Qb.i;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OpenV2Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/d;", "", "a", "b", "Lcom/avito/android/ai_assistant/generated/api/open_v_2/d$a;", "Lcom/avito/android/ai_assistant/generated/api/open_v_2/d$b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface d {

    /* compiled from: OpenV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/d$a;", "Lcom/avito/android/ai_assistant/generated/api/open_v_2/d;", "Lcom/avito/android/remote/model/BeduinV2;", "beduinSnippet", "<init>", "(Lcom/avito/android/remote/model/BeduinV2;)V", "Lcom/avito/android/remote/model/BeduinV2;", "a", "()Lcom/avito/android/remote/model/BeduinV2;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        @com.google.gson.annotations.c("beduinSnippet")
        @k
        private final BeduinV2 beduinSnippet;

        public a(@k BeduinV2 beduinV2) {
            this.beduinSnippet = beduinV2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final BeduinV2 getBeduinSnippet() {
            return this.beduinSnippet;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.beduinSnippet, ((a) obj).beduinSnippet);
        }

        public final int hashCode() {
            return this.beduinSnippet.hashCode();
        }

        @k
        public final String toString() {
            return "BeduinSnippet(beduinSnippet=" + this.beduinSnippet + ')';
        }
    }

    /* compiled from: OpenV2Response.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b\r\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b)\u0010\u001eR\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b-\u0010\u001e¨\u0006."}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/d$b;", "Lcom/avito/android/ai_assistant/generated/api/open_v_2/d;", "Lcom/avito/android/remote/model/text/AttributedText;", "additionalInfo", "LQb/i;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "", "discountString", "", "id", "Lcom/avito/android/remote/model/Image;", "imageBySizes", "", "isFavourite", MessageBody.SystemMessageBody.Platform.Bubble.Item.OLD_PRICE_STRING, "priceString", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH, "urlPath", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LQb/i;Ljava/lang/String;JLcom/avito/android/remote/model/Image;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getAdditionalInfo", "()Lcom/avito/android/remote/model/text/AttributedText;", "LQb/i;", "getBadgeBar", "()LQb/i;", "Ljava/lang/String;", "getDiscountString", "()Ljava/lang/String;", "J", "a", "()J", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getOldPriceString", "c", "d", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "f", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d {

        @com.google.gson.annotations.c("additionalInfo")
        @l
        private final AttributedText additionalInfo;

        @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR)
        @l
        private final i badgeBar;

        @com.google.gson.annotations.c("discountString")
        @l
        private final String discountString;

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("imageBySizes")
        @l
        private final Image imageBySizes;

        @com.google.gson.annotations.c("isFavourite")
        @l
        private final Boolean isFavourite;

        @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.Bubble.Item.OLD_PRICE_STRING)
        @l
        private final String oldPriceString;

        @com.google.gson.annotations.c("priceString")
        @l
        private final String priceString;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH)
        @k
        private final DeepLink uriPath;

        @com.google.gson.annotations.c("urlPath")
        @k
        private final String urlPath;

        public b(@l AttributedText attributedText, @l i iVar, @l String str, long j12, @l Image image, @l Boolean bool, @l String str2, @l String str3, @k String str4, @k DeepLink deepLink, @k String str5) {
            this.additionalInfo = attributedText;
            this.badgeBar = iVar;
            this.discountString = str;
            this.id = j12;
            this.imageBySizes = image;
            this.isFavourite = bool;
            this.oldPriceString = str2;
            this.priceString = str3;
            this.title = str4;
            this.uriPath = deepLink;
            this.urlPath = str5;
        }

        /* renamed from: a, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final Image getImageBySizes() {
            return this.imageBySizes;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getPriceString() {
            return this.priceString;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final DeepLink getUriPath() {
            return this.uriPath;
        }

        @k
        /* renamed from: f, reason: from getter */
        public final String getUrlPath() {
            return this.urlPath;
        }
    }
}
