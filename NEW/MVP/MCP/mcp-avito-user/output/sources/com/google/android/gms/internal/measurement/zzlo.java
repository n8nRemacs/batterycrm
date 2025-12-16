package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
class zzlo<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f350963i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f350964b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f350967e;

    /* renamed from: f, reason: collision with root package name */
    public volatile zzma f350968f;

    /* renamed from: h, reason: collision with root package name */
    public volatile zzls f350970h;

    /* renamed from: c, reason: collision with root package name */
    public List<zzlv> f350965c = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public Map<K, V> f350966d = Collections.emptyMap();

    /* renamed from: g, reason: collision with root package name */
    public Map<K, V> f350969g = Collections.emptyMap();

    public zzlo(int i12, zzmc zzmcVar) {
        this.f350964b = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(K r5) {
        /*
            r4 = this;
            java.util.List<com.google.android.gms.internal.measurement.zzlv> r0 = r4.f350965c
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L25
            java.util.List<com.google.android.gms.internal.measurement.zzlv> r2 = r4.f350965c
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.measurement.zzlv r2 = (com.google.android.gms.internal.measurement.zzlv) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L22
            int r0 = r0 + 1
        L20:
            int r5 = -r0
            return r5
        L22:
            if (r2 != 0) goto L25
            return r1
        L25:
            r0 = 0
        L26:
            if (r0 > r1) goto L49
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<com.google.android.gms.internal.measurement.zzlv> r3 = r4.f350965c
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.measurement.zzlv r3 = (com.google.android.gms.internal.measurement.zzlv) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L43
            int r1 = r2 + (-1)
            goto L26
        L43:
            if (r3 <= 0) goto L48
            int r0 = r2 + 1
            goto L26
        L48:
            return r2
        L49:
            int r0 = r0 + 1
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.a(java.lang.Comparable):int");
    }

    public final V b(int i12) {
        d();
        V v12 = (V) this.f350965c.remove(i12).getValue();
        if (!this.f350966d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = c().entrySet().iterator();
            List<zzlv> list = this.f350965c;
            Map.Entry<K, V> next = it.next();
            list.add(new zzlv(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v12;
    }

    public final SortedMap<K, V> c() {
        d();
        if (this.f350966d.isEmpty() && !(this.f350966d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f350966d = treeMap;
            this.f350969g = treeMap.descendingMap();
        }
        return (SortedMap) this.f350966d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        d();
        if (!this.f350965c.isEmpty()) {
            this.f350965c.clear();
        }
        if (this.f350966d.isEmpty()) {
            return;
        }
        this.f350966d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f350966d.containsKey(comparable);
    }

    public final void d() {
        if (this.f350967e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f350968f == null) {
            this.f350968f = new zzma(this, null);
        }
        return this.f350968f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlo)) {
            return super.equals(obj);
        }
        zzlo zzloVar = (zzlo) obj;
        int size = size();
        if (size != zzloVar.size()) {
            return false;
        }
        int iZzb = zzb();
        if (iZzb != zzloVar.zzb()) {
            return entrySet().equals(zzloVar.entrySet());
        }
        for (int i12 = 0; i12 < iZzb; i12++) {
            if (!zzb(i12).equals(zzloVar.zzb(i12))) {
                return false;
            }
        }
        if (iZzb != size) {
            return this.f350966d.equals(zzloVar.f350966d);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        return iA2 >= 0 ? (V) this.f350965c.get(iA2).getValue() : this.f350966d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iZzb = zzb();
        int iHashCode = 0;
        for (int i12 = 0; i12 < iZzb; i12++) {
            iHashCode += this.f350965c.get(i12).hashCode();
        }
        return this.f350966d.size() > 0 ? iHashCode + this.f350966d.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        d();
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        if (iA2 >= 0) {
            return b(iA2);
        }
        if (this.f350966d.isEmpty()) {
            return null;
        }
        return this.f350966d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f350966d.size() + this.f350965c.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final V put(K k12, V v12) {
        d();
        int iA2 = a(k12);
        if (iA2 >= 0) {
            return (V) this.f350965c.get(iA2).setValue(v12);
        }
        d();
        boolean zIsEmpty = this.f350965c.isEmpty();
        int i12 = this.f350964b;
        if (zIsEmpty && !(this.f350965c instanceof ArrayList)) {
            this.f350965c = new ArrayList(i12);
        }
        int i13 = -(iA2 + 1);
        if (i13 >= i12) {
            return c().put(k12, v12);
        }
        if (this.f350965c.size() == i12) {
            zzlv zzlvVarRemove = this.f350965c.remove(i12 - 1);
            c().put((Comparable) zzlvVarRemove.getKey(), zzlvVarRemove.getValue());
        }
        this.f350965c.add(i13, new zzlv(this, k12, v12));
        return null;
    }

    public final int zzb() {
        return this.f350965c.size();
    }

    public final Iterable<Map.Entry<K, V>> zzc() {
        return this.f350966d.isEmpty() ? (Iterable<Map.Entry<K, V>>) zzlu.f350976b : this.f350966d.entrySet();
    }

    public final boolean zze() {
        return this.f350967e;
    }

    public final Map.Entry<K, V> zzb(int i12) {
        return this.f350965c.get(i12);
    }

    public void zza() {
        Map<K, V> mapUnmodifiableMap;
        Map<K, V> mapUnmodifiableMap2;
        if (this.f350967e) {
            return;
        }
        if (this.f350966d.isEmpty()) {
            mapUnmodifiableMap = Collections.emptyMap();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(this.f350966d);
        }
        this.f350966d = mapUnmodifiableMap;
        if (this.f350969g.isEmpty()) {
            mapUnmodifiableMap2 = Collections.emptyMap();
        } else {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(this.f350969g);
        }
        this.f350969g = mapUnmodifiableMap2;
        this.f350967e = true;
    }
}
