package u10;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1MortgageCatalogCalculatorInitialValuesGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lu10/b;", "", "Lu10/f;", "cost", "downPayment", "landCost", "", "tabTitle", "Lu10/e;", "term", "<init>", "(Lu10/f;Lu10/f;Lu10/f;Ljava/lang/String;Lu10/e;)V", "Lu10/f;", "a", "()Lu10/f;", "b", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lu10/e;", "e", "()Lu10/e;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u10.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48760b {

    @com.google.gson.annotations.c("cost")
    @Y61.k
    private final f cost;

    @com.google.gson.annotations.c("downPayment")
    @Y61.k
    private final f downPayment;

    @com.google.gson.annotations.c("landCost")
    @l
    private final f landCost;

    @com.google.gson.annotations.c("tabTitle")
    @Y61.k
    private final String tabTitle;

    @com.google.gson.annotations.c("term")
    @Y61.k
    private final C48763e term;

    public C48760b(@Y61.k f fVar, @Y61.k f fVar2, @l f fVar3, @Y61.k String str, @Y61.k C48763e c48763e) {
        this.cost = fVar;
        this.downPayment = fVar2;
        this.landCost = fVar3;
        this.tabTitle = str;
        this.term = c48763e;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final f getCost() {
        return this.cost;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final f getDownPayment() {
        return this.downPayment;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final f getLandCost() {
        return this.landCost;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTabTitle() {
        return this.tabTitle;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final C48763e getTerm() {
        return this.term;
    }
}
