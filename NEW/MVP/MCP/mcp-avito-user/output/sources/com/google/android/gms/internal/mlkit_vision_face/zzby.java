package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
abstract class zzby extends AbstractMap {

    /* renamed from: b, reason: collision with root package name */
    @a
    public transient Set f353006b;

    /* renamed from: c, reason: collision with root package name */
    @a
    public transient Set f353007c;

    /* renamed from: d, reason: collision with root package name */
    @a
    public transient Collection f353008d;

    public abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f353006b;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f353006b = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f353007c;
        if (set != null) {
            return set;
        }
        zzbw zzbwVar = new zzbw(this);
        this.f353007c = zzbwVar;
        return zzbwVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f353008d;
        if (collection != null) {
            return collection;
        }
        zzbx zzbxVar = new zzbx(this);
        this.f353008d = zzbxVar;
        return zzbxVar;
    }
}
