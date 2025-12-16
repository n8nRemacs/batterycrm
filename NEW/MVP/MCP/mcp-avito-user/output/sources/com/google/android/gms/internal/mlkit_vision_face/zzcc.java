package com.google.android.gms.internal.mlkit_vision_face;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzcc extends zzbn {

    /* renamed from: f, reason: collision with root package name */
    public static final zzbn f353009f = new zzcc(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f353010d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f353011e;

    public zzcc(Object[] objArr, int i12) {
        this.f353010d = objArr;
        this.f353011e = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbn, com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f353010d;
        int i12 = this.f353011e;
        System.arraycopy(objArr2, 0, objArr, 0, i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int b() {
        return this.f353011e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final Object[] e() {
        return this.f353010d;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzab.zza(i12, this.f353011e, "index");
        Object obj = this.f353010d[i12];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f353011e;
    }
}
