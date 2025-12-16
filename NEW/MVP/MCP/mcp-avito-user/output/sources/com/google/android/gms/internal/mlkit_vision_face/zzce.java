package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzce extends zzbq {

    /* renamed from: d, reason: collision with root package name */
    public final transient zzbp f353013d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f353014e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f353015f;

    public zzce(zzbp zzbpVar, Object[] objArr, int i12) {
        this.f353013d = zzbpVar;
        this.f353014e = objArr;
        this.f353015f = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int a(Object[] objArr) {
        return zzf().a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f353013d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbq
    public final zzbn g() {
        return new zzcd(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbq, com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f353015f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbq, com.google.android.gms.internal.mlkit_vision_face.zzbi
    /* renamed from: zzd */
    public final zzcl iterator() {
        return zzf().listIterator(0);
    }
}
