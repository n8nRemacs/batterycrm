package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
abstract class zzcn extends AbstractMap {

    /* renamed from: b, reason: collision with root package name */
    @a
    public transient Set f351820b;

    /* renamed from: c, reason: collision with root package name */
    @a
    public transient Set f351821c;

    /* renamed from: d, reason: collision with root package name */
    @a
    public transient Collection f351822d;

    public abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f351820b;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f351820b = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f351821c;
        if (set != null) {
            return set;
        }
        zzcl zzclVar = new zzcl(this);
        this.f351821c = zzclVar;
        return zzclVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f351822d;
        if (collection != null) {
            return collection;
        }
        zzcm zzcmVar = new zzcm(this);
        this.f351822d = zzcmVar;
        return zzcmVar;
    }
}
