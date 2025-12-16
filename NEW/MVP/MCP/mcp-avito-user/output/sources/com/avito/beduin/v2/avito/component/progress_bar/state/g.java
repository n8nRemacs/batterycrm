package com.avito.beduin.v2.avito.component.progress_bar.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoProgressBarStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/progress_bar/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/progress_bar/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f334829l = new g();

    public g() {
        super(1);
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        Boolean boolC = g13.c("visible");
        return new a(g13.contains("progress") ? (o) g13.f(b.f334824l, "progress", "progress") : null, com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, n.f334843b), boolC != null ? boolC.booleanValue() : true, (Y41.a) g13.d(d.f334826l, "onShow", "onShow"), (Y41.a) g13.d(f.f334828l, "onHide", "onHide"), g13.getString("tag"));
    }
}
