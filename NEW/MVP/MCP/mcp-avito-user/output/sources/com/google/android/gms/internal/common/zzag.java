package com.google.android.gms.internal.common;

import I41.a;
import aZ0.InterfaceC19845a;
import aZ0.e;
import aZ0.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@NullMarked
/* loaded from: classes6.dex */
public abstract class zzag extends zzac implements List, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final zzak f350230c = new zzae(zzai.f350231f, 0);

    public static zzag h(int i12, Object[] objArr) {
        return i12 == 0 ? zzai.f350231f : new zzai(objArr, i12);
    }

    public static zzag zzj(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return zzk((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zzai.f350231f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zzm(next);
        }
        zzad zzadVar = new zzad();
        zzadVar.zzb(next);
        zzadVar.zzc(it);
        zzadVar.f350224c = true;
        return h(zzadVar.f350223b, zzadVar.f350222a);
    }

    public static zzag zzk(Collection collection) {
        if (!(collection instanceof zzac)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzah.a(length, array);
            return h(length, array);
        }
        zzag zzagVarZzd = ((zzac) collection).zzd();
        if (!zzagVarZzd.e()) {
            return zzagVarZzd;
        }
        Object[] array2 = zzagVarZzd.toArray();
        return h(array2.length, array2);
    }

    public static zzag zzl() {
        return zzai.f350231f;
    }

    public static zzag zzm(Object obj) {
        Object[] objArr = {obj};
        zzah.a(1, objArr);
        return h(1, objArr);
    }

    public static zzag zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzah.a(2, objArr);
        return h(2, objArr);
    }

    @Override // com.google.android.gms.internal.common.zzac
    public void a(Object[] objArr) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i12] = get(i12);
        }
    }

    @Override // java.util.List
    @e
    @Deprecated
    public final void add(int i12, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @InterfaceC19845a
    @e
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
                        if (zzr.zza(get(i12), list.get(i12))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzr.zza(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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
    @InterfaceC19845a
    @e
    @Deprecated
    public final Object remove(int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @InterfaceC19845a
    @e
    @Deprecated
    public final Object set(int i12, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: zze */
    public final zzaj iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzag subList(int i12, int i13) {
        zzs.zzc(i12, i13, size());
        int i14 = i13 - i12;
        return i14 == size() ? this : i14 == 0 ? zzai.f350231f : new zzaf(this, i12, i14);
    }

    @Override // java.util.List
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final zzak listIterator(int i12) {
        zzs.zzb(i12, size(), "index");
        return isEmpty() ? f350230c : new zzae(this, i12);
    }

    @Override // com.google.android.gms.internal.common.zzac
    @l
    @Deprecated
    public final zzag zzd() {
        return this;
    }
}
