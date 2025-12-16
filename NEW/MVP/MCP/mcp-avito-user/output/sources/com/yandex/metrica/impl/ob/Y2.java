package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C39245xf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class Y2 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38668a3 f379948a;

    public Y2() {
        this(new C38668a3());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        X2 x22 = (X2) obj;
        C39245xf c39245xf = new C39245xf();
        c39245xf.f382189a = new C39245xf.a[x22.f379840a.size()];
        Iterator<T21.a> it = x22.f379840a.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            c39245xf.f382189a[i12] = this.f379948a.fromModel(it.next());
            i12++;
        }
        c39245xf.f382190b = x22.f379841b;
        return c39245xf;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        C39245xf c39245xf = (C39245xf) obj;
        ArrayList arrayList = new ArrayList(c39245xf.f382189a.length);
        for (C39245xf.a aVar : c39245xf.f382189a) {
            arrayList.add(this.f379948a.toModel(aVar));
        }
        return new X2(arrayList, c39245xf.f382190b);
    }

    @j.k0
    public Y2(@j.N C38668a3 c38668a3) {
        this.f379948a = c38668a3;
    }
}
