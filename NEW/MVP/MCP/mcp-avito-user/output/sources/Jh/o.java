package jh;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: BbipConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljh/o;", "", "Ljh/m;", "forecastBlock", "Ljh/C;", "totalBudgetBlock", "<init>", "(Ljh/m;Ljh/C;)V", "Ljh/m;", "a", "()Ljh/m;", "Ljh/C;", "b", "()Ljh/C;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o {

    @com.google.gson.annotations.c("forecastBlock")
    @Y61.k
    private final m forecastBlock;

    @com.google.gson.annotations.c("totalBudgetBlock")
    @Y61.k
    private final C42378C totalBudgetBlock;

    public o(@Y61.k m mVar, @Y61.k C42378C c42378c) {
        this.forecastBlock = mVar;
        this.totalBudgetBlock = c42378c;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final m getForecastBlock() {
        return this.forecastBlock;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C42378C getTotalBudgetBlock() {
        return this.totalBudgetBlock;
    }
}
