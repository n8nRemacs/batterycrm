package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public class U9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.p fromModel(@j.N C38733ci c38733ci) {
        If.p pVar = new If.p();
        pVar.f378438a = c38733ci.f380345a;
        pVar.f378439b = c38733ci.f380346b;
        pVar.f378440c = c38733ci.f380347c;
        pVar.f378441d = c38733ci.f380348d;
        return pVar;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38733ci toModel(@j.N If.p pVar) {
        return new C38733ci(pVar.f378438a, pVar.f378439b, pVar.f378440c, pVar.f378441d);
    }
}
