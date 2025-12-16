package com.yandex.div.core.view2.divs;

import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import kotlin.Metadata;

/* compiled from: DivTextBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class o2 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C37962h2 f368587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.k f368588m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f368589n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368590o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<DivAlignmentVertical> f368591p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(C37962h2 c37962h2, com.yandex.div.core.view2.divs.widgets.k kVar, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.e eVar) {
        super(1);
        this.f368587l = c37962h2;
        this.f368588m = kVar;
        this.f368589n = bVar;
        this.f368590o = eVar;
        this.f368591p = bVar2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar = this.f368589n;
        com.yandex.div.json.expressions.e eVar = this.f368590o;
        DivAlignmentHorizontal divAlignmentHorizontalA = bVar.a(eVar);
        DivAlignmentVertical divAlignmentVerticalA = this.f368591p.a(eVar);
        this.f368587l.getClass();
        C37962h2.h(this.f368588m, divAlignmentHorizontalA, divAlignmentVerticalA);
        return kotlin.G0.f406611a;
    }
}
