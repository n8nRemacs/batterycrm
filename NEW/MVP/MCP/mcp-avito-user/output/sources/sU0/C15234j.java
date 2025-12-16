package Su0;

import kotlin.Metadata;

/* compiled from: OrdersApi2Response.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LSu0/j;", "", "", "price", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Su0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15234j {

    @com.google.gson.annotations.c("price")
    @Y61.l
    private final String price;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    public C15234j(@Y61.l String str, @Y61.l String str2) {
        this.price = str;
        this.title = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
