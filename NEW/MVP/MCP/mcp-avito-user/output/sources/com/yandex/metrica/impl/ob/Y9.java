package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public final class Y9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C39128si toModel(@Y61.k If.r rVar) {
        return new C39128si(rVar.f378452a);
    }

    @Override // com.yandex.metrica.core.api.Converter
    public Object fromModel(Object obj) {
        If.r rVar = new If.r();
        rVar.f378452a = ((C39128si) obj).a();
        return rVar;
    }
}
