package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
class zzgl extends AbstractMap {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f352526h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f352527b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f352530e;

    /* renamed from: f, reason: collision with root package name */
    public volatile zzgk f352531f;

    /* renamed from: c, reason: collision with root package name */
    public List f352528c = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public Map f352529d = Collections.emptyMap();

    /* renamed from: g, reason: collision with root package name */
    public Map f352532g = Collections.emptyMap();

    public final int a(Comparable comparable) {
        int size = this.f352528c.size();
        int i12 = size - 1;
        int i13 = 0;
        if (i12 >= 0) {
            int iCompareTo = comparable.compareTo(((zzgi) this.f352528c.get(i12)).zza());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i12;
            }
        }
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int iCompareTo2 = comparable.compareTo(((zzgi) this.f352528c.get(i14)).zza());
            if (iCompareTo2 < 0) {
                i12 = i14 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i14;
                }
                i13 = i14 + 1;
            }
        }
        return -(i13 + 1);
    }

    public final Object b(int i12) {
        d();
        Object value = ((zzgi) this.f352528c.remove(i12)).getValue();
        if (!this.f352529d.isEmpty()) {
            Iterator it = c().entrySet().iterator();
            List list = this.f352528c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzgi(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    public final SortedMap c() {
        d();
        if (this.f352529d.isEmpty() && !(this.f352529d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f352529d = treeMap;
            this.f352532g = treeMap.descendingMap();
        }
        return (SortedMap) this.f352529d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        d();
        if (!this.f352528c.isEmpty()) {
            this.f352528c.clear();
        }
        if (this.f352529d.isEmpty()) {
            return;
        }
        this.f352529d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f352529d.containsKey(comparable);
    }

    public final void d() {
        if (this.f352530e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f352531f == null) {
            this.f352531f = new zzgk(this, null);
        }
        return this.f352531f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgl)) {
            return super.equals(obj);
        }
        zzgl zzglVar = (zzgl) obj;
        int size = size();
        if (size != zzglVar.size()) {
            return false;
        }
        int iZzb = zzb();
        if (iZzb != zzglVar.zzb()) {
            return entrySet().equals(zzglVar.entrySet());
        }
        for (int i12 = 0; i12 < iZzb; i12++) {
            if (!zzg(i12).equals(zzglVar.zzg(i12))) {
                return false;
            }
        }
        if (iZzb != size) {
            return this.f352529d.equals(zzglVar.f352529d);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        return iA2 >= 0 ? ((zzgi) this.f352528c.get(iA2)).getValue() : this.f352529d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZzb = zzb();
        int iHashCode = 0;
        for (int i12 = 0; i12 < iZzb; i12++) {
            iHashCode += ((zzgi) this.f352528c.get(i12)).hashCode();
        }
        return this.f352529d.size() > 0 ? this.f352529d.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        d();
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        if (iA2 >= 0) {
            return b(iA2);
        }
        if (this.f352529d.isEmpty()) {
            return null;
        }
        return this.f352529d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f352529d.size() + this.f352528c.size();
    }

    public void zza() {
        if (this.f352530e) {
            return;
        }
        this.f352529d = this.f352529d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f352529d);
        this.f352532g = this.f352532g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f352532g);
        this.f352530e = true;
    }

    public final int zzb() {
        return this.f352528c.size();
    }

    public final Iterable zzc() {
        return this.f352529d.isEmpty() ? zzgh.f352517b : this.f352529d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        d();
        int iA2 = a(comparable);
        if (iA2 >= 0) {
            return ((zzgi) this.f352528c.get(iA2)).setValue(obj);
        }
        d();
        boolean zIsEmpty = this.f352528c.isEmpty();
        int i12 = this.f352527b;
        if (zIsEmpty && !(this.f352528c instanceof ArrayList)) {
            this.f352528c = new ArrayList(i12);
        }
        int i13 = -(iA2 + 1);
        if (i13 >= i12) {
            return c().put(comparable, obj);
        }
        if (this.f352528c.size() == i12) {
            zzgi zzgiVar = (zzgi) this.f352528c.remove(i12 - 1);
            c().put(zzgiVar.zza(), zzgiVar.getValue());
        }
        this.f352528c.add(i13, new zzgi(this, comparable, obj));
        return null;
    }

    public final Map.Entry zzg(int i12) {
        return (Map.Entry) this.f352528c.get(i12);
    }

    public final boolean zzj() {
        return this.f352530e;
    }
}
