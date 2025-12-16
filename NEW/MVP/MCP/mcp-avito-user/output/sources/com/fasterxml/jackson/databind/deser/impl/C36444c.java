package com.fasterxml.jackson.databind.deser.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: BeanPropertyMap.java */
/* renamed from: com.fasterxml.jackson.databind.deser.impl.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36444c implements Iterable<com.fasterxml.jackson.databind.deser.v>, Serializable {
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f341603b;

    /* renamed from: c, reason: collision with root package name */
    public int f341604c;

    /* renamed from: d, reason: collision with root package name */
    public int f341605d;

    /* renamed from: e, reason: collision with root package name */
    public int f341606e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f341607f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.v[] f341608g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<String, List<com.fasterxml.jackson.databind.v>> f341609h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<String, String> f341610i;

    /* renamed from: j, reason: collision with root package name */
    public final Locale f341611j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashMap] */
    public C36444c(boolean z12, Collection<com.fasterxml.jackson.databind.deser.v> collection, Map<String, List<com.fasterxml.jackson.databind.v>> map, Locale locale) {
        ?? EmptyMap;
        this.f341603b = z12;
        this.f341608g = (com.fasterxml.jackson.databind.deser.v[]) collection.toArray(new com.fasterxml.jackson.databind.deser.v[collection.size()]);
        this.f341609h = map;
        this.f341611j = locale;
        if (map == null || map.isEmpty()) {
            EmptyMap = Collections.emptyMap();
        } else {
            EmptyMap = new HashMap();
            for (Map.Entry<String, List<com.fasterxml.jackson.databind.v>> entry : map.entrySet()) {
                String key = entry.getKey();
                key = z12 ? key.toLowerCase(locale) : key;
                Iterator<com.fasterxml.jackson.databind.v> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    String lowerCase = it.next().f342656b;
                    if (z12) {
                        lowerCase = lowerCase.toLowerCase(locale);
                    }
                    EmptyMap.put(lowerCase, key);
                }
            }
        }
        this.f341610i = EmptyMap;
        h(collection);
    }

    public final int a(com.fasterxml.jackson.databind.deser.v vVar) {
        com.fasterxml.jackson.databind.deser.v[] vVarArr = this.f341608g;
        int length = vVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (vVarArr[i12] == vVar) {
                return i12;
            }
        }
        throw new IllegalStateException(AK.c.s(new StringBuilder("Illegal state: property '"), vVar.f341896d.f342656b, "' missing from _propsInOrder"));
    }

    public final com.fasterxml.jackson.databind.deser.v b(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode() & this.f341604c;
        int i12 = iHashCode << 1;
        Object obj = this.f341607f[i12];
        if (str.equals(obj)) {
            return (com.fasterxml.jackson.databind.deser.v) this.f341607f[i12 + 1];
        }
        if (obj == null) {
            return null;
        }
        int i13 = this.f341604c + 1;
        int i14 = ((iHashCode >> 1) + i13) << 1;
        Object obj2 = this.f341607f[i14];
        if (str.equals(obj2)) {
            return (com.fasterxml.jackson.databind.deser.v) this.f341607f[i14 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i15 = (i13 + (i13 >> 1)) << 1;
        int i16 = this.f341606e + i15;
        while (i15 < i16) {
            Object obj3 = this.f341607f[i15];
            if (obj3 == str || str.equals(obj3)) {
                return (com.fasterxml.jackson.databind.deser.v) this.f341607f[i15 + 1];
            }
            i15 += 2;
        }
        return null;
    }

    public final void d() {
        int length = this.f341607f.length;
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13 += 2) {
            com.fasterxml.jackson.databind.deser.v vVar = (com.fasterxml.jackson.databind.deser.v) this.f341607f[i13];
            if (vVar != null) {
                vVar.f(i12);
                i12++;
            }
        }
    }

    public final com.fasterxml.jackson.databind.deser.v e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot pass null property name");
        }
        if (this.f341603b) {
            str = str.toLowerCase(this.f341611j);
        }
        int iHashCode = str.hashCode() & this.f341604c;
        int i12 = iHashCode << 1;
        Object obj = this.f341607f[i12];
        if (obj == str || str.equals(obj)) {
            return (com.fasterxml.jackson.databind.deser.v) this.f341607f[i12 + 1];
        }
        Map<String, String> map = this.f341610i;
        if (obj == null) {
            return b(map.get(str));
        }
        int i13 = this.f341604c + 1;
        int i14 = ((iHashCode >> 1) + i13) << 1;
        Object obj2 = this.f341607f[i14];
        if (str.equals(obj2)) {
            return (com.fasterxml.jackson.databind.deser.v) this.f341607f[i14 + 1];
        }
        if (obj2 != null) {
            int i15 = (i13 + (i13 >> 1)) << 1;
            int i16 = this.f341606e + i15;
            while (i15 < i16) {
                Object obj3 = this.f341607f[i15];
                if (obj3 == str || str.equals(obj3)) {
                    return (com.fasterxml.jackson.databind.deser.v) this.f341607f[i15 + 1];
                }
                i15 += 2;
            }
        }
        return b(map.get(str));
    }

    public final String g(com.fasterxml.jackson.databind.deser.v vVar) {
        return this.f341603b ? vVar.f341896d.f342656b.toLowerCase(this.f341611j) : vVar.f341896d.f342656b;
    }

    public final void h(Collection<com.fasterxml.jackson.databind.deser.v> collection) {
        int i12;
        int size = collection.size();
        this.f341605d = size;
        if (size <= 5) {
            i12 = 8;
        } else if (size <= 12) {
            i12 = 16;
        } else {
            int i13 = 32;
            while (i13 < size + (size >> 2)) {
                i13 += i13;
            }
            i12 = i13;
        }
        this.f341604c = i12 - 1;
        int i14 = (i12 >> 1) + i12;
        Object[] objArrCopyOf = new Object[i14 * 2];
        int i15 = 0;
        for (com.fasterxml.jackson.databind.deser.v vVar : collection) {
            if (vVar != null) {
                String strG = g(vVar);
                int iHashCode = strG.hashCode() & this.f341604c;
                int i16 = iHashCode << 1;
                if (objArrCopyOf[i16] != null) {
                    i16 = ((iHashCode >> 1) + i12) << 1;
                    if (objArrCopyOf[i16] != null) {
                        i16 = (i14 << 1) + i15;
                        i15 += 2;
                        if (i16 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i16] = strG;
                objArrCopyOf[i16 + 1] = vVar;
            }
        }
        this.f341607f = objArrCopyOf;
        this.f341606e = i15;
    }

    public final void i(com.fasterxml.jackson.databind.deser.v vVar) {
        ArrayList arrayList = new ArrayList(this.f341605d);
        String strG = g(vVar);
        int length = this.f341607f.length;
        boolean zEquals = false;
        for (int i12 = 1; i12 < length; i12 += 2) {
            Object[] objArr = this.f341607f;
            com.fasterxml.jackson.databind.deser.v vVar2 = (com.fasterxml.jackson.databind.deser.v) objArr[i12];
            if (vVar2 != null) {
                if (zEquals || !(zEquals = strG.equals(objArr[i12 - 1]))) {
                    arrayList.add(vVar2);
                } else {
                    this.f341608g[a(vVar2)] = null;
                }
            }
        }
        if (!zEquals) {
            throw new NoSuchElementException(AK.c.s(new StringBuilder("No entry '"), vVar.f341896d.f342656b, "' found, can't remove"));
        }
        h(arrayList);
    }

    @Override // java.lang.Iterable
    public final Iterator<com.fasterxml.jackson.databind.deser.v> iterator() {
        ArrayList arrayList = new ArrayList(this.f341605d);
        int length = this.f341607f.length;
        for (int i12 = 1; i12 < length; i12 += 2) {
            com.fasterxml.jackson.databind.deser.v vVar = (com.fasterxml.jackson.databind.deser.v) this.f341607f[i12];
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return arrayList.iterator();
    }

    public final C36444c l(u uVar) {
        String strG = g(uVar);
        int length = this.f341607f.length;
        for (int i12 = 1; i12 < length; i12 += 2) {
            com.fasterxml.jackson.databind.deser.v vVar = (com.fasterxml.jackson.databind.deser.v) this.f341607f[i12];
            if (vVar != null && vVar.f341896d.f342656b.equals(strG)) {
                return new C36444c(this, uVar, i12, a(vVar));
            }
        }
        return new C36444c(this, uVar, strG, strG.hashCode() & this.f341604c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Properties=[");
        Iterator<com.fasterxml.jackson.databind.deser.v> it = iterator();
        int i12 = 0;
        while (it.hasNext()) {
            com.fasterxml.jackson.databind.deser.v next = it.next();
            int i13 = i12 + 1;
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(next.f341896d.f342656b);
            sb2.append('(');
            sb2.append(next.f341897e);
            sb2.append(')');
            i12 = i13;
        }
        sb2.append(']');
        Map<String, List<com.fasterxml.jackson.databind.v>> map = this.f341609h;
        if (!map.isEmpty()) {
            sb2.append("(aliases: ");
            sb2.append(map);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public C36444c(C36444c c36444c, u uVar, int i12, int i13) {
        this.f341603b = c36444c.f341603b;
        this.f341611j = c36444c.f341611j;
        this.f341604c = c36444c.f341604c;
        this.f341605d = c36444c.f341605d;
        this.f341606e = c36444c.f341606e;
        this.f341609h = c36444c.f341609h;
        this.f341610i = c36444c.f341610i;
        Object[] objArr = c36444c.f341607f;
        this.f341607f = Arrays.copyOf(objArr, objArr.length);
        com.fasterxml.jackson.databind.deser.v[] vVarArr = c36444c.f341608g;
        com.fasterxml.jackson.databind.deser.v[] vVarArr2 = (com.fasterxml.jackson.databind.deser.v[]) Arrays.copyOf(vVarArr, vVarArr.length);
        this.f341608g = vVarArr2;
        this.f341607f[i12] = uVar;
        vVarArr2[i13] = uVar;
    }

    public C36444c(C36444c c36444c, u uVar, String str, int i12) {
        this.f341603b = c36444c.f341603b;
        this.f341611j = c36444c.f341611j;
        this.f341604c = c36444c.f341604c;
        this.f341605d = c36444c.f341605d;
        this.f341606e = c36444c.f341606e;
        this.f341609h = c36444c.f341609h;
        this.f341610i = c36444c.f341610i;
        Object[] objArr = c36444c.f341607f;
        this.f341607f = Arrays.copyOf(objArr, objArr.length);
        com.fasterxml.jackson.databind.deser.v[] vVarArr = c36444c.f341608g;
        int length = vVarArr.length;
        com.fasterxml.jackson.databind.deser.v[] vVarArr2 = (com.fasterxml.jackson.databind.deser.v[]) Arrays.copyOf(vVarArr, length + 1);
        this.f341608g = vVarArr2;
        vVarArr2[length] = uVar;
        int i13 = this.f341604c + 1;
        int i14 = i12 << 1;
        Object[] objArr2 = this.f341607f;
        if (objArr2[i14] != null) {
            i14 = ((i12 >> 1) + i13) << 1;
            if (objArr2[i14] != null) {
                int i15 = this.f341606e;
                i14 = ((i13 + (i13 >> 1)) << 1) + i15;
                this.f341606e = i15 + 2;
                if (i14 >= objArr2.length) {
                    this.f341607f = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this.f341607f;
        objArr3[i14] = str;
        objArr3[i14 + 1] = uVar;
    }

    public C36444c(C36444c c36444c, boolean z12) {
        this.f341603b = z12;
        this.f341611j = c36444c.f341611j;
        this.f341609h = c36444c.f341609h;
        this.f341610i = c36444c.f341610i;
        com.fasterxml.jackson.databind.deser.v[] vVarArr = c36444c.f341608g;
        com.fasterxml.jackson.databind.deser.v[] vVarArr2 = (com.fasterxml.jackson.databind.deser.v[]) Arrays.copyOf(vVarArr, vVarArr.length);
        this.f341608g = vVarArr2;
        h(Arrays.asList(vVarArr2));
    }
}
