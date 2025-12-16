package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzaw extends zzcn {

    /* renamed from: e, reason: collision with root package name */
    public final transient Map f351760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzbe f351761f;

    public zzaw(zzbe zzbeVar, Map map) {
        this.f351761f = zzbeVar;
        this.f351760e = map;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final Set a() {
        return new zzau(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzbe zzbeVar = this.f351761f;
        if (this.f351760e == zzbeVar.f351776d) {
            zzbeVar.zzn();
            return;
        }
        zzav zzavVar = new zzav(this);
        while (zzavVar.hasNext()) {
            zzavVar.next();
            zzavVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@a Object obj) {
        Map map = this.f351760e;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@a Object obj) {
        return this == obj || this.f351760e.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @a
    public final Object get(@a Object obj) {
        Object obj2;
        Map map = this.f351760e;
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
        return this.f351761f.d(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f351760e.hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f351761f.zzq();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @a
    public final /* synthetic */ Object remove(@a Object obj) {
        Collection collection = (Collection) this.f351760e.remove(obj);
        if (collection == null) {
            return null;
        }
        zzbe zzbeVar = this.f351761f;
        Collection collectionC = zzbeVar.c();
        collectionC.addAll(collection);
        zzbeVar.f351777e -= collection.size();
        collection.clear();
        return collectionC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f351760e.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f351760e.toString();
    }
}
