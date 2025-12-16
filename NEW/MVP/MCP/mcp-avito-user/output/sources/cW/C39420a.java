package cw;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2LogisticsSellerTariffGetResponse.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b&\u0010\"R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b*\u0010)R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b,\u0010-R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b.\u0010\u001c¨\u0006/"}, d2 = {"Lcw/a;", "", "", "createCustomTariffUrl", "", "Lcw/b;", "customTariffs", "Lcw/c;", "customTariffsCardOnboarding", "Lcom/avito/android/remote/model/text/AttributedText;", "footerInfo", "", "hasDeliveryDays", "headerInfo", "", "maxDeliveryDays", "maxPrice", "Lcw/f;", "terms", "Lcw/e;", "termsTypes", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcw/c;Lcom/avito/android/remote/model/text/AttributedText;ZLcom/avito/android/remote/model/text/AttributedText;JJLcw/f;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcw/c;", "c", "()Lcw/c;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Z", "e", "()Z", "f", "J", "g", "()J", "h", "Lcw/f;", "i", "()Lcw/f;", "j", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cw.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39420a {

    @com.google.gson.annotations.c("createCustomTariffUrl")
    @l
    private final String createCustomTariffUrl;

    @com.google.gson.annotations.c("customTariffs")
    @k
    private final List<C39421b> customTariffs;

    @com.google.gson.annotations.c("customTariffsCardOnboarding")
    @l
    private final C39422c customTariffsCardOnboarding;

    @com.google.gson.annotations.c("footerInfo")
    @l
    private final AttributedText footerInfo;

    @com.google.gson.annotations.c("hasDeliveryDays")
    private final boolean hasDeliveryDays;

    @com.google.gson.annotations.c("headerInfo")
    @l
    private final AttributedText headerInfo;

    @com.google.gson.annotations.c("maxDeliveryDays")
    private final long maxDeliveryDays;

    @com.google.gson.annotations.c("maxPrice")
    private final long maxPrice;

    @com.google.gson.annotations.c("terms")
    @k
    private final f terms;

    @com.google.gson.annotations.c("termsTypes")
    @k
    private final List<e> termsTypes;

    public C39420a(@l String str, @k List<C39421b> list, @l C39422c c39422c, @l AttributedText attributedText, boolean z12, @l AttributedText attributedText2, long j12, long j13, @k f fVar, @k List<e> list2) {
        this.createCustomTariffUrl = str;
        this.customTariffs = list;
        this.customTariffsCardOnboarding = c39422c;
        this.footerInfo = attributedText;
        this.hasDeliveryDays = z12;
        this.headerInfo = attributedText2;
        this.maxDeliveryDays = j12;
        this.maxPrice = j13;
        this.terms = fVar;
        this.termsTypes = list2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getCreateCustomTariffUrl() {
        return this.createCustomTariffUrl;
    }

    @k
    public final List<C39421b> b() {
        return this.customTariffs;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C39422c getCustomTariffsCardOnboarding() {
        return this.customTariffsCardOnboarding;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getFooterInfo() {
        return this.footerInfo;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getHasDeliveryDays() {
        return this.hasDeliveryDays;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AttributedText getHeaderInfo() {
        return this.headerInfo;
    }

    /* renamed from: g, reason: from getter */
    public final long getMaxDeliveryDays() {
        return this.maxDeliveryDays;
    }

    /* renamed from: h, reason: from getter */
    public final long getMaxPrice() {
        return this.maxPrice;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final f getTerms() {
        return this.terms;
    }

    @k
    public final List<e> j() {
        return this.termsTypes;
    }
}
