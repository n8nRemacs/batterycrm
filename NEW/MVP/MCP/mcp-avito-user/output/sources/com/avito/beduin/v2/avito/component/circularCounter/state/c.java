package com.avito.beduin.v2.avito.component.circularCounter.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoCircularCounterStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/circularCounter/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/circularCounter/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334097l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AbstractC36250j.b bVar) {
        super(1);
        this.f334097l = bVar;
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        com.avito.beduin.v2.component.common.utils.a aVarA = com.avito.beduin.v2.component.common.utils.h.a(this.f334097l);
        g kVar = (g) g13.f(b.f334096l, "content", "content");
        if (kVar == null) {
            kVar = new k("");
        }
        g gVar = kVar;
        Float fN2 = g13.n("progress");
        return new a(gVar, fN2 != null ? fN2.floatValue() : 0.0f, com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, f.f334101b), aVarA.f335704b, aVarA.f335705c, aVarA.f335706d, aVarA.f335703a);
    }
}
