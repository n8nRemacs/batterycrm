package CE;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Api21FeesFeesMethodsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0006\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR-\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"LCE/i;", "", "", "id", "", "", "LX41/o;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "version", "<init>", "(JLjava/util/Map;J)V", "J", "a", "()J", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "c", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i {

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final Map<String, Object> parameters;

    @com.google.gson.annotations.c("version")
    private final long version;

    public i(long j12, @l Map<String, Object> map, long j13) {
        this.id = j12;
        this.parameters = map;
        this.version = j13;
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @l
    public final Map<String, Object> b() {
        return this.parameters;
    }

    /* renamed from: c, reason: from getter */
    public final long getVersion() {
        return this.version;
    }
}
