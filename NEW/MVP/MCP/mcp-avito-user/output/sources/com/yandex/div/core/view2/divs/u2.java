package com.yandex.div.core.view2.divs;

import com.yandex.div2.C38269b7;
import com.yandex.div2.DivFontFamily;
import kotlin.Metadata;

/* compiled from: DivTextBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class u2 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C37962h2 f368830l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.k f368831m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C38269b7 f368832n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368833o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(C37962h2 c37962h2, com.yandex.div.core.view2.divs.widgets.k kVar, com.yandex.div.json.expressions.e eVar, C38269b7 c38269b7) {
        super(1);
        this.f368830l = c37962h2;
        this.f368831m = kVar;
        this.f368832n = c38269b7;
        this.f368833o = eVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        C38269b7 c38269b7 = this.f368832n;
        com.yandex.div.json.expressions.b<DivFontFamily> bVar = c38269b7.f374588r;
        com.yandex.div.json.expressions.e eVar = this.f368833o;
        this.f368831m.setTypeface(this.f368830l.f368465b.a(bVar.a(eVar), c38269b7.f374591u.a(eVar)));
        return kotlin.G0.f406611a;
    }
}
