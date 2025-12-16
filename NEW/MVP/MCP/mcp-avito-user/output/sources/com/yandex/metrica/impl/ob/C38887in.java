package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.in, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38887in<T> extends AbstractC38863hn {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final AbstractC38863hn f380800b;

    public C38887in(int i12) {
        this(i12, null);
    }

    public int b(@j.P T t12) {
        throw null;
    }

    public C38887in(int i12, @j.P AbstractC38863hn abstractC38863hn) {
        super(i12);
        this.f380800b = abstractC38863hn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.impl.ob.AbstractC38863hn
    @j.N
    public C38838gn<List<T>, Xm> a(@j.P List<T> list) {
        int iB2;
        int i12 = 0;
        if (list == null || (list.size() <= a() && this.f380800b == null)) {
            iB2 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iB2 = 0;
            int i13 = 0;
            for (T t12 : list) {
                if (i13 < a()) {
                    AbstractC38863hn abstractC38863hn = this.f380800b;
                    if (abstractC38863hn != null) {
                        C38838gn<Object, Vm> c38838gnA = abstractC38863hn.a(t12);
                        Object obj = c38838gnA.f380668a;
                        iB2 += c38838gnA.f380669b.a();
                        t12 = obj;
                    }
                    arrayList.add(t12);
                } else {
                    i12++;
                    iB2 += b(t12);
                }
                i13++;
            }
            list = arrayList;
        }
        return new C38838gn<>(list, new Xm(i12, iB2));
    }
}
