package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.util.E;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ReadOnlyClassToSerializerMap.java */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final a[] f342301a;

    /* renamed from: b, reason: collision with root package name */
    public final int f342302b;

    /* compiled from: ReadOnlyClassToSerializerMap.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.l<Object> f342303a;

        /* renamed from: b, reason: collision with root package name */
        public final a f342304b;

        /* renamed from: c, reason: collision with root package name */
        public final Class<?> f342305c;

        /* renamed from: d, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.h f342306d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f342307e;

        public a(a aVar, E e12, com.fasterxml.jackson.databind.l<Object> lVar) {
            this.f342304b = aVar;
            this.f342303a = lVar;
            this.f342307e = e12.f342580d;
            this.f342305c = e12.f342578b;
            this.f342306d = e12.f342579c;
        }
    }

    public l(HashMap map) {
        int size = map.size();
        int i12 = 8;
        while (i12 < (size <= 64 ? size + size : size + (size >> 2))) {
            i12 += i12;
        }
        this.f342302b = i12 - 1;
        a[] aVarArr = new a[i12];
        for (Map.Entry entry : map.entrySet()) {
            E e12 = (E) entry.getKey();
            int i13 = e12.f342577a & this.f342302b;
            aVarArr[i13] = new a(aVarArr[i13], e12, (com.fasterxml.jackson.databind.l) entry.getValue());
        }
        this.f342301a = aVarArr;
    }

    public final com.fasterxml.jackson.databind.l<Object> a(Class<?> cls) {
        a aVar = this.f342301a[(cls.getName().hashCode() + 1) & this.f342302b];
        if (aVar == null) {
            return null;
        }
        if (aVar.f342305c == cls && aVar.f342307e) {
            return aVar.f342303a;
        }
        while (true) {
            aVar = aVar.f342304b;
            if (aVar == null) {
                return null;
            }
            if (aVar.f342305c == cls && aVar.f342307e) {
                return aVar.f342303a;
            }
        }
    }

    public final com.fasterxml.jackson.databind.l<Object> b(com.fasterxml.jackson.databind.h hVar) {
        a aVar = this.f342301a[(hVar.f341931c - 1) & this.f342302b];
        if (aVar == null) {
            return null;
        }
        if (!aVar.f342307e && hVar.equals(aVar.f342306d)) {
            return aVar.f342303a;
        }
        while (true) {
            aVar = aVar.f342304b;
            if (aVar == null) {
                return null;
            }
            if (!aVar.f342307e && hVar.equals(aVar.f342306d)) {
                return aVar.f342303a;
            }
        }
    }

    public final com.fasterxml.jackson.databind.l<Object> c(Class<?> cls) {
        a aVar = this.f342301a[cls.getName().hashCode() & this.f342302b];
        if (aVar == null) {
            return null;
        }
        if (aVar.f342305c == cls && !aVar.f342307e) {
            return aVar.f342303a;
        }
        while (true) {
            aVar = aVar.f342304b;
            if (aVar == null) {
                return null;
            }
            if (aVar.f342305c == cls && !aVar.f342307e) {
                return aVar.f342303a;
            }
        }
    }
}
