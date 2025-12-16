package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C38979mf;
import java.util.List;

/* loaded from: classes7.dex */
public class Ka implements Converter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38912jn f378699a;

    public Ka() {
        this(new C38912jn(20, 100));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Na<C38979mf.l[], Vm> fromModel(@j.N List<String> list) {
        C38838gn<List<String>, Xm> c38838gnA = this.f378699a.a((List) list);
        List<String> list2 = c38838gnA.f380668a;
        C38979mf.l[] lVarArr = new C38979mf.l[0];
        if (list2 != null) {
            lVarArr = new C38979mf.l[list2.size()];
            for (int i12 = 0; i12 < list2.size(); i12++) {
                C38979mf.l lVar = new C38979mf.l();
                lVarArr[i12] = lVar;
                lVar.f381096a = C38689b.b(list2.get(i12));
            }
        }
        return new Na<>(lVarArr, c38838gnA.f380669b);
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Ka(@j.N C38912jn c38912jn) {
        this.f378699a = c38912jn;
    }
}
