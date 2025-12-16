package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public class A9 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39287z9 f377764a;

    public A9() {
        this(new C39287z9());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.f fromModel(@j.N C39096ra c39096ra) {
        If.f fVar = new If.f();
        fVar.f378353a = a(c39096ra.f381733a);
        fVar.f378354b = a(c39096ra.f381734b);
        fVar.f378355c = a(c39096ra.f381735c);
        return fVar;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        If.f fVar = (If.f) obj;
        return new C39096ra(a(fVar.f378353a), a(fVar.f378354b), a(fVar.f378355c));
    }

    @j.k0
    public A9(@j.N C39287z9 c39287z9) {
        this.f377764a = c39287z9;
    }

    @j.N
    public C39096ra a(@j.N If.f fVar) {
        return new C39096ra(a(fVar.f378353a), a(fVar.f378354b), a(fVar.f378355c));
    }

    @j.P
    private If.e a(@j.P C39073qa c39073qa) {
        if (c39073qa == null) {
            return null;
        }
        this.f377764a.getClass();
        If.e eVar = new If.e();
        eVar.f378351a = c39073qa.f381452a;
        eVar.f378352b = c39073qa.f381453b;
        return eVar;
    }

    @j.P
    private C39073qa a(@j.P If.e eVar) {
        if (eVar == null) {
            return null;
        }
        return this.f377764a.toModel(eVar);
    }
}
