package com.google.android.gms.internal.auth;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
class zzgv extends AbstractMap {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f350159h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f350160b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f350163e;

    /* renamed from: f, reason: collision with root package name */
    public volatile zzgt f350164f;

    /* renamed from: c, reason: collision with root package name */
    public List f350161c = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public Map f350162d = Collections.emptyMap();

    /* renamed from: g, reason: collision with root package name */
    public Map f350165g = Collections.emptyMap();

    public /* synthetic */ zzgv(int i12, zzgu zzguVar) {
        this.f350160b = i12;
    }

    public final int a(Comparable comparable) {
        int size = this.f350161c.size();
        int i12 = size - 1;
        int i13 = 0;
        if (i12 >= 0) {
            int iCompareTo = comparable.compareTo(((zzgp) this.f350161c.get(i12)).zza());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i12;
            }
        }
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int iCompareTo2 = comparable.compareTo(((zzgp) this.f350161c.get(i14)).zza());
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
        Object value = ((zzgp) this.f350161c.remove(i12)).getValue();
        if (!this.f350162d.isEmpty()) {
            Iterator it = c().entrySet().iterator();
            List list = this.f350161c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzgp(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    public final SortedMap c() {
        d();
        if (this.f350162d.isEmpty() && !(this.f350162d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f350162d = treeMap;
            this.f350165g = treeMap.descendingMap();
        }
        return (SortedMap) this.f350162d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        d();
        if (!this.f350161c.isEmpty()) {
            this.f350161c.clear();
        }
        if (this.f350162d.isEmpty()) {
            return;
        }
        this.f350162d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f350162d.containsKey(comparable);
    }

    public final void d() {
        if (this.f350163e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f350164f == null) {
            this.f350164f = new zzgt(this, null);
        }
        return this.f350164f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgv)) {
            return super.equals(obj);
        }
        zzgv zzgvVar = (zzgv) obj;
        int size = size();
        if (size != zzgvVar.size()) {
            return false;
        }
        int iZzb = zzb();
        if (iZzb != zzgvVar.zzb()) {
            return entrySet().equals(zzgvVar.entrySet());
        }
        for (int i12 = 0; i12 < iZzb; i12++) {
            if (!zzg(i12).equals(zzgvVar.zzg(i12))) {
                return false;
            }
        }
        if (iZzb != size) {
            return this.f350162d.equals(zzgvVar.f350162d);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        return iA2 >= 0 ? ((zzgp) this.f350161c.get(iA2)).getValue() : this.f350162d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZzb = zzb();
        int iHashCode = 0;
        for (int i12 = 0; i12 < iZzb; i12++) {
            iHashCode += ((zzgp) this.f350161c.get(i12)).hashCode();
        }
        return this.f350162d.size() > 0 ? this.f350162d.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        d();
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        if (iA2 >= 0) {
            return b(iA2);
        }
        if (this.f350162d.isEmpty()) {
            return null;
        }
        return this.f350162d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f350162d.size() + this.f350161c.size();
    }

    public void zza() {
        if (this.f350163e) {
            return;
        }
        this.f350162d = this.f350162d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f350162d);
        this.f350165g = this.f350165g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f350165g);
        this.f350163e = true;
    }

    public final int zzb() {
        return this.f350161c.size();
    }

    public final Iterable zzc() {
        return this.f350162d.isEmpty() ? zzgo.f350150b : this.f350162d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        d();
        int iA2 = a(comparable);
        if (iA2 >= 0) {
            return ((zzgp) this.f350161c.get(iA2)).setValue(obj);
        }
        d();
        boolean zIsEmpty = this.f350161c.isEmpty();
        int i12 = this.f350160b;
        if (zIsEmpty && !(this.f350161c instanceof ArrayList)) {
            this.f350161c = new ArrayList(i12);
        }
        int i13 = -(iA2 + 1);
        if (i13 >= i12) {
            return c().put(comparable, obj);
        }
        if (this.f350161c.size() == i12) {
            zzgp zzgpVar = (zzgp) this.f350161c.remove(i12 - 1);
            c().put(zzgpVar.zza(), zzgpVar.getValue());
        }
        this.f350161c.add(i13, new zzgp(this, comparable, obj));
        return null;
    }

    public final Map.Entry zzg(int i12) {
        return (Map.Entry) this.f350161c.get(i12);
    }

    public final boolean zzj() {
        return this.f350163e;
    }
}
