package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public final class C9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.h fromModel(@Y61.k Uh uh2) {
        If.h hVar = new If.h();
        hVar.f378357a = uh2.c();
        hVar.f378358b = uh2.b();
        hVar.f378359c = uh2.a();
        hVar.f378361e = uh2.e();
        hVar.f378360d = uh2.d();
        return hVar;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Uh toModel(@Y61.k If.h hVar) {
        return new Uh(hVar.f378357a, hVar.f378358b, hVar.f378359c, hVar.f378360d, hVar.f378361e);
    }
}
