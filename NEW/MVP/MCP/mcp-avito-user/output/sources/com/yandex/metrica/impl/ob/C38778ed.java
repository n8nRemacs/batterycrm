package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C39054pf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ed, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38778ed {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final U7 f380477a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final T7 f380478b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38703bd f380479c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Zc f380480d;

    public C38778ed(@j.N Context context) {
        this(C38899ja.a(context).f(), C38899ja.a(context).e(), new Vb(context), new C38678ad(), new Yc());
    }

    public C38753dd a(int i12) {
        Map<Long, String> mapA = this.f380477a.a(i12);
        Map<Long, String> mapA2 = this.f380478b.a(i12);
        C39054pf c39054pf = new C39054pf();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapA;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C39054pf.b bVarA = this.f380479c.a(((Long) entry.getKey()).longValue(), (String) entry.getValue());
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        c39054pf.f381295a = (C39054pf.b[]) arrayList.toArray(new C39054pf.b[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) mapA2;
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            C39054pf.a aVarA = this.f380480d.a(((Long) entry2.getKey()).longValue(), (String) entry2.getValue());
            if (aVarA != null) {
                arrayList2.add(aVarA);
            }
        }
        c39054pf.f381296b = (C39054pf.a[]) arrayList2.toArray(new C39054pf.a[arrayList2.size()]);
        return new C38753dd(mapA.isEmpty() ? -1L : ((Long) Collections.max(linkedHashMap.keySet())).longValue(), mapA2.isEmpty() ? -1L : ((Long) Collections.max(linkedHashMap2.keySet())).longValue(), c39054pf);
    }

    @j.k0
    public C38778ed(@j.N U7 u72, @j.N T7 t72, @j.N Vb vb2, @j.N C38678ad c38678ad, @j.N Yc yc2) {
        this(u72, t72, new C38703bd(vb2, c38678ad), new Zc(vb2, yc2));
    }

    @j.k0
    public C38778ed(@j.N U7 u72, @j.N T7 t72, @j.N C38703bd c38703bd, @j.N Zc zc2) {
        this.f380477a = u72;
        this.f380478b = t72;
        this.f380479c = c38703bd;
        this.f380480d = zc2;
    }

    public void a(C38753dd c38753dd) {
        long j12 = c38753dd.f380369a;
        if (j12 >= 0) {
            this.f380477a.c(j12);
        }
        long j13 = c38753dd.f380370b;
        if (j13 >= 0) {
            this.f380478b.c(j13);
        }
    }
}
