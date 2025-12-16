package com.avito.beduin.v2.avito.component.badge.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoBadgeStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/badge/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/badge/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f333805l = new d();

    public d() {
        super(1);
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        Float fN2 = g13.n("thickness");
        float fFloatValue = fN2 != null ? fN2.floatValue() : 0.0f;
        com.avito.beduin.v2.theme.r rVar = (com.avito.beduin.v2.theme.r) g13.f(c.f333804l, "color", "color");
        if (rVar == null) {
            rVar = com.avito.beduin.v2.theme.t.f338374a;
        }
        return new a(fFloatValue, rVar);
    }
}
