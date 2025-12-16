package com.yandex.div.core.view2.divs;

import com.yandex.div2.DivContainer;
import kotlin.Metadata;

/* compiled from: DivContainerBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/DivContainer$Orientation;", "it", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/DivContainer$Orientation;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.c0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37940c0 extends kotlin.jvm.internal.N implements Y41.l<DivContainer.Orientation, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.l f368352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DivContainer f368353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368354n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37940c0(com.yandex.div.core.view2.divs.widgets.l lVar, DivContainer divContainer, com.yandex.div.json.expressions.e eVar) {
        super(1);
        this.f368352l = lVar;
        this.f368353m = divContainer;
        this.f368354n = eVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(DivContainer.Orientation orientation) {
        this.f368352l.setOrientation(!C37931a.z(this.f368353m, this.f368354n) ? 1 : 0);
        return kotlin.G0.f406611a;
    }
}
