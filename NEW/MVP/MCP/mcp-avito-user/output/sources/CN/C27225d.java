package cn;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.cart_snippet_actions.models.api.CartSnippetActionsStepper;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CartSheetAfterAddingContent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Lcn/d;", "", "", "id", "Lcom/avito/android/remote/model/Image;", "image", "title", "Lcn/e;", "fullPrice", "", "discountPercents", "multiItemParams", "Lcn/d$a;", "seller", "Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;", "stepper", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;Lcn/d$a;Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;Lkotlin/jvm/internal/w;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "d", "()Lcom/avito/android/remote/model/Image;", "h", "J", "b", "()J", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "e", "Lcn/d$a;", "f", "()Lcn/d$a;", "Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;", "g", "()Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;", "_avito_cart-sheet-after-adding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cn.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C27225d {

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

    @com.google.gson.annotations.c("multiItemParams")
    @l
    private final String multiItemParams;

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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcn/d$a;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_cart-sheet-after-adding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cn.d$a */
    public static final /* data */ class a {

        @com.google.gson.annotations.c("name")
        @k
        private final String name;

        public a(@k String str) {
            this.name = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.name, ((a) obj).name);
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Seller(name="), this.name, ')');
        }
    }

    public /* synthetic */ C27225d(String str, Image image, String str2, long j12, Integer num, String str3, a aVar, CartSnippetActionsStepper cartSnippetActionsStepper, C42822w c42822w) {
        this(str, image, str2, j12, num, str3, aVar, cartSnippetActionsStepper);
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

    @l
    /* renamed from: e, reason: from getter */
    public final String getMultiItemParams() {
        return this.multiItemParams;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27225d)) {
            return false;
        }
        C27225d c27225d = (C27225d) obj;
        return L.f(this.id, c27225d.id) && L.f(this.image, c27225d.image) && L.f(this.title, c27225d.title) && this.fullPrice == c27225d.fullPrice && L.f(this.discountPercents, c27225d.discountPercents) && L.f(this.multiItemParams, c27225d.multiItemParams) && L.f(this.seller, c27225d.seller) && L.f(this.stepper, c27225d.stepper);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final a getSeller() {
        return this.seller;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final CartSnippetActionsStepper getStepper() {
        return this.stepper;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iG2 = r.g(H.d(com.avito.android.actions_sheet.a.g(this.image, this.id.hashCode() * 31, 31), 31, this.title), 31, this.fullPrice);
        Integer num = this.discountPercents;
        int iHashCode = (iG2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.multiItemParams;
        return this.stepper.hashCode() + ((this.seller.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "MainItem(id=" + this.id + ", image=" + this.image + ", title=" + this.title + ", fullPrice=" + ((Object) C27226e.b(this.fullPrice)) + ", discountPercents=" + this.discountPercents + ", multiItemParams=" + this.multiItemParams + ", seller=" + this.seller + ", stepper=" + this.stepper + ')';
    }

    private C27225d(String str, Image image, String str2, long j12, Integer num, String str3, a aVar, CartSnippetActionsStepper cartSnippetActionsStepper) {
        this.id = str;
        this.image = image;
        this.title = str2;
        this.fullPrice = j12;
        this.discountPercents = num;
        this.multiItemParams = str3;
        this.seller = aVar;
        this.stepper = cartSnippetActionsStepper;
    }
}
