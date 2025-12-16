package cw;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2LogisticsSellerTariffGetResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcw/f;", "", "", "customTariffId", SearchParamsConverterKt.LOCATION_ID, "maxDeliveryDays", "minDeliveryDays", "", "name", "price", "", "terms", "termsType", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "b", "c", "d", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "Ljava/util/List;", "g", "()Ljava/util/List;", "h", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f {

    @com.google.gson.annotations.c("customTariffId")
    @l
    private final Long customTariffId;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final Long locationId;

    @com.google.gson.annotations.c("maxDeliveryDays")
    @l
    private final Long maxDeliveryDays;

    @com.google.gson.annotations.c("minDeliveryDays")
    @l
    private final Long minDeliveryDays;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("price")
    @l
    private final Long price;

    @com.google.gson.annotations.c("terms")
    @l
    private final List<f> terms;

    @com.google.gson.annotations.c("termsType")
    @l
    private final String termsType;

    public f(@l Long l12, @l Long l13, @l Long l14, @l Long l15, @k String str, @l Long l16, @l List<f> list, @l String str2) {
        this.customTariffId = l12;
        this.locationId = l13;
        this.maxDeliveryDays = l14;
        this.minDeliveryDays = l15;
        this.name = str;
        this.price = l16;
        this.terms = list;
        this.termsType = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Long getCustomTariffId() {
        return this.customTariffId;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getLocationId() {
        return this.locationId;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getMaxDeliveryDays() {
        return this.maxDeliveryDays;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getMinDeliveryDays() {
        return this.minDeliveryDays;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Long getPrice() {
        return this.price;
    }

    @l
    public final List<f> g() {
        return this.terms;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getTermsType() {
        return this.termsType;
    }
}
