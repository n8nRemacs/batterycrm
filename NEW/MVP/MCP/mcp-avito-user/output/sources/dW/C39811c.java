package dw;

import Y61.l;
import kotlin.Metadata;

/* compiled from: Api2LogisticsSellerTariffUpdatePostRequest.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ldw/c;", "", "", "customTariffId", "locationID", "maxDeliveryDays", "minDeliveryDays", "price", "", "termsType", "<init>", "(Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/Long;", "getCustomTariffId", "()Ljava/lang/Long;", "J", "getLocationID", "()J", "getMaxDeliveryDays", "getMinDeliveryDays", "getPrice", "Ljava/lang/String;", "getTermsType", "()Ljava/lang/String;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dw.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39811c {

    @com.google.gson.annotations.c("customTariffId")
    @l
    private final Long customTariffId;

    @com.google.gson.annotations.c("locationID")
    private final long locationID;

    @com.google.gson.annotations.c("maxDeliveryDays")
    @l
    private final Long maxDeliveryDays;

    @com.google.gson.annotations.c("minDeliveryDays")
    @l
    private final Long minDeliveryDays;

    @com.google.gson.annotations.c("price")
    @l
    private final Long price;

    @com.google.gson.annotations.c("termsType")
    @l
    private final String termsType;

    public C39811c(@l Long l12, long j12, @l Long l13, @l Long l14, @l Long l15, @l String str) {
        this.customTariffId = l12;
        this.locationID = j12;
        this.maxDeliveryDays = l13;
        this.minDeliveryDays = l14;
        this.price = l15;
        this.termsType = str;
    }
}
