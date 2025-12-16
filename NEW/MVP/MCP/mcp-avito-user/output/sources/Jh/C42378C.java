package jh;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: BbipConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Ljh/C;", "", "", "title", "totalPriceFormatted", "totalBudgetFormatted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "b", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jh.C, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42378C {

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("totalBudgetFormatted")
    @Y61.l
    private final String totalBudgetFormatted;

    @com.google.gson.annotations.c("totalPriceFormatted")
    @Y61.l
    private final String totalPriceFormatted;

    public C42378C(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.title = str;
        this.totalPriceFormatted = str2;
        this.totalBudgetFormatted = str3;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getTotalBudgetFormatted() {
        return this.totalBudgetFormatted;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getTotalPriceFormatted() {
        return this.totalPriceFormatted;
    }
}
