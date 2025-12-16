package com.avito.beduin.v2.avito.component.docking_badge.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoDockingBadgeGroupStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/docking_badge/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/docking_badge/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class l extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public static final l f334335l = new l();

    public l() {
        super(1);
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        n[] nVarArr = (n[]) C42745f0.C(g13.g("badges", "badges", g.f334330l)).toArray(new n[0]);
        Boolean boolC = g13.c("visible");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        Integer numA = g13.a("verticalSpacing");
        int iIntValue = numA != null ? numA.intValue() : 3;
        Integer numA2 = g13.a("numberOfLines");
        return new a(nVarArr, iIntValue, numA2 != null ? numA2.intValue() : -1, zBooleanValue, (Y41.a) g13.d(i.f334332l, "onShow", "onShow"), (Y41.a) g13.d(k.f334334l, "onHide", "onHide"), g13.getString("tag"));
    }
}
