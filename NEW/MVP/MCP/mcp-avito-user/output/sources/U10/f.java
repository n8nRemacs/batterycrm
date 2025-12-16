package u10;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1MortgageCatalogCalculatorInitialValuesGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lu10/f;", "", "", "initial", "Lu10/d;", "max", "min", "", "title", "<init>", "(JLu10/d;Lu10/d;Ljava/lang/String;)V", "J", "a", "()J", "Lu10/d;", "b", "()Lu10/d;", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f {

    @com.google.gson.annotations.c("initial")
    private final long initial;

    @com.google.gson.annotations.c("max")
    @Y61.k
    private final C48762d max;

    @com.google.gson.annotations.c("min")
    @Y61.k
    private final C48762d min;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public f(long j12, @Y61.k C48762d c48762d, @Y61.k C48762d c48762d2, @Y61.k String str) {
        this.initial = j12;
        this.max = c48762d;
        this.min = c48762d2;
        this.title = str;
    }

    /* renamed from: a, reason: from getter */
    public final long getInitial() {
        return this.initial;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C48762d getMax() {
        return this.max;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final C48762d getMin() {
        return this.min;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
