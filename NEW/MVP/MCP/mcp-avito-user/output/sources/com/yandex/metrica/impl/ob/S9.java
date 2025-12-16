package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C38708bi;
import com.yandex.metrica.impl.ob.If;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class S9 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Integer, C38708bi.a> f379357a = Collections.unmodifiableMap(new a());

    /* renamed from: b, reason: collision with root package name */
    private static final Map<C38708bi.a, Integer> f379358b = Collections.unmodifiableMap(new b());

    public class a extends HashMap<Integer, C38708bi.a> {
        public a() {
            put(1, C38708bi.a.WIFI);
            put(2, C38708bi.a.CELL);
        }
    }

    public class b extends HashMap<C38708bi.a, Integer> {
        public b() {
            put(C38708bi.a.WIFI, 1);
            put(C38708bi.a.CELL, 2);
        }
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.o fromModel(@j.N C38708bi c38708bi) {
        If.o oVar = new If.o();
        oVar.f378429a = c38708bi.f380219a;
        oVar.f378430b = c38708bi.f380220b;
        oVar.f378431c = c38708bi.f380221c;
        List<Pair<String, String>> list = c38708bi.f380222d;
        If.o.a[] aVarArr = new If.o.a[list.size()];
        int i12 = 0;
        for (Pair<String, String> pair : list) {
            If.o.a aVar = new If.o.a();
            aVar.f378436a = (String) pair.first;
            aVar.f378437b = (String) pair.second;
            aVarArr[i12] = aVar;
            i12++;
        }
        oVar.f378432d = aVarArr;
        Long l12 = c38708bi.f380223e;
        oVar.f378433e = l12 == null ? 0L : l12.longValue();
        List<C38708bi.a> list2 = c38708bi.f380224f;
        int[] iArr = new int[list2.size()];
        for (int i13 = 0; i13 < list2.size(); i13++) {
            iArr[i13] = f379358b.get(list2.get(i13)).intValue();
        }
        oVar.f378434f = iArr;
        return oVar;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38708bi toModel(@j.N If.o oVar) {
        String str = oVar.f378429a;
        String str2 = oVar.f378430b;
        String str3 = oVar.f378431c;
        If.o.a[] aVarArr = oVar.f378432d;
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (If.o.a aVar : aVarArr) {
            arrayList.add(new Pair(aVar.f378436a, aVar.f378437b));
        }
        Long lValueOf = Long.valueOf(oVar.f378433e);
        int[] iArr = oVar.f378434f;
        ArrayList arrayList2 = new ArrayList(iArr.length);
        for (int i12 : iArr) {
            arrayList2.add(f379357a.get(Integer.valueOf(i12)));
        }
        return new C38708bi(str, str2, str3, arrayList, lValueOf, arrayList2);
    }
}
