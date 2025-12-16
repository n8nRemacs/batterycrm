package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzbn extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbs f351783b;

    public zzbn(zzbs zzbsVar) {
        this.f351783b = zzbsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f351783b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@a Object obj) {
        zzbs zzbsVar = this.f351783b;
        Map mapA = zzbsVar.a();
        if (mapA != null) {
            return mapA.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iE2 = zzbsVar.e(entry.getKey());
            if (iE2 != -1) {
                Object[] objArr = zzbsVar.f351797e;
                objArr.getClass();
                if (zzam.zza(objArr[iE2], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzbs zzbsVar = this.f351783b;
        Map mapA = zzbsVar.a();
        return mapA != null ? mapA.entrySet().iterator() : new zzbl(zzbsVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@a Object obj) {
        zzbs zzbsVar = this.f351783b;
        Map mapA = zzbsVar.a();
        if (mapA != null) {
            return mapA.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzbsVar.c()) {
            return false;
        }
        int iD2 = zzbsVar.d();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = zzbsVar.f351794b;
        obj2.getClass();
        int[] iArr = zzbsVar.f351795c;
        iArr.getClass();
        Object[] objArr = zzbsVar.f351796d;
        objArr.getClass();
        Object[] objArr2 = zzbsVar.f351797e;
        objArr2.getClass();
        int iA2 = zzbt.a(key, value, iD2, obj2, iArr, objArr, objArr2);
        if (iA2 == -1) {
            return false;
        }
        zzbsVar.b(iA2, iD2);
        zzbsVar.f351799g--;
        zzbsVar.f351798f += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f351783b.size();
    }
}
