package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
class zzxs extends AbstractMap {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f354130h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f354131b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f354134e;

    /* renamed from: f, reason: collision with root package name */
    public volatile zzxq f354135f;

    /* renamed from: c, reason: collision with root package name */
    public List f354132c = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public Map f354133d = Collections.emptyMap();

    /* renamed from: g, reason: collision with root package name */
    public Map f354136g = Collections.emptyMap();

    public final int a(Comparable comparable) {
        int size = this.f354132c.size();
        int i12 = size - 1;
        int i13 = 0;
        if (i12 >= 0) {
            int iCompareTo = comparable.compareTo(((zzxm) this.f354132c.get(i12)).zza());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i12;
            }
        }
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int iCompareTo2 = comparable.compareTo(((zzxm) this.f354132c.get(i14)).zza());
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
        Object value = ((zzxm) this.f354132c.remove(i12)).getValue();
        if (!this.f354133d.isEmpty()) {
            Iterator it = c().entrySet().iterator();
            List list = this.f354132c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzxm(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    public final SortedMap c() {
        d();
        if (this.f354133d.isEmpty() && !(this.f354133d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f354133d = treeMap;
            this.f354136g = treeMap.descendingMap();
        }
        return (SortedMap) this.f354133d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        d();
        if (!this.f354132c.isEmpty()) {
            this.f354132c.clear();
        }
        if (this.f354133d.isEmpty()) {
            return;
        }
        this.f354133d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f354133d.containsKey(comparable);
    }

    public final void d() {
        if (this.f354134e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f354135f == null) {
            this.f354135f = new zzxq(this, null);
        }
        return this.f354135f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxs)) {
            return super.equals(obj);
        }
        zzxs zzxsVar = (zzxs) obj;
        int size = size();
        if (size != zzxsVar.size()) {
            return false;
        }
        int iZzb = zzb();
        if (iZzb != zzxsVar.zzb()) {
            return entrySet().equals(zzxsVar.entrySet());
        }
        for (int i12 = 0; i12 < iZzb; i12++) {
            if (!zzg(i12).equals(zzxsVar.zzg(i12))) {
                return false;
            }
        }
        if (iZzb != size) {
            return this.f354133d.equals(zzxsVar.f354133d);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        return iA2 >= 0 ? ((zzxm) this.f354132c.get(iA2)).getValue() : this.f354133d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZzb = zzb();
        int iHashCode = 0;
        for (int i12 = 0; i12 < iZzb; i12++) {
            iHashCode += ((zzxm) this.f354132c.get(i12)).hashCode();
        }
        return this.f354133d.size() > 0 ? this.f354133d.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        d();
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        if (iA2 >= 0) {
            return b(iA2);
        }
        if (this.f354133d.isEmpty()) {
            return null;
        }
        return this.f354133d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f354133d.size() + this.f354132c.size();
    }

    public void zza() {
        if (this.f354134e) {
            return;
        }
        this.f354133d = this.f354133d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f354133d);
        this.f354136g = this.f354136g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f354136g);
        this.f354134e = true;
    }

    public final int zzb() {
        return this.f354132c.size();
    }

    public final Iterable zzc() {
        return this.f354133d.isEmpty() ? zzxl.f354121b : this.f354133d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        d();
        int iA2 = a(comparable);
        if (iA2 >= 0) {
            return ((zzxm) this.f354132c.get(iA2)).setValue(obj);
        }
        d();
        boolean zIsEmpty = this.f354132c.isEmpty();
        int i12 = this.f354131b;
        if (zIsEmpty && !(this.f354132c instanceof ArrayList)) {
            this.f354132c = new ArrayList(i12);
        }
        int i13 = -(iA2 + 1);
        if (i13 >= i12) {
            return c().put(comparable, obj);
        }
        if (this.f354132c.size() == i12) {
            zzxm zzxmVar = (zzxm) this.f354132c.remove(i12 - 1);
            c().put(zzxmVar.zza(), zzxmVar.getValue());
        }
        this.f354132c.add(i13, new zzxm(this, comparable, obj));
        return null;
    }

    public final Map.Entry zzg(int i12) {
        return (Map.Entry) this.f354132c.get(i12);
    }

    public final boolean zzj() {
        return this.f354134e;
    }
}
