package com.google.android.gms.internal.fido;

import AK.c;
import I41.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public abstract class zzcc extends zzby implements List, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final zzdd f350284c = new zzbz(zzct.f350300f, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzcc g(int i12, Object[] objArr) {
        return i12 == 0 ? zzct.f350300f : new zzct(objArr, i12);
    }

    public static zzcc zzi(Object[] objArr) {
        if (objArr.length == 0) {
            return zzct.f350300f;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (objArr2[i12] == null) {
                throw new NullPointerException(c.g(i12, "at index "));
            }
        }
        return g(length, objArr2);
    }

    public static zzcc zzj(Object obj) {
        Object[] objArr = {obj};
        for (int i12 = 0; i12 < 1; i12++) {
            if (objArr[i12] == null) {
                throw new NullPointerException(c.g(i12, "at index "));
            }
        }
        return g(1, objArr);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public int a(Object[] objArr) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i12] = get(i12);
        }
        return size;
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

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@a Object obj) {
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
                        if (zzbk.zza(get(i12), list.get(i12))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzbk.zza(it.next(), it2.next())) {
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

    public int indexOf(@a Object obj) {
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

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(@a Object obj) {
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

    @Override // com.google.android.gms.internal.fido.zzby
    /* renamed from: zzd */
    public final zzdc iterator() {
        return listIterator(0);
    }

    public zzcc zzf() {
        return size() <= 1 ? this : new zzca(this);
    }

    @Override // java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public zzcc subList(int i12, int i13) {
        zzbm.zze(i12, i13, size());
        int i14 = i13 - i12;
        return i14 == size() ? this : i14 == 0 ? zzct.f350300f : new zzcb(this, i12, i14);
    }

    @Override // java.util.List
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final zzdd listIterator(int i12) {
        zzbm.zzb(i12, size(), "index");
        return isEmpty() ? f350284c : new zzbz(this, i12);
    }
}
