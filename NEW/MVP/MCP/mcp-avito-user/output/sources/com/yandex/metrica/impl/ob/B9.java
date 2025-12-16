package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public final class B9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C39206w0 toModel(@Y61.k If.g gVar) {
        return new C39206w0(gVar.f378356a);
    }

    @Override // com.yandex.metrica.core.api.Converter
    public Object fromModel(Object obj) {
        If.g gVar = new If.g();
        gVar.f378356a = ((C39206w0) obj).a();
        return gVar;
    }
}
