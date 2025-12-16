package vo;

import com.avito.android.checkout.generated.api.api_checkout_v_8.ApiCheckoutPromocode;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiCheckoutV8Response.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b)\u0010%R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lvo/i;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "agreement", "Lvo/d;", "bblFooter", "Lvo/a;", "button", "installmentsButton", "Lvo/l;", "navbar", "", "Lvo/e;", "prices", "Lcom/avito/android/checkout/generated/api/api_checkout_v_8/ApiCheckoutPromocode;", "promocode", "Lvo/g;", "services", "", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lvo/d;Lvo/a;Lvo/a;Lvo/l;Ljava/util/List;Lcom/avito/android/checkout/generated/api/api_checkout_v_8/ApiCheckoutPromocode;Ljava/util/List;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lvo/d;", "b", "()Lvo/d;", "Lvo/a;", "c", "()Lvo/a;", "d", "Lvo/l;", "e", "()Lvo/l;", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lcom/avito/android/checkout/generated/api/api_checkout_v_8/ApiCheckoutPromocode;", "g", "()Lcom/avito/android/checkout/generated/api/api_checkout_v_8/ApiCheckoutPromocode;", "h", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i {

    @com.google.gson.annotations.c("agreement")
    @Y61.l
    private final AttributedText agreement;

    @com.google.gson.annotations.c("bblFooter")
    @Y61.l
    private final d bblFooter;

    @com.google.gson.annotations.c("button")
    @Y61.k
    private final C49359a button;

    @com.google.gson.annotations.c("installmentsButton")
    @Y61.l
    private final C49359a installmentsButton;

    @com.google.gson.annotations.c("navbar")
    @Y61.l
    private final l navbar;

    @com.google.gson.annotations.c("prices")
    @Y61.k
    private final List<e> prices;

    @com.google.gson.annotations.c("promocode")
    @Y61.l
    private final ApiCheckoutPromocode promocode;

    @com.google.gson.annotations.c("services")
    @Y61.k
    private final List<g> services;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public i(@Y61.l AttributedText attributedText, @Y61.l d dVar, @Y61.k C49359a c49359a, @Y61.l C49359a c49359a2, @Y61.l l lVar, @Y61.k List<e> list, @Y61.l ApiCheckoutPromocode apiCheckoutPromocode, @Y61.k List<g> list2, @Y61.k String str) {
        this.agreement = attributedText;
        this.bblFooter = dVar;
        this.button = c49359a;
        this.installmentsButton = c49359a2;
        this.navbar = lVar;
        this.prices = list;
        this.promocode = apiCheckoutPromocode;
        this.services = list2;
        this.title = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final AttributedText getAgreement() {
        return this.agreement;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final d getBblFooter() {
        return this.bblFooter;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final C49359a getButton() {
        return this.button;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final C49359a getInstallmentsButton() {
        return this.installmentsButton;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final l getNavbar() {
        return this.navbar;
    }

    @Y61.k
    public final List<e> f() {
        return this.prices;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final ApiCheckoutPromocode getPromocode() {
        return this.promocode;
    }

    @Y61.k
    public final List<g> h() {
        return this.services;
    }

    @Y61.k
    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
