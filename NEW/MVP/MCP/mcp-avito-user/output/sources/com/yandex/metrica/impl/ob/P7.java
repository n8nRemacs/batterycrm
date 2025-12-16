package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C38897j8;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class P7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final HashMap<String, List<String>> f379159a;

    public P7() {
        HashMap<String, List<String>> map = new HashMap<>();
        this.f379159a = map;
        map.put("reports", C38897j8.d.f380858a);
        map.put("sessions", C38897j8.e.f380860a);
        map.put("preferences", C38897j8.c.f380857a);
        map.put("binary_data", C38897j8.b.f380856a);
    }

    @j.N
    public HashMap<String, List<String>> a() {
        return this.f379159a;
    }
}
