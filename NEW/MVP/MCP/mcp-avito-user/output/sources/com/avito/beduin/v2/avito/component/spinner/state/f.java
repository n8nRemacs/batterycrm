package com.avito.beduin.v2.avito.component.spinner.state;

import Y41.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoSpinnerState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/spinner/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/spinner/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public static final f f335142l = new f();

    public f() {
        super(1);
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        Boolean boolC = g13.c("visible");
        return new a(com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, k.f335151b), boolC != null ? boolC.booleanValue() : true, (Y41.a) g13.d(c.f335139l, "onShow", "onShow"), (Y41.a) g13.d(e.f335141l, "onHide", "onHide"), g13.getString("tag"));
    }
}
