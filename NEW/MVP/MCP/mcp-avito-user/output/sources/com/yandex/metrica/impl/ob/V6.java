package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class V6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final T6 f379776a;

    public V6() {
        this(new T6());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38929kf fromModel(@j.N E6 e62) {
        C38929kf c38929kf = new C38929kf();
        Integer num = e62.f378036e;
        c38929kf.f380923e = num == null ? -1 : num.intValue();
        c38929kf.f380922d = e62.f378035d;
        c38929kf.f380920b = e62.f378033b;
        c38929kf.f380919a = e62.f378032a;
        c38929kf.f380921c = e62.f378034c;
        T6 t62 = this.f379776a;
        List<StackTraceElement> list = e62.f378037f;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new D6((StackTraceElement) it.next()));
        }
        c38929kf.f380924f = t62.fromModel(arrayList);
        return c38929kf;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public V6(@j.N T6 t62) {
        this.f379776a = t62;
    }
}
