package j91;

import Y61.k;
import Y61.l;
import com.google.gson.i;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.MessengerResponse;

/* compiled from: JsonRpcResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\b8\u0006X\u0087D¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lj91/c;", "Lru/avito/messenger/api/entity/MessengerResponse;", "", "id", "Lcom/google/gson/i;", "result", "Lj91/a;", "error", "", "requestId", "rpcId", "<init>", "(JLcom/google/gson/i;Lj91/a;Ljava/lang/String;Ljava/lang/String;)V", "J", "b", "()Ljava/lang/Long;", "Lcom/google/gson/i;", "d", "()Lcom/google/gson/i;", "Lj91/a;", "a", "()Lj91/a;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "e", "jsonrpc", "getJsonrpc", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c implements MessengerResponse {

    @com.google.gson.annotations.c("error")
    @l
    private final C42223a error;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("jsonrpc")
    @k
    private final String jsonrpc = "2.0";

    @com.google.gson.annotations.c("requestId")
    @l
    private final String requestId;

    @com.google.gson.annotations.c("result")
    @k
    private final i result;

    @com.google.gson.annotations.c("rpcId")
    @l
    private final String rpcId;

    public c(long j12, @k i iVar, @l C42223a c42223a, @l String str, @l String str2) {
        this.id = j12;
        this.result = iVar;
        this.error = c42223a;
        this.requestId = str;
        this.rpcId = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C42223a getError() {
        return this.error;
    }

    @k
    public final Long b() {
        return Long.valueOf(this.id);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final i getResult() {
        return this.result;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getRpcId() {
        return this.rpcId;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsonRpcResponse(id=");
        sb2.append(this.id);
        sb2.append(", result=");
        sb2.append(this.result);
        sb2.append(", error=");
        sb2.append(this.error);
        sb2.append(", requestId=");
        sb2.append(this.requestId);
        sb2.append(", rpcId=");
        sb2.append(this.rpcId);
        sb2.append(", jsonrpc='");
        return AK.c.s(sb2, this.jsonrpc, "')");
    }
}
