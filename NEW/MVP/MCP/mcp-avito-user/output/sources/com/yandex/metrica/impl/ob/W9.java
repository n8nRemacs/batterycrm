package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public class W9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.q fromModel(@j.N C38758di c38758di) {
        If.q qVar = new If.q();
        qVar.f378442a = c38758di.f380403a;
        qVar.f378443b = c38758di.f380404b;
        qVar.f378445d = C38689b.a(c38758di.f380405c);
        qVar.f378444c = C38689b.a(c38758di.f380406d);
        qVar.f378446e = c38758di.f380407e;
        qVar.f378447f = c38758di.f380408f;
        qVar.f378448g = c38758di.f380409g;
        qVar.f378449h = c38758di.f380410h;
        qVar.f378450i = c38758di.f380411i;
        qVar.f378451j = c38758di.f380412j;
        return qVar;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38758di toModel(@j.N If.q qVar) {
        return new C38758di(qVar.f378442a, qVar.f378443b, C38689b.a(qVar.f378445d), C38689b.a(qVar.f378444c), qVar.f378446e, qVar.f378447f, qVar.f378448g, qVar.f378449h, qVar.f378450i, qVar.f378451j);
    }
}
