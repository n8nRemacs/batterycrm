package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzct extends zzcf {

    /* renamed from: d, reason: collision with root package name */
    public final transient zzce f351827d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f351828e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f351829f;

    public zzct(zzce zzceVar, Object[] objArr, int i12) {
        this.f351827d = zzceVar;
        this.f351828e = objArr;
        this.f351829f = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int a(int i12, Object[] objArr) {
        return zzf().a(i12, objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f351827d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf
    public final zzcc g() {
        return new zzcs(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf, com.google.android.gms.internal.mlkit_vision_barcode.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f351829f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf, com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    /* renamed from: zzd */
    public final zzda iterator() {
        return zzf().listIterator(0);
    }
}
