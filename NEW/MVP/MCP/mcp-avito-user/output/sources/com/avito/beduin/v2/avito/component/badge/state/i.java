package com.avito.beduin.v2.avito.component.badge.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoBadgeStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/badge/state/b;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/badge/state/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i extends N implements Y41.l<G, b> {

    /* renamed from: l, reason: collision with root package name */
    public static final i f333810l = new i();

    public i() {
        super(1);
    }

    @Override // Y41.l
    public final b invoke(G g12) {
        G g13 = g12;
        Boolean boolC = g13.c("visible");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        String string = g13.getString("text");
        Integer numA = g13.a("maxNumber");
        a aVar = (a) g13.f(d.f333805l, "border", "border");
        Boolean boolC2 = g13.c("shouldShowAnimated");
        boolean zBooleanValue2 = boolC2 != null ? boolC2.booleanValue() : false;
        Boolean boolC3 = g13.c("isPulsating");
        return new b(string, numA, aVar, zBooleanValue2, boolC3 != null ? boolC3.booleanValue() : false, com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, p.f333823b), zBooleanValue, (Y41.a) g13.d(f.f333807l, "onShow", "onShow"), (Y41.a) g13.d(h.f333809l, "onHide", "onHide"), g13.getString("tag"));
    }
}
