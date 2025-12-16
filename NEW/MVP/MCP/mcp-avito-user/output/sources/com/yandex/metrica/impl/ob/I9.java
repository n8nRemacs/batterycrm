package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public class I9 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final H9 f378282a;

    public I9() {
        this(new H9());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.k.a.b fromModel(@j.N C38727cc c38727cc) {
        If.k.a.b bVar = new If.k.a.b();
        Qc qc2 = c38727cc.f380311a;
        bVar.f378412a = qc2.f379255a;
        bVar.f378413b = qc2.f379256b;
        C38677ac c38677ac = c38727cc.f380312b;
        if (c38677ac != null) {
            bVar.f378414c = this.f378282a.fromModel(c38677ac);
        }
        return bVar;
    }

    @j.k0
    public I9(@j.N H9 h92) {
        this.f378282a = h92;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38727cc toModel(@j.N If.k.a.b bVar) {
        If.k.a.b.C10955a c10955a = bVar.f378414c;
        return new C38727cc(new Qc(bVar.f378412a, bVar.f378413b), c10955a != null ? this.f378282a.toModel(c10955a) : null);
    }
}
