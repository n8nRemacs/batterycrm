package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ListConverter;
import com.yandex.metrica.impl.ob.If;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class O9 implements ListConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.m[] fromModel(@j.N List<Bd> list) {
        If.m[] mVarArr = new If.m[list.size()];
        for (int i12 = 0; i12 < list.size(); i12++) {
            Bd bd2 = list.get(i12);
            If.m mVar = new If.m();
            mVar.f378424a = bd2.f377845a;
            mVar.f378425b = bd2.f377846b;
            mVarArr[i12] = mVar;
        }
        return mVarArr;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<Bd> toModel(@j.N If.m[] mVarArr) {
        ArrayList arrayList = new ArrayList(mVarArr.length);
        for (If.m mVar : mVarArr) {
            arrayList.add(new Bd(mVar.f378424a, mVar.f378425b));
        }
        return arrayList;
    }
}
