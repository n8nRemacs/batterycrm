package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* loaded from: classes7.dex */
public class K9 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final G9 f378697a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final I9 f378698b;

    public K9() {
        this(new G9(), new I9());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.k.a fromModel(@j.N C38976mc c38976mc) {
        If.k.a aVar = new If.k.a();
        aVar.f378390a = c38976mc.f381037a;
        aVar.f378391b = c38976mc.f381038b;
        aVar.f378392c = c38976mc.f381039c;
        aVar.f378393d = c38976mc.f381040d;
        aVar.f378394e = c38976mc.f381041e;
        aVar.f378395f = c38976mc.f381042f;
        aVar.f378396g = c38976mc.f381043g;
        aVar.f378399j = c38976mc.f381044h;
        aVar.f378397h = c38976mc.f381045i;
        aVar.f378398i = c38976mc.f381046j;
        aVar.f378405p = c38976mc.f381047k;
        aVar.f378406q = c38976mc.f381048l;
        Xb xb2 = c38976mc.f381049m;
        if (xb2 != null) {
            aVar.f378400k = this.f378697a.fromModel(xb2);
        }
        Xb xb3 = c38976mc.f381050n;
        if (xb3 != null) {
            aVar.f378401l = this.f378697a.fromModel(xb3);
        }
        Xb xb4 = c38976mc.f381051o;
        if (xb4 != null) {
            aVar.f378402m = this.f378697a.fromModel(xb4);
        }
        Xb xb5 = c38976mc.f381052p;
        if (xb5 != null) {
            aVar.f378403n = this.f378697a.fromModel(xb5);
        }
        C38727cc c38727cc = c38976mc.f381053q;
        if (c38727cc != null) {
            aVar.f378404o = this.f378698b.fromModel(c38727cc);
        }
        return aVar;
    }

    @j.k0
    public K9(@j.N G9 g92, @j.N I9 i92) {
        this.f378697a = g92;
        this.f378698b = i92;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38976mc toModel(@j.N If.k.a aVar) {
        If.k.a.C10953a c10953a = aVar.f378400k;
        Xb model = c10953a != null ? this.f378697a.toModel(c10953a) : null;
        If.k.a.C10953a c10953a2 = aVar.f378401l;
        Xb model2 = c10953a2 != null ? this.f378697a.toModel(c10953a2) : null;
        If.k.a.C10953a c10953a3 = aVar.f378402m;
        Xb model3 = c10953a3 != null ? this.f378697a.toModel(c10953a3) : null;
        If.k.a.C10953a c10953a4 = aVar.f378403n;
        Xb model4 = c10953a4 != null ? this.f378697a.toModel(c10953a4) : null;
        If.k.a.b bVar = aVar.f378404o;
        return new C38976mc(aVar.f378390a, aVar.f378391b, aVar.f378392c, aVar.f378393d, aVar.f378394e, aVar.f378395f, aVar.f378396g, aVar.f378399j, aVar.f378397h, aVar.f378398i, aVar.f378405p, aVar.f378406q, model, model2, model3, model4, bVar != null ? this.f378698b.toModel(bVar) : null);
    }
}
