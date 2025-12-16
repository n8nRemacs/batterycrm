package jh;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: BbipConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001b"}, d2 = {"Ljh/e;", "", "", "priceFormatted", "budgetFormatted", "", "discountPct", "price", "", "recommended", "budget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IZLjava/lang/Integer;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "I", "d", "()I", "Z", "f", "()Z", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

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

    public e(@Y61.k String str, @Y61.l String str2, @Y61.l Integer num, int i12, boolean z12, @Y61.l Integer num2) {
        this.priceFormatted = str;
        this.budgetFormatted = str2;
        this.discountPct = num;
        this.price = i12;
        this.recommended = z12;
        this.budget = num2;
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
}
