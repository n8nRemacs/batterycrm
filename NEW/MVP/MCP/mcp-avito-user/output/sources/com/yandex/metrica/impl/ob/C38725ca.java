package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* renamed from: com.yandex.metrica.impl.ob.ca, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38725ca implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38700ba f380307a;

    public C38725ca() {
        this(new C38700ba());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.v fromModel(@j.N C38861hl c38861hl) {
        If.v vVar = new If.v();
        vVar.f378458a = c38861hl.f380733a;
        vVar.f378459b = c38861hl.f380734b;
        vVar.f378460c = c38861hl.f380735c;
        vVar.f378461d = c38861hl.f380736d;
        vVar.f378466i = c38861hl.f380737e;
        vVar.f378467j = c38861hl.f380738f;
        vVar.f378468k = c38861hl.f380739g;
        vVar.f378469l = c38861hl.f380740h;
        vVar.f378471n = c38861hl.f380741i;
        vVar.f378472o = c38861hl.f380742j;
        vVar.f378462e = c38861hl.f380743k;
        vVar.f378463f = c38861hl.f380744l;
        vVar.f378464g = c38861hl.f380745m;
        vVar.f378465h = c38861hl.f380746n;
        vVar.f378473p = c38861hl.f380747o;
        vVar.f378470m = this.f380307a.fromModel(c38861hl.f380748p);
        return vVar;
    }

    @j.k0
    public C38725ca(@j.N C38700ba c38700ba) {
        this.f380307a = c38700ba;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38861hl toModel(@j.N If.v vVar) {
        return new C38861hl(vVar.f378458a, vVar.f378459b, vVar.f378460c, vVar.f378461d, vVar.f378466i, vVar.f378467j, vVar.f378468k, vVar.f378469l, vVar.f378471n, vVar.f378472o, vVar.f378462e, vVar.f378463f, vVar.f378464g, vVar.f378465h, vVar.f378473p, this.f380307a.toModel(vVar.f378470m));
    }
}
