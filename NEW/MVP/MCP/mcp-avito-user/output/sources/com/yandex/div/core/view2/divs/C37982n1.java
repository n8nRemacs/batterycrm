package com.yandex.div.core.view2.divs;

import com.yandex.div2.DivFontFamily;
import com.yandex.div2.DivInput;
import kotlin.Metadata;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.n1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37982n1 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.j f368573l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T0 f368574m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DivInput f368575n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368576o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37982n1(T0 t02, com.yandex.div.core.view2.divs.widgets.j jVar, com.yandex.div.json.expressions.e eVar, DivInput divInput) {
        super(1);
        this.f368573l = jVar;
        this.f368574m = t02;
        this.f368575n = divInput;
        this.f368576o = eVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        com.yandex.div.core.view2.J j12 = this.f368574m.f368228b;
        DivInput divInput = this.f368575n;
        com.yandex.div.json.expressions.b<DivFontFamily> bVar = divInput.f371722k;
        com.yandex.div.json.expressions.e eVar = this.f368576o;
        this.f368573l.setTypeface(j12.a(bVar.a(eVar), divInput.f371725n.a(eVar)));
        return kotlin.G0.f406611a;
    }
}
