package vh;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api4BblConfigureResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lvh/l;", "", "Lvh/k;", "button", "", "progress", "<init>", "(Lvh/k;Ljava/lang/Double;)V", "Lvh/k;", "a", "()Lvh/k;", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l {

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final k button;

    @com.google.gson.annotations.c("progress")
    @Y61.l
    private final Double progress;

    public l(@Y61.l k kVar, @Y61.l Double d12) {
        this.button = kVar;
        this.progress = d12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final k getButton() {
        return this.button;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Double getProgress() {
        return this.progress;
    }
}
