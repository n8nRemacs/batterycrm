package j91;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: JsonRpcError.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lj91/a;", "", "", "code", "", "message", "<init>", "(ILjava/lang/String;)V", "I", "a", "()I", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j91.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C42223a {

    @com.google.gson.annotations.c("code")
    private final int code;

    @com.google.gson.annotations.c("message")
    @l
    private final String message;

    public C42223a(int i12, @l String str) {
        this.code = i12;
        this.message = str;
    }

    /* renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsonRpcError(code=");
        sb2.append(this.code);
        sb2.append(", message=");
        return C22026a.c(sb2, this.message, ')');
    }
}
