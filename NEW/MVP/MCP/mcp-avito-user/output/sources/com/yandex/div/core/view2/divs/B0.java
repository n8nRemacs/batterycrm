package com.yandex.div.core.view2.divs;

import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import kotlin.Metadata;

/* compiled from: DivGifImageBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class B0 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C38015x0 f368011l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.g f368012m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368013n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f368014o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<DivAlignmentVertical> f368015p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(C38015x0 c38015x0, com.yandex.div.core.view2.divs.widgets.g gVar, com.yandex.div.json.expressions.e eVar, com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar, com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar2) {
        super(1);
        this.f368011l = c38015x0;
        this.f368012m = gVar;
        this.f368013n = eVar;
        this.f368014o = bVar;
        this.f368015p = bVar2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        int i12 = C38015x0.f369024e;
        com.yandex.div.json.expressions.e eVar = this.f368013n;
        this.f368011l.getClass();
        this.f368012m.setGravity(C37931a.r(this.f368014o.a(eVar), this.f368015p.a(eVar)));
        return kotlin.G0.f406611a;
    }
}
