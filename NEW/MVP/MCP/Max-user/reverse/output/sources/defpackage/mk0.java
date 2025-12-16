package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class mk0 implements oac {
    public static final ih7 w0;
    public static final Object x0;
    public final HashMap X;
    public boolean Y;
    public m9c Z;
    public final rf7 a;
    public final String b;
    public final rac c;
    public final Object d;
    public final qf7 o;
    public boolean s0;
    public boolean t0;
    public final ArrayList u0;
    public final ff7 v0;

    static {
        String[] strArr = {"id", HasExtraData.KEY_URI_SOURCE};
        int i = ih7.a;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, strArr);
        w0 = new ih7(hashSet);
        x0 = new Object();
    }

    public mk0(rf7 rf7Var, String str, String str2, rac racVar, Object obj, qf7 qf7Var, boolean z, boolean z2, m9c m9cVar, ff7 ff7Var) {
        this.a = rf7Var;
        this.b = str;
        HashMap map = new HashMap();
        this.X = map;
        map.put("id", str);
        map.put(HasExtraData.KEY_URI_SOURCE, rf7Var == null ? "null-request" : rf7Var.b);
        this.c = racVar;
        this.d = obj == null ? x0 : obj;
        this.o = qf7Var;
        this.Y = z;
        this.Z = m9cVar;
        this.s0 = z2;
        this.t0 = false;
        this.u0 = new ArrayList();
        this.v0 = ff7Var;
    }

    public static void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((nk0) it.next()).b();
        }
    }

    public static void c(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((nk0) it.next()).c();
        }
    }

    public static void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((nk0) it.next()).d();
        }
    }

    public final void a(nk0 nk0Var) {
        boolean z;
        synchronized (this) {
            this.u0.add(nk0Var);
            z = this.t0;
        }
        if (z) {
            nk0Var.a();
        }
    }

    public final void e() {
        ArrayList arrayList;
        synchronized (this) {
            if (this.t0) {
                arrayList = null;
            } else {
                this.t0 = true;
                arrayList = new ArrayList(this.u0);
            }
        }
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((nk0) it.next()).a();
        }
    }

    public final synchronized boolean f() {
        return this.s0;
    }

    public final synchronized boolean g() {
        return this.Y;
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str) {
        return this.X.get(str);
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Map getExtras() {
        return this.X;
    }

    public final void h(String str, String str2) {
        HashMap map = this.X;
        map.put(HasExtraData.KEY_ORIGIN, str);
        map.put(HasExtraData.KEY_ORIGIN_SUBCATEGORY, str2);
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtra(String str, Object obj) {
        if (w0.contains(str)) {
            return;
        }
        this.X.put(str, obj);
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtras(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            putExtra((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str, Object obj) {
        Object obj2 = this.X.get(str);
        return obj2 == null ? obj : obj2;
    }
}
