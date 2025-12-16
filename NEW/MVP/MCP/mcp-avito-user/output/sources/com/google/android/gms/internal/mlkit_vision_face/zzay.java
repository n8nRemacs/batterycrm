package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzay extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbd f352969b;

    public zzay(zzbd zzbdVar) {
        this.f352969b = zzbdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f352969b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@a Object obj) {
        zzbd zzbdVar = this.f352969b;
        Map mapA = zzbdVar.a();
        if (mapA != null) {
            return mapA.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iE2 = zzbdVar.e(entry.getKey());
            if (iE2 != -1) {
                Object[] objArr = zzbdVar.f352983e;
                objArr.getClass();
                if (zzx.zza(objArr[iE2], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzbd zzbdVar = this.f352969b;
        Map mapA = zzbdVar.a();
        return mapA != null ? mapA.entrySet().iterator() : new zzaw(zzbdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@a Object obj) {
        zzbd zzbdVar = this.f352969b;
        Map mapA = zzbdVar.a();
        if (mapA != null) {
            return mapA.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzbdVar.c()) {
            return false;
        }
        int iD2 = zzbdVar.d();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = zzbdVar.f352980b;
        obj2.getClass();
        int[] iArr = zzbdVar.f352981c;
        iArr.getClass();
        Object[] objArr = zzbdVar.f352982d;
        objArr.getClass();
        Object[] objArr2 = zzbdVar.f352983e;
        objArr2.getClass();
        int iA2 = zzbe.a(key, value, iD2, obj2, iArr, objArr, objArr2);
        if (iA2 == -1) {
            return false;
        }
        zzbdVar.b(iA2, iD2);
        zzbdVar.f352985g--;
        zzbdVar.f352984f += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f352969b.size();
    }
}
