package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C38830gf;
import java.util.EnumMap;

/* loaded from: classes7.dex */
public class P6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    private static final EnumMap<EnumC38822g7, Integer> f379158a;

    static {
        EnumMap<EnumC38822g7, Integer> enumMap = new EnumMap<>(EnumC38822g7.class);
        f379158a = enumMap;
        enumMap.put((EnumMap<EnumC38822g7, Integer>) EnumC38822g7.UNKNOWN, (EnumC38822g7) 0);
        enumMap.put((EnumMap<EnumC38822g7, Integer>) EnumC38822g7.BREAKPAD, (EnumC38822g7) 2);
        enumMap.put((EnumMap<EnumC38822g7, Integer>) EnumC38822g7.CRASHPAD, (EnumC38822g7) 3);
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38830gf fromModel(@j.N C38747d7 c38747d7) {
        C38830gf c38830gf = new C38830gf();
        c38830gf.f380643f = 1;
        C38830gf.a aVar = new C38830gf.a();
        c38830gf.f380644g = aVar;
        aVar.f380648a = c38747d7.a();
        C38722c7 c38722c7B = c38747d7.b();
        c38830gf.f380644g.f380649b = new Cif();
        Integer num = f379158a.get(c38722c7B.b());
        if (num != null) {
            c38830gf.f380644g.f380649b.f380788a = num.intValue();
        }
        Cif cif = c38830gf.f380644g.f380649b;
        String strA = c38722c7B.a();
        if (strA == null) {
            strA = "";
        }
        cif.f380789b = strA;
        return c38830gf;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }
}
