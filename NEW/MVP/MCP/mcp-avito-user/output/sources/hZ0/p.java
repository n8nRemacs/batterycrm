package hz0;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import kotlin.Metadata;

/* compiled from: Api2StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lhz0/p;", "", "", "id", "Lhz0/q;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "version", "<init>", "(Ljava/lang/Long;Lhz0/q;J)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Lhz0/q;", "b", "()Lhz0/q;", "J", "c", "()J", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p {

    @com.google.gson.annotations.c("id")
    @Y61.l
    private final Long id;

    @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @Y61.l
    private final q parameters;

    @com.google.gson.annotations.c("version")
    private final long version;

    public p(@Y61.l Long l12, @Y61.l q qVar, long j12) {
        this.id = l12;
        this.parameters = qVar;
        this.version = j12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final q getParameters() {
        return this.parameters;
    }

    /* renamed from: c, reason: from getter */
    public final long getVersion() {
        return this.version;
    }
}
