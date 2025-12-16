package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C39245xf;

/* renamed from: com.yandex.metrica.impl.ob.a3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38668a3 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C39245xf.a fromModel(@j.N T21.a aVar) {
        int i12;
        C39245xf.a aVar2 = new C39245xf.a();
        int iOrdinal = aVar.f15318a.ordinal();
        if (iOrdinal != 0) {
            i12 = 1;
            if (iOrdinal == 1) {
                i12 = 3;
            }
        } else {
            i12 = 2;
        }
        aVar2.f382192a = i12;
        aVar2.f382193b = aVar.f15319b;
        aVar2.f382194c = aVar.f15320c;
        aVar2.f382195d = aVar.f15321d;
        aVar2.f382196e = aVar.f15322e;
        return aVar2;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T21.a toModel(@j.N C39245xf.a aVar) {
        com.yandex.metrica.billing_interface.e eVar;
        int i12 = aVar.f382192a;
        if (i12 == 2) {
            eVar = com.yandex.metrica.billing_interface.e.f377619b;
        } else if (i12 != 3) {
            eVar = com.yandex.metrica.billing_interface.e.f377621d;
        } else {
            eVar = com.yandex.metrica.billing_interface.e.f377620c;
        }
        return new T21.a(eVar, aVar.f382193b, aVar.f382194c, aVar.f382195d, aVar.f382196e);
    }
}
