package bM0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.vas_planning.remote.model.Action;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasPlannerResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LbM0/e;", "", "Lcom/avito/android/vas_planning/remote/model/Action;", "action", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "", "plannedIds", "title", "LbM0/f;", ConstraintKt.WARNING, "<init>", "(Lcom/avito/android/vas_planning/remote/model/Action;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/String;LbM0/f;)V", "Lcom/avito/android/vas_planning/remote/model/Action;", "a", "()Lcom/avito/android/vas_planning/remote/model/Action;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "LbM0/f;", "e", "()LbM0/f;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e {

    @com.google.gson.annotations.c("action")
    @k
    private final Action action;

    @com.google.gson.annotations.c("description")
    @k
    private final AttributedText description;

    @com.google.gson.annotations.c("plannedIds")
    @l
    private final List<String> plannedIds;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c(ConstraintKt.WARNING)
    @l
    private final f warning;

    public e(@k Action action, @k AttributedText attributedText, @l List<String> list, @k String str, @l f fVar) {
        this.action = action;
        this.description = attributedText;
        this.plannedIds = list;
        this.title = str;
        this.warning = fVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final List<String> c() {
        return this.plannedIds;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final f getWarning() {
        return this.warning;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.action, eVar.action) && L.f(this.description, eVar.description) && L.f(this.plannedIds, eVar.plannedIds) && L.f(this.title, eVar.title) && L.f(this.warning, eVar.warning);
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.action.hashCode() * 31, 31, this.description);
        List<String> list = this.plannedIds;
        int iD2 = H.d((iB2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.title);
        f fVar = this.warning;
        return iD2 + (fVar != null ? fVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "VasPlannerResult(action=" + this.action + ", description=" + this.description + ", plannedIds=" + this.plannedIds + ", title=" + this.title + ", warning=" + this.warning + ')';
    }
}
