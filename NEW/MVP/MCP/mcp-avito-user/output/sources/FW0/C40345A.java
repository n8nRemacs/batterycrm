package fW0;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsSpendings.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LfW0/A;", "", "LfW0/d;", "chart", "LfW0/E;", "tabs", "", "LfW0/t;", "groupings", "LfW0/j;", "expenses", "LfW0/n;", "expensesDescription", "<init>", "(LfW0/d;LfW0/E;Ljava/util/List;Ljava/util/List;LfW0/n;)V", "LfW0/d;", "getChart", "()LfW0/d;", "LfW0/E;", "getTabs", "()LfW0/E;", "Ljava/util/List;", "getGroupings", "()Ljava/util/List;", "getExpenses", "LfW0/n;", "getExpensesDescription", "()LfW0/n;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fW0.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40345A {

    @com.google.gson.annotations.c("chart")
    @Y61.l
    private final C40351d chart;

    @com.google.gson.annotations.c("expenses")
    @Y61.k
    private final List<j> expenses;

    @com.google.gson.annotations.c("expensesDescription")
    @Y61.l
    private final n expensesDescription;

    @com.google.gson.annotations.c("groupings")
    @Y61.k
    private final List<t> groupings;

    @com.google.gson.annotations.c("tabs")
    @Y61.k
    private final E tabs;

    public C40345A(@Y61.l C40351d c40351d, @Y61.k E e12, @Y61.k List<t> list, @Y61.k List<j> list2, @Y61.l n nVar) {
        this.chart = c40351d;
        this.tabs = e12;
        this.groupings = list;
        this.expenses = list2;
        this.expensesDescription = nVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40345A)) {
            return false;
        }
        C40345A c40345a = (C40345A) obj;
        return L.f(this.chart, c40345a.chart) && L.f(this.tabs, c40345a.tabs) && L.f(this.groupings, c40345a.groupings) && L.f(this.expenses, c40345a.expenses) && L.f(this.expensesDescription, c40345a.expensesDescription);
    }

    public final int hashCode() {
        C40351d c40351d = this.chart;
        int iE2 = H.e(H.e((this.tabs.hashCode() + ((c40351d == null ? 0 : c40351d.hashCode()) * 31)) * 31, 31, this.groupings), 31, this.expenses);
        n nVar = this.expensesDescription;
        return iE2 + (nVar != null ? nVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "StatsCommonSpendings(chart=" + this.chart + ", tabs=" + this.tabs + ", groupings=" + this.groupings + ", expenses=" + this.expenses + ", expensesDescription=" + this.expensesDescription + ')';
    }
}
