package com.google.android.gms.internal.location;

import AK.c;
import I41.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public abstract class zzds extends zzdp implements List, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final zzdv f350528c = new zzdq(zzdt.f350529f, 0);

    public static zzds zzj(Collection collection) {
        if (collection instanceof zzdp) {
            zzds zzdsVarZzd = ((zzdp) collection).zzd();
            if (!zzdsVarZzd.e()) {
                return zzdsVarZzd;
            }
            Object[] array = zzdsVarZzd.toArray();
            int length = array.length;
            return length == 0 ? zzdt.f350529f : new zzdt(array, length);
        }
        Object[] array2 = collection.toArray();
        int length2 = array2.length;
        for (int i12 = 0; i12 < length2; i12++) {
            if (array2[i12] == null) {
                throw new NullPointerException(c.g(i12, "at index "));
            }
        }
        return length2 == 0 ? zzdt.f350529f : new zzdt(array2, length2);
    }

    public static zzds zzk() {
        return zzdt.f350529f;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public void a(Object[] objArr) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i12] = get(i12);
        }
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i12, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i12, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@a Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i12 = 0; i12 < size; i12++) {
                        if (zzdl.zza(get(i12), list.get(i12))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzdl.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i12 = 0; i12 < size; i12++) {
            iHashCode = (iHashCode * 31) + get(i12).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(@a Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (obj.equals(get(i12))) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.location.zzdp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@a Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i12, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.location.zzdp
    /* renamed from: zze */
    public final zzdu iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzds subList(int i12, int i13) {
        zzdm.zzc(i12, i13, size());
        int i14 = i13 - i12;
        return i14 == size() ? this : i14 == 0 ? zzdt.f350529f : new zzdr(this, i12, i14);
    }

    @Override // java.util.List
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final zzdv listIterator(int i12) {
        zzdm.zzb(i12, size(), "index");
        return isEmpty() ? f350528c : new zzdq(this, i12);
    }

    @Override // com.google.android.gms.internal.location.zzdp
    @Deprecated
    public final zzds zzd() {
        return this;
    }
}
