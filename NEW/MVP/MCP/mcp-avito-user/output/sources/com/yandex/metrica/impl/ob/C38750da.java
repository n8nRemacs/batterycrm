package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* renamed from: com.yandex.metrica.impl.ob.da, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38750da implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38700ba f380364a;

    public C38750da() {
        this(new C38700ba());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.w fromModel(@j.N C39227wl c39227wl) {
        If.w wVar = new If.w();
        wVar.f378474a = c39227wl.f382144a;
        wVar.f378475b = c39227wl.f382145b;
        wVar.f378476c = c39227wl.f382146c;
        wVar.f378477d = c39227wl.f382147d;
        wVar.f378478e = c39227wl.f382148e;
        wVar.f378479f = c39227wl.f382149f;
        wVar.f378480g = c39227wl.f382150g;
        wVar.f378481h = this.f380364a.fromModel(c39227wl.f382151h);
        return wVar;
    }

    @j.k0
    public C38750da(@j.N C38700ba c38700ba) {
        this.f380364a = c38700ba;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C39227wl toModel(@j.N If.w wVar) {
        return new C39227wl(wVar.f378474a, wVar.f378475b, wVar.f378476c, wVar.f378477d, wVar.f378478e, wVar.f378479f, wVar.f378480g, this.f380364a.toModel(wVar.f378481h));
    }
}
