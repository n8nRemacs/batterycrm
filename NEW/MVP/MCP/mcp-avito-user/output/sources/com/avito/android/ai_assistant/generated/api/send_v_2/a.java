package com.avito.android.ai_assistant.generated.api.send_v_2;

import Rb.i;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.BeduinParameter;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendV2Response.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$a;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$b;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$c;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$d;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$e;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$f;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$g;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$h;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$a;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a;", "", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/b;", "actions", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ai_assistant.generated.api.send_v_2.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2638a implements a {

        @com.google.gson.annotations.c("actions")
        @k
        private final List<com.avito.android.ai_assistant.generated.api.send_v_2.b> actions;

        /* JADX WARN: Multi-variable type inference failed */
        public C2638a(@k List<? extends com.avito.android.ai_assistant.generated.api.send_v_2.b> list) {
            this.actions = list;
        }

        @k
        public final List<com.avito.android.ai_assistant.generated.api.send_v_2.b> a() {
            return this.actions;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2638a) && L.f(this.actions, ((C2638a) obj).actions);
        }

        public final int hashCode() {
            return this.actions.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Actions(actions="), this.actions, ')');
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$b;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a;", "Lcom/avito/android/remote/model/BeduinV2;", BeduinParameter.TYPE, "<init>", "(Lcom/avito/android/remote/model/BeduinV2;)V", "Lcom/avito/android/remote/model/BeduinV2;", "a", "()Lcom/avito/android/remote/model/BeduinV2;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        @com.google.gson.annotations.c(BeduinParameter.TYPE)
        @k
        private final BeduinV2 beduin;

        public b(@k BeduinV2 beduinV2) {
            this.beduin = beduinV2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final BeduinV2 getBeduin() {
            return this.beduin;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.beduin, ((b) obj).beduin);
        }

        public final int hashCode() {
            return this.beduin.hashCode();
        }

        @k
        public final String toString() {
            return "Beduin(beduin=" + this.beduin + ')';
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$c;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a;", "", "LRb/g;", "elements", "Lcom/avito/android/deep_linking/links/DeepLink;", "onShowClickstreamDeeplink", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        @com.google.gson.annotations.c("elements")
        @k
        private final List<Rb.g> elements;

        @com.google.gson.annotations.c("onShowClickstreamDeeplink")
        @l
        private final DeepLink onShowClickstreamDeeplink;

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @k
        private final String style;

        public c(@k List<Rb.g> list, @l DeepLink deepLink, @k String str) {
            this.elements = list;
            this.onShowClickstreamDeeplink = deepLink;
            this.style = str;
        }

        @k
        public final List<Rb.g> a() {
            return this.elements;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final DeepLink getOnShowClickstreamDeeplink() {
            return this.onShowClickstreamDeeplink;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getStyle() {
            return this.style;
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$d;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a;", "", "Lcom/avito/android/remote/model/Image;", "elements", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {

        @com.google.gson.annotations.c("elements")
        @k
        private final List<Image> elements;

        public d(@k List<Image> list) {
            this.elements = list;
        }

        @k
        public final List<Image> a() {
            return this.elements;
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b*\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b,\u0010\u001fR\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b0\u0010\u001f¨\u00061"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$e;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "additionalInfo", "LRb/i;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "", "discountString", "", "id", "Lcom/avito/android/remote/model/Image;", "imageBySizes", "", "isFavourite", MessageBody.SystemMessageBody.Platform.Bubble.Item.OLD_PRICE_STRING, "priceAttributed", "priceString", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH, "urlPath", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LRb/i;Ljava/lang/String;JLcom/avito/android/remote/model/Image;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "LRb/i;", "b", "()LRb/i;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "J", "d", "()J", "Lcom/avito/android/remote/model/Image;", "e", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/Boolean;", "l", "()Ljava/lang/Boolean;", "f", "g", "h", "i", "Lcom/avito/android/deep_linking/links/DeepLink;", "j", "()Lcom/avito/android/deep_linking/links/DeepLink;", "k", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements a {

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

        @com.google.gson.annotations.c("priceAttributed")
        @l
        private final AttributedText priceAttributed;

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

        public e(@l AttributedText attributedText, @l i iVar, @l String str, long j12, @l Image image, @l Boolean bool, @l String str2, @l AttributedText attributedText2, @l String str3, @k String str4, @k DeepLink deepLink, @k String str5) {
            this.additionalInfo = attributedText;
            this.badgeBar = iVar;
            this.discountString = str;
            this.id = j12;
            this.imageBySizes = image;
            this.isFavourite = bool;
            this.oldPriceString = str2;
            this.priceAttributed = attributedText2;
            this.priceString = str3;
            this.title = str4;
            this.uriPath = deepLink;
            this.urlPath = str5;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final AttributedText getAdditionalInfo() {
            return this.additionalInfo;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final i getBadgeBar() {
            return this.badgeBar;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getDiscountString() {
            return this.discountString;
        }

        /* renamed from: d, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final Image getImageBySizes() {
            return this.imageBySizes;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final String getOldPriceString() {
            return this.oldPriceString;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final AttributedText getPriceAttributed() {
            return this.priceAttributed;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final String getPriceString() {
            return this.priceString;
        }

        @k
        /* renamed from: i, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: j, reason: from getter */
        public final DeepLink getUriPath() {
            return this.uriPath;
        }

        @k
        /* renamed from: k, reason: from getter */
        public final String getUrlPath() {
            return this.urlPath;
        }

        @l
        /* renamed from: l, reason: from getter */
        public final Boolean getIsFavourite() {
            return this.isFavourite;
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$f;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a;", "", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/d;", "elements", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements a {

        @com.google.gson.annotations.c("elements")
        @k
        private final List<com.avito.android.ai_assistant.generated.api.send_v_2.d> elements;

        /* JADX WARN: Multi-variable type inference failed */
        public f(@k List<? extends com.avito.android.ai_assistant.generated.api.send_v_2.d> list) {
            this.elements = list;
        }

        @k
        public final List<com.avito.android.ai_assistant.generated.api.send_v_2.d> a() {
            return this.elements;
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$g;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "", "markdownText", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements a {

        @com.google.gson.annotations.c("attributedText")
        @k
        private final AttributedText attributedText;

        @com.google.gson.annotations.c("markdownText")
        @k
        private final String markdownText;

        public g(@k AttributedText attributedText, @k String str) {
            this.attributedText = attributedText;
            this.markdownText = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final AttributedText getAttributedText() {
            return this.attributedText;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getMarkdownText() {
            return this.markdownText;
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$h;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f89088a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1220444782;
        }

        @k
        public final String toString() {
            return "Unknown";
        }
    }
}
