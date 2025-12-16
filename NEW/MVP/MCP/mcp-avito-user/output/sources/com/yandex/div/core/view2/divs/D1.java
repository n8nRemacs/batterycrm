package com.yandex.div.core.view2.divs;

import com.yandex.div2.C38267b5;
import com.yandex.div2.DivFontFamily;
import kotlin.Metadata;

/* compiled from: DivSelectBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class D1 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.p f368034l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G1 f368035m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C38267b5 f368036n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368037o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(com.yandex.div.core.view2.divs.widgets.p pVar, G1 g12, C38267b5 c38267b5, com.yandex.div.json.expressions.e eVar) {
        super(1);
        this.f368034l = pVar;
        this.f368035m = g12;
        this.f368036n = c38267b5;
        this.f368037o = eVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        com.yandex.div.core.view2.J j12 = this.f368035m.f368078b;
        C38267b5 c38267b5 = this.f368036n;
        com.yandex.div.json.expressions.b<DivFontFamily> bVar = c38267b5.f374464k;
        com.yandex.div.json.expressions.e eVar = this.f368037o;
        this.f368034l.setTypeface(j12.a(bVar.a(eVar), c38267b5.f374467n.a(eVar)));
        return kotlin.G0.f406611a;
    }
}
