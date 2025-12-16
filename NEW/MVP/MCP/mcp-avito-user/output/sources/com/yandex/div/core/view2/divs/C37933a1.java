package com.yandex.div.core.view2.divs;

import com.yandex.div2.DivSizeUnit;
import kotlin.Metadata;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.a1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37933a1 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T0 f368331l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.j f368332m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<Long> f368333n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368334o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ DivSizeUnit f368335p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37933a1(T0 t02, com.yandex.div.core.view2.divs.widgets.j jVar, com.yandex.div.json.expressions.b<Long> bVar, com.yandex.div.json.expressions.e eVar, DivSizeUnit divSizeUnit) {
        super(1);
        this.f368331l = t02;
        this.f368332m = jVar;
        this.f368333n = bVar;
        this.f368334o = eVar;
        this.f368335p = divSizeUnit;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        Long lA2 = this.f368333n.a(this.f368334o);
        this.f368331l.getClass();
        com.yandex.div.core.view2.divs.widgets.j jVar = this.f368332m;
        DivSizeUnit divSizeUnit = this.f368335p;
        jVar.setFixedLineHeight(lA2 == null ? null : Integer.valueOf(C37931a.T(lA2, jVar.getResources().getDisplayMetrics(), divSizeUnit)));
        C37931a.e(jVar, lA2, divSizeUnit);
        return kotlin.G0.f406611a;
    }
}
