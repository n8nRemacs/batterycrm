package u10;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1MortgageCatalogCalculatorInitialValuesGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lu10/c;", "", "Lu10/f;", "downPayment", "monthlyPayment", "", "tabTitle", "Lu10/e;", "term", "<init>", "(Lu10/f;Lu10/f;Ljava/lang/String;Lu10/e;)V", "Lu10/f;", "a", "()Lu10/f;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lu10/e;", "d", "()Lu10/e;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u10.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48761c {

    @com.google.gson.annotations.c("downPayment")
    @Y61.k
    private final f downPayment;

    @com.google.gson.annotations.c("monthlyPayment")
    @Y61.k
    private final f monthlyPayment;

    @com.google.gson.annotations.c("tabTitle")
    @Y61.k
    private final String tabTitle;

    @com.google.gson.annotations.c("term")
    @Y61.k
    private final C48763e term;

    public C48761c(@Y61.k f fVar, @Y61.k f fVar2, @Y61.k String str, @Y61.k C48763e c48763e) {
        this.downPayment = fVar;
        this.monthlyPayment = fVar2;
        this.tabTitle = str;
        this.term = c48763e;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final f getDownPayment() {
        return this.downPayment;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final f getMonthlyPayment() {
        return this.monthlyPayment;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTabTitle() {
        return this.tabTitle;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final C48763e getTerm() {
        return this.term;
    }
}
