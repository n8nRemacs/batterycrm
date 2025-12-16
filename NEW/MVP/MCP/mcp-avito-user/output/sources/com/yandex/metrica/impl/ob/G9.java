package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public class G9 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final F9 f378179a;

    public G9() {
        this(new F9());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.k.a.C10953a fromModel(@j.N Xb xb2) {
        If.k.a.C10953a c10953a = new If.k.a.C10953a();
        Qc qc2 = xb2.f379901a;
        c10953a.f378407a = qc2.f379255a;
        c10953a.f378408b = qc2.f379256b;
        Wb wb2 = xb2.f379902b;
        if (wb2 != null) {
            this.f378179a.getClass();
            If.k.a.C10953a.C10954a c10954a = new If.k.a.C10953a.C10954a();
            c10954a.f378410a = wb2.f379815a;
            c10954a.f378411b = wb2.f379816b;
            c10953a.f378409c = c10954a;
        }
        return c10953a;
    }

    @j.k0
    public G9(@j.N F9 f92) {
        this.f378179a = f92;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Xb toModel(@j.N If.k.a.C10953a c10953a) {
        Wb wb2;
        If.k.a.C10953a.C10954a c10954a = c10953a.f378409c;
        if (c10954a != null) {
            this.f378179a.getClass();
            wb2 = new Wb(c10954a.f378410a, c10954a.f378411b);
        } else {
            wb2 = null;
        }
        return new Xb(new Qc(c10953a.f378407a, c10953a.f378408b), wb2);
    }
}
