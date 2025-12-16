package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
abstract class zzap extends zzar implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient Map f352962d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f352963e;

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzar
    public final Map a() {
        return new zzah(this, this.f352962d);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzar
    public final Set b() {
        return new zzaj(this, this.f352962d);
    }

    public abstract Collection c();

    public Collection d(Object obj, Collection collection) {
        throw null;
    }

    public final Collection zzh(Object obj) {
        Collection collectionC = (Collection) this.f352962d.get(obj);
        if (collectionC == null) {
            collectionC = c();
        }
        return d(obj, collectionC);
    }

    public final void zzn() {
        Map map = this.f352962d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f352963e = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzar, com.google.android.gms.internal.mlkit_vision_face.zzca
    public final boolean zzo(Object obj, Object obj2) {
        Map map = this.f352962d;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f352963e++;
            return true;
        }
        Collection collectionC = c();
        if (!collectionC.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f352963e++;
        map.put(obj, collectionC);
        return true;
    }
}
