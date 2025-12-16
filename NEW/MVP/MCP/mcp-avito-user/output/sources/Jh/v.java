package jh;

import androidx.compose.runtime.internal.P;
import com.avito.android.bbip_remote.model.BbipPrivatePresetsData;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BbipPrivateConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b7\u0010 R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Ljh/v;", "", "", "title", "subTitle", "", "currentDuration", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LuZ/e;", "navBar", "Ljh/t;", "budgetSection", "Ljh/x;", "customBudgetSection", "Ljh/y;", "durationsSection", "Ljh/q;", "actions", "checkoutContext", "Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "bblFooter", "Ljh/r;", "bblUxFeedback", "Ljh/w;", "widget", "Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData;", "presetsData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/text/AttributedText;LuZ/e;Ljh/t;Ljh/x;Ljh/y;Ljh/q;Ljava/lang/String;Lcom/avito/android/mnz_common/data/MnzFloatingFooter;Ljh/r;Ljh/w;Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData;)V", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "l", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/text/AttributedText;", "h", "()Lcom/avito/android/remote/model/text/AttributedText;", "LuZ/e;", "j", "()LuZ/e;", "Ljh/t;", "d", "()Ljh/t;", "Ljh/x;", "g", "()Ljh/x;", "Ljh/y;", "i", "()Ljh/y;", "Ljh/q;", "a", "()Ljh/q;", "e", "Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "b", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "Ljh/r;", "c", "()Ljh/r;", "Ljh/w;", "n", "()Ljh/w;", "Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData;", "k", "()Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class v {

    @com.google.gson.annotations.c("actions")
    @Y61.k
    private final q actions;

    @com.google.gson.annotations.c("bblFooter")
    @Y61.l
    private final MnzFloatingFooter bblFooter;

    @com.google.gson.annotations.c("uxFeedback")
    @Y61.l
    private final r bblUxFeedback;

    @com.google.gson.annotations.c("budgetSection")
    @Y61.k
    private final t budgetSection;

    @com.google.gson.annotations.c("checkoutContext")
    @Y61.k
    private final String checkoutContext;

    @com.google.gson.annotations.c("currentDuration")
    @Y61.l
    private final Integer currentDuration;

    @com.google.gson.annotations.c("customBudgetSection")
    @Y61.k
    private final x customBudgetSection;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("durationsSection")
    @Y61.l
    private final y durationsSection;

    @com.google.gson.annotations.c("navBar")
    @Y61.l
    private final uZ.e navBar;

    @com.google.gson.annotations.c("presetsData")
    @Y61.l
    private final BbipPrivatePresetsData presetsData;

    @com.google.gson.annotations.c("subTitle")
    @Y61.l
    private final String subTitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("widget")
    @Y61.l
    private final w widget;

    public v(@Y61.k String str, @Y61.l String str2, @Y61.l Integer num, @Y61.l AttributedText attributedText, @Y61.l uZ.e eVar, @Y61.k t tVar, @Y61.k x xVar, @Y61.l y yVar, @Y61.k q qVar, @Y61.k String str3, @Y61.l MnzFloatingFooter mnzFloatingFooter, @Y61.l r rVar, @Y61.l w wVar, @Y61.l BbipPrivatePresetsData bbipPrivatePresetsData) {
        this.title = str;
        this.subTitle = str2;
        this.currentDuration = num;
        this.description = attributedText;
        this.navBar = eVar;
        this.budgetSection = tVar;
        this.customBudgetSection = xVar;
        this.durationsSection = yVar;
        this.actions = qVar;
        this.checkoutContext = str3;
        this.bblFooter = mnzFloatingFooter;
        this.bblUxFeedback = rVar;
        this.widget = wVar;
        this.presetsData = bbipPrivatePresetsData;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final q getActions() {
        return this.actions;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final MnzFloatingFooter getBblFooter() {
        return this.bblFooter;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final r getBblUxFeedback() {
        return this.bblUxFeedback;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final t getBudgetSection() {
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

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final x getCustomBudgetSection() {
        return this.customBudgetSection;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final y getDurationsSection() {
        return this.durationsSection;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final uZ.e getNavBar() {
        return this.navBar;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final BbipPrivatePresetsData getPresetsData() {
        return this.presetsData;
    }

    @Y61.l
    /* renamed from: l, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Y61.k
    /* renamed from: m, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: n, reason: from getter */
    public final w getWidget() {
        return this.widget;
    }

    public /* synthetic */ v(String str, String str2, Integer num, AttributedText attributedText, uZ.e eVar, t tVar, x xVar, y yVar, q qVar, String str3, MnzFloatingFooter mnzFloatingFooter, r rVar, w wVar, BbipPrivatePresetsData bbipPrivatePresetsData, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : num, attributedText, eVar, tVar, xVar, yVar, qVar, str3, mnzFloatingFooter, rVar, (i12 & 4096) != 0 ? null : wVar, (i12 & 8192) != 0 ? null : bbipPrivatePresetsData);
    }
}
