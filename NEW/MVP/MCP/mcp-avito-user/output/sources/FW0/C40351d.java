package fW0;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsSpendings.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LfW0/d;", "", "", "maxExpenses", "", "LfW0/e;", "items", "<init>", "(ILjava/util/List;)V", "I", "getMaxExpenses", "()I", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fW0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40351d {

    @com.google.gson.annotations.c("items")
    @Y61.k
    private final List<C40352e> items;

    @com.google.gson.annotations.c("maxExpenses")
    private final int maxExpenses;

    public C40351d(int i12, @Y61.k List<C40352e> list) {
        this.maxExpenses = i12;
        this.items = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40351d)) {
            return false;
        }
        C40351d c40351d = (C40351d) obj;
        return this.maxExpenses == c40351d.maxExpenses && L.f(this.items, c40351d.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.maxExpenses) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChartSpending(maxExpenses=");
        sb2.append(this.maxExpenses);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }
}
