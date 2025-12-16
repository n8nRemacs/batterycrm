package com.yandex.div.core.view2.divs;

import com.yandex.div2.T5;
import kotlin.Metadata;

/* compiled from: DivSliderBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class O1 extends kotlin.jvm.internal.N implements Y41.l<Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M1 f368181l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.r f368182m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368183n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T5.f f368184o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(M1 m12, com.yandex.div.core.view2.divs.widgets.r rVar, com.yandex.div.json.expressions.e eVar, T5.f fVar) {
        super(1);
        this.f368181l = m12;
        this.f368182m = rVar;
        this.f368183n = eVar;
        this.f368184o = fVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Integer num) {
        num.intValue();
        com.yandex.div.json.expressions.e eVar = this.f368183n;
        M1 m12 = this.f368181l;
        m12.getClass();
        T5.f fVar = this.f368184o;
        com.yandex.div.core.view2.divs.widgets.r rVar = this.f368182m;
        rVar.setThumbSecondTextDrawable(fVar == null ? null : new L21.b(X1.a(fVar, rVar.getResources().getDisplayMetrics(), m12.f368152c, eVar)));
        return kotlin.G0.f406611a;
    }
}
