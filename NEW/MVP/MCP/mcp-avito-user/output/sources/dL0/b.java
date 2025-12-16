package DL0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Action;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VasPerformanceResult.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LDL0/b;", "", "", "title", "description", "actionTitle", "", "LDL0/c;", "tabs", "Lcom/avito/android/remote/model/Action;", "infoAction", "action", "LAL0/b;", "lightning", "LAL0/a;", "additionalInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/Action;Lcom/avito/android/remote/model/Action;LAL0/b;LAL0/a;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "c", "getActionTitle", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lcom/avito/android/remote/model/Action;", "d", "()Lcom/avito/android/remote/model/Action;", "a", "LAL0/b;", "e", "()LAL0/b;", "LAL0/a;", "b", "()LAL0/a;", "_avito_vas-performance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    @com.google.gson.annotations.c("action")
    @l
    private final Action action;

    @com.google.gson.annotations.c("actionTitle")
    @l
    private final String actionTitle;

    @com.google.gson.annotations.c("additionalInfo")
    @l
    private final AL0.a additionalInfo;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("infoAction")
    @l
    private final Action infoAction;

    @com.google.gson.annotations.c("lightning")
    @l
    private final AL0.b lightning;

    @com.google.gson.annotations.c("tabs")
    @k
    private final List<c> tabs;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public b(@k String str, @l String str2, @l String str3, @k List<c> list, @l Action action, @l Action action2, @l AL0.b bVar, @l AL0.a aVar) {
        this.title = str;
        this.description = str2;
        this.actionTitle = str3;
        this.tabs = list;
        this.infoAction = action;
        this.action = action2;
        this.lightning = bVar;
        this.additionalInfo = aVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AL0.a getAdditionalInfo() {
        return this.additionalInfo;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Action getInfoAction() {
        return this.infoAction;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final AL0.b getLightning() {
        return this.lightning;
    }

    @k
    public final List<c> f() {
        return this.tabs;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ b(String str, String str2, String str3, List list, Action action, Action action2, AL0.b bVar, AL0.a aVar, int i12, C42822w c42822w) {
        this(str, str2, str3, list, action, action2, (i12 & 64) != 0 ? null : bVar, (i12 & 128) != 0 ? null : aVar);
    }
}
