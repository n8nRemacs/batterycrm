package com.avito.android.reputation.ui.items.reputation_pie_chart;

import Y41.l;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReputationPieChartState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/reputation/ui/items/reputation_pie_chart/h;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/reputation/ui/items/reputation_pie_chart/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class j extends N implements l<G, h> {

    /* renamed from: l, reason: collision with root package name */
    public static final j f254909l = new j();

    public j() {
        super(1);
    }

    @Override // Y41.l
    public final h invoke(G g12) {
        G g13 = g12;
        Float fN2 = g13.n("percent");
        return new h(fN2 != null ? fN2.floatValue() : 0.0f, (r) g13.f(i.f254908l, "color", "color"));
    }
}
