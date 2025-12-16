package jh;

import androidx.compose.runtime.internal.P;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BbipConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Ljh/i;", "", "", "title", "subTitle", "", "currentDuration", "Ljh/o;", "forecastSection", "Ljh/f;", "budgetSection", "Ljh/k;", "durationsSection", "Ljh/b;", "actions", "checkoutContext", "Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "bblFooter", "Ljh/d;", "bblUxFeedback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljh/o;Ljh/f;Ljh/k;Ljh/b;Ljava/lang/String;Lcom/avito/android/mnz_common/data/MnzFloatingFooter;Ljh/d;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "i", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "Ljh/o;", "h", "()Ljh/o;", "Ljh/f;", "d", "()Ljh/f;", "Ljh/k;", "g", "()Ljh/k;", "Ljh/b;", "a", "()Ljh/b;", "e", "Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "b", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "Ljh/d;", "c", "()Ljh/d;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {

    @com.google.gson.annotations.c("actions")
    @Y61.k
    private final C42381b actions;

    @com.google.gson.annotations.c("bblFooter")
    @Y61.l
    private final MnzFloatingFooter bblFooter;

    @com.google.gson.annotations.c("uxFeedback")
    @Y61.l
    private final C42383d bblUxFeedback;

    @com.google.gson.annotations.c("budgetSection")
    @Y61.k
    private final f budgetSection;

    @com.google.gson.annotations.c("checkoutContext")
    @Y61.k
    private final String checkoutContext;

    @com.google.gson.annotations.c("currentDuration")
    @Y61.l
    private final Integer currentDuration;

    @com.google.gson.annotations.c("durationsSection")
    @Y61.l
    private final k durationsSection;

    @com.google.gson.annotations.c("forecastSection")
    @Y61.k
    private final o forecastSection;

    @com.google.gson.annotations.c("subTitle")
    @Y61.l
    private final String subTitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public i(@Y61.k String str, @Y61.l String str2, @Y61.l Integer num, @Y61.k o oVar, @Y61.k f fVar, @Y61.l k kVar, @Y61.k C42381b c42381b, @Y61.k String str3, @Y61.l MnzFloatingFooter mnzFloatingFooter, @Y61.l C42383d c42383d) {
        this.title = str;
        this.subTitle = str2;
        this.currentDuration = num;
        this.forecastSection = oVar;
        this.budgetSection = fVar;
        this.durationsSection = kVar;
        this.actions = c42381b;
        this.checkoutContext = str3;
        this.bblFooter = mnzFloatingFooter;
        this.bblUxFeedback = c42383d;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C42381b getActions() {
        return this.actions;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final MnzFloatingFooter getBblFooter() {
        return this.bblFooter;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final C42383d getBblUxFeedback() {
        return this.bblUxFeedback;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final f getBudgetSection() {
        return this.budgetSection;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getCheckoutContext() {
        return this.checkoutContext;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final Integer getCurrentDuration() {
        return this.currentDuration;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final k getDurationsSection() {
        return this.durationsSection;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final o getForecastSection() {
        return this.forecastSection;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Y61.k
    /* renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ i(String str, String str2, Integer num, o oVar, f fVar, k kVar, C42381b c42381b, String str3, MnzFloatingFooter mnzFloatingFooter, C42383d c42383d, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : num, oVar, fVar, kVar, c42381b, str3, mnzFloatingFooter, c42383d);
    }
}
