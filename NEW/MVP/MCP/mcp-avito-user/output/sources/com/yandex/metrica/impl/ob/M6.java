package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C38855hf;

/* loaded from: classes7.dex */
public class M6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final S6 f378883a;

    public M6() {
        this(new S6());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38855hf fromModel(@j.N C39284z6 c39284z6) {
        C38855hf c38855hfFromModel = this.f378883a.fromModel(c39284z6.f382305a);
        c38855hfFromModel.f380712g = 1;
        C38855hf.a aVar = new C38855hf.a();
        c38855hfFromModel.f380713h = aVar;
        aVar.f380717a = c39284z6.f382306b;
        return c38855hfFromModel;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public M6(@j.N S6 s62) {
        this.f378883a = s62;
    }
}
