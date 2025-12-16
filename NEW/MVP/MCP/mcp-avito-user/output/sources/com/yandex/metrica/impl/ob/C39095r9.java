package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C39221wf;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.r9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39095r9 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39167u9 f381732a;

    public C39095r9() {
        this(new C39167u9());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        C39147td c39147td = (C39147td) obj;
        C39221wf c39221wf = new C39221wf();
        c39221wf.f382122a = new C39221wf.b[c39147td.f381879a.size()];
        int i12 = 0;
        int i13 = 0;
        for (Bd bd2 : c39147td.f381879a) {
            C39221wf.b[] bVarArr = c39221wf.f382122a;
            C39221wf.b bVar = new C39221wf.b();
            bVar.f382128a = bd2.f377845a;
            bVar.f382129b = bd2.f377846b;
            bVarArr[i13] = bVar;
            i13++;
        }
        C39277z c39277z = c39147td.f381880b;
        if (c39277z != null) {
            c39221wf.f382123b = this.f381732a.fromModel(c39277z);
        }
        c39221wf.f382124c = new String[c39147td.f381881c.size()];
        Iterator<String> it = c39147td.f381881c.iterator();
        while (it.hasNext()) {
            c39221wf.f382124c[i12] = it.next();
            i12++;
        }
        return c39221wf;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        C39221wf c39221wf = (C39221wf) obj;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            C39221wf.b[] bVarArr = c39221wf.f382122a;
            if (i13 >= bVarArr.length) {
                break;
            }
            C39221wf.b bVar = bVarArr[i13];
            arrayList.add(new Bd(bVar.f382128a, bVar.f382129b));
            i13++;
        }
        C39221wf.a aVar = c39221wf.f382123b;
        C39277z model = aVar != null ? this.f381732a.toModel(aVar) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c39221wf.f382124c;
            if (i12 >= strArr.length) {
                return new C39147td(arrayList, model, arrayList2);
            }
            arrayList2.add(strArr[i12]);
            i12++;
        }
    }

    @j.k0
    public C39095r9(@j.N C39167u9 c39167u9) {
        this.f381732a = c39167u9;
    }
}
