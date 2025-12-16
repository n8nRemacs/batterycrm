package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
abstract class zzck extends zzcx {
    public abstract Map b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        b().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@a Object obj) {
        Object obj2;
        boolean zContainsKey;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map mapB = b();
        mapB.getClass();
        try {
            obj2 = mapB.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (!zzam.zza(obj2, entry.getValue())) {
            return false;
        }
        if (obj2 != null) {
            return true;
        }
        Map map = ((zzaw) b()).f351760e;
        map.getClass();
        try {
            zContainsKey = map.containsKey(key);
        } catch (ClassCastException | NullPointerException unused2) {
            zContainsKey = false;
        }
        return zContainsKey;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return ((AbstractMap) b()).isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@a Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return ((zzaw) b()).f351761f.zzq().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcx, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return zzcy.a(collection, this);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i12;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                zzbj.a(size, "expectedSize");
                i12 = size + 1;
            } else {
                i12 = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i12);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((zzaw) b()).f351761f.zzq().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return b().size();
    }
}
