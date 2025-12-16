package hz0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lhz0/e;", "", "", "id", "", "Lhz0/b;", "orders", "Lhz0/f;", "pageInfo", "title", "<init>", "(Ljava/lang/String;Ljava/util/List;Lhz0/f;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lhz0/f;", "c", "()Lhz0/f;", "d", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    @com.google.gson.annotations.c("id")
    @Y61.l
    private final String id;

    @com.google.gson.annotations.c("orders")
    @Y61.l
    private final List<C41198b> orders;

    @com.google.gson.annotations.c("pageInfo")
    @Y61.l
    private final f pageInfo;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    public e(@Y61.l String str, @Y61.l List<C41198b> list, @Y61.l f fVar, @Y61.l String str2) {
        this.id = str;
        this.orders = list;
        this.pageInfo = fVar;
        this.title = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    public final List<C41198b> b() {
        return this.orders;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final f getPageInfo() {
        return this.pageInfo;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
