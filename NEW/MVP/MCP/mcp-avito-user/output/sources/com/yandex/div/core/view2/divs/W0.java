package com.yandex.div.core.view2.divs;

import kotlin.Metadata;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class W0 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.j f368257l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<Integer> f368258m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368259n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(com.yandex.div.core.view2.divs.widgets.j jVar, com.yandex.div.json.expressions.b<Integer> bVar, com.yandex.div.json.expressions.e eVar) {
        super(1);
        this.f368257l = jVar;
        this.f368258m = bVar;
        this.f368259n = eVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        this.f368257l.setHighlightColor(this.f368258m.a(this.f368259n).intValue());
        return kotlin.G0.f406611a;
    }
}
