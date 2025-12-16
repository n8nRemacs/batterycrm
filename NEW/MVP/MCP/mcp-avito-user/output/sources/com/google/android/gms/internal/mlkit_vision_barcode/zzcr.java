package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzcr extends zzcc {

    /* renamed from: f, reason: collision with root package name */
    public static final zzcc f351823f = new zzcr(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f351824d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f351825e;

    public zzcr(Object[] objArr, int i12) {
        this.f351824d = objArr;
        this.f351825e = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcc, com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int a(int i12, Object[] objArr) {
        Object[] objArr2 = this.f351824d;
        int i13 = this.f351825e;
        System.arraycopy(objArr2, 0, objArr, i12, i13);
        return i12 + i13;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int b() {
        return this.f351825e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final Object[] e() {
        return this.f351824d;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzaq.zza(i12, this.f351825e, "index");
        Object obj = this.f351824d[i12];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f351825e;
    }
}
