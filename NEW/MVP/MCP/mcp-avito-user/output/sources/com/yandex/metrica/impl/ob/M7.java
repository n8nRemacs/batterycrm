package com.yandex.metrica.impl.ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.ob.C38897j8;
import com.yandex.metrica.impl.ob.X7;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class M7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final N7 f378884a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final P7 f378885b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final X7.b f378886c;

    public M7(@j.N N7 n72, @j.N P7 p72, @j.N X7.b bVar) {
        this.f378884a = n72;
        this.f378885b = p72;
        this.f378886c = bVar;
    }

    public X7 a() {
        HashMap map = new HashMap();
        map.put("binary_data", C38897j8.b.f380856a);
        return this.f378886c.a("auto_inapp", this.f378884a.a(), this.f378884a.b(), new SparseArray<>(), new Z7("auto_inapp", map));
    }

    public X7 b() {
        HashMap map = new HashMap();
        map.put("preferences", C38897j8.c.f380857a);
        return this.f378886c.a("client storage", this.f378884a.c(), this.f378884a.d(), new SparseArray<>(), new Z7("metrica.db", map));
    }

    public X7 c() {
        return this.f378886c.a("main", this.f378884a.e(), this.f378884a.f(), this.f378884a.l(), new Z7("main", this.f378885b.a()));
    }

    public X7 d() {
        HashMap map = new HashMap();
        map.put("preferences", C38897j8.c.f380857a);
        return this.f378886c.a("metrica_multiprocess.db", this.f378884a.g(), this.f378884a.h(), new SparseArray<>(), new Z7("metrica_multiprocess.db", map));
    }

    public X7 e() {
        HashMap map = new HashMap();
        List<String> list = C38897j8.c.f380857a;
        map.put("preferences", list);
        map.put("binary_data", C38897j8.b.f380856a);
        map.put("startup", list);
        List<String> list2 = C38897j8.a.f380851a;
        map.put("l_dat", list2);
        map.put("lbs_dat", list2);
        return this.f378886c.a("metrica.db", this.f378884a.i(), this.f378884a.j(), this.f378884a.k(), new Z7("metrica.db", map));
    }
}
