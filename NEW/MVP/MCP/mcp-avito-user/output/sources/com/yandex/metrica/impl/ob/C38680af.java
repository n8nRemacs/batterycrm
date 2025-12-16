package com.yandex.metrica.impl.ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.ob.C39197vf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.af, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38680af {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f380123c = {0, 1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<HashMap<String, C39197vf.a>> f380124a;

    /* renamed from: b, reason: collision with root package name */
    private int f380125b;

    public C38680af() {
        this(f380123c);
    }

    @j.P
    public C39197vf.a a(int i12, @j.N String str) {
        return this.f380124a.get(i12).get(str);
    }

    public void b() {
        this.f380125b++;
    }

    @j.N
    public C39197vf c() {
        C39197vf c39197vf = new C39197vf();
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < this.f380124a.size(); i12++) {
            SparseArray<HashMap<String, C39197vf.a>> sparseArray = this.f380124a;
            Iterator<C39197vf.a> it = sparseArray.get(sparseArray.keyAt(i12)).values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        c39197vf.f382068a = (C39197vf.a[]) arrayList.toArray(new C39197vf.a[arrayList.size()]);
        return c39197vf;
    }

    @j.k0
    public C38680af(int[] iArr) {
        this.f380124a = new SparseArray<>();
        this.f380125b = 0;
        for (int i12 : iArr) {
            this.f380124a.put(i12, new HashMap<>());
        }
    }

    public void a(@j.N C39197vf.a aVar) {
        this.f380124a.get(aVar.f382071b).put(new String(aVar.f382070a), aVar);
    }

    public int a() {
        return this.f380125b;
    }
}
