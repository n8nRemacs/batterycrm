package jh;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: BbipConfiguratorV3Result.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Ljh/p;", "", "", "forecastTitle", "budgetTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p {

    @com.google.gson.annotations.c("budgetTitle")
    @Y61.k
    private final String budgetTitle;

    @com.google.gson.annotations.c("forecastTitle")
    @Y61.k
    private final String forecastTitle;

    public p(@Y61.k String str, @Y61.k String str2) {
        this.forecastTitle = str;
        this.budgetTitle = str2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getBudgetTitle() {
        return this.budgetTitle;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getForecastTitle() {
        return this.forecastTitle;
    }
}
