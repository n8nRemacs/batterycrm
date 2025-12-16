package com.google.android.gms.internal.fido;

import I41.a;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzcj extends zzcd implements NavigableMap {

    /* renamed from: g, reason: collision with root package name */
    public static final Comparator f350290g;

    /* renamed from: h, reason: collision with root package name */
    public static final zzcj f350291h;

    /* renamed from: d, reason: collision with root package name */
    public final transient zzcv f350292d;

    /* renamed from: e, reason: collision with root package name */
    public final transient zzcc f350293e;

    /* renamed from: f, reason: collision with root package name */
    @a
    public final transient zzcj f350294f;

    static {
        zzcq zzcqVar = zzcq.f350299b;
        f350290g = zzcqVar;
        zzcv zzcvVarW = zzck.w(zzcqVar);
        zzdd zzddVar = zzcc.f350284c;
        f350291h = new zzcj(zzcvVarW, zzct.f350300f, null);
    }

    public zzcj(zzcv zzcvVar, zzcc zzccVar, @a zzcj zzcjVar) {
        this.f350292d = zzcvVar;
        this.f350293e = zzccVar;
        this.f350294f = zzcjVar;
    }

    public static zzcj b(Comparator comparator) {
        if (zzcq.f350299b.equals(comparator)) {
            return f350291h;
        }
        zzcv zzcvVarW = zzck.w(comparator);
        zzdd zzddVar = zzcc.f350284c;
        return new zzcj(zzcvVarW, zzct.f350300f, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzcj zzf(Map map) {
        final Comparator comparator = f350290g;
        Comparator comparator2 = map.comparator();
        int i12 = 1;
        boolean zEquals = comparator2 == null ? true : comparator.equals(comparator2);
        Set setEntrySet = map.entrySet();
        Map.Entry[] entryArr = zzcd.f350285c;
        if (!(setEntrySet instanceof Collection)) {
            Iterator it = setEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            setEntrySet = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) setEntrySet.toArray(entryArr);
        int length = entryArr2.length;
        if (length == 0) {
            return b(comparator);
        }
        if (length == 1) {
            Map.Entry entry = entryArr2[0];
            Objects.requireNonNull(entry);
            Map.Entry entry2 = entry;
            return new zzcj(new zzcv(zzcc.zzj(entry2.getKey()), comparator), zzcc.zzj(entry2.getValue()), null);
        }
        Object[] objArr = new Object[length];
        Object[] objArr2 = new Object[length];
        if (zEquals) {
            for (int i13 = 0; i13 < length; i13++) {
                Map.Entry entry3 = entryArr2[i13];
                Objects.requireNonNull(entry3);
                Map.Entry entry4 = entry3;
                Object key = entry4.getKey();
                Object value = entry4.getValue();
                zzbv.a(key, value);
                objArr[i13] = key;
                objArr2[i13] = value;
            }
        } else {
            Arrays.sort(entryArr2, 0, length, new Comparator() { // from class: com.google.android.gms.internal.fido.zzcg
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Map.Entry entry5 = (Map.Entry) obj;
                    Map.Entry entry6 = (Map.Entry) obj2;
                    Objects.requireNonNull(entry5);
                    Objects.requireNonNull(entry6);
                    return comparator.compare(entry5.getKey(), entry6.getKey());
                }
            });
            Map.Entry entry5 = entryArr2[0];
            Objects.requireNonNull(entry5);
            Map.Entry entry6 = entry5;
            Object key2 = entry6.getKey();
            objArr[0] = key2;
            Object value2 = entry6.getValue();
            objArr2[0] = value2;
            zzbv.a(objArr[0], value2);
            while (i12 < length) {
                Map.Entry entry7 = entryArr2[i12 - 1];
                Objects.requireNonNull(entry7);
                Map.Entry entry8 = entry7;
                Map.Entry entry9 = entryArr2[i12];
                Objects.requireNonNull(entry9);
                Map.Entry entry10 = entry9;
                Object key3 = entry10.getKey();
                Object value3 = entry10.getValue();
                zzbv.a(key3, value3);
                objArr[i12] = key3;
                objArr2[i12] = value3;
                if (comparator.compare(key2, key3) == 0) {
                    throw new IllegalArgumentException(e.n("Multiple entries with same key: ", String.valueOf(entry8), " and ", String.valueOf(entry10)));
                }
                i12++;
                key2 = key3;
            }
        }
        return new zzcj(new zzcv(zzcc.g(length, objArr), comparator), zzcc.g(length, objArr2), null);
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    public final zzcf a() {
        return isEmpty() ? zzcu.f350304j : new zzci(this);
    }

    @Override // java.util.NavigableMap
    @a
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @a
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f350292d.f350295d;
    }

    public final zzcj d(int i12, int i13) {
        zzcc zzccVar = this.f350293e;
        if (i12 == 0) {
            if (i13 == zzccVar.size()) {
                return this;
            }
            i12 = 0;
        }
        zzcv zzcvVar = this.f350292d;
        return i12 == i13 ? b(zzcvVar.f350295d) : new zzcj(zzcvVar.E(i12, i13), zzccVar.subList(i12, i13), null);
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f350292d.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        zzcj zzcjVar = this.f350294f;
        if (zzcjVar != null) {
            return zzcjVar;
        }
        boolean zIsEmpty = isEmpty();
        zzcv zzcvVar = this.f350292d;
        if (!zIsEmpty) {
            return new zzcj((zzcv) zzcvVar.descendingSet(), this.f350293e.zzf(), this);
        }
        Comparator comparator = zzcvVar.f350295d;
        return b((comparator instanceof zzcs ? (zzcs) comparator : new zzbw(comparator)).zza());
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    @a
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzi().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f350292d.first();
    }

    @Override // java.util.NavigableMap
    @a
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @a
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    @I41.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(@I41.a java.lang.Object r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.fido.zzcv r0 = r3.f350292d
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            com.google.android.gms.internal.fido.zzcc r2 = r0.f350311f     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.f350295d     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r4 = 0
            return r4
        L16:
            com.google.android.gms.internal.fido.zzcc r0 = r3.f350293e
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzcj.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    @a
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @a
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.f350292d;
    }

    @Override // java.util.NavigableMap
    @a
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzi().get(this.f350293e.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f350292d.last();
    }

    @Override // java.util.NavigableMap
    @a
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @a
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f350292d;
    }

    @Override // java.util.NavigableMap
    @a
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @a
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f350293e.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.f350293e;
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    /* renamed from: zza */
    public final zzby values() {
        return this.f350293e;
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    /* renamed from: zzd */
    public final /* synthetic */ zzcf keySet() {
        return this.f350292d;
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzcj headMap(Object obj, boolean z12) {
        obj.getClass();
        return d(0, this.f350292d.y(obj, z12));
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzcj subMap(Object obj, boolean z12, Object obj2, boolean z13) {
        obj.getClass();
        obj2.getClass();
        if (this.f350292d.f350295d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z13).tailMap(obj, z12);
        }
        throw new IllegalArgumentException(zzbo.zza("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzcj tailMap(Object obj, boolean z12) {
        obj.getClass();
        return d(this.f350292d.C(obj, z12), this.f350293e.size());
    }
}
