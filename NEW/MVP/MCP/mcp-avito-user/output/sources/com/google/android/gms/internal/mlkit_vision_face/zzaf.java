package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzaf extends zzbv {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzah f352942b;

    public zzaf(zzah zzahVar) {
        this.f352942b = zzahVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbv
    public final Map b() {
        return this.f352942b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@a Object obj) {
        Set setEntrySet = this.f352942b.f352946e.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzag(this.f352942b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@a Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzap zzapVar = this.f352942b.f352947f;
        Object key = entry.getKey();
        Map map = zzapVar.f352962d;
        map.getClass();
        try {
            objRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        zzapVar.f352963e -= size;
        return true;
    }
}
