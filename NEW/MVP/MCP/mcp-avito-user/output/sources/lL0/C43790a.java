package ll0;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: EstimateEditV4Request.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0019\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R-\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b!\u0010\u0017R-\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b#\u0010\u0017¨\u0006$"}, d2 = {"Lll0/a;", "", "", "categoryId", "", "description", "itemId", "locationJwt", "", "LX41/o;", "params", "price", "pricePenny", "rawParams", "slots", "title", "<init>", "(JLjava/lang/String;JLjava/lang/String;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "J", "getCategoryId", "()J", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "getItemId", "getLocationJwt", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "Ljava/lang/Long;", "getPrice", "()Ljava/lang/Long;", "getPricePenny", "getRawParams", "getSlots", "getTitle", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ll0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C43790a {

    @com.google.gson.annotations.c("categoryId")
    private final long categoryId;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("itemId")
    private final long itemId;

    @com.google.gson.annotations.c("locationJwt")
    @k
    private final String locationJwt;

    @com.google.gson.annotations.c("params")
    @l
    private final Map<String, Object> params;

    @com.google.gson.annotations.c("price")
    @l
    private final Long price;

    @com.google.gson.annotations.c("pricePenny")
    @l
    private final Long pricePenny;

    @com.google.gson.annotations.c("rawParams")
    @l
    private final String rawParams;

    @com.google.gson.annotations.c("slots")
    @l
    private final Map<String, Object> slots;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public C43790a(long j12, @l String str, long j13, @k String str2, @l Map<String, Object> map, @l Long l12, @l Long l13, @l String str3, @l Map<String, Object> map2, @l String str4) {
        this.categoryId = j12;
        this.description = str;
        this.itemId = j13;
        this.locationJwt = str2;
        this.params = map;
        this.price = l12;
        this.pricePenny = l13;
        this.rawParams = str3;
        this.slots = map2;
        this.title = str4;
    }
}
