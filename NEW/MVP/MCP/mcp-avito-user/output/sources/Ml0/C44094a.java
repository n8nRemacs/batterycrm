package ml0;

import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: EstimateV4Request.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\f0\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\f\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b&\u0010%R-\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b'\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b(\u0010\u001f¨\u0006)"}, d2 = {"Lml0/a;", "", "", "categoryId", "", "hasCnc", "hasDbs", "hasDelivery", "hasDeliveryPvz", "", "locationJwt", "", "LX41/o;", "params", "price", "pricePenny", "slots", DeliverySubsidiesSlotKt.SUBSIDY_ID, "<init>", "(JLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;)V", "J", "getCategoryId", "()J", "Ljava/lang/Boolean;", "getHasCnc", "()Ljava/lang/Boolean;", "getHasDbs", "getHasDelivery", "getHasDeliveryPvz", "Ljava/lang/String;", "getLocationJwt", "()Ljava/lang/String;", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "Ljava/lang/Long;", "getPrice", "()Ljava/lang/Long;", "getPricePenny", "getSlots", "getSubsidyId", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ml0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44094a {

    @com.google.gson.annotations.c("categoryId")
    private final long categoryId;

    @com.google.gson.annotations.c("hasCnc")
    @Y61.l
    private final Boolean hasCnc;

    @com.google.gson.annotations.c("hasDbs")
    @Y61.l
    private final Boolean hasDbs;

    @com.google.gson.annotations.c("hasDelivery")
    @Y61.l
    private final Boolean hasDelivery;

    @com.google.gson.annotations.c("hasDeliveryPvz")
    @Y61.l
    private final Boolean hasDeliveryPvz;

    @com.google.gson.annotations.c("locationJwt")
    @Y61.k
    private final String locationJwt;

    @com.google.gson.annotations.c("params")
    @Y61.k
    private final Map<String, Object> params;

    @com.google.gson.annotations.c("price")
    @Y61.l
    private final Long price;

    @com.google.gson.annotations.c("pricePenny")
    @Y61.l
    private final Long pricePenny;

    @com.google.gson.annotations.c("slots")
    @Y61.l
    private final Map<String, Object> slots;

    @com.google.gson.annotations.c(DeliverySubsidiesSlotKt.SUBSIDY_ID)
    @Y61.l
    private final String subsidyId;

    public C44094a(long j12, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l Boolean bool3, @Y61.l Boolean bool4, @Y61.k String str, @Y61.k Map<String, Object> map, @Y61.l Long l12, @Y61.l Long l13, @Y61.l Map<String, Object> map2, @Y61.l String str2) {
        this.categoryId = j12;
        this.hasCnc = bool;
        this.hasDbs = bool2;
        this.hasDelivery = bool3;
        this.hasDeliveryPvz = bool4;
        this.locationJwt = str;
        this.params = map;
        this.price = l12;
        this.pricePenny = l13;
        this.slots = map2;
        this.subsidyId = str2;
    }
}
