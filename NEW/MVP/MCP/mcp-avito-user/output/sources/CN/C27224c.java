package cn;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.cart_snippet_actions.models.api.CartSnippetActionsStepper;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CartSheetAfterAddingContent.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Lcn/c;", "", "", "id", "Lcom/avito/android/remote/model/Image;", "image", "Lcn/e;", "fullPrice", "", "discountPercents", "title", "onTapDeepLink", "Lcn/c$a;", "seller", "Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;", "stepper", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcn/c$a;Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;Lkotlin/jvm/internal/w;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "d", "()Lcom/avito/android/remote/model/Image;", "J", "b", "()J", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "g", "getOnTapDeepLink", "Lcn/c$a;", "e", "()Lcn/c$a;", "Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;", "f", "()Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;", "_avito_cart-sheet-after-adding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cn.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C27224c {

    @com.google.gson.annotations.c("discountPercents")
    @l
    private final Integer discountPercents;

    @com.google.gson.annotations.c("fullPrice")
    private final long fullPrice;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("image")
    @k
    private final Image image;

    @com.google.gson.annotations.c("onTapDeepLink")
    @k
    private final String onTapDeepLink;

    @com.google.gson.annotations.c("seller")
    @k
    private final a seller;

    @com.google.gson.annotations.c("stepper")
    @k
    private final CartSnippetActionsStepper stepper;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    /* compiled from: CartSheetAfterAddingContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcn/c$a;", "", "", "name", "Lcn/c$a$a;", "reviews", "<init>", "(Ljava/lang/String;Lcn/c$a$a;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcn/c$a$a;", "b", "()Lcn/c$a$a;", "_avito_cart-sheet-after-adding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cn.c$a */
    public static final /* data */ class a {

        @com.google.gson.annotations.c("name")
        @k
        private final String name;

        @com.google.gson.annotations.c("reviews")
        @l
        private final C2063a reviews;

        /* compiled from: CartSheetAfterAddingContent.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcn/c$a$a;", "", "", "rating", "", "reviewsCount", "<init>", "(DI)V", "D", "a", "()D", "I", "b", "()I", "_avito_cart-sheet-after-adding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: cn.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2063a {

            @com.google.gson.annotations.c("rating")
            private final double rating;

            @com.google.gson.annotations.c("reviewsCount")
            private final int reviewsCount;

            public C2063a(double d12, int i12) {
                this.rating = d12;
                this.reviewsCount = i12;
            }

            /* renamed from: a, reason: from getter */
            public final double getRating() {
                return this.rating;
            }

            /* renamed from: b, reason: from getter */
            public final int getReviewsCount() {
                return this.reviewsCount;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2063a)) {
                    return false;
                }
                C2063a c2063a = (C2063a) obj;
                return Double.compare(this.rating, c2063a.rating) == 0 && this.reviewsCount == c2063a.reviewsCount;
            }

            public final int hashCode() {
                return Integer.hashCode(this.reviewsCount) + (Double.hashCode(this.rating) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Reviews(rating=");
                sb2.append(this.rating);
                sb2.append(", reviewsCount=");
                return r.t(sb2, this.reviewsCount, ')');
            }
        }

        public a(@k String str, @l C2063a c2063a) {
            this.name = str;
            this.reviews = c2063a;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final C2063a getReviews() {
            return this.reviews;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.name, aVar.name) && L.f(this.reviews, aVar.reviews);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            C2063a c2063a = this.reviews;
            return iHashCode + (c2063a == null ? 0 : c2063a.hashCode());
        }

        @k
        public final String toString() {
            return "Seller(name=" + this.name + ", reviews=" + this.reviews + ')';
        }
    }

    public /* synthetic */ C27224c(String str, Image image, long j12, Integer num, String str2, String str3, a aVar, CartSnippetActionsStepper cartSnippetActionsStepper, C42822w c42822w) {
        this(str, image, j12, num, str2, str3, aVar, cartSnippetActionsStepper);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Integer getDiscountPercents() {
        return this.discountPercents;
    }

    /* renamed from: b, reason: from getter */
    public final long getFullPrice() {
        return this.fullPrice;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final a getSeller() {
        return this.seller;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27224c)) {
            return false;
        }
        C27224c c27224c = (C27224c) obj;
        return L.f(this.id, c27224c.id) && L.f(this.image, c27224c.image) && this.fullPrice == c27224c.fullPrice && L.f(this.discountPercents, c27224c.discountPercents) && L.f(this.title, c27224c.title) && L.f(this.onTapDeepLink, c27224c.onTapDeepLink) && L.f(this.seller, c27224c.seller) && L.f(this.stepper, c27224c.stepper);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final CartSnippetActionsStepper getStepper() {
        return this.stepper;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iG2 = r.g(com.avito.android.actions_sheet.a.g(this.image, this.id.hashCode() * 31, 31), 31, this.fullPrice);
        Integer num = this.discountPercents;
        return this.stepper.hashCode() + ((this.seller.hashCode() + H.d(H.d((iG2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.title), 31, this.onTapDeepLink)) * 31);
    }

    @k
    public final String toString() {
        return "Item(id=" + this.id + ", image=" + this.image + ", fullPrice=" + ((Object) C27226e.b(this.fullPrice)) + ", discountPercents=" + this.discountPercents + ", title=" + this.title + ", onTapDeepLink=" + this.onTapDeepLink + ", seller=" + this.seller + ", stepper=" + this.stepper + ')';
    }

    private C27224c(String str, Image image, long j12, Integer num, String str2, String str3, a aVar, CartSnippetActionsStepper cartSnippetActionsStepper) {
        this.id = str;
        this.image = image;
        this.fullPrice = j12;
        this.discountPercents = num;
        this.title = str2;
        this.onTapDeepLink = str3;
        this.seller = aVar;
        this.stepper = cartSnippetActionsStepper;
    }
}
