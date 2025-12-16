package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Ff;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class V9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        C38782eh c38782eh = (C38782eh) obj;
        Ff ff2 = new Ff();
        ff2.f378142a = new Ff.a[c38782eh.f380491a.size()];
        for (int i12 = 0; i12 < c38782eh.f380491a.size(); i12++) {
            Ff.a[] aVarArr = ff2.f378142a;
            C38857hh c38857hh = c38782eh.f380491a.get(i12);
            Ff.a aVar = new Ff.a();
            aVar.f378148a = c38857hh.f380718a;
            List<String> list = c38857hh.f380719b;
            aVar.f378149b = new String[list.size()];
            Iterator<String> it = list.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                aVar.f378149b[i13] = it.next();
                i13++;
            }
            aVarArr[i12] = aVar;
        }
        ff2.f378143b = c38782eh.f380492b;
        ff2.f378144c = c38782eh.f380493c;
        ff2.f378145d = c38782eh.f380494d;
        ff2.f378146e = c38782eh.f380495e;
        return ff2;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        Ff ff2 = (Ff) obj;
        ArrayList arrayList = new ArrayList(ff2.f378142a.length);
        int i12 = 0;
        while (true) {
            Ff.a[] aVarArr = ff2.f378142a;
            if (i12 >= aVarArr.length) {
                return new C38782eh(arrayList, ff2.f378143b, ff2.f378144c, ff2.f378145d, ff2.f378146e);
            }
            Ff.a aVar = aVarArr[i12];
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = aVar.f378149b;
            if (strArr != null && strArr.length > 0) {
                arrayList2 = new ArrayList(aVar.f378149b.length);
                int i13 = 0;
                while (true) {
                    String[] strArr2 = aVar.f378149b;
                    if (i13 >= strArr2.length) {
                        break;
                    }
                    arrayList2.add(strArr2[i13]);
                    i13++;
                }
            }
            String str = aVar.f378148a;
            if (str == null) {
                str = "";
            }
            arrayList.add(new C38857hh(str, arrayList2));
            i12++;
        }
    }
}
