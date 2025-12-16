package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Ud;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes7.dex */
public final class Td implements InterfaceC39280z2<Ud.a, C38779ee> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f379513a;

    public Td(@Y61.k Ud ud2) {
        boolean z12;
        List<Ud.a> list = ud2.f379612b;
        if ((list instanceof Collection) && list.isEmpty()) {
            z12 = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Ud.a) it.next()).f379615c == EnumC39158u0.APP) {
                    z12 = false;
                    break;
                }
            }
            z12 = true;
        }
        this.f379513a = z12;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39280z2, Y41.p
    @Y61.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<Ud.a> invoke(@Y61.k List<? extends Ud.a> list, @Y61.k C38779ee c38779ee) {
        Ud.a aVar = new Ud.a(c38779ee.f380481a, c38779ee.f380482b, c38779ee.f380485e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Ud.a) it.next()).f379615c == c38779ee.f380485e) {
                    if (aVar.f379615c == EnumC39158u0.APP && this.f379513a) {
                        return C42745f0.i0(aVar, list);
                    }
                    return null;
                }
            }
        }
        return C42745f0.i0(aVar, list);
    }
}
