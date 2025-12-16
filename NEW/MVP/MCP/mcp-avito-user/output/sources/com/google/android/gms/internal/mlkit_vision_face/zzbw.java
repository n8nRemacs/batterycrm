package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
class zzbw extends zzci {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractMap f353004b;

    public zzbw(AbstractMap abstractMap) {
        abstractMap.getClass();
        this.f353004b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f353004b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@a Object obj) {
        return this.f353004b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f353004b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new zzbt(this.f353004b.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@a Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.f353004b.remove(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f353004b.size();
    }
}
