package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* renamed from: com.yandex.metrica.impl.ob.w9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39215w9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.c fromModel(@j.N Ph ph2) {
        If.c cVar = new If.c();
        cVar.f378344a = ph2.f379213a;
        cVar.f378345b = ph2.f379214b;
        cVar.f378346c = ph2.f379215c;
        cVar.f378347d = ph2.f379216d;
        return cVar;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ph toModel(@j.N If.c cVar) {
        return new Ph(cVar.f378344a, cVar.f378345b, cVar.f378346c, cVar.f378347d);
    }
}
