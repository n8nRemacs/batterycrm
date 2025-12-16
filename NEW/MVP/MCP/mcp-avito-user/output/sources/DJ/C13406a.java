package Dj;

import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2CartQuantityGetResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LDj/a;", "", "", "", "cartCategories", "", "quantity", "<init>", "(Ljava/util/List;J)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "J", "b", "()J", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13406a {

    @c("cartCategories")
    @l
    private final List<String> cartCategories;

    @c("quantity")
    private final long quantity;

    public C13406a(@l List<String> list, long j12) {
        this.cartCategories = list;
        this.quantity = j12;
    }

    @l
    public final List<String> a() {
        return this.cartCategories;
    }

    /* renamed from: b, reason: from getter */
    public final long getQuantity() {
        return this.quantity;
    }
}
