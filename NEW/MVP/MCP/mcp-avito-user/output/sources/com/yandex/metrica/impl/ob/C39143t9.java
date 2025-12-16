package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* renamed from: com.yandex.metrica.impl.ob.t9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39143t9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38864i toModel(@j.N If.b bVar) {
        return new C38864i(bVar.f378342a, bVar.f378343b);
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        C38864i c38864i = (C38864i) obj;
        If.b bVar = new If.b();
        bVar.f378342a = c38864i.f380750a;
        bVar.f378343b = c38864i.f380751b;
        return bVar;
    }
}
