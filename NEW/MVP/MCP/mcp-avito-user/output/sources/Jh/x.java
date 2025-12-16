package jh;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BbipPrivateConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ljh/x;", "", "", "title", "forecastSubtitle", "selectButtonText", "", "Ljh/u;", "budgetsByDayList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "c", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class x {

    @com.google.gson.annotations.c("budgetsByDay")
    @Y61.k
    private final List<u> budgetsByDayList;

    @com.google.gson.annotations.c("forecastSubtitle")
    @Y61.k
    private final String forecastSubtitle;

    @com.google.gson.annotations.c("selectButtonText")
    @Y61.k
    private final String selectButtonText;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public x(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k List<u> list) {
        this.title = str;
        this.forecastSubtitle = str2;
        this.selectButtonText = str3;
        this.budgetsByDayList = list;
    }

    @Y61.k
    public final List<u> a() {
        return this.budgetsByDayList;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getForecastSubtitle() {
        return this.forecastSubtitle;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getSelectButtonText() {
        return this.selectButtonText;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
