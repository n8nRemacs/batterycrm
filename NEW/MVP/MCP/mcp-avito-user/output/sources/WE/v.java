package We;

import kotlin.Metadata;

/* compiled from: GetMessengerByItemIdForApiv3Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b!\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\"\u0010\u0016¨\u0006#"}, d2 = {"LWe/v;", "", "LWe/w;", "analyticsInfo", "", "buttonLabel", "", "contactsCount", "description", "discountAmount", "id", "oldPrice", "price", "pricePerContact", "title", "<init>", "(LWe/w;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LWe/w;", "a", "()LWe/w;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "J", "c", "()J", "d", "e", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "g", "h", "i", "j", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class v {

    @com.google.gson.annotations.c("analyticsInfo")
    @Y61.l
    private final w analyticsInfo;

    @com.google.gson.annotations.c("buttonLabel")
    @Y61.l
    private final String buttonLabel;

    @com.google.gson.annotations.c("contactsCount")
    private final long contactsCount;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final String description;

    @com.google.gson.annotations.c("discountAmount")
    @Y61.l
    private final String discountAmount;

    @com.google.gson.annotations.c("id")
    @Y61.l
    private final Long id;

    @com.google.gson.annotations.c("oldPrice")
    @Y61.l
    private final String oldPrice;

    @com.google.gson.annotations.c("price")
    @Y61.k
    private final String price;

    @com.google.gson.annotations.c("pricePerContact")
    @Y61.l
    private final String pricePerContact;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public v(@Y61.l w wVar, @Y61.l String str, long j12, @Y61.l String str2, @Y61.l String str3, @Y61.l Long l12, @Y61.l String str4, @Y61.k String str5, @Y61.l String str6, @Y61.k String str7) {
        this.analyticsInfo = wVar;
        this.buttonLabel = str;
        this.contactsCount = j12;
        this.description = str2;
        this.discountAmount = str3;
        this.id = l12;
        this.oldPrice = str4;
        this.price = str5;
        this.pricePerContact = str6;
        this.title = str7;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final w getAnalyticsInfo() {
        return this.analyticsInfo;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    /* renamed from: c, reason: from getter */
    public final long getContactsCount() {
        return this.contactsCount;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getDiscountAmount() {
        return this.discountAmount;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getOldPrice() {
        return this.oldPrice;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final String getPricePerContact() {
        return this.pricePerContact;
    }

    @Y61.k
    /* renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
