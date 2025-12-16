package fW0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsSpendings.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\n\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001b"}, d2 = {"LfW0/e;", "", "Ljava/util/Date;", "date", "", "dateTitle", "", "expenses", "expensesFormatted", "", "isWeekend", "xLabel", "<init>", "(Ljava/util/Date;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "Ljava/lang/String;", "getDateTitle", "()Ljava/lang/String;", "I", "getExpenses", "()I", "getExpensesFormatted", "Z", "()Z", "getXLabel", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fW0.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40352e {

    @com.google.gson.annotations.c("date")
    @Y61.k
    private final Date date;

    @com.google.gson.annotations.c("dateTitle")
    @Y61.k
    private final String dateTitle;

    @com.google.gson.annotations.c("expenses")
    private final int expenses;

    @com.google.gson.annotations.c("expensesFormatted")
    @Y61.k
    private final String expensesFormatted;

    @com.google.gson.annotations.c("isWeekend")
    private final boolean isWeekend;

    @com.google.gson.annotations.c("xLabel")
    @Y61.l
    private final String xLabel;

    public C40352e(@Y61.k Date date, @Y61.k String str, int i12, @Y61.k String str2, boolean z12, @Y61.l String str3) {
        this.date = date;
        this.dateTitle = str;
        this.expenses = i12;
        this.expensesFormatted = str2;
        this.isWeekend = z12;
        this.xLabel = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40352e)) {
            return false;
        }
        C40352e c40352e = (C40352e) obj;
        return L.f(this.date, c40352e.date) && L.f(this.dateTitle, c40352e.dateTitle) && this.expenses == c40352e.expenses && L.f(this.expensesFormatted, c40352e.expensesFormatted) && this.isWeekend == c40352e.isWeekend && L.f(this.xLabel, c40352e.xLabel);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(H.d(androidx.appcompat.app.r.e(this.expenses, H.d(this.date.hashCode() * 31, 31, this.dateTitle), 31), 31, this.expensesFormatted), 31, this.isWeekend);
        String str = this.xLabel;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChartSpendingItem(date=");
        sb2.append(this.date);
        sb2.append(", dateTitle=");
        sb2.append(this.dateTitle);
        sb2.append(", expenses=");
        sb2.append(this.expenses);
        sb2.append(", expensesFormatted=");
        sb2.append(this.expensesFormatted);
        sb2.append(", isWeekend=");
        sb2.append(this.isWeekend);
        sb2.append(", xLabel=");
        return C22026a.c(sb2, this.xLabel, ')');
    }
}
