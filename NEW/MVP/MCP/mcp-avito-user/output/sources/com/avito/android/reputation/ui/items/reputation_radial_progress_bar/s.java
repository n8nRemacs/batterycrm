package com.avito.android.reputation.ui.items.reputation_radial_progress_bar;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReputationRadialProgressBarState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/reputation/ui/items/reputation_radial_progress_bar/n;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/reputation/ui/items/reputation_radial_progress_bar/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class s extends N implements Y41.l<G, n> {

    /* renamed from: l, reason: collision with root package name */
    public static final s f255046l = new s();

    public s() {
        super(1);
    }

    @Override // Y41.l
    public final n invoke(G g12) {
        G g13 = g12;
        Integer numA = g13.a("threshold");
        Integer numA2 = g13.a("score");
        int iIntValue = numA2 != null ? numA2.intValue() : 0;
        com.avito.beduin.v2.theme.r rVar = (com.avito.beduin.v2.theme.r) g13.f(o.f255042l, "leftColor", "leftColor");
        com.avito.beduin.v2.theme.r rVar2 = (com.avito.beduin.v2.theme.r) g13.f(p.f255043l, "rightColor", "rightColor");
        Integer numA3 = g13.a("progressBarWidth");
        com.avito.beduin.v2.theme.r rVar3 = (com.avito.beduin.v2.theme.r) g13.f(q.f255044l, "backgroundLeftColor", "backgroundLeftColor");
        com.avito.beduin.v2.theme.r rVar4 = (com.avito.beduin.v2.theme.r) g13.f(r.f255045l, "backgroundRightColor", "backgroundRightColor");
        Integer numA4 = g13.a("thresholdHeight");
        return new n(numA, iIntValue, numA3, rVar, rVar2, rVar3, rVar4, numA4 != null ? numA4.intValue() : 0);
    }
}
