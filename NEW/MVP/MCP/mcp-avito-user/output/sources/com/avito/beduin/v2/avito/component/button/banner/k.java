package com.avito.beduin.v2.avito.component.button.banner;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.avito.component.button.banner.a;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoBannerStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/button/banner/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/button/banner/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public static final k f333927l = new k();

    public k() {
        super(1);
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        a.C10369a c10369a = (a.C10369a) g13.h("child", "child", d.f333920l);
        Boolean boolC = g13.c("visible");
        return new a(g13.getString("title"), (Y41.a) g13.d(f.f333922l, "onCloseButtonClick", "onCloseButtonClick"), com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, o.f333933b), c10369a, boolC != null ? boolC.booleanValue() : true, (Y41.a) g13.d(h.f333924l, "onShow", "onShow"), (Y41.a) g13.d(j.f333926l, "onHide", "onHide"), g13.getString("tag"));
    }
}
