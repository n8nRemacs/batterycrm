package jh;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: BbipConfiguratorV3Result.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Ljh/h;", "", "", "priceFormatted", "budgetFormatted", "", "discountPct", "price", "", "recommended", "budget", "unavailableBudgetWarning", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IZLjava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "I", "d", "()I", "Z", "f", "()Z", "a", "g", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    @com.google.gson.annotations.c("budget")
    @Y61.l
    private final Integer budget;

    @com.google.gson.annotations.c("budgetFormatted")
    @Y61.l
    private final String budgetFormatted;

    @com.google.gson.annotations.c("discountPct")
    @Y61.l
    private final Integer discountPct;

    @com.google.gson.annotations.c("price")
    private final int price;

    @com.google.gson.annotations.c("priceFormatted")
    @Y61.k
    private final String priceFormatted;

    @com.google.gson.annotations.c("recommended")
    private final boolean recommended;

    @com.google.gson.annotations.c("unavailableBudgetWarning")
    @Y61.l
    private final String unavailableBudgetWarning;

    public h(@Y61.k String str, @Y61.l String str2, @Y61.l Integer num, int i12, boolean z12, @Y61.l Integer num2, @Y61.l String str3) {
        this.priceFormatted = str;
        this.budgetFormatted = str2;
        this.discountPct = num;
        this.price = i12;
        this.recommended = z12;
        this.budget = num2;
        this.unavailableBudgetWarning = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Integer getBudget() {
        return this.budget;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getBudgetFormatted() {
        return this.budgetFormatted;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Integer getDiscountPct() {
        return this.discountPct;
    }

    /* renamed from: d, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getPriceFormatted() {
        return this.priceFormatted;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getRecommended() {
        return this.recommended;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getUnavailableBudgetWarning() {
        return this.unavailableBudgetWarning;
    }
}
