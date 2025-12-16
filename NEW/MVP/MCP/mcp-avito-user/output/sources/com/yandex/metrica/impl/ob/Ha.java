package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C38979mf;
import java.util.Map;

/* loaded from: classes7.dex */
public class Ha implements Converter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38962ln f378250a;

    public Ha() {
        this(new C38962ln(20480, 100, 1000));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Na<C38979mf.i, Vm> fromModel(@j.N Map<String, String> map) {
        C38838gn<Map<String, String>, Xm> c38838gnA = this.f378250a.a(map);
        C38979mf.i iVar = new C38979mf.i();
        iVar.f381082b = ((Xm) c38838gnA.f380669b).f379942b;
        Map<String, String> map2 = c38838gnA.f380668a;
        if (map2 != null) {
            iVar.f381081a = new C38979mf.i.a[map2.size()];
            int i12 = 0;
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                iVar.f381081a[i12] = new C38979mf.i.a();
                iVar.f381081a[i12].f381084a = C38689b.b(entry.getKey());
                iVar.f381081a[i12].f381085b = C38689b.b(entry.getValue());
                i12++;
            }
        }
        return new Na<>(iVar, c38838gnA.f380669b);
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Ha(@j.N C38962ln c38962ln) {
        this.f378250a = c38962ln;
    }
}
