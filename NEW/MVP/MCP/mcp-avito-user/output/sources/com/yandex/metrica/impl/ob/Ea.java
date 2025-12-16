package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C38979mf;
import java.math.BigDecimal;

/* loaded from: classes7.dex */
public class Ea implements ProtobufConverter {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38979mf.e fromModel(@j.N BigDecimal bigDecimal) {
        kotlin.Q qA2 = Ol.a(bigDecimal);
        Nl nl2 = new Nl(((Number) qA2.f406619b).longValue(), ((Number) qA2.f406620c).intValue());
        C38979mf.e eVar = new C38979mf.e();
        eVar.f381070a = nl2.b();
        eVar.f381071b = nl2.a();
        return eVar;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }
}
