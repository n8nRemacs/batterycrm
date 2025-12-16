package ex;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2NdTrxLotsSearchGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lex/a;", "", "", "developmentsCount", "", "Lex/c;", "lots", "lotsCount", "lotsMax", "<init>", "(JLjava/util/List;JJ)V", "J", "a", "()J", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "getLotsMax", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ex.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C40174a {

    @com.google.gson.annotations.c("developmentsCount")
    private final long developmentsCount;

    @com.google.gson.annotations.c("lots")
    @Y61.k
    private final List<C40176c> lots;

    @com.google.gson.annotations.c("lotsCount")
    private final long lotsCount;

    @com.google.gson.annotations.c("lotsMax")
    private final long lotsMax;

    public C40174a(long j12, @Y61.k List<C40176c> list, long j13, long j14) {
        this.developmentsCount = j12;
        this.lots = list;
        this.lotsCount = j13;
        this.lotsMax = j14;
    }

    /* renamed from: a, reason: from getter */
    public final long getDevelopmentsCount() {
        return this.developmentsCount;
    }

    @Y61.k
    public final List<C40176c> b() {
        return this.lots;
    }

    /* renamed from: c, reason: from getter */
    public final long getLotsCount() {
        return this.lotsCount;
    }
}
