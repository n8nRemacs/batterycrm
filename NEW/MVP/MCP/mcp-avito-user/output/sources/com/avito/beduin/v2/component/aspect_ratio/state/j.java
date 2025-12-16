package com.avito.beduin.v2.component.aspect_ratio.state;

import Y41.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.component.aspect_ratio.state.AspectRatioState;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import com.avito.beduin.v2.theme.s;
import com.avito.beduin.v2.theme.t;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AspectRatioStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/component/aspect_ratio/state/AspectRatioState;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/component/aspect_ratio/state/AspectRatioState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements l<G, AspectRatioState> {

    /* renamed from: l, reason: collision with root package name */
    public static final j f335546l = new j();

    public j() {
        super(1);
    }

    @Override // Y41.l
    public final AspectRatioState invoke(G g12) {
        G g13 = g12;
        AspectRatioState.a aVar = (AspectRatioState.a) g13.h("child", "child", a.f335536l);
        Boolean boolC = g13.c("visible");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        r rVarB = t.f338374a.b(s.b(g13, "backgroundColor"));
        Y41.a aVar2 = (Y41.a) g13.d(c.f335538l, "onClick", "onClick");
        AspectRatioState.b bVar = (AspectRatioState.b) g13.f(d.f335539l, "ratio", "ratio");
        if (bVar == null) {
            bVar = new AspectRatioState.b(1, 1, AspectRatioState.Axis.f335527c);
        }
        return new AspectRatioState(rVarB, aVar2, bVar, (ET0.b) g13.f(e.f335541l, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING), aVar, zBooleanValue, (Y41.a) g13.d(g.f335543l, "onShow", "onShow"), (Y41.a) g13.d(i.f335545l, "onHide", "onHide"), g13.getString("tag"));
    }
}
