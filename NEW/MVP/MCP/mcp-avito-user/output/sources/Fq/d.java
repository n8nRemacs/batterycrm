package fq;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StagesTransitionState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f396153b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ActionTransition f396154c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f396155d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<String, StageTransitionField> f396156e;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k String str, @k ActionTransition actionTransition, boolean z12, @k Map<String, ? extends StageTransitionField> map) {
        this.f396153b = str;
        this.f396154c = actionTransition;
        this.f396155d = z12;
        this.f396156e = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d a(d dVar, boolean z12, LinkedHashMap linkedHashMap, int i12) {
        String str = dVar.f396153b;
        ActionTransition actionTransition = dVar.f396154c;
        if ((i12 & 4) != 0) {
            z12 = dVar.f396155d;
        }
        Map map = linkedHashMap;
        if ((i12 & 8) != 0) {
            map = dVar.f396156e;
        }
        dVar.getClass();
        return new d(str, actionTransition, z12, map);
    }

    @l
    public final String c() {
        StageTransitionField stageTransitionField = this.f396156e.get("comment");
        StageTransitionField.CommentField commentField = stageTransitionField instanceof StageTransitionField.CommentField ? (StageTransitionField.CommentField) stageTransitionField : null;
        if (commentField != null) {
            return commentField.f122947b;
        }
        return null;
    }

    public final boolean d(@k String str) {
        StageTransitionField stageTransitionField = this.f396156e.get("reason");
        StageTransitionField.RadioGroup radioGroup = stageTransitionField instanceof StageTransitionField.RadioGroup ? (StageTransitionField.RadioGroup) stageTransitionField : null;
        return L.f(radioGroup != null ? radioGroup.f122951b : null, str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f396153b, dVar.f396153b) && this.f396154c == dVar.f396154c && this.f396155d == dVar.f396155d && L.f(this.f396156e, dVar.f396156e);
    }

    public final int hashCode() {
        return this.f396156e.hashCode() + r.i((this.f396154c.hashCode() + (this.f396153b.hashCode() * 31)) * 31, 31, this.f396155d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StagesTransitionState(dealId=");
        sb2.append(this.f396153b);
        sb2.append(", transition=");
        sb2.append(this.f396154c);
        sb2.append(", isLoading=");
        sb2.append(this.f396155d);
        sb2.append(", fields=");
        return r.w(sb2, this.f396156e, ')');
    }
}
