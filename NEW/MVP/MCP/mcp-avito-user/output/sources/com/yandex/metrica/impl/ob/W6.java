package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class W6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final T6 f379806a;

    public W6() {
        this(new T6());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38954lf fromModel(@j.N F6 f62) {
        C38954lf c38954lf = new C38954lf();
        String strB = f62.b();
        if (strB == null) {
            strB = "";
        }
        c38954lf.f380978a = strB;
        String strC = f62.c();
        c38954lf.f380979b = strC != null ? strC : "";
        c38954lf.f380980c = this.f379806a.fromModel(f62.d());
        if (f62.a() != null) {
            c38954lf.f380981d = fromModel(f62.a());
        }
        List<F6> listE = f62.e();
        int i12 = 0;
        if (listE == null) {
            c38954lf.f380982e = new C38954lf[0];
        } else {
            c38954lf.f380982e = new C38954lf[listE.size()];
            Iterator<F6> it = listE.iterator();
            while (it.hasNext()) {
                c38954lf.f380982e[i12] = fromModel(it.next());
                i12++;
            }
        }
        return c38954lf;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public W6(@j.N T6 t62) {
        this.f379806a = t62;
    }
}
