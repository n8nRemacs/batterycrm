package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public class Q9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        C38683ai c38683ai = (C38683ai) obj;
        If.n nVar = new If.n();
        nVar.f378426a = c38683ai.f380131a;
        nVar.f378427b = c38683ai.f380132b;
        return nVar;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        If.n nVar = (If.n) obj;
        return new C38683ai(nVar.f378426a, nVar.f378427b);
    }
}
