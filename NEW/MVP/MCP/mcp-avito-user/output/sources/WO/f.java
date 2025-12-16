package wo;

import Y61.k;
import Y61.l;
import com.avito.android.checkout.generated.api.api_checkout_v_9.ApiCheckoutPromocode;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiCheckoutV9Response.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b$\u0010 R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lwo/f;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "agreement", "Lwo/a;", "button", "installmentsButton", "Lwo/i;", "navbar", "", "Lwo/c;", "prices", "Lcom/avito/android/checkout/generated/api/api_checkout_v_9/ApiCheckoutPromocode;", "promocode", "Lwo/e;", "services", "", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lwo/a;Lwo/a;Lwo/i;Ljava/util/List;Lcom/avito/android/checkout/generated/api/api_checkout_v_9/ApiCheckoutPromocode;Ljava/util/List;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lwo/a;", "b", "()Lwo/a;", "c", "Lwo/i;", "d", "()Lwo/i;", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lcom/avito/android/checkout/generated/api/api_checkout_v_9/ApiCheckoutPromocode;", "f", "()Lcom/avito/android/checkout/generated/api/api_checkout_v_9/ApiCheckoutPromocode;", "g", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f {

    @com.google.gson.annotations.c("agreement")
    @l
    private final AttributedText agreement;

    @com.google.gson.annotations.c("button")
    @k
    private final C49658a button;

    @com.google.gson.annotations.c("installmentsButton")
    @l
    private final C49658a installmentsButton;

    @com.google.gson.annotations.c("navbar")
    @l
    private final i navbar;

    @com.google.gson.annotations.c("prices")
    @k
    private final List<c> prices;

    @com.google.gson.annotations.c("promocode")
    @l
    private final ApiCheckoutPromocode promocode;

    @com.google.gson.annotations.c("services")
    @k
    private final List<e> services;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public f(@l AttributedText attributedText, @k C49658a c49658a, @l C49658a c49658a2, @l i iVar, @k List<c> list, @l ApiCheckoutPromocode apiCheckoutPromocode, @k List<e> list2, @k String str) {
        this.agreement = attributedText;
        this.button = c49658a;
        this.installmentsButton = c49658a2;
        this.navbar = iVar;
        this.prices = list;
        this.promocode = apiCheckoutPromocode;
        this.services = list2;
        this.title = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getAgreement() {
        return this.agreement;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C49658a getButton() {
        return this.button;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C49658a getInstallmentsButton() {
        return this.installmentsButton;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final i getNavbar() {
        return this.navbar;
    }

    @k
    public final List<c> e() {
        return this.prices;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final ApiCheckoutPromocode getPromocode() {
        return this.promocode;
    }

    @k
    public final List<e> g() {
        return this.services;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
