package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes7.dex */
class O5 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Af fromModel(@j.N N5 n52) {
        Af af2 = new Af();
        af2.f377774d = new int[n52.b().size()];
        Iterator<Integer> it = n52.b().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            af2.f377774d[i12] = it.next().intValue();
            i12++;
        }
        af2.f377773c = n52.c();
        af2.f377772b = n52.d();
        af2.f377771a = n52.e();
        return af2;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public N5 toModel(@j.N Af af2) {
        return new N5(af2.f377771a, af2.f377772b, af2.f377773c, A2.a(af2.f377774d));
    }
}
