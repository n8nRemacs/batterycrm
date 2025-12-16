package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public class L9 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final K9 f378785a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final M9 f378786b;

    public L9() {
        this(new K9(), new M9());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.k fromModel(@j.N C39026oc c39026oc) {
        If.k kVar = new If.k();
        kVar.f378388a = this.f378785a.fromModel(c39026oc.f381239a);
        kVar.f378389b = this.f378786b.fromModel(c39026oc.f381240b);
        return kVar;
    }

    @j.k0
    public L9(@j.N K9 k92, @j.N M9 m92) {
        this.f378785a = k92;
        this.f378786b = m92;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C39026oc toModel(@j.N If.k kVar) {
        K9 k92 = this.f378785a;
        If.k.a aVar = kVar.f378388a;
        If.k.a aVar2 = new If.k.a();
        if (aVar == null) {
            aVar = aVar2;
        }
        C38976mc model = k92.toModel(aVar);
        M9 m92 = this.f378786b;
        If.k.b bVar = kVar.f378389b;
        If.k.b bVar2 = new If.k.b();
        if (bVar == null) {
            bVar = bVar2;
        }
        return new C39026oc(model, m92.toModel(bVar));
    }
}
