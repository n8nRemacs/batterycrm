package km;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2CampaignsSalesByIdAutosavePostRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkm/b;", "", "", "discount", "", "itemIds", "", "uuid", "<init>", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/Long;", "getDiscount", "()Ljava/lang/Long;", "Ljava/util/List;", "getItemIds", "()Ljava/util/List;", "Ljava/lang/String;", "getUuid", "()Ljava/lang/String;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: km.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42714b {

    @c("discount")
    @l
    private final Long discount;

    @c("itemIds")
    @k
    private final List<Long> itemIds;

    @c("uuid")
    @k
    private final String uuid;

    public C42714b(@l Long l12, @k List<Long> list, @k String str) {
        this.discount = l12;
        this.itemIds = list;
        this.uuid = str;
    }
}
