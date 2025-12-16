package com.yandex.div.core.view2.divs;

import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import kotlin.Metadata;

/* compiled from: DivImageBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class L0 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K0 f368137l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.i f368138m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368139n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f368140o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<DivAlignmentVertical> f368141p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(K0 k02, com.yandex.div.core.view2.divs.widgets.i iVar, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.e eVar) {
        super(1);
        this.f368137l = k02;
        this.f368138m = iVar;
        this.f368139n = eVar;
        this.f368140o = bVar;
        this.f368141p = bVar2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        com.yandex.div.json.expressions.e eVar = this.f368139n;
        this.f368137l.getClass();
        this.f368138m.setGravity(C37931a.r(this.f368140o.a(eVar), this.f368141p.a(eVar)));
        return kotlin.G0.f406611a;
    }
}
