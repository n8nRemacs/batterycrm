package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.p4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39043p4 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, X3> f381282a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, F3> f381283b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final Context f381284c;

    public C39043p4(@j.N Context context) {
        this.f381284c = context.getApplicationContext();
    }

    @j.P
    public synchronized X3 a(@j.N I3 i32) {
        return this.f381282a.get(i32.toString());
    }

    @j.N
    public synchronized X3 b(@j.N I3 i32, @j.N D3 d32, @j.N N3<X3> n32) {
        return (X3) a(i32, d32, n32, this.f381282a);
    }

    @j.N
    public synchronized F3 a(@j.N I3 i32, @j.N D3 d32, @j.N N3<F3> n32) {
        return (F3) a(i32, d32, n32, this.f381283b);
    }

    @j.N
    private <T extends R3> T a(@j.N I3 i32, @j.N D3 d32, @j.N N3<T> n32, @j.N Map<String, T> map) {
        T t12 = map.get(i32.toString());
        if (t12 == null) {
            T t13 = (T) n32.a(this.f381284c, i32, d32);
            map.put(i32.toString(), t13);
            return t13;
        }
        t12.a(d32);
        return t12;
    }
}
