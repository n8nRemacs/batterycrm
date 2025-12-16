package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import j.k0;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool.java */
/* loaded from: classes5.dex */
public final class j implements com.bumptech.glide.load.engine.bitmap_recycle.b {

    /* renamed from: a, reason: collision with root package name */
    public final h<a, Object> f338921a;

    /* renamed from: b, reason: collision with root package name */
    public final b f338922b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f338923c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f338924d;

    /* renamed from: e, reason: collision with root package name */
    public final int f338925e;

    /* renamed from: f, reason: collision with root package name */
    public int f338926f;

    /* compiled from: LruArrayPool.java */
    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        public final b f338927a;

        /* renamed from: b, reason: collision with root package name */
        public int f338928b;

        /* renamed from: c, reason: collision with root package name */
        public Class<?> f338929c;

        public a(b bVar) {
            this.f338927a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public final void a() {
            this.f338927a.c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f338928b == aVar.f338928b && this.f338929c == aVar.f338929c;
        }

        public final int hashCode() {
            int i12 = this.f338928b * 31;
            Class<?> cls = this.f338929c;
            return i12 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f338928b + "array=" + this.f338929c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    public static final class b extends d<a> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        public final m a() {
            return new a(this);
        }
    }

    @k0
    public j() {
        this.f338921a = new h<>();
        this.f338922b = new b();
        this.f338923c = new HashMap();
        this.f338924d = new HashMap();
        this.f338925e = 4194304;
    }

    public final synchronized void a() {
        c(0);
    }

    public final void b(Class cls, int i12) {
        NavigableMap<Integer, Integer> navigableMapH = h(cls);
        Integer num = navigableMapH.get(Integer.valueOf(i12));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(Integer.valueOf(i12));
                return;
            } else {
                navigableMapH.put(Integer.valueOf(i12), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i12 + ", this: " + this);
    }

    public final void c(int i12) {
        while (this.f338926f > i12) {
            Object objC = this.f338921a.c();
            com.bumptech.glide.util.k.b(objC);
            com.bumptech.glide.load.engine.bitmap_recycle.a aVarE = e(objC.getClass());
            this.f338926f -= aVarE.a(objC) * aVarE.b();
            b(objC.getClass(), aVarE.a(objC));
            if (Log.isLoggable(aVarE.getTag(), 2)) {
                aVarE.a(objC);
            }
        }
    }

    public final synchronized Object d(Class cls, int i12) {
        a aVarB;
        int i13;
        try {
            Integer numCeilingKey = h(cls).ceilingKey(Integer.valueOf(i12));
            if (numCeilingKey == null || ((i13 = this.f338926f) != 0 && this.f338925e / i13 < 2 && numCeilingKey.intValue() > i12 * 8)) {
                a aVarB2 = this.f338922b.b();
                aVarB2.f338928b = i12;
                aVarB2.f338929c = cls;
                aVarB = aVarB2;
            } else {
                b bVar = this.f338922b;
                int iIntValue = numCeilingKey.intValue();
                aVarB = bVar.b();
                aVarB.f338928b = iIntValue;
                aVarB.f338929c = cls;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return g(aVarB, cls);
    }

    public final <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> e(Class<T> cls) {
        HashMap map = this.f338924d;
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> gVar = (com.bumptech.glide.load.engine.bitmap_recycle.a) map.get(cls);
        if (gVar == null) {
            if (cls.equals(int[].class)) {
                gVar = new i();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                gVar = new g();
            }
            map.put(cls, gVar);
        }
        return gVar;
    }

    public final synchronized Object f() {
        a aVarB;
        aVarB = this.f338922b.b();
        aVarB.f338928b = 8;
        aVarB.f338929c = byte[].class;
        return g(aVarB, byte[].class);
    }

    public final <T> T g(a aVar, Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVarE = e(cls);
        T t12 = (T) this.f338921a.a(aVar);
        if (t12 != null) {
            this.f338926f -= aVarE.a(t12) * aVarE.b();
            b(cls, aVarE.a(t12));
        }
        if (t12 != null) {
            return t12;
        }
        Log.isLoggable(aVarE.getTag(), 2);
        return aVarE.newArray(aVar.f338928b);
    }

    public final NavigableMap<Integer, Integer> h(Class<?> cls) {
        HashMap map = this.f338923c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized <T> void i(T t12) {
        Class<?> cls = t12.getClass();
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVarE = e(cls);
        int iA2 = aVarE.a(t12);
        int iB2 = aVarE.b() * iA2;
        if (iB2 <= this.f338925e / 2) {
            a aVarB = this.f338922b.b();
            aVarB.f338928b = iA2;
            aVarB.f338929c = cls;
            this.f338921a.b(aVarB, t12);
            NavigableMap<Integer, Integer> navigableMapH = h(cls);
            Integer num = navigableMapH.get(Integer.valueOf(aVarB.f338928b));
            Integer numValueOf = Integer.valueOf(aVarB.f338928b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, Integer.valueOf(iIntValue));
            this.f338926f += iB2;
            c(this.f338925e);
        }
    }

    public j(int i12) {
        this.f338921a = new h<>();
        this.f338922b = new b();
        this.f338923c = new HashMap();
        this.f338924d = new HashMap();
        this.f338925e = i12;
    }
}
