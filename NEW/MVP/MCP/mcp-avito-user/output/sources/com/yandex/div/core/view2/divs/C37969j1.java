package com.yandex.div.core.view2.divs;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div/core/util/mask/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div/core/util/mask/a;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.j1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37969j1 extends kotlin.jvm.internal.N implements Y41.l<com.yandex.div.core.util.mask.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<com.yandex.div.core.util.mask.a> f368520l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.j f368521m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37969j1(l0.h<com.yandex.div.core.util.mask.a> hVar, com.yandex.div.core.view2.divs.widgets.j jVar) {
        super(1);
        this.f368520l = hVar;
        this.f368521m = jVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.yandex.div.core.util.mask.a] */
    @Override // Y41.l
    public final kotlin.G0 invoke(com.yandex.div.core.util.mask.a aVar) {
        com.yandex.div.core.util.mask.a aVar2 = aVar;
        this.f368520l.f406842b = aVar2;
        if (aVar2 != 0) {
            String strH = aVar2.h();
            com.yandex.div.core.view2.divs.widgets.j jVar = this.f368521m;
            jVar.setText(strH);
            jVar.setSelection(aVar2.f367803d);
        }
        return kotlin.G0.f406611a;
    }
}
