package com.google.android.gms.internal.mlkit_vision_face;

import AK.c;
import I41.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public abstract class zzbn extends zzbi implements List, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final zzcm f352999c = new zzbl(zzcc.f353009f, 0);

    public static zzbn zzi(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        for (int i12 = 0; i12 < 2; i12++) {
            if (objArr[i12] == null) {
                throw new NullPointerException(c.g(i12, "at index "));
            }
        }
        return new zzcc(objArr, 2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
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

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection
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
                        if (zzx.zza(get(i12), list.get(i12))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzx.zza(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    /* renamed from: zzd */
    public final zzcl iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzf */
    public zzbn subList(int i12, int i13) {
        zzab.zzc(i12, i13, size());
        int i14 = i13 - i12;
        return i14 == size() ? this : i14 == 0 ? zzcc.f353009f : new zzbm(this, i12, i14);
    }

    @Override // java.util.List
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzcm listIterator(int i12) {
        zzab.zzb(i12, size(), "index");
        return isEmpty() ? f352999c : new zzbl(this, i12);
    }
}
