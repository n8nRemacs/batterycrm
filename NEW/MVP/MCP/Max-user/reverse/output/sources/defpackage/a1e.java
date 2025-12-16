package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import scout.exception.ElementCreationFailedException;
import scout.exception.MissingObjectFactoryException;
import scout.exception.ObjectCreationFailedException;
import scout.exception.ObjectNullabilityException;

/* loaded from: classes.dex */
public final class a1e {
    public final String a;
    public final List b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Set f;
    public final w5 g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final int l;

    public a1e(String str, ArrayList arrayList, HashMap map, HashMap map2, HashMap map3, HashSet hashSet) {
        List listUnmodifiableList;
        this.a = str;
        this.b = arrayList;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.f = hashSet;
        this.g = f9j.a ? new ww4(0, this) : new ww4(1, this);
        boolean zIsEmpty = arrayList.isEmpty();
        List listUnmodifiableList2 = hd5.a;
        if (zIsEmpty) {
            listUnmodifiableList = listUnmodifiableList2;
        } else {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (int i = ve3.i(arrayList); i >= 0; i--) {
                a1e a1eVar = (a1e) arrayList.get(i);
                if (hashSet2.add(a1eVar)) {
                    arrayList2.add(a1eVar);
                }
                for (a1e a1eVar2 : a1eVar.h) {
                    if (hashSet2.add(a1eVar2)) {
                        arrayList2.add(a1eVar2);
                    }
                }
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        this.h = listUnmodifiableList;
        List<a1e> list = this.b;
        if (!list.isEmpty()) {
            HashSet hashSet3 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (a1e a1eVar3 : list) {
                for (a1e a1eVar4 : a1eVar3.i) {
                    if (hashSet3.add(a1eVar4)) {
                        arrayList3.add(a1eVar4);
                    }
                }
                if (hashSet3.add(a1eVar3)) {
                    arrayList3.add(a1eVar3);
                }
            }
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList3);
        }
        this.i = listUnmodifiableList2;
        List list2 = this.h;
        this.j = list2;
        this.k = listUnmodifiableList2;
        this.l = list2.size();
    }

    public static final void a(StringBuilder sb, a1e a1eVar, int i) {
        sb.append('\n');
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("   ");
        }
        sb.append("⌞ " + a1eVar + " (object factories: " + a1eVar.c.size() + ", collection factories: " + a1eVar.d.size() + ", association factories: " + a1eVar.e.size() + ", allowed object overrides: " + a1eVar.f.size() + ')');
        Iterator it = a1eVar.j.iterator();
        while (it.hasNext()) {
            a(sb, (a1e) it.next(), i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    public final ArrayList b(int i) {
        hd5 hd5Var;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            hd5Var = hd5.a;
            if (i2 >= this.l) {
                break;
            }
            a1e a1eVar = (a1e) this.k.get(i2);
            ?? r5 = (List) a1eVar.d.get(Integer.valueOf(i));
            if (r5 != 0) {
                hd5Var = r5;
            }
            int size = hd5Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    arrayList.add(((io7) hd5Var.get(i3)).a(a1eVar.g));
                } catch (Exception e) {
                    throw new ElementCreationFailedException(i, this, e);
                }
            }
            i2++;
        }
        ?? r2 = (List) this.d.get(Integer.valueOf(i));
        if (r2 != 0) {
            hd5Var = r2;
        }
        int size2 = hd5Var.size();
        for (int i4 = 0; i4 < size2; i4++) {
            try {
                arrayList.add(((io7) hd5Var.get(i4)).a(this.g));
            } catch (Exception e2) {
                throw new ElementCreationFailedException(i, this, e2);
            }
        }
        arrayList.isEmpty();
        return arrayList;
    }

    public final Object c(int i, boolean z) {
        io7 io7Var = (io7) this.c.get(Integer.valueOf(i));
        if (io7Var != null) {
            try {
                Object objA = io7Var.a(this.g);
                if (objA == null && z) {
                    throw new ObjectNullabilityException(i, this);
                }
                return objA;
            } catch (Exception e) {
                throw new ObjectCreationFailedException(i, this, e);
            }
        }
        for (int i2 = 0; i2 < this.l; i2++) {
            a1e a1eVar = (a1e) this.j.get(i2);
            io7 io7Var2 = (io7) a1eVar.c.get(Integer.valueOf(i));
            if (io7Var2 != null) {
                try {
                    Object objA2 = io7Var2.a(a1eVar.g);
                    if (objA2 == null && z) {
                        throw new ObjectNullabilityException(i, this);
                    }
                    return objA2;
                } catch (Exception e2) {
                    throw new ObjectCreationFailedException(i, this, e2);
                }
            }
        }
        if (z) {
            throw new MissingObjectFactoryException(i, this);
        }
        return null;
    }

    public final String toString() {
        return ho7.i("Scope(name=\"", this.a, "\")");
    }
}
