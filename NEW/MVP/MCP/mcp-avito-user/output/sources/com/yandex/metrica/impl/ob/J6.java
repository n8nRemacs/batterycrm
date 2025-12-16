package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class J6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private V6 f378564a;

    public J6(@j.N V6 v62) {
        this.f378564a = v62;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38755df fromModel(@j.N C39212w6 c39212w6) {
        C38755df c38755df = new C38755df();
        E6 e62 = c39212w6.f382099a;
        if (e62 != null) {
            c38755df.f380372a = this.f378564a.fromModel(e62);
        }
        c38755df.f380373b = new C38929kf[c39212w6.f382100b.size()];
        Iterator<E6> it = c39212w6.f382100b.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            c38755df.f380373b[i12] = this.f378564a.fromModel(it.next());
            i12++;
        }
        String str = c39212w6.f382101c;
        if (str != null) {
            c38755df.f380374c = str;
        }
        return c38755df;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }
}
