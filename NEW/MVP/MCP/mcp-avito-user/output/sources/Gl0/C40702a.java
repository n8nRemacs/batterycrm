package gl0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2DeliverySubsidySettingsPostResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b%\u0010!R\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b&\u0010!R\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b'\u0010!R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b(\u0010\u0019R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b)\u0010\u0019R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lgl0/a;", "", "", "acceptButtonTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "bannerText", "cancelButtonTitle", "currencySymbol", "", "discount", "discountTooBigHint", "discountTooSmallHint", "inputTitle", "maxDiscount", "minDiscount", "sliderStep", "title", "toastText", "", "Lgl0/b;", "trustFactors", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "c", "d", "J", "e", "()J", "f", "g", "h", "i", "j", "k", "l", "m", "Ljava/util/List;", "n", "()Ljava/util/List;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40702a {

    @c("acceptButtonTitle")
    @k
    private final String acceptButtonTitle;

    @c("bannerText")
    @k
    private final AttributedText bannerText;

    @c("cancelButtonTitle")
    @k
    private final String cancelButtonTitle;

    @c("currencySymbol")
    @k
    private final String currencySymbol;

    @c("discount")
    private final long discount;

    @c("discountTooBigHint")
    @l
    private final String discountTooBigHint;

    @c("discountTooSmallHint")
    @l
    private final String discountTooSmallHint;

    @c("inputTitle")
    @k
    private final String inputTitle;

    @c("maxDiscount")
    private final long maxDiscount;

    @c("minDiscount")
    private final long minDiscount;

    @c("sliderStep")
    private final long sliderStep;

    @c("title")
    @k
    private final String title;

    @c("toastText")
    @l
    private final String toastText;

    @c("trustFactors")
    @k
    private final List<C40703b> trustFactors;

    public C40702a(@k String str, @k AttributedText attributedText, @k String str2, @k String str3, long j12, @l String str4, @l String str5, @k String str6, long j13, long j14, long j15, @k String str7, @l String str8, @k List<C40703b> list) {
        this.acceptButtonTitle = str;
        this.bannerText = attributedText;
        this.cancelButtonTitle = str2;
        this.currencySymbol = str3;
        this.discount = j12;
        this.discountTooBigHint = str4;
        this.discountTooSmallHint = str5;
        this.inputTitle = str6;
        this.maxDiscount = j13;
        this.minDiscount = j14;
        this.sliderStep = j15;
        this.title = str7;
        this.toastText = str8;
        this.trustFactors = list;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getAcceptButtonTitle() {
        return this.acceptButtonTitle;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getBannerText() {
        return this.bannerText;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getCancelButtonTitle() {
        return this.cancelButtonTitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* renamed from: e, reason: from getter */
    public final long getDiscount() {
        return this.discount;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getDiscountTooBigHint() {
        return this.discountTooBigHint;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getDiscountTooSmallHint() {
        return this.discountTooSmallHint;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getInputTitle() {
        return this.inputTitle;
    }

    /* renamed from: i, reason: from getter */
    public final long getMaxDiscount() {
        return this.maxDiscount;
    }

    /* renamed from: j, reason: from getter */
    public final long getMinDiscount() {
        return this.minDiscount;
    }

    /* renamed from: k, reason: from getter */
    public final long getSliderStep() {
        return this.sliderStep;
    }

    @k
    /* renamed from: l, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final String getToastText() {
        return this.toastText;
    }

    @k
    public final List<C40703b> n() {
        return this.trustFactors;
    }
}
