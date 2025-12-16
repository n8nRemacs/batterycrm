package com.avito.beduin.v2.component.lazy_row.state;

import Y41.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.component.common.utils.o;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyRowStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/component/lazy_row/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/component/lazy_row/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i extends N implements l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f336093l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AbstractC36250j.b bVar) {
        super(1);
        this.f336093l = bVar;
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        AbstractC36250j.b bVar = this.f336093l;
        com.avito.beduin.v2.component.common.utils.a aVarA = com.avito.beduin.v2.component.common.utils.h.a(bVar);
        com.avito.beduin.v2.component.common.utils.i iVarA = o.a(bVar);
        z zVar = bVar.f336562a;
        ZT0.a aVarP = zVar.p(zVar.getF336696a(), "@childrenPool");
        Boolean boolC = g13.c("visible");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        ET0.a aVar = new ET0.a(C42745f0.C(g13.g(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, new e(aVarP))));
        String string = g13.getString("backgroundColor");
        if (string == null) {
            string = "#00000000";
        }
        String str = string;
        Y41.a aVar2 = (Y41.a) g13.d(g.f336091l, "onPrefetch", "onPrefetch");
        ET0.b bVar2 = (ET0.b) g13.f(h.f336092l, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING);
        Y41.a<G0> aVar3 = aVarA.f335705c;
        Integer numA = g13.a("prerenderItems");
        return new a(aVar, str, aVar2, bVar2, numA != null ? numA.intValue() : 5, iVarA.f335715a, iVarA.f335716b, zBooleanValue, aVar3, aVarA.f335706d, aVarA.f335707e, g13.getString("tag"));
    }
}
