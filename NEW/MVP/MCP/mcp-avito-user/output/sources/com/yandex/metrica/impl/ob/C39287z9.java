package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* renamed from: com.yandex.metrica.impl.ob.z9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39287z9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C39073qa toModel(@j.N If.e eVar) {
        return new C39073qa(eVar.f378351a, eVar.f378352b);
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        C39073qa c39073qa = (C39073qa) obj;
        If.e eVar = new If.e();
        eVar.f378351a = c39073qa.f381452a;
        eVar.f378352b = c39073qa.f381453b;
        return eVar;
    }
}
