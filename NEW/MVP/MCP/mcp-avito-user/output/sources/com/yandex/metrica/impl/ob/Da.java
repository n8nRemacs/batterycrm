package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C38979mf;
import java.util.List;

/* loaded from: classes7.dex */
public class Da implements Converter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38912jn f377961a;

    public Da() {
        this(new C38912jn(20, 100));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Na<C38979mf.d, Vm> fromModel(@j.N List<String> list) {
        C38838gn<List<String>, Xm> c38838gnA = this.f377961a.a((List) list);
        C38979mf.d dVar = new C38979mf.d();
        List<String> list2 = c38838gnA.f380668a;
        byte[][] bArr = new byte[0][];
        if (list2 != null) {
            bArr = new byte[list2.size()][];
            for (int i12 = 0; i12 < list2.size(); i12++) {
                bArr[i12] = C38689b.b(list2.get(i12));
            }
        }
        dVar.f381069a = bArr;
        return new Na<>(dVar, c38838gnA.f380669b);
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Da(@j.N C38912jn c38912jn) {
        this.f377961a = c38912jn;
    }
}
