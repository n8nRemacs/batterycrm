package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.m;
import j.P;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: GroupedLinkedMap.java */
/* loaded from: classes5.dex */
class h<K extends m, V> {

    /* renamed from: a, reason: collision with root package name */
    public final a<K, V> f338915a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f338916b = new HashMap();

    /* compiled from: GroupedLinkedMap.java */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f338917a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f338918b;

        /* renamed from: c, reason: collision with root package name */
        public a<K, V> f338919c;

        /* renamed from: d, reason: collision with root package name */
        public a<K, V> f338920d;

        public a() {
            this(null);
        }

        public a(K k12) {
            this.f338920d = this;
            this.f338919c = this;
            this.f338917a = k12;
        }
    }

    @P
    public final V a(K k12) {
        a aVar;
        HashMap map = this.f338916b;
        a aVar2 = (a) map.get(k12);
        if (aVar2 == null) {
            a aVar3 = new a(k12);
            map.put(k12, aVar3);
            aVar = aVar3;
        } else {
            k12.a();
            aVar = aVar2;
        }
        a<K, V> aVar4 = aVar.f338920d;
        aVar4.f338919c = aVar.f338919c;
        aVar.f338919c.f338920d = aVar4;
        a<K, V> aVar5 = this.f338915a;
        aVar.f338920d = aVar5;
        a<K, V> aVar6 = aVar5.f338919c;
        aVar.f338919c = aVar6;
        aVar6.f338920d = aVar;
        aVar.f338920d.f338919c = aVar;
        ArrayList arrayList = aVar.f338918b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return (V) aVar.f338918b.remove(size - 1);
        }
        return null;
    }

    public final void b(K k12, V v12) {
        HashMap map = this.f338916b;
        a aVar = (a) map.get(k12);
        if (aVar == null) {
            aVar = new a(k12);
            aVar.f338919c = aVar;
            aVar.f338920d = aVar;
            a<K, V> aVar2 = this.f338915a;
            aVar.f338920d = aVar2.f338920d;
            aVar.f338919c = aVar2;
            aVar2.f338920d = aVar;
            aVar.f338920d.f338919c = aVar;
            map.put(k12, aVar);
        } else {
            k12.a();
        }
        if (aVar.f338918b == null) {
            aVar.f338918b = new ArrayList();
        }
        aVar.f338918b.add(v12);
    }

    @P
    public final V c() {
        a<K, V> aVar = this.f338915a;
        a aVar2 = aVar.f338920d;
        while (true) {
            V v12 = null;
            if (aVar2.equals(aVar)) {
                return null;
            }
            ArrayList arrayList = aVar2.f338918b;
            int size = arrayList != null ? arrayList.size() : 0;
            if (size > 0) {
                v12 = (V) aVar2.f338918b.remove(size - 1);
            }
            if (v12 != null) {
                return v12;
            }
            a<K, V> aVar3 = aVar2.f338920d;
            aVar3.f338919c = aVar2.f338919c;
            aVar2.f338919c.f338920d = aVar3;
            HashMap map = this.f338916b;
            Object obj = aVar2.f338917a;
            map.remove(obj);
            ((m) obj).a();
            aVar2 = aVar2.f338920d;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f338915a;
        a aVar2 = aVar.f338919c;
        boolean z12 = false;
        while (!aVar2.equals(aVar)) {
            sb2.append('{');
            sb2.append(aVar2.f338917a);
            sb2.append(':');
            ArrayList arrayList = aVar2.f338918b;
            sb2.append(arrayList != null ? arrayList.size() : 0);
            sb2.append("}, ");
            aVar2 = aVar2.f338919c;
            z12 = true;
        }
        if (z12) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
