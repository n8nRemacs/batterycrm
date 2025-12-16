package com.yandex.div.core.view2.divs;

import com.yandex.div2.C38269b7;
import kotlin.Metadata;

/* compiled from: DivTextBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class t2 extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C37962h2 f368730l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.k f368731m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368732n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C38269b7 f368733o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(C37962h2 c37962h2, com.yandex.div.core.view2.divs.widgets.k kVar, com.yandex.div.json.expressions.e eVar, C38269b7 c38269b7) {
        super(1);
        this.f368730l = c37962h2;
        this.f368731m = kVar;
        this.f368732n = eVar;
        this.f368733o = c38269b7;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(String str) {
        C37962h2 c37962h2 = this.f368730l;
        c37962h2.getClass();
        C38269b7 c38269b7 = this.f368733o;
        com.yandex.div.json.expressions.b<String> bVar = c38269b7.f374555K;
        com.yandex.div.json.expressions.e eVar = this.f368732n;
        String strA = bVar.a(eVar);
        com.yandex.div.core.view2.divs.widgets.k kVar = this.f368731m;
        kVar.setText(strA);
        c37962h2.e(kVar, eVar, c38269b7);
        return kotlin.G0.f406611a;
    }
}
