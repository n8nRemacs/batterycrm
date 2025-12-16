package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzbp extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbs f351788b;

    public zzbp(zzbs zzbsVar) {
        this.f351788b = zzbsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f351788b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@a Object obj) {
        return this.f351788b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzbs zzbsVar = this.f351788b;
        Map mapA = zzbsVar.a();
        return mapA != null ? mapA.keySet().iterator() : new zzbk(zzbsVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@a Object obj) {
        zzbs zzbsVar = this.f351788b;
        Map mapA = zzbsVar.a();
        return mapA != null ? mapA.keySet().remove(obj) : zzbsVar.g(obj) != zzbs.f351793k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f351788b.size();
    }
}
