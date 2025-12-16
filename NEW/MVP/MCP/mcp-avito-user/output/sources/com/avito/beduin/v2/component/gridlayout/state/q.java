package com.avito.beduin.v2.component.gridlayout.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.component.common.Arrangement;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.core.z;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GridLayoutStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/component/gridlayout/state/c;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/component/gridlayout/state/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class q extends N implements Y41.l<G, c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f335876l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.component.common.utils.a f335877m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(AbstractC36250j.b bVar, com.avito.beduin.v2.component.common.utils.a aVar) {
        super(1);
        this.f335876l = bVar;
        this.f335877m = aVar;
    }

    @Override // Y41.l
    public final c invoke(G g12) {
        G g13 = g12;
        z zVar = this.f335876l.f336562a;
        ET0.a aVar = new ET0.a(C42745f0.C(g13.g(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, new j(zVar.p(zVar.getF336696a(), "@childrenPool")))));
        String string = g13.getString("backgroundColor");
        if (string == null) {
            string = "#00000000";
        }
        String str = string;
        Y41.a aVar2 = (Y41.a) g13.d(l.f335871l, "onClick", "onClick");
        Boolean boolC = g13.c("reverse");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
        String string2 = g13.getString("arrangement");
        Arrangement.a aVar3 = Arrangement.f335645c;
        Arrangement arrangement = Arrangement.f335646d;
        aVar3.getClass();
        Arrangement arrangementA = Arrangement.a.a(string2, arrangement);
        ET0.h hVar = (ET0.h) g13.f(m.f335872l, "spacing", "spacing");
        if (hVar == null) {
            hVar = new ET0.h(0, 0);
        }
        ET0.h hVar2 = hVar;
        t tVar = (t) g13.f(n.f335873l, "spanCount", "spanCount");
        if (tVar == null) {
            t.f335879a.getClass();
            tVar = t.f335880b;
        }
        t tVar2 = tVar;
        Y41.a aVar4 = (Y41.a) g13.d(p.f335875l, "onPrefetch", "onPrefetch");
        com.avito.beduin.v2.component.common.utils.a aVar5 = this.f335877m;
        return new c(str, aVar4, zBooleanValue, arrangementA, hVar2, tVar2, aVar, aVar2, aVar5.f335704b, aVar5.f335705c, aVar5.f335706d, aVar5.f335707e, aVar5.f335703a);
    }
}
