package j91;

import Y61.k;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: JsonRpcRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0006X\u0087D¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"Lj91/b;", "", "", "id", "", "method", "params", "<init>", "(JLjava/lang/String;Ljava/lang/Object;)V", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Object;", "getParams", "()Ljava/lang/Object;", "jsonrpc", "getJsonrpc", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b {

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("jsonrpc")
    @k
    private final String jsonrpc;

    @com.google.gson.annotations.c("method")
    @k
    private final String method;

    @com.google.gson.annotations.c("params")
    @k
    private final Object params;

    public b(long j12, @k String str, @k Object obj) {
        this.id = j12;
        this.method = str;
        this.params = obj;
        this.jsonrpc = "2.0";
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsonRpcRequest(id=");
        sb2.append(this.id);
        sb2.append(", method='");
        sb2.append(this.method);
        sb2.append("', params=");
        sb2.append(this.params);
        sb2.append(", jsonrpc='");
        return AK.c.s(sb2, this.jsonrpc, "')");
    }

    public /* synthetic */ b(long j12, String str, Object obj, int i12, C42822w c42822w) {
        this(j12, str, (i12 & 4) != 0 ? P0.c() : obj);
    }
}
