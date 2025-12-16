package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Bf;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class P9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        List list = (List) obj;
        Bf bf2 = new Bf();
        bf2.f377847a = new Bf.a[list.size()];
        for (int i12 = 0; i12 < list.size(); i12++) {
            Bf.a[] aVarArr = bf2.f377847a;
            Bd bd2 = (Bd) list.get(i12);
            Bf.a aVar = new Bf.a();
            aVar.f377849a = bd2.f377845a;
            aVar.f377850b = bd2.f377846b;
            aVarArr[i12] = aVar;
        }
        return bf2;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        Bf bf2 = (Bf) obj;
        ArrayList arrayList = new ArrayList(bf2.f377847a.length);
        int i12 = 0;
        while (true) {
            Bf.a[] aVarArr = bf2.f377847a;
            if (i12 >= aVarArr.length) {
                return arrayList;
            }
            Bf.a aVar = aVarArr[i12];
            arrayList.add(new Bd(aVar.f377849a, aVar.f377850b));
            i12++;
        }
    }
}
