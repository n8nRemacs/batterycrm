package Sx0;

import com.avito.android.str_booking.network.generated.api.api_4_str_order_seller_by_order_id_get.ExecuteBlock;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LSx0/i;", "", "", "LSx0/j;", "blocks", "LSx0/t;", "eventBusUpdate", "Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/ExecuteBlock;", "execute", "<init>", "(Ljava/util/List;LSx0/t;Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/ExecuteBlock;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LSx0/t;", "b", "()LSx0/t;", "Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/ExecuteBlock;", "getExecute", "()Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/ExecuteBlock;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sx0.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15260i {

    @com.google.gson.annotations.c("blocks")
    @Y61.l
    private final List<C15261j> blocks;

    @com.google.gson.annotations.c("eventBusUpdate")
    @Y61.l
    private final t eventBusUpdate;

    @com.google.gson.annotations.c("execute")
    @Y61.l
    private final ExecuteBlock execute;

    public C15260i(@Y61.l List<C15261j> list, @Y61.l t tVar, @Y61.l ExecuteBlock executeBlock) {
        this.blocks = list;
        this.eventBusUpdate = tVar;
        this.execute = executeBlock;
    }

    @Y61.l
    public final List<C15261j> a() {
        return this.blocks;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final t getEventBusUpdate() {
        return this.eventBusUpdate;
    }
}
