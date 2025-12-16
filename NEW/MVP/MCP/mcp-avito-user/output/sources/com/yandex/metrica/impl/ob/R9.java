package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Df;
import com.yandex.metrica.impl.ob.H1;
import com.yandex.metrica.impl.ob.Jf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class R9 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Integer, H1.d> f379289a = Collections.unmodifiableMap(new a());

    /* renamed from: b, reason: collision with root package name */
    private static final Map<H1.d, Integer> f379290b = Collections.unmodifiableMap(new b());

    public class a extends HashMap<Integer, H1.d> {
        public a() {
            put(1, H1.d.WIFI);
            put(2, H1.d.CELL);
        }
    }

    public class b extends HashMap<H1.d, Integer> {
        public b() {
            put(H1.d.WIFI, 1);
            put(H1.d.CELL, 2);
        }
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        Jf.e eVar = (Jf.e) obj;
        Df df2 = new Df();
        Set<String> setA = eVar.a();
        df2.f377970b = (String[]) setA.toArray(new String[((HashSet) setA).size()]);
        List<Jf.e.a> listB = eVar.b();
        Df.a[] aVarArr = new Df.a[listB.size()];
        for (int i12 = 0; i12 < listB.size(); i12++) {
            Jf.e.a aVar = listB.get(i12);
            Df.a aVar2 = new Df.a();
            aVar2.f377972a = aVar.f378599a;
            aVar2.f377973b = aVar.f378600b;
            Df.a.C10950a[] c10950aArr = new Df.a.C10950a[aVar.f378602d.c()];
            int i13 = 0;
            for (Map.Entry<String, ? extends Collection<String>> entry : aVar.f378602d.a()) {
                for (String str : entry.getValue()) {
                    Df.a.C10950a c10950a = new Df.a.C10950a();
                    c10950a.f377979a = entry.getKey();
                    c10950a.f377980b = str;
                    c10950aArr[i13] = c10950a;
                    i13++;
                }
            }
            aVar2.f377975d = c10950aArr;
            aVar2.f377974c = aVar.f378601c;
            aVar2.f377976e = aVar.f378603e;
            List<H1.d> list = aVar.f378604f;
            int[] iArr = new int[list.size()];
            for (int i14 = 0; i14 < list.size(); i14++) {
                iArr[i14] = f379290b.get(list.get(i14)).intValue();
            }
            aVar2.f377977f = iArr;
            aVarArr[i12] = aVar2;
        }
        df2.f377969a = aVarArr;
        return df2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        Df df2 = (Df) obj;
        ArrayList arrayList = new ArrayList();
        Df.a[] aVarArr = df2.f377969a;
        int length = aVarArr.length;
        boolean z12 = false;
        int i12 = 0;
        while (i12 < length) {
            Df.a aVar = aVarArr[i12];
            String str = aVar.f377972a;
            String str2 = aVar.f377973b;
            String str3 = aVar.f377974c;
            Df.a.C10950a[] c10950aArr = aVar.f377975d;
            C39108rm c39108rm = new C39108rm(z12);
            int length2 = c10950aArr.length;
            for (?? r14 = z12; r14 < length2; r14++) {
                Df.a.C10950a c10950a = c10950aArr[r14];
                c39108rm.a(c10950a.f377979a, c10950a.f377980b);
                aVarArr = aVarArr;
            }
            Df.a[] aVarArr2 = aVarArr;
            long j12 = aVar.f377976e;
            int[] iArr = aVar.f377977f;
            ArrayList arrayList2 = new ArrayList(iArr.length);
            int length3 = iArr.length;
            int i13 = 0;
            while (i13 < length3) {
                arrayList2.add(f379289a.get(Integer.valueOf(iArr[i13])));
                i13++;
                iArr = iArr;
                length = length;
            }
            arrayList.add(new Jf.e.a(str, str2, str3, c39108rm, j12, arrayList2));
            i12++;
            aVarArr = aVarArr2;
            z12 = false;
        }
        return new Jf.e(arrayList, Arrays.asList(df2.f377970b));
    }
}
