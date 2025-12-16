package Sq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.cart_snippet_actions.models.api.CartSnippetActionsStepper;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromotionsComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LSq0/c;", "", "a", "b", "LSq0/c$a;", "LSq0/c$b;", "_avito-discouraged_avito-network_seller-promotions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: PromotionsComponent.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSq0/c$a;", "LSq0/c;", "", "id", "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-network_seller-promotions"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
        @k
        private final List<BeduinModel> children;

        @com.google.gson.annotations.c("id")
        @l
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@l String str, @k List<? extends BeduinModel> list) {
            this.id = str;
            this.children = list;
        }

        @k
        public final List<BeduinModel> a() {
            return this.children;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.id, aVar.id) && L.f(this.children, aVar.children);
        }

        public final int hashCode() {
            String str = this.id;
            return this.children.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Beduin(id=");
            sb2.append(this.id);
            sb2.append(", children=");
            return H.p(sb2, this.children, ')');
        }
    }

    /* compiled from: PromotionsComponent.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"LSq0/c$b;", "LSq0/c;", "", "id", "Lcom/avito/android/remote/model/Image;", "image", "title", "", "price", "Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;", "stepper", "", "isFavorite", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;DLcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;ZLcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "c", "()Lcom/avito/android/remote/model/Image;", "g", "D", "e", "()D", "Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;", "f", "()Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;", "Z", "h", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-network_seller-promotions"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
        @l
        private final List<BeduinModel> children;

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("image")
        @l
        private final Image image;

        @com.google.gson.annotations.c("isFavorite")
        private final boolean isFavorite;

        @com.google.gson.annotations.c("onTapDeepLink")
        @k
        private final DeepLink onTapDeepLink;

        @com.google.gson.annotations.c("price")
        private final double price;

        @com.google.gson.annotations.c("stepper")
        @l
        private final CartSnippetActionsStepper stepper;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k String str, @l Image image, @k String str2, double d12, @l CartSnippetActionsStepper cartSnippetActionsStepper, boolean z12, @k DeepLink deepLink, @l List<? extends BeduinModel> list) {
            this.id = str;
            this.image = image;
            this.title = str2;
            this.price = d12;
            this.stepper = cartSnippetActionsStepper;
            this.isFavorite = z12;
            this.onTapDeepLink = deepLink;
            this.children = list;
        }

        @l
        public final List<BeduinModel> a() {
            return this.children;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final DeepLink getOnTapDeepLink() {
            return this.onTapDeepLink;
        }

        /* renamed from: e, reason: from getter */
        public final double getPrice() {
            return this.price;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.id, bVar.id) && L.f(this.image, bVar.image) && L.f(this.title, bVar.title) && Double.compare(this.price, bVar.price) == 0 && L.f(this.stepper, bVar.stepper) && this.isFavorite == bVar.isFavorite && L.f(this.onTapDeepLink, bVar.onTapDeepLink) && L.f(this.children, bVar.children);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final CartSnippetActionsStepper getStepper() {
            return this.stepper;
        }

        @k
        /* renamed from: g, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsFavorite() {
            return this.isFavorite;
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            Image image = this.image;
            int iD2 = androidx.compose.ui.graphics.colorspace.e.d(H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.title), 31, this.price);
            CartSnippetActionsStepper cartSnippetActionsStepper = this.stepper;
            int iE2 = com.avito.android.actions_sheet.a.e(this.onTapDeepLink, r.i((iD2 + (cartSnippetActionsStepper == null ? 0 : cartSnippetActionsStepper.hashCode())) * 31, 31, this.isFavorite), 31);
            List<BeduinModel> list = this.children;
            return iE2 + (list != null ? list.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Snippet(id=");
            sb2.append(this.id);
            sb2.append(", image=");
            sb2.append(this.image);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", price=");
            sb2.append(this.price);
            sb2.append(", stepper=");
            sb2.append(this.stepper);
            sb2.append(", isFavorite=");
            sb2.append(this.isFavorite);
            sb2.append(", onTapDeepLink=");
            sb2.append(this.onTapDeepLink);
            sb2.append(", children=");
            return H.p(sb2, this.children, ')');
        }
    }
}
