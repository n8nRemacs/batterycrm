package com.avito.beduin.v2.avito.component.page_indicator.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoPageIndicatorStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/page_indicator/state/f;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/page_indicator/state/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements Y41.l<G, f> {

    /* renamed from: l, reason: collision with root package name */
    public static final k f334795l = new k();

    public k() {
        super(1);
    }

    @Override // Y41.l
    public final f invoke(G g12) {
        G g13 = g12;
        Boolean boolC = g13.c("visible");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        Integer numA = g13.a("currentPage");
        int iIntValue = numA != null ? numA.intValue() : 0;
        Integer numA2 = g13.a("count");
        int iIntValue2 = numA2 != null ? numA2.intValue() : 0;
        Boolean boolC2 = g13.c("highlightVisitedDots");
        return new f(iIntValue, iIntValue2, boolC2 != null ? boolC2.booleanValue() : false, com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, s.f334815b), zBooleanValue, (Y41.a) g13.d(h.f334792l, "onShow", "onShow"), (Y41.a) g13.d(j.f334794l, "onHide", "onHide"), g13.getString("tag"));
    }
}
