package cn;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import vn.C49355b;

/* compiled from: CartSheetAfterAddingContent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\tB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcn/a;", "", "Lvn/b;", "discountOnDelivery", "Lcn/a$a;", "goToCartButton", "<init>", "(Lvn/b;Lcn/a$a;)V", "Lvn/b;", "a", "()Lvn/b;", "Lcn/a$a;", "getGoToCartButton", "()Lcn/a$a;", "_avito_cart-sheet-after-adding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C27222a {

    @com.google.gson.annotations.c("discountOnDelivery")
    @l
    private final C49355b discountOnDelivery;

    @com.google.gson.annotations.c("goToCartButton")
    @k
    private final C2062a goToCartButton;

    /* compiled from: CartSheetAfterAddingContent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcn/a$a;", "", "", "title", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDeepLink", "_avito_cart-sheet-after-adding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cn.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2062a {

        @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
        @k
        private final String deepLink;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        public C2062a(@k String str, @k String str2) {
            this.title = str;
            this.deepLink = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2062a)) {
                return false;
            }
            C2062a c2062a = (C2062a) obj;
            return L.f(this.title, c2062a.title) && L.f(this.deepLink, c2062a.deepLink);
        }

        public final int hashCode() {
            return this.deepLink.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GoToCartButton(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            return C22026a.c(sb2, this.deepLink, ')');
        }
    }

    public C27222a(@l C49355b c49355b, @k C2062a c2062a) {
        this.discountOnDelivery = c49355b;
        this.goToCartButton = c2062a;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C49355b getDiscountOnDelivery() {
        return this.discountOnDelivery;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27222a)) {
            return false;
        }
        C27222a c27222a = (C27222a) obj;
        return L.f(this.discountOnDelivery, c27222a.discountOnDelivery) && L.f(this.goToCartButton, c27222a.goToCartButton);
    }

    public final int hashCode() {
        C49355b c49355b = this.discountOnDelivery;
        return this.goToCartButton.hashCode() + ((c49355b == null ? 0 : c49355b.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "BottomForm(discountOnDelivery=" + this.discountOnDelivery + ", goToCartButton=" + this.goToCartButton + ')';
    }
}
