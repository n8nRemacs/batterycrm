package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
class zzcl extends zzcx {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractMap f351818b;

    public zzcl(AbstractMap abstractMap) {
        abstractMap.getClass();
        this.f351818b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f351818b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@a Object obj) {
        return this.f351818b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f351818b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new zzci(this.f351818b.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@a Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.f351818b.remove(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f351818b.size();
    }
}
