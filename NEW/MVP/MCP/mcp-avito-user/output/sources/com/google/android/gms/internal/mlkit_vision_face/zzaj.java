package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzaj extends zzbw {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzap f352951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzap zzapVar, Map map) {
        super((AbstractMap) map);
        this.f352951c = zzapVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f353004b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(@a Object obj) {
        return this == obj || this.f353004b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f353004b.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzai(this, this.f353004b.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@a Object obj) {
        Collection collection = (Collection) this.f353004b.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f352951c.f352963e -= size;
        return size > 0;
    }
}
