package Kz0;

import kotlin.Metadata;

/* compiled from: Api3StrSellerOrdersCalendarPostResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LKz0/e;", "", "", "date", "LKz0/f;", "footer", "id", "LKz0/h;", "price", "<init>", "(Ljava/lang/String;LKz0/f;Ljava/lang/String;LKz0/h;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LKz0/f;", "b", "()LKz0/f;", "c", "LKz0/h;", "d", "()LKz0/h;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    @com.google.gson.annotations.c("date")
    @Y61.k
    private final String date;

    @com.google.gson.annotations.c("footer")
    @Y61.k
    private final f footer;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("price")
    @Y61.k
    private final h price;

    public e(@Y61.k String str, @Y61.k f fVar, @Y61.k String str2, @Y61.k h hVar) {
        this.date = str;
        this.footer = fVar;
        this.id = str2;
        this.price = hVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final f getFooter() {
        return this.footer;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final h getPrice() {
        return this.price;
    }
}
