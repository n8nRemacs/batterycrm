package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzba extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbd f352974b;

    public zzba(zzbd zzbdVar) {
        this.f352974b = zzbdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f352974b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@a Object obj) {
        return this.f352974b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzbd zzbdVar = this.f352974b;
        Map mapA = zzbdVar.a();
        return mapA != null ? mapA.keySet().iterator() : new zzav(zzbdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@a Object obj) {
        zzbd zzbdVar = this.f352974b;
        Map mapA = zzbdVar.a();
        return mapA != null ? mapA.keySet().remove(obj) : zzbdVar.g(obj) != zzbd.f352979k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f352974b.size();
    }
}
