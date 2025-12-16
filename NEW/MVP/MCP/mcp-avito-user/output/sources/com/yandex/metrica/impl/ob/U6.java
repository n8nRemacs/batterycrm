package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;

/* loaded from: classes7.dex */
public class U6 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38904jf fromModel(@j.N D6 d62) {
        C38904jf c38904jf = new C38904jf();
        String strA = d62.a();
        String str = c38904jf.f380899a;
        if (strA == null) {
            strA = str;
        }
        c38904jf.f380899a = strA;
        String strC = d62.c();
        String str2 = c38904jf.f380900b;
        if (strC == null) {
            strC = str2;
        }
        c38904jf.f380900b = strC;
        Integer numD = d62.d();
        Integer numValueOf = Integer.valueOf(c38904jf.f380901c);
        if (numD == null) {
            numD = numValueOf;
        }
        c38904jf.f380901c = numD.intValue();
        Integer numB = d62.b();
        Integer numValueOf2 = Integer.valueOf(c38904jf.f380904f);
        if (numB == null) {
            numB = numValueOf2;
        }
        c38904jf.f380904f = numB.intValue();
        String strE = d62.e();
        String str3 = c38904jf.f380902d;
        if (strE == null) {
            strE = str3;
        }
        c38904jf.f380902d = strE;
        Boolean boolF = d62.f();
        Boolean boolValueOf = Boolean.valueOf(c38904jf.f380903e);
        if (boolF == null) {
            boolF = boolValueOf;
        }
        c38904jf.f380903e = boolF.booleanValue();
        return c38904jf;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }
}
