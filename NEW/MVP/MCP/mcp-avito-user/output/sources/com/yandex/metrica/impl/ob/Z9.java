package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public class Z9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C39152ti toModel(@j.N If.s sVar) {
        return new C39152ti(sVar.f378453a);
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        If.s sVar = new If.s();
        sVar.f378453a = ((C39152ti) obj).f381894a;
        return sVar;
    }
}
