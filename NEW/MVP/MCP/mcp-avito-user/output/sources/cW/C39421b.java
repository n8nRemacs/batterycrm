package cw;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: Api2LogisticsSellerTariffGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcw/b;", "", "", "description", "", "id", "maxPrice", "minPrice", "name", "price", "termsType", "<init>", "(Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;JLjava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "J", "b", "()J", "Ljava/lang/Long;", "getMaxPrice", "()Ljava/lang/Long;", "getMinPrice", "c", "d", "e", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cw.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39421b {

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("maxPrice")
    @l
    private final Long maxPrice;

    @com.google.gson.annotations.c("minPrice")
    @l
    private final Long minPrice;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("price")
    private final long price;

    @com.google.gson.annotations.c("termsType")
    @k
    private final String termsType;

    public C39421b(@k String str, long j12, @l Long l12, @l Long l13, @k String str2, long j13, @k String str3) {
        this.description = str;
        this.id = j12;
        this.maxPrice = l12;
        this.minPrice = l13;
        this.name = str2;
        this.price = j13;
        this.termsType = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: d, reason: from getter */
    public final long getPrice() {
        return this.price;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTermsType() {
        return this.termsType;
    }
}
