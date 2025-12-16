package jh;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: BbipConfiguratorV3Result.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b#\u0010\u0016¨\u0006$"}, d2 = {"Ljh/j;", "", "LuZ/e;", "navBar", "", "title", "Ljh/p;", "forecastSection", "Ljh/g;", "budgetSection", "Ljh/l;", "durationsSection", "Ljh/c;", "actions", "checkoutContext", "<init>", "(LuZ/e;Ljava/lang/String;Ljh/p;Ljh/g;Ljh/l;Ljh/c;Ljava/lang/String;)V", "LuZ/e;", "f", "()LuZ/e;", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Ljh/p;", "e", "()Ljh/p;", "Ljh/g;", "b", "()Ljh/g;", "Ljh/l;", "d", "()Ljh/l;", "Ljh/c;", "a", "()Ljh/c;", "c", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {

    @com.google.gson.annotations.c("actions")
    @Y61.k
    private final C42382c actions;

    @com.google.gson.annotations.c("budgetSection")
    @Y61.k
    private final g budgetSection;

    @com.google.gson.annotations.c("checkoutContext")
    @Y61.k
    private final String checkoutContext;

    @com.google.gson.annotations.c("durationsSection")
    @Y61.k
    private final l durationsSection;

    @com.google.gson.annotations.c("forecastSection")
    @Y61.k
    private final p forecastSection;

    @com.google.gson.annotations.c("navBar")
    @Y61.l
    private final uZ.e navBar;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public j(@Y61.l uZ.e eVar, @Y61.k String str, @Y61.k p pVar, @Y61.k g gVar, @Y61.k l lVar, @Y61.k C42382c c42382c, @Y61.k String str2) {
        this.navBar = eVar;
        this.title = str;
        this.forecastSection = pVar;
        this.budgetSection = gVar;
        this.durationsSection = lVar;
        this.actions = c42382c;
        this.checkoutContext = str2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C42382c getActions() {
        return this.actions;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final g getBudgetSection() {
        return this.budgetSection;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getCheckoutContext() {
        return this.checkoutContext;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final l getDurationsSection() {
        return this.durationsSection;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final p getForecastSection() {
        return this.forecastSection;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final uZ.e getNavBar() {
        return this.navBar;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
