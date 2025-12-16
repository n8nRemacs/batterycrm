package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.P3;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class F4<T, C extends P3> {

    /* renamed from: a, reason: collision with root package name */
    private final K4<T> f378134a;

    public interface a<T> {
        boolean a(T t12, C38715c0 c38715c0);
    }

    public F4(K4<T> k42, C c12) {
        this.f378134a = k42;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean a(@j.N C38715c0 c38715c0, @j.N a<T> aVar) {
        Iterator<Object> it = this.f378134a.a(c38715c0.o()).a().iterator();
        while (it.hasNext()) {
            if (aVar.a(it.next(), c38715c0)) {
                return true;
            }
        }
        return false;
    }
}
