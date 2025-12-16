package com.yandex.div.core.view2.divs;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;

/* compiled from: DivSliderBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/W0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/W0;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class W1 extends kotlin.jvm.internal.N implements Y41.l<com.yandex.div2.W0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M1 f368260l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.r f368261m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368262n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(M1 m12, com.yandex.div.core.view2.divs.widgets.r rVar, com.yandex.div.json.expressions.e eVar) {
        super(1);
        this.f368260l = m12;
        this.f368261m = rVar;
        this.f368262n = eVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(com.yandex.div2.W0 w02) {
        this.f368260l.getClass();
        com.yandex.div.core.view2.divs.widgets.r rVar = this.f368261m;
        rVar.setInactiveTrackDrawable(C37931a.K(w02, rVar.getResources().getDisplayMetrics(), this.f368262n));
        return kotlin.G0.f406611a;
    }
}
