package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ListConverter;
import com.yandex.metrica.impl.ob.C39299zl;
import com.yandex.metrica.impl.ob.If;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ba, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38700ba implements ListConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.y[] fromModel(@j.N List<C39299zl> list) {
        If.y[] yVarArr = new If.y[list.size()];
        for (int i12 = 0; i12 < list.size(); i12++) {
            C39299zl c39299zl = list.get(i12);
            If.y yVar = new If.y();
            yVar.f378485a = c39299zl.f382327a.f382334a;
            yVar.f378486b = c39299zl.f382328b;
            yVarArr[i12] = yVar;
        }
        return yVarArr;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<C39299zl> toModel(@j.N If.y[] yVarArr) {
        ArrayList arrayList = new ArrayList(yVarArr.length);
        for (If.y yVar : yVarArr) {
            arrayList.add(new C39299zl(C39299zl.b.a(yVar.f378485a), yVar.f378486b));
        }
        return arrayList;
    }
}
