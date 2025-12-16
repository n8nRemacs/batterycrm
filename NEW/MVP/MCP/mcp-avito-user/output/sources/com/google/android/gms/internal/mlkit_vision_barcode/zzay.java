package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzay extends zzcl {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbe f351765c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(zzbe zzbeVar, Map map) {
        super((AbstractMap) map);
        this.f351765c = zzbeVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcl, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
        return this.f351818b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(@a Object obj) {
        return this == obj || this.f351818b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f351818b.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzax(this, this.f351818b.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcl, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@a Object obj) {
        Collection collection = (Collection) this.f351818b.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f351765c.f351777e -= size;
        return size > 0;
    }
}
