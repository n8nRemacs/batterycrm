package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
abstract class zzbe extends zzbg implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient Map f351776d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f351777e;

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbg
    public final Map a() {
        return new zzaw(this, this.f351776d);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbg
    public final Set b() {
        return new zzay(this, this.f351776d);
    }

    public abstract Collection c();

    public Collection d(Object obj, Collection collection) {
        throw null;
    }

    public final Collection zzh(Object obj) {
        Collection collectionC = (Collection) this.f351776d.get(obj);
        if (collectionC == null) {
            collectionC = c();
        }
        return d(obj, collectionC);
    }

    public final void zzn() {
        Map map = this.f351776d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f351777e = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbg, com.google.android.gms.internal.mlkit_vision_barcode.zzcp
    public final boolean zzo(Object obj, Object obj2) {
        Map map = this.f351776d;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f351777e++;
            return true;
        }
        Collection collectionC = c();
        if (!collectionC.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f351777e++;
        map.put(obj, collectionC);
        return true;
    }
}
