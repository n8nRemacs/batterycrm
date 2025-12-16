package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Oh;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.s9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39119s9 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.a fromModel(@j.N Oh oh2) {
        If.a.C10952a c10952a;
        If.a aVar = new If.a();
        aVar.f378337a = new If.a.b[oh2.f379106a.size()];
        for (int i12 = 0; i12 < oh2.f379106a.size(); i12++) {
            If.a.b bVar = new If.a.b();
            Pair<String, Oh.a> pair = oh2.f379106a.get(i12);
            bVar.f378340a = (String) pair.first;
            if (pair.second != null) {
                bVar.f378341b = new If.a.C10952a();
                Oh.a aVar2 = (Oh.a) pair.second;
                if (aVar2 == null) {
                    c10952a = null;
                } else {
                    If.a.C10952a c10952a2 = new If.a.C10952a();
                    c10952a2.f378338a = aVar2.f379107a;
                    c10952a = c10952a2;
                }
                bVar.f378341b = c10952a;
            }
            aVar.f378337a[i12] = bVar;
        }
        return aVar;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Oh toModel(@j.N If.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (If.a.b bVar : aVar.f378337a) {
            String str = bVar.f378340a;
            If.a.C10952a c10952a = bVar.f378341b;
            arrayList.add(new Pair(str, c10952a == null ? null : new Oh.a(c10952a.f378338a)));
        }
        return new Oh(arrayList);
    }
}
