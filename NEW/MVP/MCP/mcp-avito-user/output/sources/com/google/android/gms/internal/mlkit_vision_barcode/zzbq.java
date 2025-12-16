package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzbq extends zzbf {

    /* renamed from: b, reason: collision with root package name */
    public final Object f351789b;

    /* renamed from: c, reason: collision with root package name */
    public int f351790c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbs f351791d;

    public zzbq(zzbs zzbsVar, int i12) {
        this.f351791d = zzbsVar;
        Object[] objArr = zzbsVar.f351796d;
        objArr.getClass();
        this.f351789b = objArr[i12];
        this.f351790c = i12;
    }

    public final void a() {
        int i12 = this.f351790c;
        zzbs zzbsVar = this.f351791d;
        Object obj = this.f351789b;
        if (i12 != -1 && i12 < zzbsVar.size()) {
            int i13 = this.f351790c;
            Object[] objArr = zzbsVar.f351796d;
            objArr.getClass();
            if (zzam.zza(obj, objArr[i13])) {
                return;
            }
        }
        Object obj2 = zzbs.f351793k;
        this.f351790c = zzbsVar.e(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbf, java.util.Map.Entry
    public final Object getKey() {
        return this.f351789b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbf, java.util.Map.Entry
    public final Object getValue() {
        zzbs zzbsVar = this.f351791d;
        Map mapA = zzbsVar.a();
        if (mapA != null) {
            return mapA.get(this.f351789b);
        }
        a();
        int i12 = this.f351790c;
        if (i12 == -1) {
            return null;
        }
        Object[] objArr = zzbsVar.f351797e;
        objArr.getClass();
        return objArr[i12];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbf, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzbs zzbsVar = this.f351791d;
        Map mapA = zzbsVar.a();
        Object obj2 = this.f351789b;
        if (mapA != null) {
            return mapA.put(obj2, obj);
        }
        a();
        int i12 = this.f351790c;
        if (i12 == -1) {
            zzbsVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = zzbsVar.f351797e;
        objArr.getClass();
        Object obj3 = objArr[i12];
        int i13 = this.f351790c;
        Object[] objArr2 = zzbsVar.f351797e;
        objArr2.getClass();
        objArr2[i13] = obj;
        return obj3;
    }
}
