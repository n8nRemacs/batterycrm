package pm;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleRequestBlock.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpm/b;", "", "", "uuid", "", "discount", "", "", "itemIds", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pm.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47111b {

    @com.google.gson.annotations.c("discount")
    @l
    private final Integer discount;

    @com.google.gson.annotations.c("itemIds")
    @l
    private final List<Long> itemIds;

    @com.google.gson.annotations.c("uuid")
    @k
    private final String uuid;

    public C47111b(@k String str, @l Integer num, @l List<Long> list) {
        this.uuid = str;
        this.discount = num;
        this.itemIds = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Integer getDiscount() {
        return this.discount;
    }

    @l
    public final List<Long> b() {
        return this.itemIds;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47111b)) {
            return false;
        }
        C47111b c47111b = (C47111b) obj;
        return L.f(this.uuid, c47111b.uuid) && L.f(this.discount, c47111b.discount) && L.f(this.itemIds, c47111b.itemIds);
    }

    public final int hashCode() {
        int iHashCode = this.uuid.hashCode() * 31;
        Integer num = this.discount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Long> list = this.itemIds;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleRequestBlock(uuid=");
        sb2.append(this.uuid);
        sb2.append(", discount=");
        sb2.append(this.discount);
        sb2.append(", itemIds=");
        return H.p(sb2, this.itemIds, ')');
    }
}
