package com.avito.beduin.v2.avito.component.items_controller;

import com.avito.beduin.v2.avito.component.items_controller.h;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoItemsControllerStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/items_controller/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/items_controller/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334555l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AbstractC36250j.b bVar) {
        super(1);
        this.f334555l = bVar;
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        ArrayList arrayListC = C42745f0.C(g13.g("items", "items", c.f334552l));
        int iF2 = P0.f(C42745f0.q(arrayListC, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((h.a) next).f334557a, next);
        }
        return new a(linkedHashMap, (Y41.l) g13.d(new e(this.f334555l), "onDataChanged", "onDataChanged"));
    }
}
