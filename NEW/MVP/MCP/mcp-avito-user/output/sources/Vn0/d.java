package VN0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ProfilesCreateApiV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LVN0/d;", "", "LVN0/a;", "error", "LVN0/c;", "result", "<init>", "(LVN0/a;LVN0/c;)V", "LVN0/a;", "a", "()LVN0/a;", "LVN0/c;", "b", "()LVN0/c;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    @com.google.gson.annotations.c("error")
    @l
    private final a error;

    @com.google.gson.annotations.c("result")
    @l
    private final c result;

    public d(@l a aVar, @l c cVar) {
        this.error = aVar;
        this.result = cVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final a getError() {
        return this.error;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final c getResult() {
        return this.result;
    }
}
