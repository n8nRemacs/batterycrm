package dx;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2NdTrxDevelopmentsSearchGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Ldx/a;", "", "", "Ldx/c;", "developments", "", "developmentsCount", "lotsCount", "<init>", "(Ljava/util/List;JJ)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "J", "b", "()J", "c", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C39813a {

    @com.google.gson.annotations.c("developments")
    @k
    private final List<C39815c> developments;

    @com.google.gson.annotations.c("developmentsCount")
    private final long developmentsCount;

    @com.google.gson.annotations.c("lotsCount")
    private final long lotsCount;

    public C39813a(@k List<C39815c> list, long j12, long j13) {
        this.developments = list;
        this.developmentsCount = j12;
        this.lotsCount = j13;
    }

    @k
    public final List<C39815c> a() {
        return this.developments;
    }

    /* renamed from: b, reason: from getter */
    public final long getDevelopmentsCount() {
        return this.developmentsCount;
    }

    /* renamed from: c, reason: from getter */
    public final long getLotsCount() {
        return this.lotsCount;
    }
}
