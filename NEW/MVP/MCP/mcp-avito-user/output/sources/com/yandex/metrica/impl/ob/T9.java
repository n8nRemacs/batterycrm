package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Ef;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes7.dex */
public class T9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        Ef.a aVar;
        Z1 z12 = (Z1) obj;
        Ef ef2 = new Ef();
        Map<String, String> map = z12.f379978a;
        if (map == null) {
            aVar = null;
        } else {
            Ef.a aVar2 = new Ef.a();
            aVar2.f378050a = new Ef.a.C10951a[map.size()];
            int i12 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Ef.a.C10951a c10951a = new Ef.a.C10951a();
                c10951a.f378052a = entry.getKey();
                c10951a.f378053b = entry.getValue();
                aVar2.f378050a[i12] = c10951a;
                i12++;
            }
            aVar = aVar2;
        }
        ef2.f378048a = aVar;
        ef2.f378049b = z12.f379979b;
        return ef2;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        HashMap map;
        Ef ef2 = (Ef) obj;
        Ef.a aVar = ef2.f378048a;
        if (aVar == null) {
            map = null;
        } else {
            HashMap map2 = new HashMap();
            for (Ef.a.C10951a c10951a : aVar.f378050a) {
                map2.put(c10951a.f378052a, c10951a.f378053b);
            }
            map = map2;
        }
        return new Z1(map, ef2.f378049b);
    }
}
