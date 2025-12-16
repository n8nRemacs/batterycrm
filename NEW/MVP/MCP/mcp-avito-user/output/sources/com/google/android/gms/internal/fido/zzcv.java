package com.google.android.gms.internal.fido;

import I41.a;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzcv extends zzck {

    /* renamed from: g, reason: collision with root package name */
    public static final zzcv f350310g;

    /* renamed from: f, reason: collision with root package name */
    public final transient zzcc f350311f;

    static {
        zzdd zzddVar = zzcc.f350284c;
        f350310g = new zzcv(zzct.f350300f, zzcq.f350299b);
    }

    public zzcv(zzcc zzccVar, Comparator comparator) {
        super(comparator);
        this.f350311f = zzccVar;
    }

    public final int C(Object obj, boolean z12) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f350311f, obj, this.f350295d);
        return iBinarySearch >= 0 ? z12 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    public final zzcv E(int i12, int i13) {
        zzcc zzccVar = this.f350311f;
        if (i12 == 0) {
            if (i13 == zzccVar.size()) {
                return this;
            }
            i12 = 0;
        }
        Comparator comparator = this.f350295d;
        return i12 < i13 ? new zzcv(zzccVar.subList(i12, i13), comparator) : zzck.w(comparator);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int a(Object[] objArr) {
        return this.f350311f.a(objArr);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int b() {
        return this.f350311f.b();
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    @a
    public final Object ceiling(Object obj) {
        int iC2 = C(obj, true);
        zzcc zzccVar = this.f350311f;
        if (iC2 == zzccVar.size()) {
            return null;
        }
        return zzccVar.get(iC2);
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f350311f, obj, this.f350295d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzcp) {
            collection = ((zzcp) collection).zza();
        }
        Comparator comparator = this.f350295d;
        if (!zzdb.zza(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zzdd zzddVarListIterator = this.f350311f.listIterator(0);
        Iterator it = collection.iterator();
        if (!zzddVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = zzddVarListIterator.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare >= 0) {
                    if (iCompare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!zzddVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = zzddVarListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int d() {
        return this.f350311f.d();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    @a
    public final Object[] e() {
        return this.f350311f.e();
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final boolean equals(@a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        zzcc zzccVar = this.f350311f;
        if (zzccVar.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f350295d;
        if (!zzdb.zza(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            zzdd zzddVarListIterator = zzccVar.listIterator(0);
            while (zzddVarListIterator.hasNext()) {
                E next = zzddVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || comparator.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f350311f.get(0);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    @a
    public final Object floor(Object obj) {
        int iY2 = y(obj, true) - 1;
        if (iY2 == -1) {
            return null;
        }
        return this.f350311f.get(iY2);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    @a
    public final Object higher(Object obj) {
        int iC2 = C(obj, false);
        zzcc zzccVar = this.f350311f;
        if (iC2 == zzccVar.size()) {
            return null;
        }
        return zzccVar.get(iC2);
    }

    @Override // com.google.android.gms.internal.fido.zzck, com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f350311f.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f350311f.get(r0.size() - 1);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    @a
    public final Object lower(Object obj) {
        int iY2 = y(obj, false) - 1;
        if (iY2 == -1) {
            return null;
        }
        return this.f350311f.get(iY2);
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck r() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f350295d);
        return isEmpty() ? zzck.w(comparatorReverseOrder) : new zzcv(this.f350311f.zzf(), comparatorReverseOrder);
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck s(Object obj, boolean z12) {
        return E(0, y(obj, z12));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f350311f.size();
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck t(Object obj, boolean z12, Object obj2, boolean z13) {
        zzcv zzcvVar = (zzcv) v(obj, z12);
        return zzcvVar.E(0, zzcvVar.y(obj2, z13));
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck v(Object obj, boolean z12) {
        return E(C(obj, z12), this.f350311f.size());
    }

    public final int y(Object obj, boolean z12) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f350311f, obj, this.f350295d);
        return iBinarySearch >= 0 ? z12 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    @Override // com.google.android.gms.internal.fido.zzck, com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* renamed from: zzd */
    public final zzdc iterator() {
        return this.f350311f.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc zzi() {
        return this.f350311f;
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    /* renamed from: zzt */
    public final zzdc descendingIterator() {
        return this.f350311f.zzf().listIterator(0);
    }
}
