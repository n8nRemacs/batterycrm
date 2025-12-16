package Zz0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_seller_orders_important_to_note.generated.api.api_1_str_seller_orders_important_to_note_post.BookingButtonV3;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1StrSellerOrdersImportantToNotePostResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LZz0/e;", "", "a", "LZz0/e$a;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface e {

    /* compiled from: Api1StrSellerOrdersImportantToNotePostResponse.kt */
    @P
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b$\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b+\u0010*¨\u0006,"}, d2 = {"LZz0/e$a;", "LZz0/e;", "", "active", "", "Lcom/avito/android/str_seller_orders_important_to_note/generated/api/api_1_str_seller_orders_important_to_note_post/BookingButtonV3;", "buttons", "LZz0/c;", "buyerInfo", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "LZz0/d;", "estateInfo", "hasAction", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "title", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;LZz0/c;Lcom/avito/android/deep_linking/links/DeepLink;LZz0/d;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LZz0/c;", "c", "()LZz0/c;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LZz0/d;", "e", "()LZz0/d;", "f", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "h", "()Lcom/avito/android/remote/model/text/AttributedText;", "i", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e {

        @com.google.gson.annotations.c("active")
        @l
        private final Boolean active;

        @com.google.gson.annotations.c("buttons")
        @l
        private final List<BookingButtonV3> buttons;

        @com.google.gson.annotations.c("buyerInfo")
        @l
        private final C19629c buyerInfo;

        @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
        @l
        private final DeepLink deepLink;

        @com.google.gson.annotations.c("estateInfo")
        @l
        private final C19630d estateInfo;

        @com.google.gson.annotations.c("hasAction")
        @l
        private final Boolean hasAction;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("subtitle")
        @l
        private final AttributedText subtitle;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final AttributedText title;

        public a(@l Boolean bool, @l List<BookingButtonV3> list, @l C19629c c19629c, @l DeepLink deepLink, @l C19630d c19630d, @l Boolean bool2, @Y61.k String str, @l AttributedText attributedText, @Y61.k AttributedText attributedText2) {
            this.active = bool;
            this.buttons = list;
            this.buyerInfo = c19629c;
            this.deepLink = deepLink;
            this.estateInfo = c19630d;
            this.hasAction = bool2;
            this.id = str;
            this.subtitle = attributedText;
            this.title = attributedText2;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final Boolean getActive() {
            return this.active;
        }

        @l
        public final List<BookingButtonV3> b() {
            return this.buttons;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final C19629c getBuyerInfo() {
            return this.buyerInfo;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final C19630d getEstateInfo() {
            return this.estateInfo;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final Boolean getHasAction() {
            return this.hasAction;
        }

        @Y61.k
        /* renamed from: g, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @Y61.k
        /* renamed from: i, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }
    }
}
