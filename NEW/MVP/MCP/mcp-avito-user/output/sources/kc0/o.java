package KC0;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoResult.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LKC0/o;", "", "LKC0/q;", "resultBanner", "LKC0/a;", "ordersDone", "totalIncome", "<init>", "(LKC0/q;LKC0/a;LKC0/a;)V", "LKC0/q;", "getResultBanner", "()LKC0/q;", "LKC0/a;", "getOrdersDone", "()LKC0/a;", "getTotalIncome", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class o {

    @com.google.gson.annotations.c("ordersDone")
    @Y61.k
    private final a ordersDone;

    @com.google.gson.annotations.c("resultBanner")
    @Y61.l
    private final q resultBanner;

    @com.google.gson.annotations.c("totalIncome")
    @Y61.k
    private final a totalIncome;

    public o(@Y61.l q qVar, @Y61.k a aVar, @Y61.k a aVar2) {
        this.resultBanner = qVar;
        this.ordersDone = aVar;
        this.totalIncome = aVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.resultBanner, oVar.resultBanner) && L.f(this.ordersDone, oVar.ordersDone) && L.f(this.totalIncome, oVar.totalIncome);
    }

    public final int hashCode() {
        q qVar = this.resultBanner;
        return this.totalIncome.hashCode() + ((this.ordersDone.hashCode() + ((qVar == null ? 0 : qVar.hashCode()) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "OverviewBlock(resultBanner=" + this.resultBanner + ", ordersDone=" + this.ordersDone + ", totalIncome=" + this.totalIncome + ')';
    }
}
