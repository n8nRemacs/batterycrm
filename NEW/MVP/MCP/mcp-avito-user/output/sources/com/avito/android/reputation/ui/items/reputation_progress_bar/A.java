package com.avito.android.reputation.ui.items.reputation_progress_bar;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReputationProgressBarState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/reputation/ui/items/reputation_progress_bar/t;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/reputation/ui/items/reputation_progress_bar/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class A extends N implements Y41.l<G, t> {

    /* renamed from: l, reason: collision with root package name */
    public static final A f254911l = new A();

    public A() {
        super(1);
    }

    @Override // Y41.l
    public final t invoke(G g12) {
        G g13 = g12;
        Integer numA = g13.a("threshold");
        com.avito.beduin.v2.theme.r rVar = (com.avito.beduin.v2.theme.r) g13.f(u.f254989l, "leftColor", "leftColor");
        com.avito.beduin.v2.theme.r rVar2 = (com.avito.beduin.v2.theme.r) g13.f(v.f254990l, "rightColor", "rightColor");
        Integer numA2 = g13.a("score");
        int iIntValue = numA2 != null ? numA2.intValue() : 0;
        Float fN2 = g13.n("trackHeight");
        float fFloatValue = fN2 != null ? fN2.floatValue() : 0.0f;
        com.avito.beduin.v2.theme.r rVar3 = (com.avito.beduin.v2.theme.r) g13.f(w.f254991l, "backgroundColor", "backgroundColor");
        Integer numA3 = g13.a("futureScore");
        Integer numA4 = g13.a("futureScoreCircleRadius");
        int iIntValue2 = numA4 != null ? numA4.intValue() : 0;
        com.avito.beduin.v2.theme.r rVar4 = (com.avito.beduin.v2.theme.r) g13.f(x.f254992l, "futureScoreCircleColor", "futureScoreCircleColor");
        Integer numA5 = g13.a("deltaStripWidth");
        int iIntValue3 = numA5 != null ? numA5.intValue() : 0;
        com.avito.beduin.v2.theme.r rVar5 = (com.avito.beduin.v2.theme.r) g13.f(y.f254993l, "deltaColor", "deltaColor");
        com.avito.beduin.v2.theme.r rVar6 = (com.avito.beduin.v2.theme.r) g13.f(z.f254994l, "deltaBackgroundColor", "deltaBackgroundColor");
        Boolean boolC = g13.c("isScaleVisible");
        return new t(numA, iIntValue, fFloatValue, rVar, rVar2, rVar3, numA3, iIntValue2, rVar4, iIntValue3, rVar5, rVar6, boolC != null ? boolC.booleanValue() : false);
    }
}
