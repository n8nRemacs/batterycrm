package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzah extends zzby {

    /* renamed from: e, reason: collision with root package name */
    public final transient Map f352946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzap f352947f;

    public zzah(zzap zzapVar, Map map) {
        this.f352947f = zzapVar;
        this.f352946e = map;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzby
    public final Set a() {
        return new zzaf(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzap zzapVar = this.f352947f;
        if (this.f352946e == zzapVar.f352962d) {
            zzapVar.zzn();
            return;
        }
        zzag zzagVar = new zzag(this);
        while (zzagVar.hasNext()) {
            zzagVar.next();
            zzagVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@a Object obj) {
        Map map = this.f352946e;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@a Object obj) {
        return this == obj || this.f352946e.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @a
    public final Object get(@a Object obj) {
        Object obj2;
        Map map = this.f352946e;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.f352947f.d(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f352946e.hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzby, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f352947f.zzq();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @a
    public final /* synthetic */ Object remove(@a Object obj) {
        Collection collection = (Collection) this.f352946e.remove(obj);
        if (collection == null) {
            return null;
        }
        zzap zzapVar = this.f352947f;
        Collection collectionC = zzapVar.c();
        collectionC.addAll(collection);
        zzapVar.f352963e -= collection.size();
        collection.clear();
        return collectionC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f352946e.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f352946e.toString();
    }
}
