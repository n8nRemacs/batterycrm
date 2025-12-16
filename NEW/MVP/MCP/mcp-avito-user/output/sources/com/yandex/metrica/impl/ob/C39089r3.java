package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39185v3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* renamed from: com.yandex.metrica.impl.ob.r3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39089r3 implements InterfaceC39280z2<C39185v3.a, C39185v3.a> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC39280z2, Y41.p
    @Y61.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<C39185v3.a> invoke(@Y61.k List<C39185v3.a> list, @Y61.k C39185v3.a aVar) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C39185v3.a) it.next()).a() == aVar.a()) {
                    if (aVar.a() != EnumC39158u0.APP) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C39185v3.a) obj).a() != EnumC39158u0.APP) {
                            arrayList.add(obj);
                        }
                    }
                    return C42745f0.i0(aVar, arrayList);
                }
            }
        }
        return C42745f0.i0(aVar, list);
    }
}
