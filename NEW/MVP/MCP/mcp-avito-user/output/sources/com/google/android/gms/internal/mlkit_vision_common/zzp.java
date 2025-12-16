package com.google.android.gms.internal.mlkit_vision_common;

import I41.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public abstract class zzp extends zzl implements List, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final zzac f352917c = new zzn(zzu.f352922f, 0);

    public static zzp zzi(Object obj) {
        Object[] objArr = {obj};
        zzt.a(1, objArr);
        return new zzu(objArr, 1);
    }

    public static zzp zzj(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzt.a(3, objArr);
        return new zzu(objArr, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
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

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
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
                        if (zzb.zza(get(i12), list.get(i12))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzb.zza(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    /* renamed from: zzd */
    public final zzab iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzf */
    public zzp subList(int i12, int i13) {
        zzf.zzc(i12, i13, size());
        int i14 = i13 - i12;
        return i14 == size() ? this : i14 == 0 ? zzu.f352922f : new zzo(this, i12, i14);
    }

    @Override // java.util.List
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final zzac listIterator(int i12) {
        zzf.zzb(i12, size(), "index");
        return isEmpty() ? f352917c : new zzn(this, i12);
    }
}
