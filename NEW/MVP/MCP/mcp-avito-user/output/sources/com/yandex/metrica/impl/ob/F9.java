package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public class F9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        Wb wb2 = (Wb) obj;
        If.k.a.C10953a.C10954a c10954a = new If.k.a.C10953a.C10954a();
        c10954a.f378410a = wb2.f379815a;
        c10954a.f378411b = wb2.f379816b;
        return c10954a;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        If.k.a.C10953a.C10954a c10954a = (If.k.a.C10953a.C10954a) obj;
        return new Wb(c10954a.f378410a, c10954a.f378411b);
    }
}
