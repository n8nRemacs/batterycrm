package com.avito.beduin.v2.avito.component.map.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoMapStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/map/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/map/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class q extends kotlin.jvm.internal.N implements Y41.l<com.avito.beduin.v2.engine.component.G, C36217a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334708l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(AbstractC36250j.b bVar) {
        super(1);
        this.f334708l = bVar;
    }

    @Override // Y41.l
    public final C36217a invoke(com.avito.beduin.v2.engine.component.G g12) {
        com.avito.beduin.v2.engine.component.G g13 = g12;
        AbstractC36250j.b bVar = this.f334708l;
        com.avito.beduin.v2.component.common.utils.a aVarA = com.avito.beduin.v2.component.common.utils.h.a(bVar);
        com.avito.beduin.v2.theme.l lVarC = com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, com.avito.beduin.v2.avito.component.map.state.style.e.f334733b);
        ET0.a aVar = new ET0.a(C42745f0.C(g13.g("pins", "pins", C36221e.f334693l)));
        N n12 = (N) g13.f(C36222f.f334694l, "userLocation", "userLocation");
        E e12 = (E) g13.f(C36223g.f334695l, "polygon", "polygon");
        z zVar = (z) g13.f(C36224h.f334696l, "moveToState", "moveToState");
        Y41.l lVar = (Y41.l) g13.d(new C36226j(bVar), "onClick", "onClick");
        Y41.l lVar2 = (Y41.l) g13.d(new C36228l(bVar), "onPinClick", "onPinClick");
        Y41.a aVar2 = (Y41.a) g13.d(C36230n.f334704l, "onMovedTo", "onMovedTo");
        Y41.l lVar3 = (Y41.l) g13.d(new p(bVar), "onMoveStart", "onMoveStart");
        Y41.r rVar = (Y41.r) g13.d(new C36220d(bVar), "onMoveEnd", "onMoveEnd");
        Boolean boolC = g13.c("isMoveEnabled");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        Boolean boolC2 = g13.c("isZoomEnabled");
        return new C36217a(lVarC, aVar, n12, e12, zVar, lVar, lVar2, aVar2, lVar3, rVar, zBooleanValue, boolC2 != null ? boolC2.booleanValue() : true, aVarA.f335704b, aVarA.f335705c, aVarA.f335706d, aVarA.f335703a);
    }
}
