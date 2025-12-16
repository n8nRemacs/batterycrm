package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ListConverter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class T6 implements ListConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private U6 f379507a = new U6();

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38904jf[] fromModel(@j.N List<D6> list) {
        C38904jf[] c38904jfArr = new C38904jf[list.size()];
        Iterator<D6> it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            c38904jfArr[i12] = this.f379507a.fromModel(it.next());
            i12++;
        }
        return c38904jfArr;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }
}
