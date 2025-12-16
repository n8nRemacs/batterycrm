package com.yandex.div.core.view2.divs;

import android.net.Uri;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.C37955g;
import com.yandex.div2.DivAction;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DivActionBinder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37963i extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DivAction.d f368500l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.a f368501m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C37955g f368502n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C37955g.b f368503o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368504p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37963i(DivAction.d dVar, l0.a aVar, C37955g c37955g, C37955g.b bVar, int i12, com.yandex.div.json.expressions.e eVar) {
        super(0);
        this.f368500l = dVar;
        this.f368501m = aVar;
        this.f368502n = c37955g;
        this.f368503o = bVar;
        this.f368504p = eVar;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        DivAction.d dVar = this.f368500l;
        List<DivAction> listSingletonList = dVar.f371235b;
        List<DivAction> list = listSingletonList;
        if (list == null || list.isEmpty()) {
            listSingletonList = null;
        }
        if (listSingletonList == null) {
            DivAction divAction = dVar.f371234a;
            listSingletonList = divAction == null ? null : Collections.singletonList(divAction);
        }
        List<DivAction> list2 = listSingletonList;
        if (list2 == null || list2.isEmpty()) {
            int i12 = com.yandex.div.internal.n.f370123a;
        } else {
            for (DivAction divAction2 : listSingletonList) {
                C37955g c37955g = this.f368502n;
                C37955g.b bVar = this.f368503o;
                C38029k c38029k = bVar.f368388a;
                dVar.f371236c.a(this.f368504p);
                c37955g.f368382b.getClass();
                InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
                com.yandex.div.json.expressions.b<Uri> bVar2 = divAction2.f371220e;
                if (bVar2 != null) {
                    bVar2.a(c38029k.getExpressionResolver());
                }
                C38029k c38029k2 = bVar.f368388a;
                c37955g.f368383c.a(divAction2, c38029k2.getExpressionResolver());
                c37955g.a(c38029k2, divAction2, null);
            }
            this.f368501m.f406838b = true;
        }
        return kotlin.G0.f406611a;
    }
}
