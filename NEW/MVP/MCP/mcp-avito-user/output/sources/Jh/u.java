package jh;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BbipPrivateConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljh/u;", "", "", "duration", "", "Ljh/s;", "budgets", "<init>", "(ILjava/util/List;)V", "I", "b", "()I", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class u {

    @com.google.gson.annotations.c("budgets")
    @Y61.k
    private final List<s> budgets;

    @com.google.gson.annotations.c("duration")
    private final int duration;

    public u(int i12, @Y61.k List<s> list) {
        this.duration = i12;
        this.budgets = list;
    }

    @Y61.k
    public final List<s> a() {
        return this.budgets;
    }

    /* renamed from: b, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }
}
