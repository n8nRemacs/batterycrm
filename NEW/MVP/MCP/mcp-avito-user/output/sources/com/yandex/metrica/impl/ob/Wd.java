package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Cf;
import com.yandex.metrica.impl.ob.Ud;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class Wd implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38804fe f379818a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Sd f379819b;

    public Wd() {
        this(new C38804fe(), new Sd());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        Ud ud2 = (Ud) obj;
        Cf cf2 = new Cf();
        cf2.f377902a = this.f379818a.fromModel(ud2.f379611a);
        cf2.f377903b = new Cf.b[ud2.f379612b.size()];
        Iterator<Ud.a> it = ud2.f379612b.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            cf2.f377903b[i12] = this.f379819b.fromModel(it.next());
            i12++;
        }
        return cf2;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        Cf cf2 = (Cf) obj;
        ArrayList arrayList = new ArrayList(cf2.f377903b.length);
        for (Cf.b bVar : cf2.f377903b) {
            arrayList.add(this.f379819b.toModel(bVar));
        }
        Cf.a aVar = cf2.f377902a;
        return new Ud(aVar == null ? this.f379818a.toModel(new Cf.a()) : this.f379818a.toModel(aVar), arrayList);
    }

    @j.k0
    public Wd(@j.N C38804fe c38804fe, @j.N Sd sd2) {
        this.f379818a = c38804fe;
        this.f379819b = sd2;
    }
}
