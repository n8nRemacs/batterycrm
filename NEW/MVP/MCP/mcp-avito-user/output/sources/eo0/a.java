package EO0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: GetWalletHistoryV2Response.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B<\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0019\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R-\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"LEO0/a;", "", "", "hasSensitiveData", "", "id", "", "", "LX41/o;", "params", "version", "<init>", "(Ljava/lang/Boolean;JLjava/util/Map;J)V", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "J", "b", "()J", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "d", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    @com.google.gson.annotations.c("hasSensitiveData")
    @l
    private final Boolean hasSensitiveData;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("params")
    @l
    private final Map<String, Object> params;

    @com.google.gson.annotations.c("version")
    private final long version;

    public a(@l Boolean bool, long j12, @l Map<String, Object> map, long j13) {
        this.hasSensitiveData = bool;
        this.id = j12;
        this.params = map;
        this.version = j13;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Boolean getHasSensitiveData() {
        return this.hasSensitiveData;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @l
    public final Map<String, Object> c() {
        return this.params;
    }

    /* renamed from: d, reason: from getter */
    public final long getVersion() {
        return this.version;
    }
}
