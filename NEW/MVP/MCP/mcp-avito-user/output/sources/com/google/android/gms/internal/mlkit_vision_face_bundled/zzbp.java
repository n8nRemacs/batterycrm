package com.google.android.gms.internal.mlkit_vision_face_bundled;

import I41.a;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzbp extends zzbm {

    /* renamed from: d, reason: collision with root package name */
    public final transient zzbl f353508d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f353509e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f353510f;

    public zzbp(zzbl zzblVar, Object[] objArr, int i12) {
        this.f353508d = zzblVar;
        this.f353509e = objArr;
        this.f353510f = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf
    public final int a(Object[] objArr) {
        return zzf().a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f353508d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbm
    public final zzbj g() {
        return new zzbo(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbm, com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f353510f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbm, com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf
    /* renamed from: zzd */
    public final zzbu iterator() {
        return zzf().listIterator(0);
    }
}
