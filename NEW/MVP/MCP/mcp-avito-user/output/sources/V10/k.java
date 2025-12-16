package v10;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1MortgageCatalogCalculatorOffersGetResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lv10/k;", "", "", "Lv10/m;", "conditions", "Lv10/n;", "discounts", "Lv10/e;", "offer", "<init>", "(Ljava/util/List;Lv10/n;Lv10/e;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lv10/n;", "b", "()Lv10/n;", "Lv10/e;", "c", "()Lv10/e;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k {

    @com.google.gson.annotations.c("conditions")
    @Y61.k
    private final List<m> conditions;

    @com.google.gson.annotations.c("discounts")
    @Y61.l
    private final n discounts;

    @com.google.gson.annotations.c("offer")
    @Y61.k
    private final e offer;

    public k(@Y61.k List<m> list, @Y61.l n nVar, @Y61.k e eVar) {
        this.conditions = list;
        this.discounts = nVar;
        this.offer = eVar;
    }

    @Y61.k
    public final List<m> a() {
        return this.conditions;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final n getDiscounts() {
        return this.discounts;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final e getOffer() {
        return this.offer;
    }
}
