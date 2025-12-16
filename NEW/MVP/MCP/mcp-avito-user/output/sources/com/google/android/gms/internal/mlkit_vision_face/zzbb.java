package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzbb extends zzaq {

    /* renamed from: b, reason: collision with root package name */
    public final Object f352975b;

    /* renamed from: c, reason: collision with root package name */
    public int f352976c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbd f352977d;

    public zzbb(zzbd zzbdVar, int i12) {
        this.f352977d = zzbdVar;
        Object[] objArr = zzbdVar.f352982d;
        objArr.getClass();
        this.f352975b = objArr[i12];
        this.f352976c = i12;
    }

    public final void a() {
        int i12 = this.f352976c;
        zzbd zzbdVar = this.f352977d;
        Object obj = this.f352975b;
        if (i12 != -1 && i12 < zzbdVar.size()) {
            int i13 = this.f352976c;
            Object[] objArr = zzbdVar.f352982d;
            objArr.getClass();
            if (zzx.zza(obj, objArr[i13])) {
                return;
            }
        }
        Object obj2 = zzbd.f352979k;
        this.f352976c = zzbdVar.e(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object getKey() {
        return this.f352975b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object getValue() {
        zzbd zzbdVar = this.f352977d;
        Map mapA = zzbdVar.a();
        if (mapA != null) {
            return mapA.get(this.f352975b);
        }
        a();
        int i12 = this.f352976c;
        if (i12 == -1) {
            return null;
        }
        Object[] objArr = zzbdVar.f352983e;
        objArr.getClass();
        return objArr[i12];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzbd zzbdVar = this.f352977d;
        Map mapA = zzbdVar.a();
        Object obj2 = this.f352975b;
        if (mapA != null) {
            return mapA.put(obj2, obj);
        }
        a();
        int i12 = this.f352976c;
        if (i12 == -1) {
            zzbdVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = zzbdVar.f352983e;
        objArr.getClass();
        Object obj3 = objArr[i12];
        int i13 = this.f352976c;
        Object[] objArr2 = zzbdVar.f352983e;
        objArr2.getClass();
        objArr2[i13] = obj;
        return obj3;
    }
}
