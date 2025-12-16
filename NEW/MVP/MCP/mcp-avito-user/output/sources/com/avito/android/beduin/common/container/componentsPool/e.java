package com.avito.android.beduin.common.container.componentsPool;

import Y41.l;
import Y41.p;
import Yh.C18265a;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ComponentsPoolHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/componentsPool/e;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f103003a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f103004b;

    public e(@Y61.k Wh.c cVar, @Y61.k i iVar) {
        this.f103003a = iVar;
        this.f103004b = new a(cVar);
    }

    public static void a(e eVar, Yh.b bVar, l lVar) {
        Object obj;
        b bVar2 = b.f103000l;
        i iVar = eVar.f103003a;
        ArrayList arrayListA = eVar.f103004b.a(bVar.f19612b, iVar.f103005a, lVar);
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.f103017c) {
                AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a = kVar.f103015a;
                String id2 = abstractC40112a.S().getF102944b();
                if (id2 != null) {
                    obj = bVar.f19611a.get(C18265a.a(id2));
                } else {
                    obj = null;
                }
                InterfaceC40116e interfaceC40116e = kVar.f103016b;
                if (obj != null) {
                    abstractC40112a.n(interfaceC40116e, Collections.singletonList(obj));
                } else {
                    abstractC40112a.m(interfaceC40116e);
                }
            }
        }
        h.a(iVar, arrayListA, bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(e eVar, List list, l lVar, p pVar, int i12) {
        if ((i12 & 4) != 0) {
            pVar = c.f103001l;
        }
        eVar.b(list, lVar, pVar, d.f103002l);
    }

    public final void b(@Y61.l List<? extends BeduinModel> list, @Y61.k l<? super Integer, ? extends j> lVar, @Y61.k p<? super Integer, ? super k, G0> pVar, @Y61.k p<? super Integer, ? super k, G0> pVar2) {
        if (list == null) {
            list = C42784z0.f406748b;
        }
        i iVar = this.f103003a;
        ArrayList arrayListA = this.f103004b.a(list, iVar.f103005a, lVar);
        Iterator it = arrayListA.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            k kVar = (k) next;
            pVar.invoke(Integer.valueOf(i12), kVar);
            kVar.f103015a.m(kVar.f103016b);
            i12 = i13;
        }
        h.a(iVar, arrayListA, pVar2);
    }
}
